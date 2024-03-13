package cytech_practice35;

public class Cytech01 {

	public static void main(String[] args) {
		//オブジェクト生成
		Computer01 computer = new Computer01();
		
		//フィールドに値を表示
		computer.price = 59;
		computer.data = 30.0;
		
		//値段と容量を表示
		computer.show();
	}
}

