package us.codecraft.tinyioc.aop;

/**
 * AopProxy是个标志型接口
 * 暴露获取aop代理对象方法的接口
 */
public interface AopProxy {

    /**
     * 获取代理对象的接口方法
     */
    Object getProxy();
}
