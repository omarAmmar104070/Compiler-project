/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Administrator
 */
//this class to define keywords in our language
public class keywords {
    public String keywordName  ;
    public String keywordMeaning ;
//constractor to assin value to keywords
    public keywords(String keywordName, String keywordMeaning) {
        this.keywordName = keywordName;
        this.keywordMeaning = keywordMeaning;
    }

    
    //this function to check the tooken is equall keyword or not
    public boolean isthis(String tooken)
    {
        return tooken==this.keywordName;
    }
    
}
