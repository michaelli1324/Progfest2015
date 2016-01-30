package org.michaelli1324.progfest2015;
import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		System.out.println("swag");
		Scanner scan = new Scanner(System.in);
		int max = Integer.parseInt(scan.nextLine());
		
		for(int line = 1; line <= max; line++){
			//first pyramid
			int count1 = 1;
			while(count1 <= line){
				System.out.print(count1);
				count1++;
			}
			for(int x = 0; x < (max-line+1); x++){
				System.out.print(" ");
			}
			
			//second pyramid
			for(int x = 0; x < line; x++){
				System.out.print(" ");
			}
			int count2 = (max-line+1);
			while(count2>=1){
				System.out.print(count2);
				count2--;
			}
			for(int x = 0; x < max; x++){
				System.out.print(" ");
			}
			
			
			//third pyramid
			for(int x = 0; x < max-line; x++){
				System.out.print(" ");
			}
			int count3 = line;
			while(count3 >= 1){
				System.out.print(count3);
				count3--;
			}
			for(int x = 0; x < max; x++){
				System.out.print(" ");
			}
				
			//fourth pyramid
			int count4 = 1;
			while(count4 <= (max-line+1)){
				System.out.print(count4);
				count4++;
			}
			
			System.out.println();
		}
	}

}
