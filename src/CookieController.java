

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CookieController")
public class CookieController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("name");
		String password = request.getParameter("pass");
		
		//Cookies
		Cookie cookie = new Cookie("Username", username);
		response.addCookie(cookie);
		
		//Sessions
		HttpSession session = request.getSession();
		session.setAttribute("Password", password);

		response.sendRedirect("Result.jsp");
	}

}
