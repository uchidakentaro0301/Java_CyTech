package cytech_practice74;

import java.util.ArrayList;
import java.util.List;

public class Cytech74 {

	public static void main(String[] args) {
		//ArrayListの生成
		List<Integer> tng = new ArrayList<>();
		
		//要素の追加
		tng.add(10);
		tng.add(20);
		tng.add(30);
		tng.add(40);
		tng.add(100);
		
		//1回繰り返しごとに、要素の値が変数valueに代入される
		for(int value : tng) {
			System.out.println(value);
		}
	}
}


