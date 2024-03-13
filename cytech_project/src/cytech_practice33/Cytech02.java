package cytech_practice33;

public class Cytech02 {

	public static void main(String[] args) {
		//Computerクラスのオブジェクト生成
		Computer01 computer = new Computer01();
		
		//フィールドに値を代入
		computer.price = 100000;
		computer.data = 30.0;
		
		//フィールドの値を出力
		System.out.println("料金は" + computer.price + "万円です。");
		System.out.println("料金は" + computer.data + "TBです。");
	}
}


