package U4T3_LoopsString;

public class StringLoops {
    // default constructor; no instance variables
    public StringLoops() { }
  
    /* Returns the number of times "character" appears in "searchString"
       This should be NON-case sensitive! 
       
       Examples:
       - if character = "a" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "A" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "!" and searchString = "Hello! Nice day!",
         this method returns 2
  
        DO THIS WITH A FOR LOOP
      */  
    public int countCharacters(String character, String searchString) {
      /* to be implemented */
      String sLower = searchString.toLowerCase();
      String cLower = character.toLowerCase();
      int count = 0;

      for(int i = 0; i < sLower.length(); i++) {
        String currentChar = sLower.substring(i, i + 1);
        if(currentChar.equals(cLower)) {
            count++;
        }
      }
      return count;
    }
    
    /* Returns the original string reversed 
     
     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */  
    public String reverseString(String origString) {
      /* to be implemented */
      String newString = "";
      for(int ind = origString.length(); ind > 0; ind--) {
        newString += origString.substring(ind - 1, ind);
      }
      return newString;
    }

    public String removeA(String str) {
      // implement me
      String letter = "";
      String newStr = "";
      for(int k = 0; k < str.length(); k++) {
        letter = str.substring(k, k + 1);
        if(!letter.equals("a")) {
          newStr += letter;
        }
      }
      return newStr;
   }   
    public String replaceCharacterV1(String searchChar, String origStr, String replaceChar){
    /* to be implemented */
    String letter = "";
    String newStr = "";
    for(int i = 0; i < origStr.length(); i++) {
      letter = origStr.substring(i, i + 1);
      if(!letter.equals(searchChar)) {
        newStr += letter;
      } else {
        newStr += replaceChar;
      }
    }
    return newStr;
    }
    
    public String replaceCharacterV2(String searchChar, String origStr, String replaceChar){
      /* to be implemented */
      String letter = "";
      String newStr = "";
      int ind = 0;
      int origLen = origStr.length();
      while(ind < origLen) {
        letter = origStr.substring(ind, ind + 1);
        if(!letter.equals(searchChar)) {
          newStr += letter;
        } else {
          newStr += replaceChar;
        }
        ind++;
      }
      return newStr;
     }   

    public int countString(String searchString, String origString) {
      /* to be implemented */
      int count = 0;
      String str = origString;
      int pos = 0;
      while(str.indexOf(searchString) != -1) {
          count++;
          pos = str.indexOf(searchString);
          str = str.substring(pos + 1);
      }
      return count;
    }

    public String removeString(String searchString, String origString) {
      /* to be implemented */
      String str = "";
      int len = searchString.length();
      int ind = origString.indexOf(searchString);
      while(){}
     }
   
   
  }  