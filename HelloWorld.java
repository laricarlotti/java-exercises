// LIST OF BEGINNER EXERCISES IN JAVA
// LIST OF BEGINNER EXERCISES IN JAVA
// LIST OF BEGINNER EXERCISES IN JAVA


// 1. Inside main(), add a statement which prints Hello someName!, with your name replacing someName.

public class HelloYou {
    public static void main(String[] args) {
      System.out.println("Hello Lari!");
    }
  }

// 2. Compilation: Creating executables

   /* Compilation helped us catch an error. Now that we’ve corrected the file, let’s walk through a successful compilation.

    As a reminder, we can compile a .java file from the terminal with the command:

    javac Whales.java

    If the file compiles successfully, this command produces an executable class: FileName.class. Executable means we can run this program from the terminal.

    We run the executable with the command:

    java Whales

    Note that we leave off the .class part of the filename. */


// 3. Int: Count the number of comments, and print it

//This is the class declaration
public class CountComment {
    //This is the main method that runs when you compile
      public static void main(String[] args) {
      //This is where you will define your variable
      int numComments = 6;
      //This is where you will print your variable
      System.out.println(numComments);
      }
    
    //This is the end of the class
  }
  
  //This is outside the class

// 4. Declare and print double variable

public class MarketShare {
	public static void main(String[] args) {
    double androidShare = 81.7;
    System.out.println(androidShare);
	}
}

// 5. Declare and print boolean variable

public class Booleans {
	public static void main(String[] args) {    
   boolean intsCanHoldDecimals = false; 
   System.out.println(intsCanHoldDecimals); 
	}
}

// 6. Declare and print char variable 

public class Char {
	public static void main(String[] args) {   
    char expectedGrade = 'A';
    System.out.println(expectedGrade);
	}
}

// 7. Declare and print String variable

public class Song {
	public static void main(String[] args) {   
    String openingLyrics = "Yesterday, all my troubles seemed so far away";
    System.out.println(openingLyrics);
	}
}