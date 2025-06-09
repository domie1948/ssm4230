package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuzerenEntity;
import java.util.Map;

/**
 * 负责人 服务类
 */
public interface FuzerenService extends IService<FuzerenEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}