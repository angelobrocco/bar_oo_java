package entities;

public class Bill {
	
	public static char gender;
	public static int beer = 5;
	public static int barbecue = 7;
	public static int softDrink = 3;
	
	public double cover() {
		if (total() > 30) {
			return 0.0;
		}
		else {
			return 4.00;
		}	
	}
	
	public double feeding() {
			return beer + barbecue + softDrink;
	}
	
	public static double ticket() {
		if (gender == 'F') {
			return 8;
		}
		else {
			return 10;
		}
	}
	
	public double total() {
		return feeding() + ticket();
	}

}
