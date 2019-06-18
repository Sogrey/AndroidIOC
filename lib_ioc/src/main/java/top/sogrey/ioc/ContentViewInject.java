package top.sogrey.ioc;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 布局注解
 */
//RUNTIME 运行时检测，CLASS 编译时检测  SOURCE 源码资源时检测
@Retention(RetentionPolicy.RUNTIME)
//TYPE 用在类上  FIELD 注解只能放在属性上  METHOD 用在方法上  CONSTRUCTOR 构造方法上
@Target(ElementType.TYPE)
public @interface ContentViewInject {
    int value();//代表可以 Int 类型,取注解里面的参数
}