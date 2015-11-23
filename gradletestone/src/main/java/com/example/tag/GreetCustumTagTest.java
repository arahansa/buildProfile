package com.example.tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class GreetCustumTagTest extends SimpleTagSupport {
    private String username;
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    @Override
    public void doTag() throws JspException, IOException {
        if ("bluepoet".equals(username)) {
            getJspBody().invoke(null);
        }
    }
}