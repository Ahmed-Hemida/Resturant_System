/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturant_system;

import java.util.Scanner;

/**
 *
 * @author kar
 */
public class Resturant_System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Menu menu=new Menu();
        Food e=new Food();
        Recipt recipt=new Recipt();
            boolean resume=false;
            Scanner cin= new Scanner(System.in);
             do{ 
                 System.out.println(" Hi,DEAr Emplyee \n do you want to add a new meal enter (y)");
                 switch(cin.nextLine()){
                        case "y":
                            do{ 
                             System.out.println(" To add your meal to menu ");
                                System.out.println(" enter meal name ");
                            e.name=cin.nextLine();
                            System.out.println(" enter meal size ");
                           e.size=cin.nextLine();
                            System.out.println(" enter meal price");
                            e.setPrice(Integer.parseInt(cin.nextLine()));
                            menu.menuFood.add(e);
                            menu.update(e);
                                  System.out.println("if you want to order more enter (y) else want the recipt enter (n) ");
                                switch(cin.nextLine()){
                                    case "y":
                                        resume=true;
                                        break;
                                    case "n":
                                        resume=false;
                                        break;
                                        default:
                                            resume=false;
                                }
                           }while(resume);
                   
                            break;
                    }
                do{
                 System.out.println("Hi,DEAr Castomar ");
                    System.out.println(" enter meal name ");
                   e.name=cin.nextLine();
                   
                   System.out.println(" enter meal size ");
                  e.size=cin.nextLine();
//                  System.out.println(e.size);
                  if(menu.search(e)==null){
                      System.out.println(" we not have this meal ");
                      
                  break;
                  }else{
//                      e.e.getPrice() == zero ,why?
                  System.out.println(e.getPrice());
                  }
                   
                   System.out.println(" enter meal piece");
                  int num_pieces =Integer.parseInt(cin.nextLine());
                recipt.record_order(e,num_pieces);
                    System.out.println("if you want to order more enter (y) else want the recipt enter (n) ");
                    switch(cin.nextLine()){
                        case "y":
                            resume=true;
                            break;
                        default:
                            resume=false;
                            recipt.print_recipt(); 
                           System.out.println("Happy meal");
                            recipt.detete_recipt();
                    }
                    
                }while(resume);
               
                
//                 System.out.println("do you want to delete the recipt enter (y) ");
//                    switch(cin.nextLine()){
//                        case "y":
//                            recipt.detete_recipt();
//                            break;
//                            default:
//                    }
                     System.out.println("if you want to close system enter (y) else  enter (n) ");
                    switch(cin.nextLine()){
                        case "n":
                            resume=true;
                            break;
                        case "y":
                            resume=false;
                            break;
                        default:
                              resume=false;
                    }
                  }while(resume); 
    }
    
}
