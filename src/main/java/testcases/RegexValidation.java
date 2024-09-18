package testcases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public  class RegexValidation extends LearnFinal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "[a-z0-9]{7,}@[a-z]{3,}.[a-z]{3}";
		String data = "sandeep32127@gmail.com";
		Pattern pat = Pattern.compile(pattern);
		Matcher mat = pat.matcher(data);
		System.out.println(mat.matches());
		LearnFinal lf = new RegexValidation();
		lf.test();
		lf.declare();
		lf.summary();
		//test();
	}
	public  void test() {
		System.out.println("i m in private");
	}
	
	public void declare() {
		// TODO Auto-generated method stub
		System.out.println("i m in declare");
	}
	
}
