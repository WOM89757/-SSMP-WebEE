package com.jcgl.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageInfo;
import com.jcgl.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;
import javafx.scene.control.Pagination;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author wom
 * @since 2020-03-24
 */
public interface ISysUserService extends IService<SysUser> {

    PageInfo<SysUser> getUserSchool(Integer pageNum);


    PageInfo<SysUser> getAll(Integer pageNum);

    boolean checkUser(String userName);

    void saveUser(SysUser sysUser);
}
