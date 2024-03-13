package cytech_practice53;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class practice53 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String inputDateString;
		
		do {
			System.out.println("「yyyy/MM/dd」の形式で入力してください。");
			
			inputDateString = reader.readLine();
			
			//isIllegaDate()メソッドで日付チェックを行い、不正な日付の場合は繰り返す。
			//
		}while (isllegaDate(inputDateString));
		System.out.println("入力した日付は正しいです。");
	}
	
	/*
	 * s指定された日付の内容が不正であるかチェック
	 * 
	 * @param inputDatString　入力された日付の文字列
	 * @return　trueは不正な日付である場合、falseは正しい日付である場合
	 */
	
	private static boolean isllegaDate(String inputDateString) {
		//日付の形式を指定して、オブジェクトを生成する
		SimpleDateFormat tng = new SimpleDateFormat("yyyy/MM/dd");
		
		//厳密なチェックをするように指定
		tng.setLenient(false);
		
		try {	
			//Date型の情報を生成（この時にチェックをされる）
			tng.parse(inputDateString);
			
			return false;
		}catch(ParseException e) {
			//日付情報の生成に失敗
			return true;
		}
	}
}


