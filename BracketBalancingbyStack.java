package jan4;

class Mystack{
	char[] c;
	int tos=-1;
	
	Mystack(String s){
		int n=s.length();
		c=new char[n];
		}
	
	void push(char ch) {
		if(tos==c.length) {
			System.out.println("stack is overflowing");
		}else {
			c[++tos]=ch;
		}
	}
	
	char pop() {
		if(tos==-1) {
			System.out.println("stack is underflow");
			return 0;
		}else {
			  return c[tos--];
		}	
	}
	
	char top() {
		if(tos>=0) {
			return c[tos];
		}else {
			return 0;
		}
		
	}
	
	
	
}

public class BracketBalancingbyStack {
	
	public static void main(String[] args) {
		String s="}()(())()(()){}{()}";
		boolean b=true;
		
		Mystack ms=new Mystack(s);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='('  || s.charAt(i)=='{') {
				ms.push(s.charAt(i));
			}else if(s.charAt(i)==')'  && ms.top()=='(') {
				ms.pop();
			}else if(s.charAt(i)=='}'  && ms.top()=='{') {
				ms.pop();
			}else if((s.charAt(i)==')' || s.charAt(i)=='}') && ms.top()==0 ) {
//				System.out.println("not balanced");
				b=false;
			}
		}
		
		if(b==true) {
			System.out.println("balanced");
		}else {
			System.out.println("not balanced");
		}
		
//		if(ms.tos==-1) {
//			System.out.println("balanced");
//		}else {
//			System.out.println("not balanced");
//		}
//		System.out.println(ms.tos);
		
	}
	
}

 