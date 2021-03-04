package fr.initiation.hellojavaee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstControler
 */
@WebServlet("/FirstControler")
public class FirstControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstControler() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String login = request.getParameter("txtLogin");
		String password = request.getParameter("txtPassword");
		if (login == null) {
			login = "";
		}
		if (password == null) {
			password = "";
		}
		HttpSession model = request.getSession(true); //force session opening
		model.setAttribute("login", login);
		model.setAttribute("password", password);
		request.getRequestDispatcher("/FirstView.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String login = request.getParameter("txtLogin");
		String password= request.getParameter("txtPassword");
		HttpSession model = request.getSession(true);
		model.setAttribute("login", login);
		model.setAttribute("password", password);
		if (login.equals("bond") && password.equals("007") )  {
			model.setAttribute("isConnected", true);
			request.getRequestDispatcher("/Landing.jsp").forward(request, response);
		} else {
			model.setAttribute("isConnected", false);
			request.getRequestDispatcher("/FirstView.jsp").forward(request, response);
		}
	}

}
