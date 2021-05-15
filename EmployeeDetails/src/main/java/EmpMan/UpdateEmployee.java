
package EmpMan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import DB.EmpDAO;
import DB.ImpEmpDAO;
import EmpDet.Employee;

@Controller
public class UpdateEmployee {

	@RequestMapping(value = "/updateEmployee", method = RequestMethod.GET)
	public String showLoginPage() {
		return "updateFirst";
	}

	@RequestMapping(value = "/upEmployee", method = RequestMethod.POST)
	public String show(@RequestParam int eid, @ModelAttribute("employee") Employee employee) {
		System.out.println(eid);
		EmpDAO emp = new ImpEmpDAO();
		Employee myEmployee = emp.getEmployee(eid);
		employee.setEid(myEmployee.getEid());
		employee.setEname(myEmployee.getEname());
		employee.setEdept(myEmployee.getEdept());
		employee.setEdesignation(myEmployee.getEdesignation());
		employee.setEsalary(myEmployee.getEsalary());
		return "updateSecond";
	}

	@RequestMapping(value = "/updateemployee", method = RequestMethod.POST)
	public String show(Model model, @ModelAttribute Employee e) {
		EmpDAO emp = new ImpEmpDAO();
		emp.update(e);
		model.addAttribute("message", "Updated Succesfully");
		return "final";
	}

}
