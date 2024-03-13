package cytech_practice47;

/*
 * shopクラス
 */
public class Shop01 {

	/*種類*/
	private String type;
	
	/*値段*/
	private int price;
	
	/*
	 * コンストラクタ（引数なし）
	 */
	public Shop01() {
		type = "小盛り";
		
		System.out.println("引数なしで小盛りを作成しています。");
	}
	
	/*
	 * コンストラクタ（引数あり）
	 */
	public Shop01(int price) {
		this();
		this.price = price;
		
		System.out.println("引数ありで小盛りを作成しています。");
	}
	
	/*
	 * 出力
	 */
	public void show() {
		System.out.println("種類は" + type + "です。");
		System.out.println("値段は" + price + "円です。");
	}
}


