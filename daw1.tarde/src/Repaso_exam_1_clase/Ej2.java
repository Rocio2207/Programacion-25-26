package Repaso_exam_1_clase;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		int num = sc.nextInt();
		
		while (num%2 != 0) {
			System.out.println("Introduce un número:");
			num = sc.nextInt();
		}
		
		
		
	sc.close();}
	
	
}
