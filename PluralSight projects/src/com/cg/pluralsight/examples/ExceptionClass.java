package com.cg.pluralsight.examples;

public class ExceptionClass {
	boolean ExceptionClassp(String b) throws InputmatchException {	
	
	StringBuffer sb = new StringBuffer(b);
	if(b.equals("hello")) {
		throw new InputmatchException("Input matches with hello ");
	}
	
	return false;
	}
	public static void main(String[] args) {
				//sb.append("1234");
		ExceptionClass ec =new ExceptionClass();
		//ec.main(args);
		//ec.ExceptionClassp("hello");
		try {
			System.out.print(ec.ExceptionClassp("hello0"));
			throw new InputmatchException(ec);
		}
		catch(InputmatchException e) {
			//e.printStackTrace();
			System.out.println(e);
			
		}

	}

}
