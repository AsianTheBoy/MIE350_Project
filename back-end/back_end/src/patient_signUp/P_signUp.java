package patient_signUp;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class P_signUp extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) {
		String name = req.getParameter("name");
		String address = req.getParameter("inputAddress");
		String city = req.getParameter("inputCity");
		String province = req.getParameter("inputProvince");
		String postal = req.getParameter("inputPostal");
		String healthCard = req.getParameter("healthCard");
		String email = req.getParameter("email");
		String password = req.getParameter("pwd");
		
		System.out.println(name + " " + address + " " + city + " " + province + " " + postal + " " + healthCard + " " + email + " " + password);
			
	}
}
