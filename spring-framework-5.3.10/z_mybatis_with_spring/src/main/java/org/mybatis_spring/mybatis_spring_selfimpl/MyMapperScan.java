package org.mybatis_spring.mybatis_spring_selfimpl;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(MapperBeanImportBeanDefinitionRegistrar.class)
public @interface MyMapperScan {
	String[] value() default {};
}
