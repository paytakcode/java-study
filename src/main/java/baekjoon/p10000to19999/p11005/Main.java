package baekjoon.p10000to19999.p11005;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		int num = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		while (num > 0){
			int temp = num % n;
			num = num / n;
			if (temp > 9){
				sb.append(Character.toString(temp + 55));
			} else {
				sb.append(temp);
			}
		}
		System.out.println(sb.reverse());
	}
}
