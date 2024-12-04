package mvc01;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class EmployeeController {

	
	 
	 @Autowired
	 EmpDao dao;
	 
	 @RequestMapping(value ="/save", method = RequestMethod.POST)
	 public String saveEmpInfo(@ModelAttribute("emp") Employee emp) {
		 return "redirect:/viewemp";
	 }
	
	 
	 @RequestMapping("/viewemp")
	 public String viewemp(Model m) {
		List<Employee> list= dao.getEmployees();
		m.addAttribute("list", list);
		return "viewemp";
	 }
	 
}
