package cytech_practice36;

public class Cytech01 {

	public static void main(String[] args) {
		//オブジェクト作成
		Computer01 computer = new Computer01();
		
		//フィールドに値の代入
		computer.price = 30;
		computer.data = 2.0;
		
		//値段と容量の表示
		computer.show();
	}
}

