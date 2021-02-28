
public class CompressionContext {
	private CompressionStrategy s;
	
	public void SetCompressionStrategy(CompressionStrategy strategy)
	{
		this.s=strategy;
	}
	
	public void CreateArchive(String f)
	{
		s.CompressFiles(f);
	}
}
