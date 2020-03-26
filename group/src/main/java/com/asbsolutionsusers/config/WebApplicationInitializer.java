package com.asbsolutionsusers.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

@Configuration
public class WebApplicationInitializer implements org.springframework.web.WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ctx
                = new AnnotationConfigWebApplicationContext();
        ctx.register(WebMvcConfigure.class);
        ctx.setServletContext(servletContext);

        ServletRegistration.Dynamic servlet = servletContext.addServlet(
                "dispatcherExample", new DispatcherServlet(ctx));
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/");
    }
}
