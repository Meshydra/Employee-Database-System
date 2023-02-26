package myServlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dbcon.DBconnection;

/**
 * Servlet implementation class deleteEmployees
 */
public class deleteEmployees extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteEmployees() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nic = request.getParameter("nic");
		
		String sql = "DELETE FROM employees WHERE NIC = ?";
		try {
			Connection conn = DBconnection.connectDb();
			PreparedStatement stmt = conn.prepareStatement(sql);
		    stmt.setString(1, nic);
		    int rowsAffected = stmt.executeUpdate();
		    if (rowsAffected == 1) {
		        // employee was successfully deleted
		    } else {
		        // employee with given NIC not found
		    }
		} catch (SQLException ex) {
		    // handle SQL exception
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.sendRedirect("viewEmployees");
	}

}
