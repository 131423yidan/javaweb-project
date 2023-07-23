package itbaizhan.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

/**
 * HttpservletRequest对象属性监听器
 */
public class HttpServletRequestAttrListener implements ServletRequestAttributeListener {
    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println("----HttpServletRequestAttrListener------Start Added---------");
        System.out.println("Name: " + srae.getName() + " value: " + srae.getValue());
        System.out.println(srae.getServletRequest());
        System.out.println("----HttpServletRequestAttrListener------End Added-------");
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println("----HttpServletRequestAttrListener------Start Removed---------");
        System.out.println("Name: " + srae.getName() + " value: " + srae.getValue());
        System.out.println(srae.getServletRequest());
        System.out.println("----HttpServletRequestAttrListener------End Removed-------");
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println("----HttpServletRequestAttrListener------Start Replaced---------");
        System.out.println("Name: " + srae.getName() + " value: " + srae.getValue());
        System.out.println(srae.getServletRequest());
        System.out.println("----HttpServletRequestAttrListener------End Replaced-------");
    }
}
