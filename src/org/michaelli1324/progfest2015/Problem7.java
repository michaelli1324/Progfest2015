package org.michaelli1324.progfest2015;
import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		System.out.println("swag");
		Scanner scan = new Scanner(System.in);
		int maxChar = Integer.parseInt(scan.nextLine());
		String phrase = scan.nextLine();
		String[] stringWords = phrase.split(" ");
		int[] intWords = new int[stringWords.length];
		for(int x = 0; x < stringWords.length; x++){
			intWords[x] = stringWords[x].length();
		}
		int sum = 0;
		int index = 0;
		swag:
		while(index < stringWords.length){
			String line = "";
			sum = 0;
			swag1:
			while(sum<10){
				if(index == stringWords.length){
					System.out.println(line);
					break swag;
				}
				if(sum + intWords[index] > 10){
					break swag1;
				}
				else{
					sum += intWords[index];
					line += stringWords[index] + " ";
					index++;
				}
			}
			System.out.println(line);
		}
	}

}
