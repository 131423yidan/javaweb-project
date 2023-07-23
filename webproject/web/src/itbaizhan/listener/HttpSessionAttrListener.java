package itbaizhan.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * HttpSession对象属性监听器
 */
public class HttpSessionAttrListener implements HttpSessionAttributeListener {
    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        System.out.println("----HttpSessionAttrListener------Start Added---------");
        System.out.println("Name: " + se.getName() + " value: " + se.getValue());
        System.out.println(se.getSession());
        System.out.println("----HttpSessionAttrListener------End Added-------");
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {
        System.out.println("----HttpSessionAttrListener------Start Removed---------");
        System.out.println("Name: " + se.getName() + " value: " + se.getValue());
        System.out.println(se.getSession());
        System.out.println("----HttpSessionAttrListener------End Removed-------");
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {
        System.out.println("----HttpSessionAttrListener------Start Replaced---------");
        System.out.println("Name: " + se.getName() + " value: " + se.getValue());
        System.out.println(se.getSession());
        System.out.println("----HttpSessionAttrListener------End Replaced-------");
    }
}
