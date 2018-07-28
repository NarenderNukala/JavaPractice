
public class Switch {
	
	public static void main(String args[]) {
		double bill, drFee, roomRent;
		String admType = "HealthCard";
		
		switch (admType) {
		case "Insurance" :
			drFee = 450;
			roomRent = 2500;
			break;
		case "HealthCard" :
			drFee = 400;
			roomRent = 1500;
			break;
		case "Cash" :
			drFee = 400;
			roomRent = 2000;
			break;
		default :
			drFee = 300;
			roomRent = 1200;
		}
		
		bill = drFee + roomRent;
		System.out.println("Admission Type " + admType);
		System.out.println("Bill Amount " + bill);
	
	}
}
