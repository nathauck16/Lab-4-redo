import java.util.Random;

class Main {

  public static void main(String[] args) {

    //random number
    Random r = new Random();
    int randomNumber = r.nextInt(50) + 1;
    System.out.println("The Random Number is: " + randomNumber);


     //positive # loop
    while (randomNumber > 0) {
      randomNumber -= 1;
      System.out.println(randomNumber);
    }

    //Negative # loop , dont really need
    while (randomNumber < 0) {
      randomNumber++;
      System.out.println(randomNumber);
    }

      //if else
      if(randomNumber <25){
        System.out.println("Ahoy Matey's!");
      } else if (randomNumber> 25 && randomNumber < 42){
        System.out.println("Cannonball!");
      } else{System.out.println("Blastoff!");
      }

      
    
  }
}