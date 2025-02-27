package ReadTheData;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class CreateOrgTest {
	
	
	@Test
	public void createOrgTest(XmlTest test) {
		String URL=test.getParameter("url");
		String BROWSER=test.getParameter("browser");
		String USERNAME=test.getParameter("username");
		String  PASSWORD=test.getParameter("password");
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}

}
