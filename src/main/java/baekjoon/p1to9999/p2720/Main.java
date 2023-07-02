package baekjoon.p1to9999.p2720;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		final int QUARTER = 25;
		final int DIME = 10;
		final int NICKEL = 5;
		final int PENNY = 1;
		final int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++){
			int change = Integer.parseInt(br.readLine());
			bw.write((change / QUARTER) + " ");
			change = change % QUARTER;
			bw.write((change / DIME) + " ");
			change = change % DIME;
			bw.write((change / NICKEL) + " ");
			change = change % NICKEL;
			bw.write((change / PENNY) + "");
			bw.newLine();
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
