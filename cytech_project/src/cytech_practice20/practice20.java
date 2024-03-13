package cytech_practice20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice20 {

	public static void main(String[] args) throws IOException {
		System.out.println("整数を入力してください。");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String cytech = reader.readLine();
		int tng = Integer.parseInt(cytech);
		
		//①左右が等しくない場合
		if(tng != 50) {
			System.out.println(tng + "は50と同じではない数値です。");
		//②tngが同じ数値だった場合の処理
		}else {
			System.out.println(tng + "は50と同じ数値です。");
		}
	}
}


 