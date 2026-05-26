package chapter19;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import tool.Page;

@WebServlet(name = "chapter19SetNotice", urlPatterns = { "/chapter19/set-notice" })
public class SetNotice extends HttpServlet {

    List<String> notice;

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        Page.header(out);

        ServletContext context = getServletContext();

        String text = request.getParameter("notice");

        notice = new ArrayList<>();

        if (text != null && !text.isEmpty()) {
            notice.add(text);
            request.setAttribute("message", "お知らせが設定されました。");
        } else {
            notice.add("現在お知らせはありません。");
        }

        context.setAttribute("notice", notice);

        request.getRequestDispatcher("input-in.jsp")
               .forward(request, response);
    }
}