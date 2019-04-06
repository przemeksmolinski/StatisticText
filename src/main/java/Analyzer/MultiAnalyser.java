package Analyzer;

import java.io.*;
import java.util.*;

public class MultiAnalyser implements Analyzer{

    public MultiAnalyser(){
    }

    @Override
    public int numberOfWords(String input){

        if (input == ""){
            return 0;
        }
        String[] words = input.split("\\s");
        int numberOfWords = words.length;
        return  numberOfWords;
    }

    public int[] frequencyOfLetters(String input){
        int[] tab = new int['z'+1];
        char numberOfLetters[] = input.toCharArray();
        for (int i=0;i<numberOfLetters.length;i++){
            tab[numberOfLetters[i]]++;
        }
        return tab;
    }

    public String longestWords(String input){
        String arr[] = input.split("\\s");

        String max = arr[0];
        for (int i = 0; i < arr.length; i++) {
           int quantity = arr[i].length();
           if (quantity > max.length()){
               max = arr[i];
           }
        }
        return max;
    }


    public Set<String> tenLongestWords(String input){
        String arr[] = input.split("\\s");
        Set<String> longestWords = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });
        longestWords.addAll(Arrays.asList(arr));

            return longestWords;
    }

    public String mostPopularWords(String input){
        String arr[] = input.split(" ");

        Map<String,Integer> mapWords = new HashMap();
        for (String s: arr){
            if (!mapWords.containsKey(s)){
                mapWords.put(s,1);
            }else{
                int quantity = mapWords.get(s);
                quantity++;
                mapWords.put(s,quantity);
            }
        }

        String max="";
        int maxInt=0;
        for (Map.Entry<String,Integer> e: mapWords.entrySet()){
            if (e.getValue()>maxInt){
                maxInt=e.getValue();
                max=e.getKey();
            }
        }
        return max;
    }

    public String readFile(String filePath){

        File file = new File(filePath);
        String input = "";
        try {
            Scanner scaner = new Scanner(file);
            while (scaner.hasNextLine()) {
                input = input + scaner.nextLine() + "\n";
            }
        } catch (FileNotFoundException e) {
            System.out.println("null");
        }
        return input;
    }
}
