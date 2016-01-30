package org.michaelli1324.progfest2015;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("swag");
		String input = scan.nextLine();
		int currIndex = 0;
		int currAlphabet = 1;
		String finalOutput = "";
		while(input.charAt(currIndex) != '$'){
			int letter = (int) input.charAt(currIndex);
			currIndex++;
			int ruleNum = Integer.parseInt(input.charAt(currIndex) + "");
			currIndex++;
			int shift = 0;
			if(ruleNum == 1){
				shift = (letter - 64) * 2;
				currAlphabet += shift;
				if(currAlphabet > 90){
					currAlphabet -= 26;
				}
				finalOutput += (char)(currAlphabet + 64);
			}
			else if (ruleNum == 2){
				shift = ((letter - 64) % 3) * 5;
				currAlphabet += shift;
				if(currAlphabet > 90){
					currAlphabet -= 26;
				}
				finalOutput += (char)(currAlphabet+64);
			}
			else if (ruleNum == 3){
				shift = ((letter - 64)/4) * -8 ;
				currAlphabet += shift;
				if(currAlphabet > 90){
					currAlphabet -= 26;
				}
				finalOutput += (char)(currAlphabet+64);
			}
			else if (ruleNum == 4){
				shift = ((int) Math.floor((Math.sqrt((letter - 64))))) * -12;
				shift = shift % 26;
				currAlphabet += shift;
				if(currAlphabet > 90){
					currAlphabet -= 26;
				}
				if(currAlphabet < 65){
					currAlphabet +=26;
				}
				finalOutput += (char)(currAlphabet+64);
			}
			else{
				for(int s = 1; s <= letter; s++){
					if((letter - 64) % s == 0){
						shift += s;
					}
				}
				shift *= 10;
				shift = shift % 26;
				currAlphabet += shift;
				if(currAlphabet > 90){
					shift -= 26;
				}
				finalOutput += (char)(currAlphabet+64);
			}
		}
		System.out.println(finalOutput);
		scan.close();
	}

}
