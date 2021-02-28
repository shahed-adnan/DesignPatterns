
public abstract class CrossCompiler {

	public final void CrossCompileTempMethod()
	{
		collectSource();
		compileToTarget();
	}
	protected abstract void collectSource();
	protected abstract void compileToTarget();
}
