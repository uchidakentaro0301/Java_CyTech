package cytech_practice46;

public class Cytech01 {

	public static void main(String[] args) {
		//オブジェクトの生成と引数なしのコンストラクタの呼び出し
		Shop01 shop1 = new Shop01();
		
		//出力
		shop1.show();
		
		//オブジェクトの生成と引数ありのコンストラクタの呼び出し
		Shop01 shop2 = new Shop01("超超大盛り", 3000);
		
		//出力
		shop2.show();
	}
}


