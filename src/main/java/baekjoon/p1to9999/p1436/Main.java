package baekjoon.p1to9999.p1436;

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
		String result = "";
		int count = 0;
		int num = 666;
		while (count < n) {
			result = String.valueOf(num);
			if (result.contains("666")){
				count++;
			}
			num++;
		}
		br.close();
		bw.write(result);
		bw.close();
	}
}
