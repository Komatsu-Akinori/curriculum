package check;

import constants.Constants;

public class Main {

	private static String firstName = "小松";
	private static String lastName = "礼法";

	private static void printName(String firstName,String lastName) {
		String fullname  = firstName + lastName;
		System.out.println("printName → " + fullname);
	}

	public static void main(String[] args) {

       printName(firstName,lastName);

       Pet x = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
       x.introduce();

       RobotPet y = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
       y.introduce();

	}

}

