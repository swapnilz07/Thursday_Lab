

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class delete_demo
 */
@WebServlet("/delete_demo")
public class delete_demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public delete_demo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		try {
			String q="delete from emp_table where emp_id=?";
			
			String emp_id;
			
			emp_id=request.getParameter("Id");
			int i=Integer.parseInt(emp_id);
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Swap_finance", "root", "root");
			PreparedStatement st=con.prepareStatement(q);
			
			st.setString(1, emp_id) ;
			
			int count=st.executeUpdate();
			
			if(count>0)
			{
				response.sendRedirect("datadeleted.jsp");
			}
			con.close();
			
		    }
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
