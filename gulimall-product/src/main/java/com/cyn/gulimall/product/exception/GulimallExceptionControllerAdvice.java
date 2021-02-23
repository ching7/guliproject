package com.cyn.gulimall.product.exception;

import com.cyn.common.exception.BizCodeEnum;
import com.cyn.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenyanan
 * @date 2021/2/22
 * Created by chenyanan on 2021/2/22
 * 集中处理所有异常
 */
@Slf4j
@RestControllerAdvice(basePackages = "com.cyn.gulimall.product.controller")
public class GulimallExceptionControllerAdvice {
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleValidException(MethodArgumentNotValidException e) {
        log.error("数据校验出现问题:{}，异常类型:{}", e.getMessage(), e.getClass());
        Map<String, String> errorMap = new HashMap<>();
        BindingResult bindingResult = e.getBindingResult();
        bindingResult.getFieldErrors().forEach((fieldError) -> {
            errorMap.put(fieldError.getField(), fieldError.getDefaultMessage());
        });
        return R.error(BizCodeEnum.VAILD_EXCEPTION.getCode(), BizCodeEnum.VAILD_EXCEPTION.getMsg())
                .put("data", errorMap);
    }

    @ExceptionHandler(value = Throwable.class)
    public R HandleException(Throwable throwable) {
        return R.error(BizCodeEnum.UNKNOW_EXCRPTION.getCode(), BizCodeEnum.UNKNOW_EXCRPTION.getMsg());
    }
}
