package com.cheng.springbootinit.common;

import java.io.Serializable;
import lombok.Data;

/**
 * 删除请求
 *
* @author <a href="https://github.com/cheng0525">菜鸟程序员</a>
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}