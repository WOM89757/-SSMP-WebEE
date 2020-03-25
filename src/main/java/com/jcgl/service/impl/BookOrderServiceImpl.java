package com.jcgl.service.impl;

import com.jcgl.entity.BookOrder;
import com.jcgl.mapper.BookOrderMapper;
import com.jcgl.service.IBookOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 自编书目_征订期号 服务实现类
 * </p>
 *
 * @author wom
 * @since 2020-03-24
 */
@Service
public class BookOrderServiceImpl extends ServiceImpl<BookOrderMapper, BookOrder> implements IBookOrderService {

}
