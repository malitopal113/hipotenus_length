package Hipotenus;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a,b;
		double c;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dik Üçgende Hipotenüs Hesaplama");
		
		System.out.print("Birinci Kenar Uzunluğu: ");
		a = input.nextInt();
		System.out.print("Birinci Kenar Uzunluğu: ");
		b = input.nextInt();
		
		c = Math.sqrt((a*a) + (b*b));
		
		double roundOff = (double) Math.round(c * 100) / 100;
		
		
		System.out.print("Hipotenüs Uzunluğu: " + roundOff );

	}

}

