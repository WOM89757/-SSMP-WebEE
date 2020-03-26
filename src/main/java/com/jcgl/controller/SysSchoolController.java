package com.jcgl.controller;


import com.jcgl.entity.SysSchool;
import com.jcgl.service.ISysSchoolService;
import com.jcgl.utils.Message;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 学校档案 前端控制器
 * </p>
 *
 * @author wom
 * @since 2020-03-24
 */
@RestController
public class SysSchoolController {
    @Resource
    ISysSchoolService iSysSchoolService;

    /**
     * 查询用户信息(分页查询）
     * @return
     */
    @RequestMapping("/schools")
    public Message getUsers(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum  ){

        // PageInfo<SysUser> pageInfo = iSysUserService.getAll(pageNum);
        List<SysSchool> schoolList = iSysSchoolService.list();
        return Message.success().add("schoolList", schoolList);
    }

}
