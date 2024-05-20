

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class resultServlet
 */
public class resultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public resultServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		int firstValue = Integer.parseInt(req.getParameter("value1"));
		int SecondValue = Integer.parseInt(req.getParameter("value2"));
		int Addition =firstValue+SecondValue;
		int Multiply = firstValue * SecondValue;
		int Divison = firstValue / SecondValue;
		if (req.getParameter("Addition") != null) {
			pw.println("Addition Result is: "+Addition);
		}
		else if (req.getParameter("Multiply") != null) {
			pw.println("MultiplicationResult is: "+ Multiply);
		}
		else if(req.getParameter("Divison") != null) {
			pw.println("DivisonResult is: "+ Divison);
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
