package cytech_practice42;

public class Cytech01 {

	public static void main(String[] args) {
		//オブジェクト生成
		Computer01 computer = new Computer01();
		
		//正しい値の場合
		computer.setPrice(100);
		computer.setData(50.0);
		
		System.out.println("間違ったデータ容量を設定");
		
		//正しくない値の場合
		computer.setPrice(-11);
		computer.setData(5000.0);
	}
}



