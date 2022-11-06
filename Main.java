/**
 * This is the main code that runs
 * with the Vehicle Class.
 *
 * @author  Mr Coxall
 * @version 1.0
 * @since   2020-01-01
 */
public final class Main {
  /**
   * The main function.
   *
   */
  public static void main(String[] args) {
    // new FordFocus
    System.out.println("Created Ford focus");
    Vehicle fordFocus = new Vehicle("white", "B40-C4RR0", 4, 284);

    System.out.println("Status:");
    fordFocus.status();

    System.out.println("Accelerating, 10 of power for 10 sec.");
    fordFocus.accelerate(10, 10);
    System.out.println("New speed: " + fordFocus.speed);

    System.out.println("Changing colour to black:");
    fordFocus.color = "black";
    System.out.println("New color: " + fordFocus.color);

    System.out.println("");

    // new Ferrari
    System.out.println("Created a Ferrari");
    Vehicle ferrari = new Vehicle("red", "VHD-35HU", 2, 320);

    System.out.println("Status:");
    ferrari.status();

    System.out.println("Accelerating, 100 of power for 4 sec.");
    ferrari.accelerate(100, 4);
    System.out.println("New speed: " + ferrari.speed);

    System.out.println("Breaking, 10 of power for 10 sec.");
    ferrari.breakSpeed(10, 10);
    System.out.println("New speed: " + ferrari.speed);

    System.out.println("Changing color:");
    ferrari.color = "racing red!";
    System.out.println("New color: " + ferrari.color);

    System.out.println("");

    // new Citroen Ami
    System.out.println("Created a Citroen Ami");
    Vehicle citroenAmi = new Vehicle("blue", "FS-695-DQ", 2, 45);

    System.out.println("Status:");
    citroenAmi.status();

    System.out.println("Accelerating, 5 of power for 10 sec.");
    citroenAmi.accelerate(5, 10);
    System.out.println("New speed: " + citroenAmi.speed);

    System.out.println("Breaking, 2 of power for 10 sec.");
    citroenAmi.breakSpeed(2, 10);
    System.out.println("New speed: " + citroenAmi.speed);

    System.out.println("Changing color:");
    citroenAmi.color = "purple";
    System.out.println("New color: " + citroenAmi.color);

    System.out.println("\nDone.");
  }
}
