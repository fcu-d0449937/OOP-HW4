package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num ;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		num = scanner.nextInt();
		
		NissanTiida data1 = new NissanTiida();
		data1.tiida(num);
	}
}