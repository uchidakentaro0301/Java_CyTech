package cytech_practice04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice04 {

	public static void main(String[] args) throws IOException {
		System.out.println("整数を入力してください。");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String cytech1 = reader.readLine();
		String cytech2 = reader.readLine();
		String cytech3 = reader.readLine();
		
		System.out.println(cytech1 + "が入力されました。");
		System.out.println(cytech2 + "が入力されました。");
		System.out.println(cytech3 + "が入力されました。");
	}
}
