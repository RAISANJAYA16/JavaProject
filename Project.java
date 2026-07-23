import java.util.Scanner; // this import most be add at the top.

  class Student{
    int roll;
    int age;
    String name;
    // Constructer
    Student(int roll,int age, String name){
        this.roll = roll;
        this.age = age;
        this.name = name;
    }
    // Method used;
void display (){
        System.out.println("Roll: "+ roll +
                " Age: "+ age +
                " Name: "+ name);
}

}
public class Project {

    // three main variable
    static Student[] students = new Student[50]; // array of object.
    static int count = 0;
    static Scanner sc = new Scanner(System.in);

    // add student
    static void addstudent() {
        if (count == students.length) {
            System.out.println("Memory full.");
            return;
        }

        System.out.print("Enter your name:");
        String name = sc.nextLine();
sc.nextLine();
        System.out.print("Enter your age:");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your roll no:");
        int roll = sc.nextInt();
        sc.nextLine();


        students[count] = new Student(roll, age, name);// object creation.
        count++;
        System.out.println("Student added Successfully.");
    }

    // viewStudetsl
    static void viewStudents() {
        if (count == 0) {
            System.out.println("Student not found");
            return;
        }
        for (int i = 0; i < count; i++) {
            students[i].display();
        }
    }
// Search Students by roll number
    static void SearchStudents(){
        System.out.print("Enter roll number to search :");
        int roll = sc.nextInt();
sc.nextLine();// Fix flush buffer after nextInt()
for (int i = 0; i< count; i++){
    if (students[i].roll == roll ){
        students[i].display();
        return;
    }
}
        System.out.println("Student not found.");

    }
    // update student
    static void     Updatestudent(){
        System.out.println("Enter roll no. to edit :");
        int roll = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i<count; i++){
            if (students [i].roll == roll) {
                System.out.print("Enter new name:");
                students[i].name = sc.nextLine();
                System.out.print("Enter new age");
                students[i].age = sc.nextInt();
                sc.nextLine();
                System.out.println("Student updated successfully");
                return;
            }

        }
        System.out.println("Student not found");

    }

    // delete student.
    static void deleteStudent(){
        System.out.println("Enter roll to delete:");
        int roll = sc.nextInt();
        for (int i = 0; i < count; i++){
            if (students[i].roll == roll){
                // delete
for (int j = i; j < count-1; j++){
    students[j] = students[j+1];
}
students[count - 1] = null;
count--;
                System.out.println("Student deleted successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
    public static void main(String[] args) {

      while (true){
          System.out.println("\n---Student management App");
          System.out.println("1. Add student");
          System.out.println("2. View student.");
          System.out.println("3. Search students.");
          System.out.println("4. Update students.");
          System.out.println("5. Delete students.");
          System.out.println("6. Exit program.");

          System.out.println("Enter Number (1 to 6): ");
          int choice = sc.nextInt();

          if (choice == 1)addstudent();
         else if (choice == 2)viewStudents();
         else if (choice == 3)SearchStudents();
        else   if (choice == 4)Updatestudent();
       else    if (choice == 5 )deleteStudent();
          else if(choice == 6){
              System.out.println("Exiting Program. Goodbye!");
              break;
          } else {
              System.out.println("Invalid number. Please enter 1 to 6.");
          }
      }
    }
}
