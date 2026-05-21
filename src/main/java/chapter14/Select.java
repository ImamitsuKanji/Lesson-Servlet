package chapter14;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.InitialContext;
import javax.sql.DataSource;

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
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource) ic.lookup(
					"java:/comp/env/jdbc/book");

			Connection con = ds.getConnection();

			request.setCharacterEncoding("UTF-8");
			String count = request.getParameter("count");
			String payment = request.getParameter("payment");
			String review = request.getParameter("review");
			String mail = request.getParameter("mail");

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
			

			PreparedStatement st = con
					.prepareStatement("insert into productreview(count,payment,review,mail) values(?,?,?,?)");

			st.setString(1, count);
			st.setString(2, payment);
			st.setString(3, review);
			st.setString(4, mail);
			int line = st.executeUpdate();

			if (line > 0) {
				out.println("追加に成功しました。");
			}

			st.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace(out);
		}

		Page.footer(out);
	}

}
