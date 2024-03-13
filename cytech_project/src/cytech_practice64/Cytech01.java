package cytech_practice64;

public class Cytech01 {

	public static void main(String[] args) {
		//String型のtng1を作成
		String tng1 = "CyTech";
		
		//tng1が保存されたstringBuilderクラスのオブジェクトを作成
		StringBuilder stringBuilder = new StringBuilder(tng1);
		
		//stringBuilder型からString型に変換
		String tng2 = stringBuilder.toString();
		
		//tng1とtng2の値を確認する
		System.out.println("tng1:" + tng1);
		System.out.println("tng2:" + tng2);
		
		//同じ”CyTech”が含まれている2つに文字列型を＝＝（等価比較）での比較
		System.out.println("==での比較結果：" +(tng1 == tng2));
		
		//同じ”CyTech”が含まれている2つに文字列型をequals（等価比較）での比較
		System.out.println("equals()での比較結果：" + tng1.equals(tng2));
	}
}


