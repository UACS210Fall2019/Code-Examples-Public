package Interfaces;

public class Dragon implements FireBreather, EggLayer {

	public static void main(String[] args) {
		Dragon myApp = new Dragon();
		
		System.out.println(myApp.identifyMyself());
	}

}
