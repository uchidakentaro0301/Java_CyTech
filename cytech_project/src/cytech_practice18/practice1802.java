package cytech_practice18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice1802 {

	public static void main(String[] args) throws IOException {
		//コンソールの入出力
		System.out.println("整数を入力してください。");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String cytech = reader.readLine();
		int tng = Integer.parseInt(cytech);
		
		//変数の定義
		String cytech1 = "study well";
		
		//if文の記述
		if(tng == 100) {
			String cytech2 = "good";
			System.out.println(cytech2);
		}
		
		System.out.println(cytech1);
	}
}

