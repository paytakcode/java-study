package baekjoon.p10000to19999.p10798;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[][] arr = new char[5][15];
		for (int i = 0; i < arr.length; i++){
			String str = br.readLine();
			for (int j = 0; j < str.length(); j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		br.close();
		for (int i = 0; i < 15; i++){
			for (int j = 0; j < 5; j++) {
				if (arr[j][i] != '\0') {
					bw.write(arr[j][i]);
				}
			}
		}
		bw.close();
	}
}

