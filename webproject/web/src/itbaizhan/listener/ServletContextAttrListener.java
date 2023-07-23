package itbaizhan.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class ServletContextAttrListener implements ServletContextAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent scae) {
        System.out.println("------Start Added------");
        System.out.println(scae.getName() + " Value:" + scae.getValue());
        System.out.println(scae.getServletContext());
        System.out.println("-------End Added--------");
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent scae) {
        System.out.println("------Start Removed------");
        System.out.println(scae.getName() + " Value:" + scae.getValue());
        System.out.println(scae.getServletContext());
        System.out.println("-------End Removed--------");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent scae) {
        System.out.println("------Start Replaced------");
        System.out.println(scae.getName() + " Value:" + scae.getValue());
        System.out.println(scae.getServletContext());
        System.out.println("-------End Replaced--------");
    }
}
