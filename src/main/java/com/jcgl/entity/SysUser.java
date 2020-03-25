package com.jcgl.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户信息表
 * </p>
 *
 * @author wom
 * @since 2020-03-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 学校编号
     */
    private Integer schoolId;

    /**
     * 角色编号
     */
    private Integer roleId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 用户状态
     */
    private String userStatus;


}
