import java.util.Scanner;

public class CheckGrade {
  public static void main(String[] args){

    int marks = 0;

    Scanner scanner = new Scanner(System.in);
      System.out.print("Enter ur marks : ");
      if (scanner.hasNextInt()) {
        marks = scanner.nextInt();
      } else {
        System.out.print("Invalid input! Please enter valid integer");
      }
    scanner.close();

    switch (marks/10) {
      case 10: 
      case 9: 
      case 8: 
        System.out.print("Distinction");
        break;
      case 7: 
      case 6: 
        System.out.print("Honors");
        break;
      case 5: System.out.print("Merit");
      break;
      case 4: System.out.print("Pass");
      break;
      default: System.out.print("Fail");
      break;
    }
  }
}
