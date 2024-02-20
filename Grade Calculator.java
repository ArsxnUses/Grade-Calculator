
import java.util.Scanner;
import java.time.LocalDate; 
public class GradeCalculator {
    public static void main(String args[]) {
        
        Scanner keyboard = new Scanner(System.in);
        LocalDate today = LocalDate.now();
        
        System.out.println("welcome to the grade calculator!");
        System.out.println("Please state your name...\n");
        String userName = keyboard.nextLine();
        
        System.out.println("\nWelcome " + userName);
        System.out.println("to get started choose a preset course or choose manual to input your own grade weights\n");
        
        int classChoice;
        double asgmtWeight = 0, labWeight = 0, discWeight = 0, quizWeight = 0, examWeight = 0;
        double asgmtGrade = 0, labGrade = 0, discGrade = 0, quizGrade = 0, examGrade = 0;
        double finalGrade = 0;
        
        do {
            System.out.println("please type the number of the course your are enrolled in");
            System.out.println("[1] class preset 1");
            System.out.println("[2] class preset 2");
            System.out.println("[3] Other / Custom\n");
            
            classChoice = keyboard.nextInt();
            
            switch ((int) classChoice) {
                case 1:
                    System.out.println("you chose Professor #1's Class\n");
                    
                    labWeight = 0.30;
                    discWeight = 0.10;
                    quizWeight = 0.30; 
                    examWeight = 0.30;
                    
                    System.out.println("what is your total grade (%) for the lab category?\n");
                    labGrade = keyboard.nextDouble();
                    System.out.println("What is the total grade (%) for the discussions categroy?\n");
                    discGrade = keyboard.nextDouble();
                    System.out.println("What is the total grade (%) for the quiz category?\n");
                    quizGrade=keyboard.nextDouble();
                    System.out.println("What is the total grade (%) for the exam category?\n");
                    examGrade = keyboard.nextDouble();
                    
                    finalGrade = (labWeight * labGrade) + (discWeight * discGrade) + (quizWeight * quizGrade) + (examWeight * examGrade);
                    break;
                case 2:
                    
                    System.out.println("You chose Professor #2's Class\n");
                    
                    asgmtWeight = 0.20;
                    labWeight = 0.40;
                    discWeight = 0.10;
                    quizWeight = 0.10;
                    examWeight = 0.20;
                    
                    System.out.println("What is your total grade (%) for the assignments category\n");
                    asgmtGrade = keyboard.nextDouble();
                    System.out.println("what is your total grade (%) for the lab category?\n");
                    labGrade = keyboard.nextDouble();
                    System.out.println("What is the total grade (%) for the discussions categroy?\n");
                    discGrade = keyboard.nextDouble();
                    System.out.println("What is the total grade (%) for the quiz category?\n");
                    quizGrade=keyboard.nextDouble();
                    System.out.println("What is the total grade (%) for the exam category?\n");
                    examGrade = keyboard.nextDouble();
                    
                    finalGrade = (asgmtWeight * asgmtGrade) + (labWeight * labGrade) + (discWeight * discGrade) + (quizWeight * quizGrade) + (examWeight * examGrade);
                    break;
                case 3:
                    
                    System.out.println("You chose manual input");
                    keyboard.nextLine();
                    
                    System.out.println("Does the course have assignments? (Press Enter to skip)");
                    String hasAsgmt = keyboard.nextLine();
                    if (!hasAsgmt.isEmpty()) {
                        System.out.println("Enter the weight for assignments category (Ex: .20)");
                        asgmtWeight = keyboard.nextDouble();
                        System.out.println("Enter your grade for the assingments category in % (Ex: 40)");
                        asgmtGrade = keyboard.nextDouble();
                    }
                    
                    keyboard.nextLine();
                    
                    System.out.println("Does the course have labs? (Press Enter to skip)");
                    String hasLab = keyboard.nextLine();
                    if (!hasLab.isEmpty()) {
                        System.out.println("Enter the weight for labs category (Ex: .20)");
                        labWeight = keyboard.nextDouble();
                        System.out.println("Enter your grade for the labs category in % (Ex: 40)");
                        labGrade = keyboard.nextDouble();
                    }
                    
                     keyboard.nextLine();
                    
                    System.out.println("Does the course have discussions? (Press Enter to skip)");
                    String hasDisc = keyboard.nextLine();
                    if (!hasDisc.isEmpty()) {
                        System.out.println("Enter the weight for discussions category (Ex: .20)");
                        discWeight = keyboard.nextDouble();
                        System.out.println("Enter your grade for the discussions category in % (Ex: 40)");
                        discGrade = keyboard.nextDouble();
                    }
                        
                     keyboard.nextLine();
                    
                    System.out.println("Does the course have quizzes? (Press Enter to skip)");
                    String hasQuiz = keyboard.nextLine();
                    if (!hasQuiz.isEmpty()) {
                        System.out.println("Enter the weight for quizzes category (Ex: .20)");
                        quizWeight = keyboard.nextDouble();
                        System.out.println("Enter your grade for the quizzes category in % (Ex: 40)");
                        quizGrade = keyboard.nextDouble();
                    }
                    
                     keyboard.nextLine();
                    
                    
                    System.out.println("Does the course have final exam? (Press Enter to skip)");
                    String hasExam = keyboard.nextLine();
                    if (!hasExam.isEmpty()) {
                        System.out.println("Enter the weight of the exam? (all weights should sum to 1.0)");
                        examWeight = keyboard.nextDouble();
                        System.out.println("Enter your grade for the final exam in % (Ex: 40)");
                        examGrade = keyboard.nextDouble();
                    }
                    
                    finalGrade = (asgmtWeight * asgmtGrade) + (labWeight * labGrade) + (discWeight * discGrade) + (quizWeight * quizGrade) + (examWeight * examGrade);
                    break;
                default:
                    System.out.println("Please choose [1], [2], or [3]");
            }
        } while (classChoice < 1 || classChoice > 3); //Repeats if the choice is invalid
        
        
        System.out.println("========== Grade Report for " + userName + " ==========\n");
        System.out.println("Assignments Total = " + asgmtGrade + "%");
        System.out.println("Labs Total = " + labGrade + "%");
        System.out.println("Discussions Total = " + discGrade + "%");
        System.out.println("Quiz Total = " + quizGrade + "%");
        System.out.println("Final Exam Total = " + examGrade + "%\n");
        System.out.println("===================================================\n");
        System.out.println("Final grade for course = " + finalGrade + "\n");
        System.out.println("========= Report generated on: " + today + " =========");

    }
}