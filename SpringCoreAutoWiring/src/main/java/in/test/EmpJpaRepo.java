package in.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmpJpaRepo implements IEmpRepo{
	
	@Value("EMPLOYEE - JPA")
	private String model;

	@Override
	public String toString() {
		return "EmpJdbcRepo [model=" + model + "]";
	}
}
