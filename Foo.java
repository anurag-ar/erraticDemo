public class Foo{
	
	public static void hw(int i){
		if( i%2 == 0){
			i = i*3 + 5;
			System.out.println("asdfg1");
		}
		else if( i/2 == 3){
			i = i*3 + 5;
			System.out.println("asdf3");
		}
		else if( i %3 == 2){
			i = i*3 + 5;
			System.out.println("a5fh");
		}
		else if( i-7 == 23){
			i = i*3 + 5;
			System.out.println("a4fh");
		}
		else {
			i = i*3 + 5;
			System.out.println("as2h");
		}
	}
	
	public static void main(String[] args){
		Foo.hw(9786);
	}
}
