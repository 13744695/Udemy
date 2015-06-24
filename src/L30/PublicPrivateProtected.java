package L30;

public class PublicPrivateProtected {
	public static void main(String[] args) {
		
		Plant p1 =new Plant();
		System.out.println(p1.name);			// name can be accessed because it is public
		System.out.println(p1.id);				// id is also public but cannot be changed because it is declared final
			
		// 	System.out.println(p1.type);		// won't work again because type is private to Plant class only
		
	}
	
	
}
