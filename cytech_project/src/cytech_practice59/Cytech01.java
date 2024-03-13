package cytech_practice59;

public class Cytech01 {

	public static void main(String[] args) {
		double data = 5.5;
		
		//オブジェクト生成
		Mac01 mac = new Mac01();
		
		//Macの容量設定メソッドを呼び出す
		mac.setData(data);
		
		//Macの容量表示メソッドを呼び出す
		mac.checkData();
		
		System.out.println("データ容量の変更をします。");
		
		//Macの容量変更メソッドを呼び出す
		mac.doubleData();
		
		//Macの容量表示メソッドを呼び出す
		mac.checkData();
	}
}


