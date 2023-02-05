

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
 * Servlet implementation class changefirstname
 */
@WebServlet("/changefirstname")
public class changefirstname extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public changefirstname() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		try
		{
			String q="Update emp_table set first_name=? where emp_id=?";
			String fname,emp_id;
		
			fname=request.getParameter("firstname");
			
			emp_id=request.getParameter("Id");
			int i = Integer.parseInt(emp_id);
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Swap_finance", "root", "root");
		    PreparedStatement st=con.prepareStatement(q);
		    
		    st.setString(1, fname);
		    st.setString(2, emp_id);
		    st.executeUpdate();
		    response.sendRedirect("namechanged.jsp");
		    con.close();
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
