package ud1.tarea8b;

import java.util.Scanner;

public class Ej8b_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("introduce la altura de la L");
		int n = sc.nextInt();
		
		int i;
		int j;
		
		for(i = 1; i < n; i++) {
			System.out.println("*");}
		for (j = 0; j < ((n / 2) + 1); j++) {
				System.out.print("* ");}
		
		
	sc.close();
	}
}