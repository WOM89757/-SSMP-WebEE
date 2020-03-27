package com.jcgl.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.github.pagehelper.PageInfo;
import com.jcgl.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户信息表 服务类
 * </p>
 *
 * @author wom
 * @since 2020-03-24
 */
public interface ISysUserService extends IService<SysUser> {

    PageInfo<SysUser> getUserSchool(Integer pageNum,Wrapper<SysUser> wrapper);
    SysUser getByIdWithSchool(Wrapper<SysUser> wrapper);

    PageInfo<SysUser> getAll(Integer pageNum);

    boolean checkUser(String userName);

    void saveUser(SysUser sysUser);


}
