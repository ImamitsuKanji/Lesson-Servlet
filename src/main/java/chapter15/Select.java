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

@WebServlet("/chapter14/select")
public class Select extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		try {
			
			SelectDAO dao=new SelectDAO();
			List<Bean> list=dao.review();
			request.setCharacterEncoding("UTF-8");
			

			Page.header(out);
			out.print("<p>" + count + "この商品をカートに入れました。</p>");
			out.print("<p>お支払いを" + payment + "に設定しました。</p>");
			out.print("<p>ご感想ありがとうございました</p>");
			out.print("<p>「" + review + "」</p>");
			if (mail != null) {
				out.print("<p>メールをお送りいたします。</p>");
				mail="メールをお送りいたします。";
			} else {
				out.print("<p>メールをお送りいたしません。</p>");
				mail="メールをお送りいたしません。";
			}
			
		} catch (Exception e) {
			e.printStackTrace(out);
		}

		Page.footer(out);
	}

}
