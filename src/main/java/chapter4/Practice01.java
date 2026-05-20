package chapter4;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/chapter4/Practice01")
public class Practice01 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;UTF-8");
		PrintWriter out = response.getWriter();

		request.setCharacterEncoding("UTF-8");

		java.time.format.DateTimeFormatter fmt = java.time.format.DateTimeFormatter.ofPattern("yyyy年MM月dd日(E)HH時mm分ss秒");
		String now = java.time.LocalDateTime.now().format(fmt);
		out.println("""
				<html><body>
				<p>現在の時刻は
				"""
				 + now + 
				 "です</p>");
	}

}
