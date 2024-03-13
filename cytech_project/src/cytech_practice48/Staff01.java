package cytech_practice48;

/*
 * スタッフクラス
 */
public class Staff01 {

	/*スタッフの人数（static変数）*/
	public static int sum = 0;
	
	/*スタッフの番号（インスタンス変数）*/
	private int no;
	
	/*スタッフの名前（インスタンス変数）*/
	private String name;
	
	/*スタッフのタイプ（インスタンス変数）*/
	private String type;
	
	/*スタッフの年齢（インスタンス変数）*/
	private int age;
	
	/*
	 * コンストラクタ
	 * 
	 * @oaram no
	 * @param name
	 * @param type
	 * @param age
	 */
	public Staff01(int no, String name, String type, int age) {
		this.no = no;
		this.name = name;
		this.type = type;
		this.age = age;
		
		//static変数のsumの値を加算する
		sum++;
		
		System.out.println("スタッフクラスを作成しました");
	}
	
	/*
	 * スタッフの情報出力（インスタンスメソッド）
	 */
	public void show() {
		System.out.println("スッタフ番号は" + no + "です。");
		System.out.println("スッタフの名前は" + name + "さんです。");
		System.out.println("スッタフタイプは" + type + "です。");
		System.out.println("スッタフの年齢は" + age + "歳です。");
	}
	
	/*
	 * スタッフの人数出力（staticメソッド）
	 */
	public static void showSum() {
		System.out.println("スタッフの合計は" + sum + "人です。");
	}
}


