package patient_profile;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdatePatientProfile extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) {
		// accept the request from the user
		String newName = req.getParameter("newName");
		String newAddress = req.getParameter("newAddress");
		String newCity = req.getParameter("newCity");
		String newState = req.getParameter("newState");
		String newZip = req.getParameter("newZip");
		String newHealthCard = req.getParameter("newHealthCard");
		String newEmail = req.getParameter("newEmail");
		
		System.out.println(newName);
	}
}
