package cytech_practice66;
/*
 * コーヒークラス
 */
public class Coffee implements Tea, Cocoa {

	/*
	 * お茶表示
	 */
	@Override
	public void ocha() {
		System.out.println("苦味は旨味");
	}
	
	/*
	 * 美味しい表示
	 */
	@Override
	public void delicious() {
		System.out.println("あまーい");
	}
}

