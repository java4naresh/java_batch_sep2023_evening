package com.srilatha.corejava.classobject;

public class IndianHeroes {
String heroName;
int heroAge;
String heroColor;
double heroHeight;
double heroWeight;
double heroRemuneration;
double heroCollection;
int numberOfMovies;

public static void main(String args[]) {
	IndianHeroes pawankalyan=new IndianHeroes();
	pawankalyan.heroName="pawankalyan";
	pawankalyan.heroAge=50;
	pawankalyan.heroColor="fair";
	pawankalyan.heroHeight=5.8;
	pawankalyan.heroWeight=75;
	pawankalyan.heroRemuneration=20000;
	pawankalyan.heroCollection=123000;
	pawankalyan.numberOfMovies=30;
	System.out.println(pawankalyan);
}

public String toString() {
	return "IndianHeroes[heroName="+heroName+", heroAge="+heroAge+", heroColor="+heroColor+", heroHeight="+heroHeight+", heroWeight="+heroWeight+"]";

}
}
		
	

