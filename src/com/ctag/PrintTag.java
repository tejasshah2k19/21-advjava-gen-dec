package com.ctag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class PrintTag extends TagSupport {

	int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int doStartTag() throws JspException {
		return EVAL_BODY_INCLUDE;
	}

	public int doAfterBody() throws JspException {
		count--;
		if (count > 0)
			return EVAL_BODY_AGAIN;// body again - print
		else
			return SKIP_BODY;
	}

	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}

}
