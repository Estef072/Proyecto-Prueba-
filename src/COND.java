
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WALTER1
 */
public class COND {
    
    public String traducirCOND(ArrayList<String> Lisp){
        ArrayList <String> dato = new  ArrayList <String> (); 
        for (String palabra : Lisp){
            if(palabra.equals("COND")){

            }
            else {
                dato.add(palabra);

            }
        }
        if (dato.size()==1){
            return "True";

        }
        else {
            return "False";

        }
        
    }
    
}
