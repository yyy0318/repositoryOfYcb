package com.ycb.demo.annotation;

import javax.xml.bind.Element;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 袁存波
 * @version 1.0
 * @create 2023-06-05 23:01
 * 注解的使用
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface ColumnName {
    /**
     * 列名
     *
     * @return 列名
     */
    String name();
}
