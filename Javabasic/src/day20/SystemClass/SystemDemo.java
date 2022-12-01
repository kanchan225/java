package day20.SystemClass;

public class SystemDemo {

	public static void main(String[] args) {
		//checking specific property
		System.out.println("System user Dir : "+System.getProperty("user.home"));
		System.out.println("Current working Dir : "+System.getProperty("user.dir"));
        //clearing this property
		System.clearProperty("user.home");
		System.out.println(System.getProperty("user.home"));
		 //setting specific property
		System.setProperty("user.home", "F:\\GitAutomation\\MorningBatch");
		System.out.println("Updated system user dir : "+System.getProperty("user.home"));
		 //setting specific property
		System.setProperty("user.country", "IND");
		//checking property
		System.out.println(System.getProperty("user.country"));
		
		//illustrating getProperty(string key, string def)
	    System.out.println("other than system property : "+System.getProperty("user.password", "none of your business"));
	    System.out.println("Difference between the current time and midnight, January 1, 1970 UTC is : "+System.currentTimeMillis());
	    System.out.println("current time in "+"nano sec : "+System.nanoTime());
	    System.out.println(System.getProperty("java.home"));
	}

}
