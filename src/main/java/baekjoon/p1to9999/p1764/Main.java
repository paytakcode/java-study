package baekjoon.p1to9999.p1764;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		final int N = Integer.parseInt(st.nextToken());
		final int M = Integer.parseInt(st.nextToken());
		int count = 0;
		TreeSet<String> treeSet1 = new TreeSet<>();
		ArrayList<String> result = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			treeSet1.add(br.readLine());
		}

		for (int i = 0; i < M; i++) {
			String name = br.readLine();
		    if (treeSet1.contains(name)) {
				result.add(name);
				count++;
			}
		}
		Collections.sort(result);
		bw.write(count + "\n");
		for (int i = 0; i < count; i++) {
			bw.write(result.get(i) + "\n");
		}
		br.close();
		bw.close();
	}
}
