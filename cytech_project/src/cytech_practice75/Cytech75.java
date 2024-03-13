package cytech_practice75;

import java.util.HashMap;
import java.util.Map;

public class Cytech75 {

	public static void main(String[] args) {
		//HashMap の生成
		Map<String, String> tng = new HashMap<>();
		
		//要素の追加
		tng.put("じゃば", "Java");
		tng.put("大分", "Oita");
		tng.put("東京", "Tokyo");
		
		//出力
		System.out.println("九州の" +tng.get("大分")+ "は楽しいね。");
	}
}


