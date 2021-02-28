
public class Client {
	public static void main(String[] args) {
		
		CrossCompiler iphone= new IphoneCompiler();
		iphone.CrossCompileTempMethod();
		CrossCompiler android = new AndroidCompiler();
		android.CrossCompileTempMethod();
	}
}
