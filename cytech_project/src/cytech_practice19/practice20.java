package cytech_practice19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice20 {

	public static void main(String[] args) throws IOException {
		//コンソールの入出力
				System.out.println("整数を入力してください。");
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				
				String cytech = reader.readLine();
				int tng = Integer.parseInt(cytech);
				
				//①変数tngは10ではない場合
				if(tng != 10) {
					//②変数tngが20以下の場合
					if(tng <= 20) {
						//出力
						System.out.println(tng + "は左辺と右辺が等しくなく、" + tng + "は20以下です。");
					}
				}
				System.out.println("システムを終了します。");
	}
}


