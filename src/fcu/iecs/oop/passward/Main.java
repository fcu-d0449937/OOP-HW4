package fcu.iecs.oop.passward;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String eng;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a password: ");
		eng = scanner.next();
		
	    PasswordEncorder data1 = new PasswordEncorder();
		eng = data1.encode(eng);
		System.out.println(data1.encode(eng));
	}


}
