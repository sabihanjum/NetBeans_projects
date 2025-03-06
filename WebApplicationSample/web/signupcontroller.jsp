<%-- 
    Document   : signupcontroller
    Created on : 5 Nov, 2024, 11:26:56 AM
    Author     : drsab
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<% 
    String firstname = request.getParameter("fname");
    String lastname = request.getParameter("lname");
    String username = request.getParameter("uname");
    String password = request.getParameter("pass");
    String email = request.getParameter("email");
    String phone = request.getParameter("contactno");
    String address = request.getParameter("address");
    String city = request.getParameter("city");
    
    if (firstname != null && lastname != null && username != null && password != null && email != null && phone != null && 
            address != null && city != null)
    {
         Connection conn = null;
         PreparedStatement pst = null;
         try{
      
         Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb", "root", "Root");
         
         String query = "INSERT INTO users(fname, lname, uname, pass, email, phone, address, city) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
         pst = conn.prepareStatement(query);
         pst.setString(1, firstname);
         pst.setString(2, lastname);
         pst.setString(3, username);
         pst.setString(4, password);
         pst.setString(5, email);
         pst.setString(6, phone);
         pst.setString(7, address);
         pst.setString(8, city);
         
         int result = pst.executeUpdate();
         if (result > 0){
             out.println("<p>Registration successfull!</p>");
             response.sendRedirect("login.jsp");
         } else {
             out.println("<p>Registration failed. Please try again.");
         }
    } catch (Exception e) {
            out.println("Error: " + e.getMessage());
    } finally {
            if (pst != null) pst.close();
            if (conn != null) conn.close();
         }             
      
    }
%>
