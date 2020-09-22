import java.util.Random;

/*
Lab 4
Partners:Nat Hauck and Brittany Posner
Date:9/22/2020
*/
class Main {

  public static void main(String[] args) {

    //random number
    Random r = new Random();
    int randomNumber = r.nextInt(50) + 1;
    System.out.println("The Random Number is: " + randomNumber);


    //if else
      if(randomNumber <25){
        System.out.println("Ahoy Matey's!");
      } else if (randomNumber> 25 && randomNumber < 42){
        System.out.println("Cannonball!");
      } else if (randomNumber> 42){
        System.out.println("Blastoff!");

      }

     //positive # loop
    while (randomNumber > 0) {
      randomNumber -= 1;
      System.out.println(randomNumber);
    }

    /*Negative # loop , dont really need
      while (randomNumber < 0) {
      randomNumber++;
      System.out.println(randomNumber);
    }
    */

      
  }
}