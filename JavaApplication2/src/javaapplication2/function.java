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
public class function {
    //check the char is Arithmatic Operator
    public static boolean isArithmaticOperator(char tooken){
        return tooken=='-'||tooken=='+'||tooken=='/'||tooken=='*';
         }
     //check the char is Tooken Delimiter         
    public static boolean isTookenDelimiter(char tooken){
        return tooken=='#';
         }
    //check the char is Start Sympol 
    public static boolean isStartSympol(char tooken){
        return tooken=='@';
         }
    //check the char is End Sympol
    public static boolean isEndSympol(char tooken){
        return tooken=='$';
         }
    //check the char is Assiment Operator 
    public static boolean isAssimentOperator(char tooken){
        return tooken=='=';
         }
    //check the char is Braces
    public static boolean isBraces(char tooken){
        return tooken=='['||tooken==']'||tooken=='{'||tooken=='}';
         }
    //check the char is Quatation Mark
    public static boolean isQuatationMark(char tooken){
        return tooken=='\"'||tooken=='\''||tooken==',';
         }
    //check the char is Line Delimiter
    public static boolean isLineDelimiter(char tooken){
        return tooken=='^';
         }
    //check the char is Logical Operator
     public static boolean isLogicalOperator(char tooken){
        return tooken=='~';
         }
     //check the char is Relational Operator
    public static boolean isRelationalOperator(char tooken){
        return tooken=='<'||tooken=='>';
         }
     //check the string is Logical Operator
    public static boolean isLogicalOperator(String tooken){
        return tooken=="||"||tooken=="&&";
         } 
    //check the string is Relational Operator
    public static boolean isRelationalOperator(String tooken){
        return tooken=="=<"||tooken=="=>"||tooken=="=="||tooken=="!=";
         }  
    //check the String is Access Operator
     public static boolean isAccessOperator(String tooken){
        return tooken=="->";
         }  
    //check the string is Start Comment
     public static boolean isStartComment(String tooken){
        return tooken=="/-";
         }
     //check the string is End Comment
      public static boolean isEndComment(String tooken){
        return tooken=="-/";
         }
      //check the String is Comment
      public static boolean isComment(String tooken){
        return tooken=="--";
         }
      //check the char is Digit
     public static boolean isDigit(char tooken){
        return tooken=='0'||tooken=='1'||tooken=='2'||tooken=='3'
               ||tooken=='4'||tooken=='5'||tooken=='6'||tooken=='7'
               ||tooken=='8'||tooken=='9';
         }
      public static boolean isAlphapet(char tooken){
          
          return (tooken >='a'&&tooken <='z')||(tooken >='A'&&tooken <='Z') ;
          
          
      }
    
    
     
}
