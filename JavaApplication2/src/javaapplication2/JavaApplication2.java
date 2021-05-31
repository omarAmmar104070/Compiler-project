/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author      
 */

public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //define keyWords with using array of class keyword that have 3 character
        keywords[] keyWord3Char;
                keyWord3Char= new keywords[2];
        keyWord3Char[0]=new keywords("Ity", "Integer");
        keyWord3Char[1]=new keywords("Cwq", "Character");

        //define keyWords with using array of class keyword that have 7 character
        keywords[] keyWord7Char;
        keyWord7Char= new keywords[4];
        keyWord7Char[0]=new keywords("Pattern", "Class");        
        keyWord7Char[1]=new keywords("Truefor", "Condition");
        keyWord7Char[2]=new keywords("Logical", "Boolean");
        keyWord7Char[3]=new keywords("Require", "Inclusion");

        
        //define keyWords with using array of class keyword that have 11 character
        keywords[] keyWord11Char;
        keyWord11Char= new keywords[4];
        keyWord11Char[0]=new keywords("DerivedFrom", "Inheritance");
        keyWord11Char[1]=new keywords("CwqSequence", "String");
        keyWord11Char[2]=new keywords("RespondWith", "Return");
        keyWord11Char[3]=new keywords("ConditionOf", "Switch");
        
        //define keyWords with using array of class keyword that have 4 character
        keywords keyWord4Char[] ;
        keyWord4Char= new keywords[4];
        keyWord4Char[0]=new keywords("Else", "Condition");
        keyWord4Char[1]=new keywords("Sity", "Sinteger");
        keyWord4Char[2]=new keywords("Srap", "Struct");
        keyWord4Char[3]=new keywords("Scan", "Switch");
       
       
        
        //define keyWord that have 5 character
        keywords keyWord5Char = new keywords("IfIty", "Float");
       
        //define keyWord that have 6 character
        keywords keyWord6Char = new keywords("SIfIty", "SFloat");
       
        //define keyWord that have 8 character
        keywords keyWord8Char = new keywords("Whatever","Loop");
 
        //define keyWord that have 9 character
        keywords keyWord9Char = new keywords("Valueless","Void");
               
        //define keyWord that have 13 character
        keywords keyWord13Char = new keywords("BreakFromThis","Break");
    
        
        //$Cwq#fajhg=d30^
        String s ="#@$+~";
        if(s=="str")
        System.out.println("true");
        else
        System.out.println(keyWord13Char.keywordMeaning);
        char c ='q';
        System.out.println(function.isAlphapet(c));
        
    }
    
}
