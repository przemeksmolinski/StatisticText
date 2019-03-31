package Analyzer;

import java.util.ArrayList;

public class MultiAnalyser {

    private final ArrayList<Analyzer> analyzers;
    MultiAnalyser(ArrayList<Analyzer> analyzers){
        this.analyzers = analyzers;
    }

    public void performAnalyzis(String text){
        for (Analyzer analizer : analyzers){
            analizer.analyze(text);
        }
    }
}
