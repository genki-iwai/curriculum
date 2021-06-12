package check;

import constants.Constants;

public class Check extends Constants{

	private  static String firstName = "岩井";
	private  static String lastName = "彦樹";

	private static void printName(String firstName,String lastName){
		System.out.println("printNameメソッド→" + firstName + lastName);
	}

	public static void  main(String[] args) {

		printName(firstName, lastName);


		Pet pet = new Pet(CHECK_CLASS_JAVA, CHECK_CLASS_HOGE);
		pet.introduce();

		RobotPet robotPet = new RobotPet(CHECK_CLASS_R2D2, CHECK_CLASS_LUKE);
		robotPet.introduce();
	}

}
