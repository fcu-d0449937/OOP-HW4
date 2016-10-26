package fcu.iecs.oop.passward;

public class PasswordEncorder {
  public String encode(String eng){

	   eng = eng.replace("A","4");
	   eng = eng.replace('a','4');
	   eng = eng.replace('E','3');
	   eng = eng.replace('e','3');
	   eng = eng.replace('I','1');
	   eng = eng.replace('i','1');
	   eng = eng.replace('T','0');
	   eng = eng.replace('t','0');
	  return eng;
}}
