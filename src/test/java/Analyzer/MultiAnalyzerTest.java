package Analyzer;

import org.junit.Assert;
import org.junit.Test;

public class MultiAnalyzerTest {

    @Test
    public void numberOfWordsTest(){
        MultiAnalyser multiAnalyser = new MultiAnalyser();
        String input = "Ala ma kota a kot ma Ale";
        Assert.assertEquals(7,multiAnalyser.numberOfWords(input));
    }

//    @Test
//    public void rozkladTest(){
//        MultiAnalyser multiAnalyser = new MultiAnalyser();
//        String input = "Ala ma kota a kot ma Ale";
//
//        Assert.assertEquals(new {},multiAnalyser....(input));
//    }

    @Test
    public void longestWordsTest(){
        MultiAnalyser multiAnalyser = new MultiAnalyser();
        String input = "Ala ma kota a kot ma Ale";
        Assert.assertEquals("kota",multiAnalyser.longestWords(input));
    }

    @Test
    public void mostPopularWordsTest(){
        MultiAnalyser multiAnalyser = new MultiAnalyser();
        String input = "Ala ma kota a kot ma Ale";
        Assert.assertEquals("ma",multiAnalyser.mostPopularWords(input));
    }

    @Test
    public void empty(){
        MultiAnalyser multiAnalyser = new MultiAnalyser();
        String input = "";
        Assert.assertEquals(0 ,multiAnalyser.numberOfWords(input));
    }
}
