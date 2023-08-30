package com.cheng.springbootinit.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * SQL 工具
 *
* @author <a href="https://github.com/cheng0525">菜鸟程序员</a>
 */
public class SqlUtils {

    /**
     * 校验排序字段是否合法（防止 SQL 注入）
     *
     * @param sortField
     * @return
     */
    public static boolean validSortField(String sortField) {
        if (StringUtils.isBlank(sortField)) {
            return false;
        }
        return !StringUtils.containsAny(sortField, "=", "(", ")", " ");
    }
}