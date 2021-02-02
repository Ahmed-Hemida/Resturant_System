/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturant_system;

import java.util.Scanner;
import org.json.JSONException;

/**
 *
 * @author kar
 */
public class Resturant_System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JSONException {

        Menu menu=new Menu();
        Food e=new Food();
        Recipt recipt=new Recipt();
//        e.name="lol";
//        e.size="s";
//        e.setPrice(45);
//        menu.menuFood.add(e);
//        menu.update(e);
//            recipt.detete_recipt();
            boolean resume=true;
                do{
                
               
//                recipt.read_order();
                   Scanner cin= new Scanner(System.in);
                    System.out.println(" enter meal name ");
                   e.name=cin.nextLine();
                   System.out.println(" enter meal size ");
                  e.size=cin.nextLine();
                  System.out.println(" enter meal price");
                   e.setPrice(Integer.parseInt(cin.nextLine()));
                   System.out.println(" enter meal piece");
                  int num_pieces =Integer.parseInt(cin.nextLine());
                recipt.record_order(e,num_pieces);
                
//                recipt.detete_recipt();
                
                    System.out.println("if you want to order more enter (y) else want the recipt enter (n) ");
                    switch(cin.nextLine()){
                        case "y":
                            resume=true;
                            break;
                        case "n":
                            resume=false;
                            break;
                    }
                    
                }while(resume);
              
                 System.out.println(" name \t price \t size \t pieces num \t meal price ");
                recipt.print_recipt(); 
                System.out.println("Happy meal");
//                 recipt.detete_recipt();
//        System.out.println(menu.menuFood.toString());
    }
    
}
