/*
 * Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.
 * 
 * front3("Java") → "JavJavJav"
 * front3("Chocolate") → "ChoChoCho"
 * front3("abc") → "abcabcabc"
 */

 public String front3(String str){
    // obviously creating a temp string and assigning it the str.substring(0, 3) would make
    // a shorter line but it would require 1 line above the return
    // my goal is to make single line solutions.
    
    return (str.length() < 3 ? str + str + str : str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3) );
    
  }
  