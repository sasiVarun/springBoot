package in.cg;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DbCon {
//	@Value("Oracle")
	@Value("${com.app.driver}")
	private String db;
//	@Value("jdbc-orcl")
	@Value("${com.app.url}")
	private String url;

	@Value("${com.app.port}")
	private int port;

	@Override
	public String toString() {
		return "DbCon [db=" + db + ", url=" + url + ", port=" + port + "]";
	}

}
