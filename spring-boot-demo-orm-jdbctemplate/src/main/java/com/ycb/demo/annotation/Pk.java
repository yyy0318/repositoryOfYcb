package com.ycb.demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 袁存波
 * @version 1.0
 * @create 2023-06-05 22:49
 * 自增注解
 * Retention注解是什么意思？注解类的生命周期
 * Target注解是什么意思？@Target 说明了Annotation所修饰的对象范围
 */
//注解不仅被保存到class文件中，jvm加载class文件之后，仍然存在；
@Retention(RetentionPolicy.RUNTIME)
//该注解只能声明在一个类的字段前。
@Target({ElementType.FIELD})
public @interface Pk {
    /**
     * 自增
     *
     * @return 自增主键
     */
    boolean auto() default true;
}

