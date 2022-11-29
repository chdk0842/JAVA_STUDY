package test.ch11.system;

import java.util.Properties;
import java.util.Set;

public class GetPropertyEx {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");

		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);
		
		Properties props = System.getProperties();
		Set keys = props.keySet();
		
		for(Object objKey: keys) {
			String key = (String) objKey;
			System.out.println(key);
			
		}
	}

}
