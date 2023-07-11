package baekjoon.p20000to29999.p24267;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long n = Long.parseLong(br.readLine());
		br.close();
		bw.write(String.valueOf((((n - 2) * (n - 1) * n) / 6)));
		bw.newLine();
		bw.write("3");
		bw.close();
	}
}
