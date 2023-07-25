package baekjoon.p1to9999.p1934;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		final int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String[] input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);

			int gcd = findGCD(a, b);
			int lcm = a * b / gcd;

			bw.write(String.valueOf(lcm));
			bw.newLine();
		}

		br.close();
		bw.close();
	}

	private static int findGCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}

