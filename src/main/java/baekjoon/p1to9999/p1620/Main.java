package baekjoon.p1to9999.p1620;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		final int n = Integer.parseInt(st.nextToken());
		final int m = Integer.parseInt(st.nextToken());
		Hashtable<String, String> noToName = new Hashtable<String, String>();
		Hashtable<String, String> nameToNo = new Hashtable<String, String>();
		for (int i = 1; i <= n; i++) {
			String no = String.valueOf(i);
			String name = br.readLine();
			noToName.put(no, name);
			nameToNo.put(name, no);
		}
		for (int i = 0; i < m; i++) {
			String noOrName = br.readLine();
			try {
			    bw.write(noToName.get(noOrName));
				bw.newLine();
			} catch (NullPointerException e) {
			    bw.write(nameToNo.get(noOrName));
				bw.newLine();
			}
		}
		br.close();
		bw.close();
	}
}
