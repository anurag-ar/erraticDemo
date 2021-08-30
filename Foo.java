public class Foo{
	
	public static int hw(int i){
		if( i%2 == 0){
			i = i*3 + 5;
			System.out.println("asdfgfhhfh");
		}
		else if( i/2 == 3){
			i = i*3 + 5;
			System.out.println("asdfgfhhfh");
		}
		else if( i %3 == 2){
			i = i*3 + 5;
			System.out.println("asdfgfhhfh");
		}
		else if( i-7 == 23){
			i = i*3 + 5;
			System.out.println("asdfgfhhfh");
		}
		else {
			i = i*3 + 5;
			System.out.println("asdfgfhhfh");
		}
	}
	
	public static void main(String[] args){
		Foo.hw(9786);
	}
}