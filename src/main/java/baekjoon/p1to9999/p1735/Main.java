package baekjoon.p1to9999.p1735;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a1 = Integer.parseInt(st.nextToken());
		int b1 = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int a2 = Integer.parseInt(st.nextToken());
		int b2 = Integer.parseInt(st.nextToken());

		int a = a1 * b2 + a2 * b1;
		int b = b1 * b2;

		int gcd = findGCD(a, b);
		a /= gcd;
		b /= gcd;

		br.close();
		bw.write(a + " " + b);
		bw.close();

	}
	private static int findGCD(int a, int b) {
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}
