package cytech_practice52;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cytech01 {

	public static void main(String[] args) {
		//日付の取得
		Date date = new Date();
		
		//書式化文字列の設定
		SimpleDateFormat tng = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println("本日の日付の表示");
		System.out.println(tng.format(date));
	}
}


