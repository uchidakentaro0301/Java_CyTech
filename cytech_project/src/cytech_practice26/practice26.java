package cytech_practice26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice26 {

	public static void main(String[] args) throws IOException {
		System.out.println("いくつ「*」を出力しますか？");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String cytech = reader.readLine();
		int tng = Integer.parseInt(cytech);
		
		//
		for(int i = 1; i <= tng; i++) {
			System.out.println("*");
		}
	}
}


