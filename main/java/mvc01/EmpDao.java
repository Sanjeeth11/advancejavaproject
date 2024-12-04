package mvc01;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmpDao {
	
	JdbcTemplate template;
	
	public EmpDao(JdbcTemplate template) {
		this.template=template;
	}

	public List<Employee> getEmployees() {
		return template.query("select * from employee", new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				return e;	
			}
		});
			
			
		

}
}
