package config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * 注册配置文件
 */

public class ServletInitializer extends AbstractDispatcherServletInitializer {
    /**
     * 注册SpringMVC的配置文件
     * @return
     */
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext
                = new AnnotationConfigWebApplicationContext();
        annotationConfigWebApplicationContext.register(SpringMVCConfig.class);
        return annotationConfigWebApplicationContext;
    }

    /**
     * 注册根配置文件
     * @return
     */
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        AnnotationConfigWebApplicationContext root
                = new AnnotationConfigWebApplicationContext();
        root.register(SpringConfig.class);
        return root;
    }

    /**
     * 在SpringMVC中，所有的请求都是先经过DispatcherServlet类，在进行分发相应的请求。
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        //所以先拦截所有的请求
        return new String[] {"/"};
    }
}
