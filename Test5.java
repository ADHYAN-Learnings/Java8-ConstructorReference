package constructorReference;

import java.util.stream.*;

interface D{
	public Test5 display();
}

public class Test5 {
	int a;
	int b;
	
	Test5(){
		 a =10;
		 b =20;
	}

	public static void main(String[] args) {
	
		D d = Test5::new;
		
		System.out.println(d.display().a+" : "+d.display().b);

	}

}
