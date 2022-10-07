package log4jTutorialsPack;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Test {
	static Logger log =Logger.getLogger(Test.class);
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
			Test t=new Test();
			
	
		BasicConfigurator.configure();
		System.out.println(t.add(20, 10));
		log.info("code started to run");
		log.warn("Warning Issued");
		log.fatal("fatal error");
		log.debug("debbug");
		log.error("error");
		

		int a=10;
		int b=0;
		
		try {
			System.out.println(a/b);
		} 
		catch (Exception e) {
			log.error("cannot be divided by zero ", e);
		}
		
		
	}	

}
