import Analyzer.MultiAnalyser;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
   public static void main(String[] args){

       MultiAnalyser multiAnalyser = new MultiAnalyser();
       //String input = "Ala ma kota a kot ma Ale krowa kot kot bak lalala pewpewp dasd das adsdasdsa dsadasdasdasdasd ddddddddd ssssssssssssssssssssssssss nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn";
      String input = "input.txt";

       String readText = multiAnalyser.readFile(input);

       System.out.println("Choose one option:  (1 = numberOfWords; 2 = frequencyOfLetters; 3 = longestWords; 4 = tenLongestWords;" +
               "5 = mostPopularWords");
       Scanner scanner = new Scanner(System.in);
       int chooseOption = scanner.nextInt();

       switch (chooseOption){
           case 1:
               System.out.println("Number of words: " + multiAnalyser.numberOfWords(readText));
               break;
           case 2: {
               int tab[] = multiAnalyser.frequencyOfLetters(readText);
               for (int i = 0; i < tab.length; i++) {
                   if (tab[i] > 0) {
                       System.out.println((char) i + " " + tab[i]);
                   }
               }
               multiAnalyser.mostPopularWords(input);
               break;
           }
           case 3:
               System.out.println("Longest words: " + multiAnalyser.longestWords(readText));
               break;
           case 4:
               System.out.println(multiAnalyser.tenLongestWords(readText));
               break;
           case 5:
               System.out.println(multiAnalyser.mostPopularWords(readText));

       }

    }


//       String[] arr = multiAnalyser.readingFromFile("input.txt");
//       System.out.println();
//       System.out.println(multiAnalyser.numberOfWords(Arrays.toString(arr)));


   }
