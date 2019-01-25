/* The class would respond to the customer form and process
 * the customer data for display
 */

package com.tfernando;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;  

public class GetData extends HttpServlet {
 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
         
        // read form fields
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String birthday = request.getParameter("birthday");
        String country = request.getParameter("country");
        
        // format date
        DateUtil dateUtil = new DateUtil();
        String dateOfBirth = dateUtil.FormatBithDate(birthday);
         
        // get age
        int age = dateUtil.calculateAge(dateUtil.parseDate(birthday));
        
        // query parameters
        request.setAttribute("fname", firstname);
        request.setAttribute("lname", lastname);
        request.setAttribute("bdate", dateOfBirth);
        request.setAttribute("cont", country);
        request.setAttribute("age", age);
        
        // send the response
        request.getRequestDispatcher("displaypage.jsp").forward(request, response);
    }
}