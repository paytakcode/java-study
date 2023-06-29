package baekjoon.p1to9999.p2444;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= 2 * n - 1; i++) {
			bw.write(" ".repeat(Math.abs(i - n)));
			bw.write("*".repeat(2 * n - 1 - 2 * Math.abs(i - n)));
			bw.newLine();
		}

		bw.close();
	}
}
