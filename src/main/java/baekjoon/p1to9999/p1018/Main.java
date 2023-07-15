package baekjoon.p1to9999.p1018;

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
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int result = 64;
		String[] board = new String[n];
		for (int i = 0; i < n; i++) {
			board[i] = br.readLine();
		}
		for (int i = 0; i <= n - 8; i++) {
			for (int j = 0; j <= m - 8; j++) {
				int min = findMin(i, j, board);
				if (result > min) {
					result = min;
				}
			}
		}
		br.close();
		bw.write(String.valueOf(result));
		bw.close();
	}

	public static int findMin(int startRow, int startCol, String[] board) {
		int max = 64;
		String[] correctRows = {"WBWBWBWB", "BWBWBWBW"};
		int count = 0;
		for (int i = 0; i < 8; i++) {
			int row = startRow + i;
			for (int j = 0; j < 8; j++) {
				int col = startCol + j;
				if (board[row].charAt(col) != correctRows[i % 2].charAt(j)) {
					count++;
				}
			}
		}

	    return Math.min(count, max - count);
	}
}
