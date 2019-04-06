package Analyzer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MultiAnalyser implements Analyzer{

    public MultiAnalyser(){
    }

    @Override
    public int numberOfWords(String input){

        if (input == ""){
            return 0;
        }
        String[] words = input.split(" ");
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
        String arr[] = input.split(" ");

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
        String arr[] = input.split(" ");
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

    public void readFile(String filePath) throws IOException {
    FileReader fileReader = new FileReader(filePath);
    BufferedReader bufferedReader = new BufferedReader(fileReader);
  try {
        String textLine = bufferedReader.readLine();
        do {
            System.out.println(textLine);

            textLine = bufferedReader.readLine();
        } while (textLine != null);
    } finally {
        bufferedReader.close();
    }

    }
}
