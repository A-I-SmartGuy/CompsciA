/*
Title: Mad Libs Project
Authors: Justin Arias and Brendan Aeria
Date: December 14, 2021
Course: AP Computer Science A

Description: In this project an original string is created with the mad libs that is not filled out,
using less than and greater than symbols to indicate what type of word the blank is looking for.
The program will then find three of these and ask the user to give a word of the type that is
specified inside of the symbols. Then it will print out the string that is now filled in with the
user's input.

Preconditions: One blank mad libs string is uncommented and assigned to the madLib variable, while 
another two are commented out. The program will then read through the string and find the parts of 
it that must be replaced with user input.

Postconditions: The user types in the specified type of word and after three words the mad libs is 
filled in and printed to the user.
*/

import java.util.Scanner;

class MadLib
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       
       //   tests with three different mad libs. 
       String madLib = "How many <plural noun> does it take to <verb> a lightbulb? <number> might do it.";
       //   String madLib = "Then the <noun> walked up to the <fruit>aid stand, and they <past tense verb> to the man running the stand...";
       //   String madLib = "It was a <adjective> day, and all of the <plural noun> were <present verb>.";
      
       int lessIndex;
       int greatIndex;
       lessIndex = madLib.indexOf('<');
       greatIndex = madLib.indexOf('>');
       //   parses sections to include. 
       String finishedMadlib = madLib.substring(0, lessIndex);
       //   parse for the parts of speech to replace
       System.out.print("Give a " + madLib.substring(lessIndex + 1, greatIndex) + ": ");
       //   prompts to keep the user on track
       String word1 = sc.nextLine();
       //   processes user input.
       finishedMadlib = finishedMadlib + word1;
       

       int less2 = madLib.indexOf('<', lessIndex + 1);
       int great2 = madLib.indexOf('>', greatIndex + 1);
       finishedMadlib = finishedMadlib + madLib.substring(greatIndex + 1, less2);
       System.out.print("Give a " + madLib.substring(less2 + 1, great2) + ": ");
       String word2 = sc.nextLine();
       finishedMadlib = finishedMadlib + word2;

       int less3 = madLib.indexOf('<', less2 + 1);
       int great3 = madLib.indexOf('>', great2 + 1);
       finishedMadlib = finishedMadlib + madLib.substring(great2 + 1, less3);
       System.out.print("Give a " + madLib.substring(less3 + 1, great3) + ": ");
       String word3 = sc.nextLine();
       finishedMadlib = finishedMadlib + word3 + madLib.substring(great3 + 1, madLib.length());
       
       //   displays the final modified Mad Lib
       System.out.println(finishedMadlib);

       sc.close();
    }
}
