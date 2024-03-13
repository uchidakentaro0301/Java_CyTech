package cytech_practice26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice2602 {

	public static void main(String[] args) throws IOException {
		System.out.println("どの範囲を計算しますか？");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String cytech = reader.readLine();
		int tng = Integer.parseInt(cytech);

		//答えを保存する変数
		int ans = 0;
		
		//iが入力値以下の場合、繰り返す
		for(int i = 1; i <= tng; i++){
			ans += i;
		}
		System.out.println("1から" + tng + "までの計算の答えは" +  ans + "です。");
	}
}


