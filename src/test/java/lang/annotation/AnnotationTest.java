package test.java.lang.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationTest {
    // @interface 意味着实现了annotation接口，该接口的实现细节由编译器完成，通过@interface定义注解后，该注解不能继承其他的注解或者接口
    // @Documented 缺省默认类或者方法的注解不会出现在javadoc中，使用该注解后表示可以出现在javadoc中。
    // @Target 指定注解的类型属性，指定注解的用途，更多的类型可以查看ElementType
    // @Retention 指定注解的作用域策略RetentionPolicy
}
