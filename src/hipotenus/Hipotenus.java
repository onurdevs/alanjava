package hipotenus;

import java.util.Scanner;

public class Hipotenus {
	public static void main(String[] args ) {
		int a,b,c;
		double u,alan;
		Scanner scan = new Scanner(System.in);
		System.out.print("Birinci sayıyı giriniz: ");
		a = scan.nextInt();
		System.out.print("İkinci sayıyı giriniz: ");
		b = scan.nextInt();
		System.out.print("Üçüncü sayıyı giriniz: ");
		c= scan.nextInt();
		
		u = (a+b+c)/2;
		alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
		
		System.out.println("Alan:"+ alan);
		
	}
			
}
