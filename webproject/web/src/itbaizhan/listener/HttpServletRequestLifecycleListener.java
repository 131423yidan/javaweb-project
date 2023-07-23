package itbaizhan.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

public class HttpServletRequestLifecycleListener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("------Start requestDestroyed---------");
        System.out.println((HttpServletRequest) sre.getServletRequest());
        System.out.println("-------End requestDestroyed--------");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("------Start Initialized---------");
        System.out.println((HttpServletRequest) sre.getServletRequest());
        System.out.println("-------End Initialized--------");
    }
}
