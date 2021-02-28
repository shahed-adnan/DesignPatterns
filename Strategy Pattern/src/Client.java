
public class Client {

	public static void main(String[] args) {
		
		CompressionContext ctx = new CompressionContext();
		ctx.SetCompressionStrategy(new ZipCompressionStrategy());
		ctx.CreateArchive("file A");
		
		CompressionContext ctx2= new CompressionContext();
		ctx2.SetCompressionStrategy(new RarCompressionStrategy());
		ctx2.CreateArchive("file B");
		
	}
}


