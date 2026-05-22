package chapter15;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import tool.Page;

@WebServlet("/chapter15/product")
public class Product extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Page.header(out);
		try {
			ProductDAO dao=new ProductDAO();
			String sort=request.getParameter("sort");
			List<Bean> list=dao.All(sort);
			
			for(Bean b: list) {
				out.print(b.getId()
						+ ":"
						+ b.getName()
						+ ":"
						+ b.getPrice()
						+ "<br>");
			}

		} catch (Exception e) {
			e.printStackTrace(out);
		}
		Page.footer(out);
	}
}
