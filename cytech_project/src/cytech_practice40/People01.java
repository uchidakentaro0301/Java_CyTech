package cytech_practice40;

public class People01 {

	/*
	 * 名前の取得
	 * 
	 * ＠param tng 姓
	 * ＠param cytech 名
	 */
	public String tellFullName(String tng, String cytech){
			String fullName = tng + cytech;
			
			return fullName;
		}
	
	/*
	 *　サイズの取得
	 * 
	 * ＠param width 足のサイズ
	 * ＠param height 足の幅
	 */
	public double footSize(double width, double height) {
		double allSize = width / ((height / 100) * (height / 100));
		
		return allSize;
	}
}


