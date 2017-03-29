package ca.demo.salestool;

public class Main {

	public static void main(String[] args) {
		SalesData data = new SalesData();
		data.display();
		displayGreeting();
	}

	public static void displayGreeting() {
		System.out.println("Hello happy Sales people");
		System.out.println("This app Shows Sales Data");
	}
}
