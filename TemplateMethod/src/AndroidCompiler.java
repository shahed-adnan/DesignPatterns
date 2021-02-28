
public class AndroidCompiler extends CrossCompiler{

	@Override
	protected void collectSource() {
		System.out.println("Source data collected for Android.");		
	}

	@Override
	protected void compileToTarget() {
		System.out.println("Compiling data to target for Android.");		
	}
	
}
