package cytech_practice71;

public class Pc {
	/**
	* 文字列比較クラス
	*
	* @param input 文字列
	* @throws Exception
	*/
	public static void check(String input) throws Exception {
		if ("tng".equals(input)) {
			// 入力された文字列がPCと一致した場合はthrowで例外を投げます。
			throw new Exception("入力されたPCが使用できません。");
		} else {
			System.out.println("問題ありません");
		}
	}
}


