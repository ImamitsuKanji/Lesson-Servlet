package chapter4;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Practice02
 */
@WebServlet("/Practice02")
public class Practice02 extends HttpServlet {

	 @Override
	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	        response.setContentType("text/html; charset=UTF-8");

	        // ブラウザの言語情報を取得
	        String language = request.getHeader("Accept-Language");

	        String greeting;

	        // 言語によって挨拶を変更
	        if (language != null) {

	            if (language.startsWith("ja")) {
	                greeting = "こんにちは";
	            } else if (language.startsWith("en")) {
	                greeting = "Hello";
	            } else {
	                greeting = "Greetings";
	            }

	        } else {
	            greeting = "言語情報を取得できませんでした";
	        }

	        PrintWriter out = response.getWriter();

	        out.println("<html>");
	        out.println("<head><meta charset='UTF-8'></head>");
	        out.println("<body>");
	        out.println("<h1>" + greeting + "</h1>");
	        out.println("<p>取得した言語情報: " + language + "</p>");
	        out.println("</body>");
	        out.println("</html>");
	}

}
