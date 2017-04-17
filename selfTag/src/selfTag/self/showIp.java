package selfTag.self;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.Tag;

public class showIp implements Tag{

	 private PageContext pageContext = null;

     @Override
     public void setPageContext(PageContext pageContext) {
         this.pageContext = pageContext;
     }
	
	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();
		String ip = request.getRemoteAddr();
		JspWriter jspWriter = pageContext.getOut();
		try {
			jspWriter.write(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Tag getParent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void release() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setParent(Tag arg0) {
		// TODO Auto-generated method stub
		
	}

}
