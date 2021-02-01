/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturant_system;

/**
 *
 * @author kar
 */
public class Resturant_System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//            System.out.println("LOL");
        Menu menu=new Menu();
//        System.out.print("\n sdvsdvd");
//         System.out.print("\n sdvsdvd");
//          System.out.print("\n sdvsdvd");
//           System.out.print("\n sdvsdvd");
//            System.out.print("\n sdvsdvd");
//             System.out.print("\n sdvsdvd");
           
        Food e=new Food();
        e.name="lol";
        e.size="s";
        e.setPrice(45);
        menu.menuFood.add(e);
        menu.update(e);
        System.out.println(menu.menuFood.toString());
    }
    
}
