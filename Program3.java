//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
public class Program3{
    public static void main(String[] args){
        //declare variables
        int length = 0;
        int width = 0;
        int area = 0;
        int perimeter = 0;
        
        //create my scanner
        Scanner numScan = new Scanner(System.in);
        
        //ask for user input
        System.out.println("Enter The Lenght: ");
        length = numScan.nextInt();
        System.out.println("Enter The Width: ");
        width = numScan.nextInt();
        
        //calculate area and perimeter
        area = length*width;
        perimeter = 2*(length+width);
        
        
        
        //print results
        System.out.println("The area is: " + area);
        System.out.println("The width is: " + perimeter);
    }
}



//Paste console output below:
/*
Enter The Lenght: 
143
Enter The Width: 
82
The area is: 11726
The width is: 450

*/
