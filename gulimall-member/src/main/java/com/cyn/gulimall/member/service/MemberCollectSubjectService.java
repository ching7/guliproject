package com.cyn.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cyn.common.utils.PageUtils;
import com.cyn.gulimall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author chenyn
 * @email 775608598@qq.com
 * @date 2020-05-19 22:32:26
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

