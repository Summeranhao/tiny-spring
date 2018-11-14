package us.codecraft.tinyioc.aop;

/**
 * 类匹配器
 */
public interface ClassFilter {

    /**
     * 用于匹配targetClass是否是要拦截的类
     */
    boolean matches(Class targetClass);

}