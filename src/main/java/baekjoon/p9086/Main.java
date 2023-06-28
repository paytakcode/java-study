package baekjoon.p9086;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		for (int i = 0; i < n; i++){
			String str = input.nextLine();
			System.out.println("" + str.charAt(0) + str.charAt(str.length() - 1));
		}
	}
}
