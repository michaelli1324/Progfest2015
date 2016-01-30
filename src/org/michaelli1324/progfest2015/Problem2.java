package org.michaelli1324.progfest2015;
public class Problem2 {

	public static void main(String[] args) {
		String[] str = {
				"public class Problem2 {",
				"	public static void main(String[] args) {",
				"		String str = {",
				"		};",
				"		for(int s = 0; s < 3; s++){System.out.println(str[s]);}",
				"		for(int s = 0; s < 9; s++){System.out.println((char)34 + str[s] + (char)34);}",
				"		for(int s = 3; s < 9; s++){System.out.println(str[s]);",
				"		}",
				"	}",
				"}"
		};
		for(int s = 0; s < 3; s++){System.out.println(str[s]);}
		for(int s = 0; s < 9; s++){System.out.println((char)34 + str[s] + (char)34);}
		for(int s = 3; s < 9; s++){System.out.println(str[s]);}
	}
}
