<%-- 
    Document   : Signup
    Created on : 4 Nov, 2024, 10:26:05 AM
    Author     : drsab
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Up Page</title>
    </head>
    <body>
        <center>
            <form name ="myForm" onSubmit="return validdateForm()" action="signupcontroller.jsp">
                <input type="hidden" name="page" value="register">
                <table> 
                    <tr> 
                        <td colspan="2">
                               <center><h2>Sign Up</h2></center>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <label>First Name</label>
                        </td>
                        <td>
                            <input type="text" name="fname" class="text" placeholder="First Name">
                        </td>
                    </tr>
                    <tr>
                        <td>
                           <label>Last Name</label>
                        </td>
                        <td>
                             <input type="text" name="lname" class="text" placeholder="Last Name">
                        </td>
                    </tr>
                     <tr>
                        <td>
                           <label>Username</label>
                        </td>
                        <td>
                             <input type="text" name="uname" class="text" placeholder="Username">
                        </td>
                    </tr>
                     <tr>
                        <td>
                           <label>Password</label>
                        </td>
                        <td>
                             <input type="password" name="pass" class="text" placeholder="Password">
                        </td>
                    </tr>
                     <tr>
                        <td>
                           <label>Email</label>
                        </td>
                        <td>
                             <input type="email" name="email" class="text" placeholder="Email">
                        </td>
                    </tr>
                    <tr>
                        <td>
                           <label>Contact No</label>
                        </td>
                        <td>
                             <input type="text" name="contactno" class="text" placeholder="Contact No">
                        </td>
                    </tr>
                    <tr>
                        <td>
                           <label>City</label>
                        </td>
                        <td>
                            <input type="text" name="city" class="text" placeholder="City" required>
                        </td>
                    </tr>
                    <tr>
                        <td>
                           <label>Address</label>
                        </td>
                        <td>
                             <input type="text" name="address" class="text" placeholder="Address">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <center>
                            <input type ="submit" value="Register Now" class="button">
                            </center>
                        </td>
                    </tr>
                    
                 </table>
            </form>
    </body>
</html>
