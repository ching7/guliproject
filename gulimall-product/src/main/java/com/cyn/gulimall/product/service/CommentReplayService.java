package com.cyn.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cyn.common.utils.PageUtils;
import com.cyn.gulimall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author chenyn
 * @email 775608598@qq.com
 * @date 2020-05-17 18:42:29
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

