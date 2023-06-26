package baekjoon.p10813;

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
		String nm = br.readLine();
		StringTokenizer st = new StringTokenizer(nm);
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] baskets = new int[n];
		for (int i = 0; i < n; i++){
			baskets[i] = i + 1;
		}
		for (int t = 0; t < m; t++){
			String ij = br.readLine();
			st = new StringTokenizer(ij);
			int i = Integer.parseInt(st.nextToken()) - 1;
			int j = Integer.parseInt(st.nextToken()) - 1;
			int temp = baskets[i];
			baskets[i] = baskets[j];
			baskets[j] = temp;
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