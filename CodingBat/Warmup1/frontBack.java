/*
 * Given a string, return a new string where the first and last chars have been exchanged.
 * 
 * frontBack("code") → "eodc"
 * frontBack("a") → "a"
 * frontBack("ab") → "ba"
 */

 public String frontBack(String str) {
    return (str.length() > 1 ? str.charAt(str.length() - 1) + str.substring(1, str.length()-1) + str.charAt(0) : str );
  }
  