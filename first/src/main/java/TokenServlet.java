

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Servlet implementation class TokenServlet
 */
public class TokenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TokenServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String tokenID = request.getParameter("tokens");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<html><head><title>Tokens</title></head><body>");
		pw.println("style\font-family:roboto;font-size:10px\">");
		if (tokenID == null) {
			Random rnd = new Random();
			tokenID = Long.toString(rnd.nextLong());
			pw.println("<p>Welcome a new Token"+tokenID+"is now established.</p>");
			
		} else {
			pw.println("<p>Welcome back Your token is "+tokenID+"</p>");
		}
		
		String requestURLSame = request.getRequestURL().toString()+"?tokens="+tokenID;
		String requestURLNew = request.getRequestURL().toString();
		pw.println("<p>Click <a href="+requestURLSame+"> here </a> again to continue browsing with same identity.</p>");
		pw.println("<p>Click <a href="+requestURLNew+"> here </a> to continue browsing with a new identity.</p>");
		pw.println("</body></html>");
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
