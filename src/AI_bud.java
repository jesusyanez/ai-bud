// Author: Jesus Yanez
//This program asks you questions and talks to you as if it were an AI,
//but not as smart as an AI
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AI_bud {

	public static void main(String[] args) {
		/**There are 8 java built in data types: boolean, byte, char, short, int, long, float, and double.
		boolean: can have two possible values: true or false
		byte: integral data type, 8 bits, ranges from -2^7 to 2^7-1
		char: textual data type, 16 bits, stores single character
		short: integral data type, 16 bits, ranges from -2^16 to 2^15-1
		int: used often, integral data type, 32 bits, ranges from -2^31 to 2^31-1
		long: integral data type, 64 bits, ranges from -2^63 to 2^63-1
		float: 32 bits, has F, almost never used
		string: textual data type, capitalized, used to print data/ store text
		*/
		
		//greeting with print statement
		System.out.println("Welcome to AI bud, nice to meet you.");
		System.out.println("What would you like to name me?");
		
		//scanner to ask for name
		Scanner sc = new Scanner(System.in);
		String name1 = sc.nextLine();
		
		//String method 'toUpperCase()' converts name to all upper case
		//final is used to make sure the name is never changed again
		final String name = name1.toUpperCase();
		System.out.println(name + ": Thank you for giving me a name. "  + name + " is a nice name. :)");
		//String method 'length' finds length of string
		int nameLength = name.length();
		System.out.println(name +": My name is "+nameLength+ " characters long.");
		System.out.println(name +": What is your \"name\"?");
		String user = sc.nextLine();
		//String method 'charAT' stores first letter of string as char
		char userI = user.charAt(0);
		System.out.println(name +": Must be nice to have the first initial " + userI + ".");
		//asks for name and uses scanner to get a double
		System.out.println(name +": How old are you " + user + "?");
		double ageDouble = sc.nextDouble();
		//casts the double into an int
		int age = (int) Math.floor(ageDouble);
		int ageMinus1 = age - 1;
		System.out.println(name + ": Last year you were " + ageMinus1);
		int agePlus1 = age + 1;
		System.out.println(name + ": Next year you will be " + agePlus1);
		int ageTimes2 = age * 2;
		System.out.println(name + ": If you double your age you will be " + ageTimes2);
		int ageDiv2 = age / 2;
		System.out.println(name + ": Half your age is " + ageDiv2);
		//operator precedence works like pemdas, multiplication and division go before addition and subtraction
		int ageUntilDecade = 10-(age%10);
		System.out.println(name + ": In " + ageUntilDecade + " years you will have accomplished another decade");
		int agePlus10 = age += 5;
		System.out.println(name + ": In 5 years you will be " + agePlus10);
		System.out.println(name + ": Would you like a lucky number? (Answer y/n)");
		String answer = sc.next();
		Random rand = new Random();
		int lucky = rand.nextInt(9) + 1;
		//used equals method to compare the text inside lucky to "y", using == compares object location
		if (answer.equals("y")) {
			System.out.println(name + ": Your lucky number is " + lucky);
		} else if (answer.equals("n")) {
			System.out.println(name + ": You have saved your luck for another day!");
		} else {
			System.out.println(name + ": Unfortunately, your luck has been given away to someone that needs it");
		}
		System.out.println(name + ": How many degrees celcius does it feel like outside today?");
		int degrees = sc.nextInt();
		System.out.println(name + ": How many degrees does it feel like inside?");
		int degreesInside = sc.nextInt();
		if (degrees > 100 || degreesInside > 90) {
			System.out.println(name + ": The weather has never been worse!");
		} else {
			System.out.println(name + ": The weather is not that bad");
		}
		System.out.println(name +": Pick and input a number between 1 and 5");
		int num = sc.nextInt();
		//method call is addsub, argument is num
		int num1 = addsub(num);
		switch (num1) {
		case 1: case 3: case 5:
			System.out.println(name +": You picked an odd numer");
			break;
		case 2: case 4: 
			System.out.println(name +": You picked an even number");
			break;
		default: 
			System.out.println(name +": You entered an invalid number");
		}
		System.out.println("Let's play hide and seek im going to count to 20");
		int count = 1;
        while (count < 21) {
            System.out.println(name + ": " + count);
            count++;
        }
        System.out.println(name + ": Found you");
        System.out.println(name +": Now i'm going to hide, I'll count for you");
        for(int i=1;i<=4;i++){  
          System.out.println(name + ": " + i);  
      }  
        System.out.println(name + ": 7");
        System.out.println(name + ": oops I messed up my counting let me start again");
        int i=1;  
        do{  
        System.out.println(name + ": " + i);  
        i++;  
        }while(i<=20); 
        System.out.println(name + ": You found me dang it");
        System.out.println(name + ": Games over now");
        System.out.println(name + ": Inheritance is a mechanism wherein a new class is derived from an existing class.");
        System.out.println(name + ": It allows you to use a class and add to it or change it");
        int [] numbers = {10, 20, 30, 40, 50};
        for(int x : numbers ) {
           if( x == 30 ) {
              continue;
           }
           System.out.print( x );
           System.out.print("\n");
        }
        //continue keeps the loop going if a number is picked from the array
        for(int x : numbers ) {
          if( x == 30 ) {
             break;
          }
          System.out.print( x );
          System.out.print("\n");
       }
        //continue stops the loop if a number is picked from the array
        //Polymorphism with constructors
        Dog obj = new Horse();
        obj.display();
        //array
        int a[] = {5,2,3};
        System.out.println(a[1]);
        // lowest value of array
        Arrays.sort(a);
        System.out.println(a[0]);
        //sum of array
        int summ = 0;
        for (i=0; i<a.length; i++) {
        	summ = summ + a[i];
        }
        System.out.println("The sum of the array is: " +summ);
        //search array for index location
        String[] TYPES = {
                "Sedan",
                "Compact",
                "Roadster",
                "Minivan",
                "SUV",
                "Convertible",
                "Cargo",
                "Others"
	};
        System.out.println(Arrays.asList(TYPES).indexOf("Sedan"));
        for (String element : TYPES) {
            System.out.println("Car Type: " + element);
        }
        
        //2d array
        int[][] z = {
        	      {1, 2, 3}, 
        	      {4, 5, 6, 9}, 
        	      {7}, 
        	};
        System.out.println(z[0][0]);
        
        // Creating an ArrayList of String
        List<String> animals = new ArrayList<>();

        // Adding new elements to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);

        // Adding an element at a particular index in an ArrayList
        animals.add(2, "Elephant");

        System.out.println(animals);
        
        int[][] arr = {{41, 44, 51, 71, 63, 1}, {7, 88, 31, 95, 9, 6}, {88, 99, 6, 5, 77, 4}};


        for (int k = 0; k < arr.length; k++) { 
            for (int j = 0; j < arr[k].length; j++) { 
                if (arr[k][j] == 88) { 
                    System.out.println("i=" + k + " j=" + j);
                }
            }
        }
        
        try { 
            int n = 30, b = 0; 
            int c = n/b;  // cannot divide by zero 
            System.out.println ("Result = " + c); 
        } 
        catch(ArithmeticException e) { 
            System.out.println ("Can't divide a number by 0"); 
        } 


	}
	
	
	
	// Function to find the index of an element in a primitive array in Java
	
	
	//method header is called addsub, parametere is int x, returns x
	public static int addsub(int x) {
		x++;
		x--;
		return x;
	}
	public static int addsub(int x, float y) {
		x++;
		x--;
		y++;
		return x;
	}

}
