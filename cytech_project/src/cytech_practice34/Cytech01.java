package cytech_practice34;

public class Cytech01 {

	public static void main(String[] args) {
		//PCオブジェクトの作成
		Computer01 computer = new Computer01();
		
		//お客様オブジェクトの作成
		Customer01 costomer = new Customer01();
		
		costomer.name = "内田太郎";
		
		costomer.computer = computer;
		costomer.computer.price = 10000;
		
		System.out.println("値段は" + costomer.computer.price + "万円です。");
		System.out.println("PCを持っているのは" + costomer.name + "さんです。");
	}
}


