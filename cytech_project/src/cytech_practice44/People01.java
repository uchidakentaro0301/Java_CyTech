package cytech_practice44;

/*
 * 人クラス
 */
public class People01 {
	/* * 名前*/
	private String shopName;
	
	/* * 年齢層*/
	private int age;
	
	/*
	 * プロフィール設定
	 * 
	 * ＠param shopName お店名前
	 */
	public void setShopFile(String shopName) {
		this.shopName = shopName;
		System.out.println("ショップの名前は" + this.shopName + "です。");
	}
	
	/*
	 * 年齢層の設定
	 * 
	 * ＠param age 年齢
	 */
	public void setShopFile(int age) {
		this.age = age;
		System.out.println("ショップの年齢層は" + this.age + "です。");
	}
	
	/*
	 * ショップ情報の設定
	 * 
	 * ＠param shopName 年齢
	 * ＠param age 年齢
	 */
	public void setShopFile(String shopName, int age) {
		this.shopName = shopName;
		this.age = age;
		System.out.println("ショップの名前は" + this.shopName + "で,ショップの年齢層は" + this.age +  "歳になります。");
	}
}



