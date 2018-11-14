package us.codecraft.tinyioc.beans;

/**
 * 从配置中读取BeanDefinition
 *
 * 解析 BeanDefinition 的接口
 * 暴露加载bean定义的方法
 */
public interface BeanDefinitionReader {

    /**
     * 根据地址加载bean的定义
     */
    void loadBeanDefinitions(String location) throws Exception;

}
