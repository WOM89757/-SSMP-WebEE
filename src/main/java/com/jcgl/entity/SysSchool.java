package com.jcgl.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 学校档案
 * </p>
 *
 * @author wom
 * @since 2020-03-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysSchool implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 学校编号
     */
    private Integer schoolId;

    /**
     * 学校类型
     */
    private Integer schoolType;

    /**
     * 学校名称
     */
    private String schoolName;

    /**
     * 学校简称
     */
    private String schoolAlias;


}
