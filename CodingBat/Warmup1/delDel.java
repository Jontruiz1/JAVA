/*
 * Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.
 * 
 * delDel("adelbc") → "abc"
 * delDel("adelHello") → "aHello"
 * delDel("adedbc") → "adedbc"
 */
public String delDel(String str) {

    return (str.length() > 3 && str.indexOf("del") == 1 ? str.substring(0,1) + str.substring(4, str.length()) : str);
    
    
}


  