package oop;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class Week3 {

  
    public static void main(String[] args) 
    {
        int ANGKA, RANDOM;
       
        
        Scanner INPUT = new Scanner(System.in);
        Random RAND = new Random();
        RANDOM = RAND.nextInt(98) + 1;
        
        System.out.println("Guess a magic number between 0 and 100 : ");
        do{
            do{
                System.out.print("Enter your guess : ");
                try
                {
                    ANGKA = INPUT.nextInt();
                }
                catch(InputMismatchException e)
                {
                    INPUT.nextLine();
                    continue;
                }
                if(ANGKA > 0 && ANGKA < 100)
                break;
            }while(true);
       
            if(ANGKA == RANDOM)
            {
                System.out.println("Yes, the number is " + RANDOM);
            }
            if (ANGKA < RANDOM)
            {
                System.out.println("Your guess is too low");
            }
            if (ANGKA > RANDOM)
            {
                System.out.println("Your guess is too high");
            }
        }while(ANGKA != RANDOM);
    }
    
}
