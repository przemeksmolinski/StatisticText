import Analyzer.MultiAnalyser;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

       MultiAnalyser multiAnalyser = new MultiAnalyser();
       String input = "Ala ma kota a kot ma Ale dupa krowa kot kot bak lalala pewpewp dasd das adsdasdsa dsadasdasdasdasd ddddddddd ssssssssssssssssssssssssss nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn";
       //String[] arr = multiAnalyser.readingFromFile("input.txt");
       System.out.println("Choose one option:  (1 = numberOfWords; 2 = frequencyOfLetters; 3 = longestWords; 4 = tenLongestWords;" +
               "5 = mostPopularWords");
       Scanner scanner = new Scanner(System.in);
       int chooseOption = scanner.nextInt();

       switch (chooseOption){
           case 1:
               System.out.println("Number of words: " + multiAnalyser.numberOfWords(input));
               break;
           case 2: {
               int tab[] = multiAnalyser.frequencyOfLetters(input);
               for (int i = 0; i < tab.length; i++) {
                   if (tab[i] > 0) {
                       System.out.println((char) i + " " + tab[i]);
                   }
               }
               multiAnalyser.mostPopularWords(input);
               break;
           }
           case 3:
               System.out.println("Longest words: " + multiAnalyser.longestWords(input));
               break;
           case 4:
               System.out.println(multiAnalyser.tenLongestWords(input));
               break;
           case 5:
               System.out.println(multiAnalyser.mostPopularWords(input));

       }

    }


//       String[] arr = multiAnalyser.readingFromFile("input.txt");
//       System.out.println();
//       System.out.println(multiAnalyser.numberOfWords(Arrays.toString(arr)));


   }

////
////        MultiAnalyser multiAnalyser = new MultiAnalyser();
////        String tekst = "Ala ma kota a kot ma Ale";
////

//        MultiAnalyser multiAnalyser = new MultiAnalyser();
//        String tekst = "Ala ma kota a kot ma Ale";
//        int tab[] = multiAnalyser.frequencyDistributionOfLetters(tekst);
//        for (int i=0;i<tab.length;i++){
//            if (tab[i]>0){
//                System.out.println((char)i+" "+tab[i]);
//            }
//        }
//        multiAnalyser.mostPopularWords(tekst);
//    }
//}
