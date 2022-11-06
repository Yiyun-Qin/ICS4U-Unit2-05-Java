/**
 * This is the stack.
 *<p>
 * By:      Yiyun Qin
 * Version: 1.0
 * Since:   2022-10-27
 *</p>
 */
public class Vehicle {
  public static String licensePlate;
  public static String color;
  public static int doorNumber;
  public static int speed = 0;
  public static int maximumSpeed;

  // constructor
  /**
   * The Vehicle constructor.
   *
   */
  public Vehicle(String colour, String license, int door, int maxSpeed) {
    speed = 0;
    licensePlate = license;
    color = colour;
    doorNumber = door;
    maximumSpeed = maxSpeed;
  }

  // getters
  /**
   * The getLicense() getter, return the license.
   *
   */
  private static String getLicense() {
    return licensePlate;
  }

  /**
   * The status() getter, show status.
   *
   */
  public static void status() {
    System.out.println(" -> Speed: " + speed);
    System.out.println(" -> MaxSpeed: " + maximumSpeed);
    System.out.println(" -> Number of doors: " + doorNumber);
    System.out.println(" -> License Plate: " + licensePlate);
    System.out.println(" -> Color: " + color);
  }

  // method
  /**
   * The accelerate(int, int) methods.
   *
   */
  public static void accelerate(int accelerationPower, int accelerationTime) {
    speed = accelerationPower * accelerationTime + speed;
    if (speed > maximumSpeed) {
      speed = maximumSpeed;
    }
  }

  /**
   * The break(int, int) methods.
   *
   */
  public static void breakSpeed(int breakPower, int breakTime) {
    speed = speed - breakPower * breakTime;
    if (speed < 0) {
      speed = 0;
    }
  }
}
