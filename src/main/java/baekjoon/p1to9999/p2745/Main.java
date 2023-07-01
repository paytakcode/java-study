package baekjoon.p1to9999.p2745;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		String num = st.nextToken();
		int n = Integer.parseInt(st.nextToken());
		int result = 0;
		for (int i = 0; i < num.length(); i++){
			int ascii = num.charAt(i);
			if (ascii <= 57){
				result += (int) ((ascii - 48) * Math.pow(n, num.length() - 1 - i));
			} else {
				result += (int) ((ascii - 55) * Math.pow(n, num.length() - 1 - i));
			}
		}
		System.out.println(result);
	}
}
