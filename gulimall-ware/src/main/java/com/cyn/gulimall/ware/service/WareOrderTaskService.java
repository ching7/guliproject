package com.cyn.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cyn.common.utils.PageUtils;
import com.cyn.gulimall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author chenyn
 * @email 775608598@qq.com
 * @date 2020-05-19 23:02:05
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

