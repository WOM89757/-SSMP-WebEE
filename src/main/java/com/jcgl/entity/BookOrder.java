package com.jcgl.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 自编书目_征订期号
 * </p>
 *
 * @author wom
 * @since 2020-03-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BookOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自编书目编号
     */
    private Integer bookId;

    /**
     * 征订编号
     */
    private Integer orderId;


}
