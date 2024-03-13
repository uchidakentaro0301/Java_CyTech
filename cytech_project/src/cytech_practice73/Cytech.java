package cytech_practice73;

import java.util.ArrayList;
import java.util.List;

public class Cytech {

	public static void main(String[] args) {
		//ArrayListの生成
		List<Integer> tng = new ArrayList<>();
		
		//要素の追加
		tng.add(1);
		tng.add(100);
		tng.add(500);
		
		//表示
		System.out.println("数値は" +tng.get(1)+ "です。");
	}
}


