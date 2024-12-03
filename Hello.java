public class Hello{
	static	String name="kang";
	public static void main(String[] args){
		System.out.print(1);
		System.out.println("hello");
		System.out.print(Hello.name);
		Hello h = new Hello(); //실체를 만드는것!!   Hello라는 설계도를 이용해서 h 라는 인스턴스가 만들어짐. 
		System.out.print(h.name);
		
		System.out.print(args[0]);
		System.out.print(args[1]);
		System.out.print(args[2]);

	}
}