public class Text03{
	public static void main(String[] args){
		System.out.println(fun(1,2,3));
	}
	public static int fun(int a,int b){
		return Math.max(a,b);
	}
	public static int fun(int a,int b,int c){
		return Math.max(fun(a,b),c);
	}
}