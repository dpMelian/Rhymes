/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rhymes;

import java.util.Arrays;

/**
 *
 * @author dpMelian
 */
public class MetricAnalyzer {
    private String verses[];
    private String tempWords;
    private int syllables[];
    private SeparateSyllables sS;
    private String tempSyllables;
    
    public MetricAnalyzer(String text){
        for(int i = 0; i < text.length(); i++){
            verses = text.split("\\r?\\n");
        }
        
        syllables = new int[verses.length];
        
        for(int i = 0; i < verses.length; i++){
            tempWords = verses[i];
            sS = new SeparateSyllables(tempWords.toLowerCase());
            tempSyllables = sS.silabear();
            System.out.println(tempSyllables);
            for(int k = 0; k < tempSyllables.length(); k++){
                if(tempSyllables.charAt(k) == '-'){
                    syllables[i] += 1;
                }
            }
            syllables[i] += 1;
        }
        System.out.println(Arrays.toString(verses));
        System.out.println(Arrays.toString(syllables));
    }
}
