package com.klef.jfsd.springboot.controller;

import java.io.IOException;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BuildScheduleServlet")
public class BuildScheduleServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException {
        
        // Get selected courses
        String[] selectedCourses = request.getParameterValues("selectedCourses");

        // Check if courses are selected
        if (selectedCourses == null || selectedCourses.length == 0) {
            request.setAttribute("message", "Please select at least one course.");
        } else {
            // Logic to save selected courses and build schedule
            // For simplicity, we just print the selected courses
            request.setAttribute("message", "Courses selected: " + Arrays.toString(selectedCourses));
        }

        // Forward back to JSP
        request.getRequestDispatcher("selectCoursesAndBuildSchedule.jsp").forward(request, response);
    }
}
