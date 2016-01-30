package org.michaelli1324.progfest2015;
import java.util.Scanner;

public class Problem8 {

	public static void main(String[] args) {
		System.out.println("swag");
		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();
		int number = Integer.parseInt(num);
		int[] numArray = new int[num.length()];
		for(int s = 0; s < numArray.length; s++){
			numArray[s] = Integer.parseInt(num.charAt(s) + "");
		}
		while(repeatNumber(number + "")){
			number++;
		}
		System.out.println(number);
	}

	public static boolean repeatNumber(String num){
		int[] numArray = new int[num.length()];
		for(int s = 0; s < numArray.length; s++){
			numArray[s] = Integer.parseInt(num.charAt(s) + "");
		}
		for(int x = 0; x < numArray.length; x++){
			int first = numArray[x];
			for(int y = 0; y < numArray.length; y++){
				int second = numArray[y];
				if(!(x==y) && ((first == second) || first == 0 || second == 0)){
					return true;
				}
			}
		}
		return false;
	}
}
