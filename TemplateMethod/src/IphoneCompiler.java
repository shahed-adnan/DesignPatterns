
public class IphoneCompiler extends CrossCompiler{

	@Override
	protected void collectSource() {
		System.out.println("Source data collected for Iphone.");		
	}

	@Override
	protected void compileToTarget() {
		System.out.println("Compiling data to target for Iphone");
	}	
}


