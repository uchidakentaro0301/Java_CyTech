package cytech_practice48;

public class Cytech01 {

	public static void main(String[] args) {
		//メソッドを呼び出す
		Staff01.showSum();
		
		//オブジェクト生成
		Staff01 staff1 = new Staff01(1,"じゃば", "男性",18);
		
		//staticメソッドを呼び出す
		Staff01.showSum();
		
		//オブジェクト生成
		Staff01 staff2 = new Staff01(2,"げんご", "女性",25);
		
		//staticメソッドを呼び出す
		Staff01.showSum();
	}
}


