package baekjoon.p10000to19999.p11382;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main{

	public void solution() throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		BigInteger result = BigInteger.valueOf(0);
		while (st.hasMoreTokens()) {
			result = result.add(BigInteger.valueOf(Long.parseLong(st.nextToken())));
		}
		bw.write(result.toString());
		bw.close();
	}

	public static void main(String[] args) throws IOException{
		new Main().solution();

	}

}