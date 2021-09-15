package controller;

import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.context.WebContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController implements IController {

    public void process( final HttpServletRequest request, final HttpServletResponse response, final ServletContext servletContext, final ITemplateEngine templateEngine)  throws Exception {
        WebContext ctx = new WebContext(request, response, servletContext, request.getLocale());
        ctx.setVariable("site_name", "Groco");
        templateEngine.process("index", ctx, response.getWriter());
    }
}
