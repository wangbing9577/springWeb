package cn.com.aizhiSoft.web.framework;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import cn.com.aizhiSoft.web.framework.config.AppContextConfig;
import cn.com.aizhiSoft.web.framework.config.WebConfig;

public class ServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class[]{AppContextConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// specify the servlet's configuration class
		return new Class<?>[]{WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// mapping "/" to DispatcherServlet
		return new String[]{"/"};
	}

}
