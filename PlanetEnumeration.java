// import 
import java.util.Scanner;

/**
 * Planet Enumeration.
 * Asks the user where they want to go
 * and create planet info where
 * it outputs a fact using a 
 * switch statement

* @author  Linh Ho
* @version 1.0
* @since   2020-09-26
*/

public class PlanetEnumeration {
  
  /**
    * Required javadoc.
  */
  
  public enum Planet {
    MERCURY, 
    VENUS, 
    EARTH, 
    MARS,
    JUPITER,
    SATURN,
    URANUS,
    NEPTUNE;
  }
  
  /**
    * Required javadoc.
  */
  
  public enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
  }
  
  /**
    * Required javadoc.
  */
  
  public enum Rainbow {
    RED,
    ORANGE,
    YELLOW,
    GREEN,
    BLUE,
    INDIGO,
    VIOLET;
  }
  
  /**
    * Required javadoc.
  */
  
  public static void planetInfo(Planet myPlanet) {
    // switch statements and print random info
    switch (myPlanet) {
      case MERCURY:
        System.out.println("Mercury is the smallest planet.");
        break;
        
      case VENUS: 
        System.out.println("Venus has 90 times the atmospheric pressure of Earth.");
        break;
        
      case EARTH:
        System.out.println("You already live here! Yay!");
        break;
        
      case MARS: 
        System.out.println("Earth and Mars have approximately the same landmass.");
        break;
        
      case JUPITER:
        System.out.println("Jupiter is the fastest spinning planet in the solar system.");
        break;
        
      case SATURN:
        System.out.println("Saturn is the flattest planet. No pun intended.");
        break;
        
      case URANUS:
        System.out.println("First planet found using a telescope. WHAT?!?");
        break;
        
      default:
        System.out.println("The coldest planet in the solar system.");
        break;
    }
  }
  
  /**
    * Required javadoc.
  */
  
  public static void dateInfo(Day myDay) {
    // switch statements and print random info
    switch (myDay) {
      case MONDAY:
        System.out.println("Monday... The most boring day of the week.");
        break;
        
      case TUESDAY: 
        System.out.println("Tuesday, the most productive day of the week.");
        break;
        
      case WEDNESDAY:
        System.out.println("Wednesday, also known as hump day");
        break;
        
      case THURSDAY: 
        System.out.println("Thursday, the irrelevant day before Friday.");
        break;
        
      case FRIDAY:
        System.out.println("Friday, the most relieving day of them all.");
        break;
        
      case SATURDAY:
        System.out.println("Saturday, a chill day.");
        break;
        
      default:
        System.out.println("Sunday, the day where you cry because Monday is coming.");
        break;
    }
  }
  
  /**
    * Required javadoc.
  */
  
  public static void rainBowInfo(Rainbow myColour) {
    // switch statements and print random info
    switch (myColour) {
      case RED:
        System.out.println("Red makes things appear closer than they really are.");
        break;
        
      case ORANGE: 
        System.out.println("In India, orange is a sacared colour.");
        break;
        
      case YELLOW:
        System.out.println("Yellow is one of the primary colors");
        break;
        
      case GREEN: 
        System.out.println("Green is the second most popular favourite colour.");
        break;
        
      case BLUE:
        System.out.println("Blue is the least common color in the foods we eat.");
        break;
        
      case INDIGO:
        System.out.println("Traders used to refer Indigo as Blue Gold");
        break;
        
      default:
        System.out.println("Purple is the hardest color for the eye to distinguish.");
        break;
    }
  }
  
  /**
    * Required javadoc.
  */
  
  public static void main(String[] args) {
    // create scanner
    Scanner userInput = new Scanner(System.in);
    
    // ask user what planet they want to go to
    System.out.println("Which planet do you want to go to? ");
    
    // set user answer to scanner
    String userPlanet = userInput.nextLine();
    
    // put user's input to uppercase since enum
    // are all uppercase
    userPlanet = userPlanet.toUpperCase();
    
    // setting planet to procedure
    Planet myPlanet = Planet.valueOf(userPlanet);
    
    // call planet info procedure
    planetInfo(myPlanet);
    
    // ask user to pick a day
    System.out.println("Pick a day.");
    
    //set user answeer to scanner
    String userDay = userInput.nextLine();
    
    // uppercase answer
    userDay = userDay.toUpperCase();
    
    // setting day to procedure
    Day myDay = Day.valueOf(userDay);
    
    // call day info procedure
    dateInfo(myDay);
    
    // ask user to choose colour from rainbow
    System.out.println("Choose a colour from a rainbow.");
    
    // set user answer to scanner
    String userColour = userInput.nextLine();
    
    // uppercase answer
    userColour = userColour.toUpperCase();
    
    // setting colour to procedure
    Rainbow myColour = Rainbow.valueOf(userColour);
    
    // call colour day info procedure
    rainBowInfo(myColour);
  }
}