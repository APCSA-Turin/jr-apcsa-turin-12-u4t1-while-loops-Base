package U4T2_ForLoops;

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
  }  