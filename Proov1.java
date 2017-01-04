public class Proov1{
	public static void main(String[] arg){		
		Arvutaja a1=new TegelikArvutaja();
		a1.nupp("1");
		a1.nupp("2");
		System.out.println(a1.ekraan()); //12
		a1.nupp("+");
		a1.nupp("3");
		a1.nupp("=");
		System.out.println(a1.ekraan()); 		
	}
}