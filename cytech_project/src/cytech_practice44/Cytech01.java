package cytech_practice44;

public class Cytech01 {

	public static void main(String[] args) {
		//オブジェクトの生成
		People01 people1 = new People01();
		
		//実引数を渡してメソッドを呼び出す
		people1.setShopFile("CyTech shop");
		people1.setShopFile(40);
		
		//オブジェクトの生成
		People01 people2 = new People01();
		
		//複数のメソッドを呼び出す
		people2.setShopFile("CyTech shop",40);
	}
}


