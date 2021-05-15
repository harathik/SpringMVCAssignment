package EmpMan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import DB.EmpDAO;
import DB.ImpEmpDAO;
import EmpDet.Employee;

@Controller
public class FindEmployee {

	@RequestMapping(value = "/findEmployee", method = RequestMethod.GET)
	public String showLoginPage() {
		return "searchFirst";
	}

	@RequestMapping(value = "/findEmployee", method = RequestMethod.POST)
	public String show(@RequestParam int eid, Model model) {
		System.out.println(eid);
		EmpDAO emp = new ImpEmpDAO();
		Employee myEmployee = emp.getEmployee(eid);
		model.addAttribute("employee", myEmployee);
		return "searchSecond";
	}
}