package itbaizhan.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * ServletContext对象生命周期监听器
 */
public class ServletContextLifecycleListener implements ServletContextListener {
    /**
     * 监听ServletContext对象创建的监听方法
     *
     * @param sce
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ServletContext Init......");
    }

    /**
     * 监听ServletContext对象销毁的监听方法
     *
     * @param sce
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("ServletContext Destroy.......");
    }
}
