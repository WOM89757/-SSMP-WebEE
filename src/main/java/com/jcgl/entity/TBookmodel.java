package com.jcgl.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 年级套订信息
 * </p>
 *
 * @author wom
 * @since 2020-03-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TBookmodel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 年级套订编号
     */
    private Integer bmodelId;

    /**
     * 套订名称
     */
    private String bmodelName;


}
