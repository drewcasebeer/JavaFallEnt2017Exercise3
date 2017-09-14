package edu.matc.taglibdemo;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HelloWorldTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out = getJspContext().getOut();
        String morningMessage = "";
        if(Calendar.getInstance().get(Calendar.AM_PM) == Calendar.AM) {
            morningMessage = "Good Morning ";
        } else {
            morningMessage = "Good Evening ";
        }
        out.println(morningMessage + "Enterprise Java. ");
        out.println("The Current Time is: " + new SimpleDateFormat("M/d/yyy h:mm:ss a").format(Calendar.getInstance().getTime()));
    }
}
