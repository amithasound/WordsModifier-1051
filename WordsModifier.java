import java.util.ArrayList;


public class WordsModifier {

    public static void main (String[] args) {
    String nstr = " ";
    char ch;    
        
        // Step 1:
        // Create an empty Arraylist object called words.
        // And then copy command line words to an Arraylist object
        ArrayList<String> words = new ArrayList<String>();
        for (String s: args) {
           words.add(s);
        }

        // Step 2:
        // print out the value in ArrayList object words
       System.out.print("Words in ArrayList before modifying: ");
        for(int i = 0; i < words.size(); i++) {   
          System.out.print(words.get(i) + " " );
        }
      
        System.out.println(" ");
        // Step 3:
        // For every element in ArrayList object words: 
        // reverse the sigulars and capitalize plurals
        for(int i = 0; i < words.size(); i++) {  
        String result = capitalize(words.get(i)); 
        String r2 = reverse(words.get(i));
          if(words.get(i).endsWith("s")){
            words.set(i, result);
          }else{
            words.set(i, r2);
          }
        } 
        
        // Step 4:
        // print the modified ArrayList object again
        System.out.print("Words in ArrayList after modifying: ");
        for(int i = 0; i < words.size(); i++) {   
          System.out.print(words.get(i) + " " );
        }
    }
    
    
    // please filling the details of method capitalize
    public static String capitalize (String s) {
       return s.toUpperCase();
    }
    
    // please filling the details of method reverse
    public static String reverse(String s) {
      String result = " ";
      for(int i=s.length()-1; i>=0; i--) {
        result = result + s.charAt(i);
      }  
    
      return result; 
     }


}