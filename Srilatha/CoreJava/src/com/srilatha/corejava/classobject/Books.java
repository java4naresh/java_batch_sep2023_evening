package com.srilatha.corejava.classobject;

public class Books {
	
		String bookName;
		String bookColor;
		int bookSize=3;
		int bookPages=245;
		

		public Books(String bookName,String bookColor,int bookSize,int bookPages){
		System.out.println("Constructor");
		this.bookName=bookName;
		this.bookColor=bookColor;
		}


		public static void main(String args[]){
		Books book=new Books("java","white",3,245);
		System.out.println(book);
		}
		

		public String toString(){
		return "Books[bookName="+bookName+",bookColor="+bookColor+",bookSize="+bookSize+",bookPages="+bookPages+"]";
	}
	}


