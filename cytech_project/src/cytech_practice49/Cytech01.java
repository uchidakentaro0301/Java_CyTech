package cytech_practice49;

public class Cytech01 {

	public static void main(String[] args) {
		//検索される文字
		String gmailAddress = "japan0011@gmail.com";
		
		//部分文字列を得る
		String name = gmailAddress.substring(0,gmailAddress.indexOf("@"));

		//出力
		System.out.println("メールアドレス:" + gmailAddress);
		System.out.println("名前は:" + name);
	}
}



