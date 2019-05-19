package _02_gotta_catchem_all;

public class ExceptionMethods {
	public double divide(Double a, Double b) {
		if(b == 0) {
			throw new IllegalArgumentException();
		}else {
			return a/b;
		}
		
	}
	public String reverse(String s) {
		if(s.length() == 0) {
			throw new IllegalStateException();
		}else {
			String d = "";
			for(int i = s.length()-1; i >= 0; i++) {
				d+=s.substring(i, i+1);
			}
			return d;
		}
		
	}
}
