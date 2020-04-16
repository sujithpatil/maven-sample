package AEMProject.core.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;

@Component(service=Servlet.class,property= {
		Constants.SERVICE_DESCRIPTION + "=Servlet to get title",
        "sling.servlet.methods=GET",
        "sling.servlet.resourceTypes=AEMproject/components/structure/page",
        "sling.servlet.extensions=" + "txt"
})
public class TitleServlet extends SlingSafeMethodsServlet {
	@Override
	protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Sujith ---------------------");
		response.getWriter().write("<h1>Sujith</h1>");
	}
}
