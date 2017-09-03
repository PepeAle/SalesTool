package ca.demo.salestool;

public class Main {

	public static void main(String[] args) {
		SalesData data= new SalesData();
		
		displayGretting();
		data.display();

	}

	private static void displayGretting() {
		System.out.println("Hello Happy Sales People");
		System.out.println("This App shows sales data");
		
	}

}
