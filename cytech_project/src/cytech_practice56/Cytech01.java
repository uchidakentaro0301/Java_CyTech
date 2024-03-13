package cytech_practice56;

public class Cytech01 {

	public static void main(String[] args) {
		//オブジェクトの生成
		Mac01 mac = new Mac01();
		
		//Macの値段設定をするメソッドを呼び出す
		mac.setPrice(70);
		
		//Macの値段表示をするメソッドを呼び出す
		mac.showPrice();
		
		//Macの値段設定をするメソッドを呼び出す
		mac.macFunction();
	}
}

