//*******************************************************************
//
//   File: PlayHangman.java          Assignment No.: 5
//
//   Author: Jason Huishen Lu      Email: <huishen.lu@yale.edu>
//
//   Class: CS 112
//
//   Time spent on this problem: 5 hours
//   --------------------
//      This program executes the hangman game and provide users with a choice
//      to play.
//
//*******************************************************************
import java.util.Scanner;

public class Coin {
    public static int height = 400;
    public static int width = 600;
    public static int xSize = 50;
    public static int ySize = 50;
    public static String background = "machine.png";
    public static String text = "candystart2.png";

    public static void main(String[] args) {
   
        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);
        coinDrag(); 
    }
    
    public static void coinDrag () {
    	StdDraw.picture(width / 2, height / 2, background, 600, 400);
    	double x =200;
    	double y = 200;
    	double clickX = 0;
    	double clickY = 0;
    	
    	StdDraw.picture(x, y, "coin.png", 50, 50);
        while  ((clickX <500 || clickX>525) || (clickY <56 || clickY>70))  {
             x = StdDraw.mouseX();
             y = StdDraw.mouseY();
             //System.out.println( x + " " + y);
   
            if (StdDraw.mousePressed()) {
            	clickX = x;
            	clickY = y;
            	//System.out.println(clickX + " " + clickY);
	            StdDraw.picture(width / 2, height / 2, background, 600, 400);
	            StdDraw.picture(x, y, "coin.png", 50, 50);
	            StdDraw.show(10);
	            StdDraw.clear();
            }
        }
    //    System.out.print("You did it!");
    }
 } // end of class

  

