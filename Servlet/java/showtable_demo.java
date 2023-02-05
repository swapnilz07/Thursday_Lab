

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.xdevapi.Statement;

/**
 * Servlet implementation class showtable_demo
 */
@WebServlet("/showtable_demo")
public class showtable_demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showtable_demo() {
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
			
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Swap_finance", "root", "root");
		java.sql.Statement st=con.createStatement();
		ResultSet rs=((java.sql.Statement) st).executeQuery("select * from emp_table");
				
		while(rs.next())
		{
			
		}
		con.close();
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
