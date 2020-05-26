package com.you.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(ElementType.TYPE)
@Retention(RUNTIME)
public @interface Test727ServiceAPI {
    String moduleKey() default "";

    boolean rpcAPIProvided() default false;
    boolean mendatory() default true;
}