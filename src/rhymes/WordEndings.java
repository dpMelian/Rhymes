/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rhymes;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author dpMelian
 */
public class WordEndings {
    Set<String> words = new HashSet<String>();
    private String res = "";
    private int wordCount = 0;
    
    public WordEndings(String ending, boolean links) throws Exception {
        File file = new File("./src/resources/word_list.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()){
            words.add(sc.nextLine());
        }
        for (String s : words){
            if(s.length() >= ending.length()) {
                if ((s.substring(s.length() - ending.length())).equals(ending)) {
                    if(links){
                        res += "<a href=\"https://www.wordreference.com/definicion/" 
                                + s + "\">" + s + "</a><br>";
                        wordCount++;
                    } else {
                        res += s + "<br>\n";
                        wordCount++;
                    }
                }
            }
        }
    }
    
    public String getRes(){
        return this.res;
    }
    
    public int getWordCount(){
        return this.wordCount;
    }
}
