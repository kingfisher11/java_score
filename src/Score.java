import java.util.Scanner;

public class Score {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Enter your name:");
            String name = scanner.nextLine();

            System.out.print("Enter your score (0-100):");
            int score = scanner.nextInt();

            // Determine student exam score
            String grade;

            if (score >= 80 && score <=100){
                grade = "A";
            } else if (score >= 60 && score <80 ){
                grade = "B";
            } else if (score >= 40 && score <60){
                grade = "C";
            } else if (score >= 0 && score <40){
                grade = "Fail";
            } else {
                System.out.println("Invalid score! Must be between 0-100.");
                grade = "Invalid";
                continue;
            }

            System.out.println(name+" "+score+" "+grade);
            // Ask if user wants to repeat
            System.out.print("Do you want to check another student? (yes/no): ");
            String again = scanner.nextLine().toLowerCase();

            if (!again.equals("yes")){
                break;
            }
        }
        System.out.print("\n Thank you for using Student Score Checker. ");
    }
}
