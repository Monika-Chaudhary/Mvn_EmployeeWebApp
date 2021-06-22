

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Welcome() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String ename=request.getParameter("ename");
		String eid=request.getParameter("eid");
		String email=request.getParameter("email");
		out.print("<html>");
		out.print("<head><title>Employee Info</title></head>");
		out.print("<body style='background-color:pink;margin:200px;'>");
		out.print("<center><h1 style='color:Red'>EMPLOYEE INFORMATION</h1></center>");
		out.print("<center><h2 style='color:blue'>Employee Name : "+ename+"</h2></center>");
		out.print("<center><h2 style='color:blue'>Employee Id : "+eid+"</h2></center>");
		out.print("<center><h2 style='color:blue'>Employee Email : "+email+"</h2></center>");
		out.print("</body></html>");
		out.close();
	}

}
