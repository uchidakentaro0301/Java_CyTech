package cytech_practice46;

/*
 * shopクラス
 */
public class Shop01 {
	
	/*種類*/
	private String type;
	
	/*値段*/
	private int price;
	
	
	/*
	 * 引数なしのコンストラクタ
	 */
	public Shop01() {
		type = "超大盛り";
		price = 1500;
		
		System.out.println("大盛りのお店を作成しました。");
	}
	
	/*
	 * 引数ありのコンストラクタ
	 */
	public Shop01(String type, int price) {
		this.type = type;
		this.price = price;
		
		System.out.println("大盛りのお店を作成しました。");
	}
	
	/*
	 * 出力
	 */
	public void show() {
		System.out.println("お店の種類は" + type + "です。");
		System.out.println("お店の平均の値段は" + price + "です。");
	}
}


