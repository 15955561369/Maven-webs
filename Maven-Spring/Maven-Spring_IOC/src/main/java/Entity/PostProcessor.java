package Entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Spring的生命周期：
 *  Bean的后置处理器
 */
public class PostProcessor implements BeanPostProcessor {
    /**
     * 执行在init前
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("【后置处理器：执行在init前】");
        return null;
    }

    /**
     * 执行在init后
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("【后置处理器：执行在init后】");
        return null;
    }


}
