package in.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmpService {
	
	@Value("EMP_SERV")
	private String mode;
	
//	@Autowired
//	@Qualifier("empJdbcRepo")
	@Value("#{empJpaRepo}")
	private IEmpRepo repo;

	@Override
	public String toString() {
		return "EmpService [mode=" + mode + ", repo=" + repo + "]";
	}
}
