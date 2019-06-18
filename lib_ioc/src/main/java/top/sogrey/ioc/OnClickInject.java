package top.sogrey.ioc;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 事件注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)//使用在方法上
public @interface OnClickInject {
    //会有很多个点击事件，所以使用数组
    int[] value();
}