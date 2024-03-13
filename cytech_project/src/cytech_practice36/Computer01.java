package cytech_practice36;

public class Computer01 {

	int price;
	
	double data;
	
	public void show() {
		
		message();
		
		System.out.println("PCの値段は" +price+ "万円です。");
		System.out.println("データの容量は" + data + "TBです。");
	}
	
	public void message() {
		System.out.println("PCの情報を表示します。");
	}
}

