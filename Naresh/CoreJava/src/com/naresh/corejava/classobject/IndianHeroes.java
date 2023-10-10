package com.naresh.corejava.classobject;

public class IndianHeroes {
	
	String heroName;
	int heroAge;
	int heroTotalMovies;
    int heroIndustryHits;

    // this is created by me
	/*public IndianHeroes() {

	}*/
    
    //this is created by sts
    public IndianHeroes() {
    	
    }
    
    //this is created by me
	/*public IndianHeroes(String heroName, int heroAge, int heroTotalMovies, int heroIndustryHits) {
         this.heroName = heroName;
		 this.heroAge = heroAge;
		 this.heroTotalMovies = heroTotalMovies;
		 this.heroIndustryHits = heroIndustryHits;
	}*/
	
    //this is created by sts
	public IndianHeroes(String heroName, int heroAge, int heroTotalMovies, int heroIndustryHits) {
		this.heroName = heroName;
		this.heroAge = heroAge;
		this.heroTotalMovies = heroTotalMovies;
		this.heroIndustryHits = heroIndustryHits;
	}
	



	public static void main(String[] args) 
	{
		IndianHeroes hero1 = new IndianHeroes();//
        IndianHeroes hero2 = new IndianHeroes("Chiranjeevi", 67, 154, 25);
		System.out.println(hero1);
		System.out.println(hero2);
	}


	//this is created by sts
	public String toString() {
		return "IndianHeroes [heroName=" + heroName + ", heroAge=" + heroAge + ", heroTotalMovies=" + heroTotalMovies
				+ ", heroIndustryHits=" + heroIndustryHits + "]";
	}

	//this is created by me
	/*public String toString() {
       return "IndianHeroes[heroName="+heroName+", heroAge="+heroAge+", heroTotalMovies="+heroTotalMovies+", heroIndustryHits="+heroIndustryHits+"]";
	}*/

}
