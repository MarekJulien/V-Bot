package com.vbot.program;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TokenManager {

	public static String getToken() {
		
		// Define local token path
		File file = new File("/home/vbot/token.txt");
		
		// Declare Scanner
		Scanner scanner = null;
		
		// Create scanner
		try {
			scanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// Read token from file
		String token = scanner.nextLine();
		
		// Return token
		return token;
		
	}
	
}
