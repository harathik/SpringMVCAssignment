package EmpMan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import DB.EmpDAO;
import DB.ImpEmpDAO;
import EmpDet.Employee;

@Controller
public class AddNewEmployee {

	@RequestMapping(value = "/newEmployee", method = RequestMethod.GET)
	public String showLoginPage() {
		return "addEmployee";
	}

	@RequestMapping(value = "/newEmployee", method = RequestMethod.POST)
	public String showDetails(ModelMap map, @ModelAttribute("model") Employee e) {

		System.out.println(e);
		EmpDAO emp = new ImpEmpDAO();
		emp.insert(e);
		map.put("message", "Employee Registered Succesfully");
		return "final";

	}

}
