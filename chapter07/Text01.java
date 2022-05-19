public class Text01{
	public static void main(String[] args){
		System.out.println(fun1(10));
	}
	public static int fun1(int n){
		if(n > 1){
			return n * fun1(n-1);
		}else{
			return 1;
		}
	}
}