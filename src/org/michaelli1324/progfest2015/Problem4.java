package org.michaelli1324.progfest2015;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		System.out.println("swag");
		Scanner scan = new Scanner(System.in);
		String creditString = scan.nextLine();
		int[] creditNum = new int[creditString.length()];
		int finalNum = 0;
		for(int s = 0; s< creditNum.length; s++){
			creditNum[s] = Integer.parseInt(creditString.charAt(s) + "");
		}
		if(creditString.length() % 2 == 0){
			for(int x = 0; x < creditString.length(); x++){
					if(x % 2 == 0){
						int num = 0;
						num += creditNum[x] * 2;
						if(finalNum > 10){
							num = (num/10) + (num%10);
						}
						finalNum += num;
					}
					else {
						finalNum += creditNum[x];
					}
			}
		}
		else{
			for(int x = 0; x < creditString.length(); x++){
				if(x % 2 == 1){
					int num = 0;
					num += creditNum[x] * 2;
					if(finalNum > 10){
						finalNum += (num/10) + (num%10);
					}
				}
				else {
					finalNum += creditNum[x];
				}
		}
		
	}
		if(finalNum % 10 == 0){
			System.out.println("This credit card is valid");
		}
		else{
			System.out.println("This credit card is an invalid card");
		}
		scan.close();
	}
}
