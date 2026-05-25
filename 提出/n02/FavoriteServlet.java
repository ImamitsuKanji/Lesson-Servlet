package n02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import beans.Favorite;



@WebServlet("/n02/favorite-servlet")
public class FavoriteServlet extends HttpServlet {

	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String url = request.getParameter("url");

		HttpSession session = request.getSession();

		List<Favorite> favorite = (List<Favorite>) session.getAttribute("favorite");
		if (favorite == null) {
			favorite = new ArrayList<Favorite>();
		}

		Favorite f = new Favorite();
		f.setName(name);
		f.setURL(url);
		favorite.add(f);

		session.setAttribute("favorite", favorite);
		
		response.sendRedirect(request.getContextPath() + "/n02/favorites.jsp");
	}

}
