

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
 * Servlet implementation class ins_demo
 */
@WebServlet("/ins_demo")
public class ins_demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ins_demo() {
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
		String que="Insert into emp_table(emp_id, first_name, last_name, emp_email, emp_department, emp_designation)values(?, ?, ?, ?, ?, ?)";
		
		String firstname,lastname,gmail,department,designation,emp_id;
	
		emp_id=request.getParameter("emp_id");
	    int i=Integer.parseInt(emp_id);
       
	    firstname=request.getParameter("fnaem");
	    lastname=request.getParameter("lname");
	    gmail=request.getParameter("gmail");
	    department=request.getParameter("emp_dep");
	    designation=request.getParameter("emp_des");
	    
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Swap_finance", "root", "root");
		PreparedStatement st=con.prepareStatement(que);
		
		st.setString(1, emp_id);
		st.setString(2, firstname);
		st.setString(3, lastname);
		st.setString(4, gmail);
		st.setString(5, department);
		st.setString(6,designation);

		int count=st.executeUpdate();
		
		if(count>0)
		{
			response.sendRedirect("datainserted.jsp");
		}
		
		con.close();
			
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
