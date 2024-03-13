package cytech_practice17;

public class practice17 {

	public static void main(String[] args) {
		//変数の定義
		int cytech1 = 100;
		int cytech2 = 500;
		
		//出力
		//左辺と右辺が等しい
		System.out.println("a == b:" + (cytech1 == cytech2));
		
		//左辺と右辺は等しくない
		System.out.println("a != b:" + (cytech1 != cytech2));
		
		//左辺は右辺より小さい
		System.out.println("a < b:" + (cytech1 < cytech2));
		System.out.println("a < b:" + (cytech2 < cytech1));
		
		//左辺は右辺より大きい、または等しい
		System.out.println("a >= b:" + (cytech1 >= cytech2));
		System.out.println("a >= b:" + (cytech2 >= cytech1));
	}
}


