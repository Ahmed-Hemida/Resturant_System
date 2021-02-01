package resturant_system;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    ArrayList<Food> menuFood = new ArrayList<>();
    //reading food data
    Menu()  {
        try {
            File menuLoader = new File("MenuData.txt");
            Scanner scanner = new Scanner(menuLoader);
            int foodRead = 0;
            while (scanner.hasNextLine()) {
                Food Temp = new Food();
                Temp.name = scanner.nextLine();
                Temp.size = scanner.nextLine();
                Temp.setPrice(Integer.parseInt(scanner.nextLine()));
                menuFood.add(Temp);
                foodRead++;
            }
            System.out.println(foodRead +" types of food has been loaded into your system");
            scanner.close();
            menuFood.sort(Food.foodComparator);
            System.out.println(menuFood.toString());
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
    //adding food to menu
    public void update(Food temp){
        try {
           FileWriter outfile=new FileWriter("MenuData.txt",true);
//         outfile.newLine();
       
           outfile.write(temp.name.concat("\r\n"));
           outfile.write(temp.size.concat("\r\n"));
           outfile.write(String.valueOf((int)temp.getPrice()).concat("\r\n"));

            outfile.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
