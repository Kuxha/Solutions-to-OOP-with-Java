/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class Change {
    
    private char from;
    private char to;
    public Change(char fromCharacter,char toCharacter){
    
        this.from = fromCharacter;
        this.to = toCharacter;
    
    
    }
    
//     public String change(String characterString){
//         
//         String changed = "";
//         for(int i=0;i<characterString.length();i++){
//             char letter = characterString.charAt(i);
//             if(letter == this.from){
//                 changed = changed + this.to;
//             }
//             else {
//                 changed = changed + letter;
//             }
//         }
//         
//         return changed;
//         
//     }
      public String change(String characterString) {
        return characterString.replace(this.from, this.to);
    }
    
    
    
    
    
    
}
