import java.util.*;

class GradeCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Take marks obtained in each subject
        System.out.println("Enter marks obtained in each subject (out of 100):");
        int totalMarks = 0;
        System.out.println("Enter number of subjects: ");
		int numSubjects = scanner.nextInt();
		int allsubject= numSubjects*100;
        
        for (int i=1;i<=numSubjects;i++){
            System.out.print("Enter marks for subject " + i + " (press -1 to stop): ");
            int marks = scanner.nextInt();
            
            if (marks == -1) {
                break;
            }
            
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks. Please enter a value between 0 and 100.");
            } else {
                totalMarks =totalMarks + marks;    
            }
        } 
        
        
        double averagePercentage = (double) totalMarks / numSubjects;
        
        
        char grade;
        if (averagePercentage > 90 ) {
            grade = 'O';
        } 
		else if (averagePercentage > 80 && averagePercentage<= 90) {
            grade = 'E';
        } 
		else if (averagePercentage > 70 && averagePercentage<= 80) {
            grade = 'A';
        } 
		else if (averagePercentage > 60 && averagePercentage<= 70) {
            grade = 'B';
        }
		else if (averagePercentage > 50 && averagePercentage<= 60) {
            grade = 'C';
        }
		else if (averagePercentage > 40 && averagePercentage<= 50) {
            grade = 'D';
        }
		else {
            grade = 'F';
        }
        
        
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks +" out of "+ allsubject);
        System.out.println("Average Percentage: " + averagePercentage + " %");
        System.out.println("Grade: " + grade);
        
        
    }
}
