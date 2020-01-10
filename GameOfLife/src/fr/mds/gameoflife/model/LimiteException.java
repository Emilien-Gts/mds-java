package fr.mds.gameoflife.model;

public class LimiteException extends Exception{ 
	  public LimiteException(){
	    System.out.println("Tell me a number like: 5< x >100");
	  }  
	}
