package in.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmpJdbcRepo implements IEmpRepo{
	
	@Value("EMPLOYEE - JDBC")
	private String model;

	@Override
	public String toString() {
		return "EmpJdbcRepo [model=" + model + "]";
	}
}
