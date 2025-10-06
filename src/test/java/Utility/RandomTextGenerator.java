package Utility;

import java.util.Random;

public class RandomTextGenerator {
	
	static String characters ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	static StringBuilder name=new StringBuilder();
	static Random rd=new Random();
	
	public static String Generator(int length) {
		
		
		for (int i = 0; i < length; i++) {
			
			name.append(characters.charAt(rd.nextInt(characters.length())));
		}
		
	
		return name.toString();
		
	}

}
