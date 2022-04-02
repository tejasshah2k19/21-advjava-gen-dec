package com.ctag;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CopyTag extends TagSupport {

	public int doStartTag() throws JspException {
		// main logic

		JspWriter out = pageContext.getOut();
		Calendar c = Calendar.getInstance();
		try {
			out.print("&copy;" + c.get(Calendar.YEAR));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return EVAL_BODY_INCLUDE;
		// return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		// execute page or not
		return EVAL_PAGE;
//		return SKIP_PAGE;
	}
}
//<copy></copy>