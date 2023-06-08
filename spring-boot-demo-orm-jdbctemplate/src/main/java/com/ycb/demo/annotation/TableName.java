package com.ycb.demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 袁存波
 * @version 1.0
 * @create 2023-06-05 23:04
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface TableName {
    /**
     * 表名
     *
     * @return 表名
     */
    String name();
}
