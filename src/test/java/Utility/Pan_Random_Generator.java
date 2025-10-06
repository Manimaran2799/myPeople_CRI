package Utility;

import java.util.Random;

public class Pan_Random_Generator {

	public static String PanGenerator(String lastname) {

		String Characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuilder sb = new StringBuilder();
		Random rd = new Random();

		// first 3characters
		for (int i = 0; i < 3; i++) {

			sb.append(Characters.charAt(rd.nextInt(Characters.length())));
		}

		// fourth character random generator
		String fourth = "PFCHAT";

		for (int i = 0; i < 1; i++) {

			sb.append(fourth.charAt(rd.nextInt(fourth.length())));
		}

		// fifth character
		char fifth = lastname.toUpperCase().charAt(0);
		sb.append(fifth);

		// next four characters

		for (int i = 0; i < 4; i++) {
			sb.append(rd.nextInt(10));
		}

		// last character
		sb.append(Characters.charAt(rd.nextInt(Characters.length())));

		return sb.toString();
	}

}
