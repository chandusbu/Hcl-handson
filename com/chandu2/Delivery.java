package com.chandu2;
import java.util.Scanner;
import java.util.*;

public class Delivery {


long over;
long ball;
long runs;
String batsman;
String bowler;
String nonstriker;
public Delivery(long over, long ball, long runs, String batsman, String bowler, String nonstriker) {
	
	this.over = over;
	this.ball = ball;
	this.runs = runs;
	this.batsman = batsman;
	this.bowler = bowler;
	this.nonstriker = nonstriker;
}

void displayDeliveryDetails()
{
System.out.println("Delivery Details:");
System.out.println("Over: " +over);
System.out.println("Ball :" +ball);
System.out.println("Runs:" +runs);
System.out.println("Batsman:" +batsman);
System.out.println("Bowler:" +bowler);
System.out.println("Nonstriker:" +nonstriker);

}



}