package DB;

import java.util.List;

import org.springframework.stereotype.Repository;

import EmpDet.Employee;

@Repository
public interface EmpDAO {

	public void insert(Employee e);

	public List<Employee> getEmployees();

	Employee getEmployee(int eid);

	void update(Employee employee);

	public void delete(int eid);

	/* public boolean findUser(String username, String password); */

}
