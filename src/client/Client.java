package client;

import java.io.PrintStream;
import java.net.*;
import java.util.Scanner;

public class Client {
	
	public static void main(String arg[]) {
		try {
			int number, temp;
			
			Scanner sc = new Scanner(System.in);
			
			Socket s = new Socket("127.0.0.1", 3000);
			
			Scanner sc1 = new Scanner(s.getInputStream());
			
			System.out.println("Enter a number");
			number = sc.nextInt();
			
			PrintStream p = new PrintStream(s.getOutputStream());
			
			p.println(number);
			
			temp = sc1.nextInt();
			System.out.println(temp);
		
		} catch (Exception e) {
			System.out.println("erreur serveur");
		}
		
	}

}
