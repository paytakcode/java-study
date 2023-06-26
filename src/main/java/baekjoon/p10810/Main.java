package baekjoon.p10810;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public void solution() throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] baskets = new int[n];
		for (int t = 0; t < m; t++){
			String ijk = br.readLine();
			StringTokenizer st2 = new StringTokenizer(ijk);
			int i = Integer.parseInt(st2.nextToken());
			int j = Integer.parseInt(st2.nextToken());
			int k = Integer.parseInt(st2.nextToken());
			for (int b = i - 1; b < j; b++){
				baskets[b] = k;
			}
		}
		for (int basket : baskets) {
			sb.append(basket).append(" ");
		}

		bw.write(sb.toString());
		bw.close();
	}

	public static void main(String[] args) throws IOException{
		new Main().solution();

	}

}