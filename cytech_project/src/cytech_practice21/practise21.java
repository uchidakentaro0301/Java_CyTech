package cytech_practice21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practise21 {

	public static void main(String[] args) throws IOException {
		//
		System.out.println("整数を入力してください。");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String cytech = reader.readLine();
		int tng = Integer.parseInt(cytech);
		
		if(tng == 100) {
			//①tngが100と等しい場合
			System.out.println("フォロワーが100歳になりました。");
		}else if(tng == 200){
			//②tngが200と等しい場合
			System.out.println("フォロワーが200になりました。");
		}else if(tng == 10000) {
			//③tngが10000と等しい場合
			System.out.println("フォロワーが10000になりました。");
		}else {
			//それ以外の場合
			System.out.println("超えれていません。頑張っていきましょう！");
		}
	}
}

