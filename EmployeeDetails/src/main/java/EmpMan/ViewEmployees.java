package EmpMan;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import DB.EmpDAO;
import DB.ImpEmpDAO;
import EmpDet.Employee;

@Controller
public class ViewEmployees {

	private EmpDAO employeeDAO = new ImpEmpDAO();

	@RequestMapping(value = "/viewEmployee", method = RequestMethod.GET)
	public String showLoginPage(Model model) {
		List<Employee> emp = employeeDAO.getEmployees();
		model.addAttribute("employees", emp);
		return "viewEmployee";
	}

}
