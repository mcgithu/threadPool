package com.example.demo.handle;

import com.example.demo.enums.MSG_TYPE;

import java.lang.annotation.*;

@Documented
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MsgTypeHandler {

    MSG_TYPE value();
}

