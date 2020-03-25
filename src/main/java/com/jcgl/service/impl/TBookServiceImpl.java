package com.jcgl.service.impl;

import com.jcgl.entity.TBook;
import com.jcgl.mapper.TBookMapper;
import com.jcgl.service.ITBookService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 在此期号内建立、修改、删除和向省店上报书目信息 服务实现类
 * </p>
 *
 * @author wom
 * @since 2020-03-24
 */
@Service
public class TBookServiceImpl extends ServiceImpl<TBookMapper, TBook> implements ITBookService {

}
