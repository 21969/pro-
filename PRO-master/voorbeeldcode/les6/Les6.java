import java.util.Scanner;
public class Les6{
  public static void main(String[] args) {
      Les6 les6 = new Les6();
  }
  public Les6(){
    showProblem();
    solveProblem();
  }
  private void showProblem(){
    //Met de onderstaande code kun je een appel eten.
    //Wat nu als je meer appels wil kunnen eten?
    //Moet ik dan de complete code kopieren?

    //Opdracht 1
    //Lees de onderstaande code regel voor regel door en zet per regel, in een comment erachter, wat de code doet
    //Als je een regel niet begrijpt zet je er een vraagteken achter.
    //Stel in de les vragen over regels die je niet begrijpt.

    //Opdracht 2
    //Pas de onderstaande code aan zodat je 3 appels tegelijk kunt eten.
    //Je hoeft nog niet te switchen tussen de appels met het "next" commando.

    Apple apple1 = new Apple();  //maakt een nieuwe Apple
    Apple apple2 = new Apple();
    Apple apple3 = new Apple();
    Scanner scanner = new Scanner(System.in);  //maakt een nieuwe Scanner

    while(true){ //zolang # waar is
      System.out.println("eat, look, next or exit?"); //print line
      String input = scanner.next(); //geeft de scanner de user input

      if(input.equals("eat")){ //als "eat" ingevoerd wordt
        apple1.takeBite(); //neem een hap
        apple2.takeBite();
        apple3.takeBite();
      }
      else if(input.equals("look")){ //als "look" ingevoerd wordt
        apple1.printAppleStatus(); //print de status van de Apple
        apple2.printAppleStatus();
        apple3.printAppleStatus();
      }
      else if(input.equals("exit")){ //als "exit" ingevoerd wordt
        break; //sluit af
      }else if(input.equals("next")){ // als "next" ingevoerd wordt
        //ga naar de volgende appel
        System.out.println("there is only one apple!"); //print line
      }else{ //anders
        System.out.println("i don't understand."); //print line
      }
  }
}
    //Opdracht 3
    //Maak een nieuwe functie aan met de naam solveProblem.
    //Plak de code voor het eten van de 3 appels erin.
    //Pas de code aan zodat je met behulp van een array 20 appels kunt eten met het "eat" commando.



    private void solveProblem(){

      Apple[] apples = new Apple[20];
      for(int i = 0; i < apples.length; i++){
        apples[i] = new Apple();
      }
      Scanner scanner = new Scanner(System.in);  //maakt een nieuwe Scanner

      while(true){ //zolang # waar is
        System.out.println("eat, look, next or exit?"); //print line
        String input = scanner.next(); //geeft de scanner de user input

        if(input.equals("eat")){ //als "eat" ingevoerd wordt
          for(int i = 0; i < apples.length; i++){
            apples[i].takeBite();
          }


        }
        else if(input.equals("look")){ //als "look" ingevoerd wordt
          for(int i = 0; i < apples.length; i++){
            apples[i].printAppleStatus(); //print de status van de Apple
          }
        }
        else if(input.equals("exit")){ //als "exit" ingevoerd wordt
          break; //sluit af
        }else if(input.equals("next")){ // als "next" ingevoerd wordt
          //ga naar de volgende appel
          System.out.println("there is only one apple!"); //print line
        }else{ //anders
          System.out.println("i don't understand."); //print line
        }
      }
    }






    //Opdracht 4
    //Pas de code zo aan dat je ook 20 appels kunt bekijken met het "look" commando.

    //Extra opdracht 5
    //Verzin een manier om te switchen tussen de appels,
    //zodat je niet alle appels tegelijk eet maar dat je ze 1 voor 1 kunt eten en bekijken.
    //Gebruik hiervoor het "next" commando.


}
