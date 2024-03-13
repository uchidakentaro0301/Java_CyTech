package cytech_practice51;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cytech01 {

	public static void main(String[] args) throws IOException {
		System.out.println("整数を比較します");
		System.out.println("整数を2つ入力してください");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String tng1 = reader.readLine();
		String tng2 = reader.readLine();
		

		//引数の文字列をint型の数値に変換
		int cytech1 = Integer.parseInt(tng1);
		int cytech2 = Integer.parseInt(tng2);
		
		//2つの引数のうち大きい値を返す
		int anser = Math.max(cytech1, cytech2);

		//出力
		System.out.println("比較した結果、大きい方は" + anser + "です。");

	}
}


