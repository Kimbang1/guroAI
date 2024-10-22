package lengthcount;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
	
		String sc = scanner.nextLine();
		scanner.close();
		
		
		
		int[] fOc = new int[26];
		for(int i = 0; i<26; i++) {
			fOc[i] = -1;
		}
		
		for(int i=0; i< sc.length(); i++) {
			char ch = sc.charAt(i);
			int index = ch - 'a';
			if(fOc[index] == -1) {
				fOc[index] = i;
			}
		}
		
		StringBuilder result = new StringBuilder();
		for(int i = 0; i<26; i++) {
			result.append(fOc[i]).append(" ");
		}
		
		System.out.println(result.toString().trim());
		

	}

}
