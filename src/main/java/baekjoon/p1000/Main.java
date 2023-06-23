package baekjoon.p1000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;


public class Main{
	public void solution() throws IOException{
		int sum = 0;
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		StringTokenizer st=new StringTokenizer(str);

		while(st.hasMoreTokens()) {
			sum += Integer.parseInt(st.nextToken());
		}
		br.close();
		bw.write(sum+"\n");
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws IOException{
		new Main().solution();

	}
}