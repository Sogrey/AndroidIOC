package top.sogrey.ioc;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 组件注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)//用在属性字段上
public @interface ViewInject {
    int value();
}