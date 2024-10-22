package pack.cf.prop;

public class Main {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		try {
			prop.load(Main.class.getResourceAsStream("mysqlConn.properties"));
			System.out.println(prop.getPropety("driver"));
			System.out.println(prop.getPropety("url"));
			System.out.println(prop.getPropety("uid"));
			System.out.println(prop.getPropety("pwd"));
		} catch (Exception e) {
			System.out.println(e.getMessage( ));
		}

	}

}
