package fr.initiation.hellojavaee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		try(PrintWriter out = response.getWriter()) {
			out.println("<!Doctype html>");
			out.println("<html>");
			out.println("    <head>");
			out.println("        <meta charset=\"UTF-8\">");
			out.println("        <title>First Servlet</title>");
			out.println("    </head>");
			out.println("    <body>");
			out.println("        <h2>L'heure en temps réel:</h2>");
			out.println("        <p>" + new Date() + "</p>");
			
			out.println( "        <form method='POST' action='FirstServlet'>" );
            out.println( "            <label for='txtLogin'>Login :</label>" ); 
            out.println( "            <input id='txtLogin' name='txtLogin' type='text' value='" +  "' autofocus /><br/>" );
            out.println( "            <label for='txtPassword'>Password :</label>" ); 
            out.println( "            <input name='txtPassword' type='password' value='" +  "' /><br/>" );
            out.println( "            <br/>" );
            out.println( "            <input name='btnConnect' type='submit' value='Se connecter' /><br/>" );
            out.println( "        </form>" );
			
			out.println("    </body>");
			out.println("</html>");
		} 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
