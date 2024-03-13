package cytech_practice22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice22 {

	public static void main(String[] args) throws IOException {

		System.out.println("整数を入力してください。");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String cytech = reader.readLine();
		int tng = Integer.parseInt(cytech);

		switch(tng) {
		case 100:
			//変数tngが100の場合
			System.out.println("100が入力されました。");
			break;
			
		case 200:
			//変数tngが200の場合
			System.out.println("200が入力されました。");
			break;
			
		default:
			//変数tngが100と200の場合
			System.out.println("100と200以外の数値が入力されました。");
			break;
		}
	}
}


