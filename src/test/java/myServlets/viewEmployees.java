package myServlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import objects.Employee;
import dbcon.DBconnection;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class viewEmployees
 */
public class viewEmployees extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewEmployees() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    try {
	        Connection conn = DBconnection.connectDb();
	        String sql = "SELECT * FROM employees";
	        PreparedStatement stmt = conn.prepareStatement(sql);
	        ResultSet rs = stmt.executeQuery();
	        
	        // Parse the result set
	        List<Employee> employeeList = new ArrayList<>();
	        while (rs.next()) {
	            Employee employee = new Employee();
	            employee.setNic(rs.getString("NIC"));
	            employee.setName(rs.getString("Name"));
	            employee.setDepartment(rs.getString("Department"));
	            employee.setDesignation(rs.getString("Designation"));
	            employee.setJoinDate(rs.getDate("JoinDate"));
	            // Add more fields as needed
	            employeeList.add(employee);
	        }
	        rs.close();
	        stmt.close();
	        conn.close();
	        
	        // Store the employee data in the request object as an attribute
	        request.setAttribute("employeeList", employeeList);
	        
	        RequestDispatcher dispatcher = request.getRequestDispatcher("dashboard.jsp");
	        dispatcher.forward(request, response);
	    } catch (SQLException e) {
	        e.printStackTrace();
	        // Handle the exception
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	        // Handle the exception
	    }
	}


}
