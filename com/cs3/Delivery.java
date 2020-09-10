package com.cs3;

public class Delivery {
	
	
	Long over,ball,runs;
    String batsman,bowlerName,strikerName;
    public Delivery(Long over, Long ball, Long runs, String batsman, String bowlerName, String strikerName) {
		super();
		this.over = over;
		this.ball = ball;
		this.runs = runs;
		this.batsman = batsman;
		this.bowlerName = bowlerName;
		this.strikerName = strikerName;
	}
    void print()
    {
    	
    		
    		
    		System.out.println("over: "+over);
    		System.out.println("ball: "+ball);
    		System.out.println("runs: "+runs);
    		System.out.println("batsman: "+batsman);
    		System.out.println("bowlername: "+bowlerName);
    		System.out.println("strikername: "+strikerName);
    		
    		
    		
    		
    		
    	}    
	public Long getOver() {
		return over;
	}
	public void setOver(Long over) {
		this.over = over;
	}
	public Long getBall() {
		return ball;
	}
	public void setBall(Long ball) {
		this.ball = ball;
	}
	public Long getRuns() {
		return runs;
	}
	public void setRuns(Long runs) {
		this.runs = runs;
	}
	public String getBatsman() {
		return batsman;
	}
	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}
	public String getBowlerName() {
		return bowlerName;
	}
	public void setBowlerName(String bowlerName) {
		this.bowlerName = bowlerName;
	}
	public String getStrikerName() {
		return strikerName;
	}
	public void setStrikerName(String strikerName) {
		this.strikerName = strikerName;
	}
   }