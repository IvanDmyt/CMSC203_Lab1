/*
 * Class: CMSC203 
 * Instructor:Professor Monshi
 * Description: Computer Science class where we study object oriented design using Java programming language
 * Due: 10/02/2024
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Ivan Sergiyovych Dmytriiev
*/  
import java.util.Scanner;

public class MovieDriver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Movie movie = new Movie();
            
            
        System.out.print("Enter the name of a movie ");
        String title = scanner.nextLine();
        movie.setTitle(title);  
            
           
        System.out.print("Enter the rating of the movie ");
        String rating = scanner.nextLine();
        movie.setRating(rating);  
            
          
        System.out.print("Enter the number of tickets sold for this movie ");
        int soldTickets = scanner.nextInt();
        movie.setSoldTickets(soldTickets);  
            
        scanner.nextLine();  
            
        System.out.println(movie.toString());

        System.out.println("Goodbye");
        
        scanner.close();
       }
    }
