package baekjoon.p10000to19999.p10988;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int result = 1;
		for (int i = 0; i < (str.length() / 2); i++){
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
				result = 0;
			}
		}
		System.out.println(result);
	}
}
