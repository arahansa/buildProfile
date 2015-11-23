package com.example;

import java.io.IOException;
import java.time.LocalTime;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class AdvisorTagHandler extends SimpleTagSupport {
	private Integer seconds;

	public void doTag() throws JspException, IOException {
		LocalTime timeOfDay = LocalTime.ofSecondOfDay(seconds / 1000);
		getJspContext().getOut().write("Hello " + timeOfDay.toString() + " <br>");

	}

	public void setSeconds(Integer seconds) {
		this.seconds = seconds;
	}

	

}