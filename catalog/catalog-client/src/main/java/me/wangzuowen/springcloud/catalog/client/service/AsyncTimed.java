package me.wangzuowen.springcloud.catalog.client.service;

import java.lang.annotation.*;

@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AsyncTimed {

}
