


public class RuntimeLoad {
    public static void main(String[] args) {
		 CosContainer c = new CosContainer(); 
		 Money m =    c.invokeAnnotation(new Money());
		 
		 try {
			 int money = m.minus(); 
			 System.out.println("남은 금액은:"+ money);
		} catch (Exception e) {
			System.out.println("Money 오브젝트가 만들어지지 않았어요");
		}
	
		 
	}
}
