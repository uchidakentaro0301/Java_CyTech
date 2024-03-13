package cytech_practice35;

/**
 * PCクラス
 */
public class Computer01 {

	/*
	 * 値段
	 */
	int price;
	
	/*
	 * データ量
	 */
	double data;
	
	/*
	 * 値段と容量を表示
	 */
	public void show(){
		System.out.println("PCの値段は" +price+ "万円です。");
		System.out.println("データの容量は" + data + "TBです。");
	}
}


