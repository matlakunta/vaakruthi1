

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Servlet implementation class ShowParameters
 */
public class ShowParameters extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Request HTTP Parameters Sent</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<p>Parameters sent in the request:</p>");
		Enumeration enm = req.getParameterNames();
		while(enm.hasMoreElements()) {
			String name = (String)enm.nextElement();
			String[] values = req.getParameterValues(name);
			out.print("<b>"+name+"</b>");
			for (int i =0; i<values.length;i++) {
				out.print(values[i]+"<br>");
			}
		}
		out.print("</body>");
		out.print("</html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
