/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturant_system;

import java.io.File;
import java.io.FileNotFoundException;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


import org.json.JSONArray;
import org.json.JSONException;

import org.json.JSONObject;

public class Recipt {
     ArrayList<Food> order = new ArrayList<>();
    
      
     Recipt(){
//     read_order();
     
//         System.out.println(read);
     }
     public void record_order(Food e ,int num_pieces){ 
         
         JSONObject json=new JSONObject();
        
         try {
             json.put("name",e.name);
             json.put("price",e.getPrice());
             json.put("size",e.size);
             json.put("num_pieces",num_pieces);
         } catch (JSONException ex) {
             System.err.println(ex);
         }
            
         try{
             
      FileWriter inPutFile=new FileWriter("OrderData.txt",true);
       inPutFile.write(json.toString().concat("\r\n"));
      inPutFile.close();
            
     }catch (IOException ex){
             System.err.println(ex);
        }
     }
     
     public JSONArray read_order(){
     File outPutFile=new File("OrderData.txt");
     String read="";
      JSONArray jsonObjectArray=new JSONArray();
         try {
             // A JSON object. Key value pairs are unordered. JSONObject supports java.util.Map interface.
             Scanner scanner = new Scanner( outPutFile); 
             
              while (scanner.hasNextLine()) {
                  read= scanner.nextLine();
                  JSONObject json=new JSONObject(read);
               jsonObjectArray.put(json);
            } 
              scanner.close();
         } catch (FileNotFoundException ex) {
             System.err.println(ex);
         } catch (JSONException ex) {
             System.err.println(ex);
         }
        
         
           
     return jsonObjectArray ;
     }
     
       public void print_recipt(){
        JSONArray jsonObjectArray = read_order();
        float total =0;
        for (int i = 0 ; i < jsonObjectArray.length(); i++) {
         try {
             JSONObject obj = jsonObjectArray.getJSONObject(i); 
             String name = obj.getString("name");
              int price = (int) obj.get("price");
               String size = obj.getString("size");
              int num_pieces = (int) obj.get("num_pieces");
              total =+price*num_pieces;
         System.out.println( name +"\t"+ price+"\t"+ size+"\t"+num_pieces +"\t"+ price*num_pieces);
         } catch (JSONException ex) {
            System.err.println(ex);
         }
    }
        
         System.out.println( "tatal price " +"\t"+ total);
        
   }
     public void detete_recipt(){
     
     File File=new File("OrderData.txt");
     File.deleteOnExit();
     }
    
    
    
}
