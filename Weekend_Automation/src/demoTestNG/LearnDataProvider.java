package demoTestNG;

import org.testng.annotations.DataProvider;

public class LearnDataProvider {
	@DataProvider
public Object[][] getData() {
	Object[][]data= {{"admin","manager"},{"admin1","manager1"},{"manager","admin"},{"Admin","Admin1234"}};
	return data;
}
}
