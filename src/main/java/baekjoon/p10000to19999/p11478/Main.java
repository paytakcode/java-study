package baekjoon.p10000to19999.p11478;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		HashSet<String> stringSet = new HashSet<>();
		final String str = br.readLine();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <str.length() + 1; j++) {
			    stringSet.add(str.substring(i, j));
			}
		}
		br.close();
		bw.write(String.valueOf(stringSet.size()));
		bw.close();
	}
}
