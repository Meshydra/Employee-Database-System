package myServlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dbcon.DBconnection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/createEmployee")
public class createEmployees extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the form data from the request
        String nic = request.getParameter("nic");
        String name = request.getParameter("name");
        String department = request.getParameter("department");
        String designation = request.getParameter("designation");
        String joinDate = request.getParameter("date");

        // Insert the data into the database
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            // Load the database driver
        	conn = DBconnection.connectDb();

            // Create the SQL statement
            String sql = "INSERT INTO employees (NIC, Name, Department, Designation, joinDate) "
                    + "VALUES (?, ?, ?, ?, ?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, nic);
            stmt.setString(2, name);
            stmt.setString(3, department);
            stmt.setString(4, designation);
            stmt.setString(5, joinDate);

            // Execute the SQL statement
            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted == 0) {
                throw new SQLException("Insert failed, no rows affected");
            }

            // Redirect the user to the employee list page
            response.sendRedirect("viewEmployees");

        } catch (ClassNotFoundException | SQLException e) {
            throw new ServletException("Database error", e);
        } finally {
            // Close the database resources
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    // Ignore
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    // Ignore
                }
            }
        }
    }
}
