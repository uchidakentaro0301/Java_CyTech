package cytech_practice41;

public class Cytech01 {

	public static void main(String[] args) {
		
		//oオブジェクトの作成
		People01 java = new People01();
		
		//呼び出し、戻り値を変数に代入
		String[] getDayOff = java.tellYourDayOff();
		
		//変数の中身を繰り返し表示
		for(int i = 0; i < getDayOff.length; i++) {
			System.out.println((i + 1) + "回目の休みは" + getDayOff[i] + "です。");
		}
	}
}

