package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContactServlet
 */
@WebServlet("/servlet/contactServlet")
public class ContactServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		
		String[] name =request.getParameterValues("name");
		String[] typs =request.getParameterValues("typs");
		String coontact = request.getParameter("coontact");
		
		for(String s:name) {
			out.println(s);
		}
		
		for(String s:typs) {
			out.println(s);
		}
		
		out.println(coontact);
	}

}
