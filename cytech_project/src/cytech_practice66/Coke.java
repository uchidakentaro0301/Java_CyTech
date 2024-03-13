package cytech_practice66;

/*
 * コーラクラス
 */
public class Coke implements Tea,Cocoa{

	/*
	 * お茶表示
	 */
	@Override
	public void ocha() {
		System.out.println("うまっ");
	}
	
	/*
	 * 美味しい表示
	 */
	@Override
	public void delicious() {
		System.out.println("いいね");
	}
}

