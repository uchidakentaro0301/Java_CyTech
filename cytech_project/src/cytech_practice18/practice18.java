package cytech_practice18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice18 {

	public static void main(String[] args) throws IOException {
		//コンソールの入出力
		System.out.println("整数を入力してください。");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String cytech = reader.readLine(); 
		int tng = Integer.parseInt(cytech);
		
		//if文の記述
		//もしtngの値が「5」だった場合の処理を下記に記述（左辺と右辺が等しい場合はtrue）
		if(tng == 100) {
			System.out.println("100が入力されました。");
			System.out.println("評価値は「true」です。");
		}
		System.out.println("システムを終了します。");
	}
}
	

