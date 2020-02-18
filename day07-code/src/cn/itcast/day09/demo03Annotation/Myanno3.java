package cn.itcast.day09.demo03Annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Target：描述注解能够作用的位置
 *         * ElementType取值：
 *         * TYPE：可以作用于类上
 *         * METHOD：可以作用于方法上
 *         * FIELD：可以作用于成员变量上
 *         * @Retention：描述注解被保留的阶段
 *         * @Retention(RetentionPolicy.RUNTIME)：当前被描述的注解，会保留到class字节码文件中，并被JVM读取到
 *         * @Documented：描述注解是否被抽取到api文档中
 *         * @Inherited：描述注解是否被子类继承
 */
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Myanno3 {
}
