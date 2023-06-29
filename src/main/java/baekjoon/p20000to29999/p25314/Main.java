package baekjoon.p20000to29999.p25314;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public void solution() throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String result = "long ".repeat(N / 4) + "int";
		bw.write(result);
		bw.close();
	}

	public static void main(String[] args) throws IOException{
		new Main().solution();

	}

}