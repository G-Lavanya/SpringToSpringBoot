package com.cg.pluralsight.java8.newfeatures;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

interface parser{
	String parse(String value);
}

class StringParser{
	static String convertto(String pname) {
		if(pname.length()>8) {
			return pname.concat("Golla");
		}
		else {
		return pname.substring(3);
		}
	}
	
		String convert(String pname) {
		if(pname.length()>8) {
			return pname.concat("46000");
		}
		else {
		return pname.concat("hello");
		}
	}
		String AddName(String pname) {
			return "constructor invoked " + pname;
		}
}




class Myprinter{
	Myprinter(String surname,parser p){
		surname = p.parse(surname);
		System.out.println(surname);
	}
	void print(String name, parser parser) {
		name = parser.parse(name);
		System.out.println(name);
	}
}


public class MethodReference{
	public static void main(String[] args) {
		String name = "Lavanyaaaaa ";
		StringParser sp  = new StringParser(); // to run static method 
		String sur = "Musings";
		Myprinter p = new Myprinter(sur,value->sp.AddName(value));
		System.out.println("Using method reference");
		Myprinter p1 = new Myprinter(sur,sp::AddName);		
				
				
		//		new parser() {
			
			//@Override
			/*
			 * public String parse(String value) { return sp.AddName(sur); } });
			 */
		p.print(name, (v -> StringParser.convertto(v)));
		p.print(name, (s->sp.convert(s)));		//object created 
		p.print(name, (StringParser::convertto));
		p.print(name, sp::convert);
				
				/*new parser() {

			@Override
			public String parse(String value) {

				return StringParser.convertto(value);
			}
			
		}*/
		
	}
}