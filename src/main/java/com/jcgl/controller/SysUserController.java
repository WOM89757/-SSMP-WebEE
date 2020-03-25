package com.jcgl.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageInfo;
import com.jcgl.entity.SysUser;
import com.jcgl.service.ISysUserService;
import com.jcgl.utils.Message;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author wom
 * @since 2020-03-24
 */
@RestController
public class SysUserController {
    @Resource
    ISysUserService iSysUserService;


    /**
     * 查询用户信息(分页查询）
     * @return
     */
    @RequestMapping("/users")
    public Message getUsers(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum ){

        IPage<SysUser> page  = new Page<>(pageNum, 10);
        IPage<SysUser> pageInfo =iSysUserService.page(page);

        return Message.success().add("pageInfo", pageInfo);
    }
    /**
     * 根据id查询用户
     *
     * @param id 用户id
     * @return 用户信息
     */
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Message getEmp(@PathVariable("id") Integer id) {
        SysUser user = iSysUserService.getById(id);
        return Message.success().add("user", user);
    }
    /**
     * 删除员工（单个删除、批量删除都处理）
     */

    @RequestMapping(value = "/emp/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Message deleteEmpById(@PathVariable("id") String ids) {

        if (ids.contains("-")) {//批量删除

            List<Integer> del_ids = new ArrayList<Integer>();
            String[] str_ids = ids.split("-");
            //组装id的集合
            for (String string : str_ids){
                del_ids.add(Integer.parseInt(string));
            }
            iSysUserService.removeByIds(del_ids);
        } else {//单个删除
            Integer id = Integer.parseInt(ids);
            iSysUserService.removeById(id);
        }

        return Message.success();
    }
}
