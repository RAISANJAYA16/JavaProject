# Student Management System (Java)

A simple console-based **Student Management System** built in Java. This project was created after completing one month of Java training, as a way to practice core Java concepts in a single, working command-line application.

The program lets a user **add, view, search, update, and delete** student records, all stored in memory while the program runs.

---

## Features

- ➕ **Add Student** — enter a student's name, age, and roll number to create a new record
- 📋 **View Students** — list all students currently stored
- 🔍 **Search Student** — find a student by roll number
- ✏️ **Update Student** — edit a student's name and age using their roll number
- ❌ **Delete Student** — remove a student by roll number
- 🔁 **Menu Loop** — the program keeps running and showing the menu until the user chooses to exit

---

## Concepts & Java Features Used

This project intentionally combines several core Java concepts learned during training:

| Concept | Where it's used |
|---|---|
| **Classes & Objects** | `Student` class represents each student as an object |
| **Constructors** | `Student(int roll, int age, String name)` initializes new student objects |
| **Instance methods** | `display()` prints a student's details |
| **Static methods & variables** | All operations (`addstudent()`, `viewStudents()`, etc.) and the `students` array/`count` are `static`, so they can be used directly from `main()` without creating a `Project` object |
| **Arrays of objects** | `Student[] students = new Student[50]` stores up to 50 students |
| **`Scanner` class** | Reads user input from the console (`System.in`) |
| **Control flow** | `if / else if` for menu choices, `for` loops to search/update/delete/display, `while(true)` for the main menu loop |
| **String & primitive handling** | Mixing `nextInt()` and `nextLine()` to read numbers and text from the same `Scanner` |

---

## Project Structure

```
Project.java
├── class Student          → represents one student (roll, age, name)
│   ├── Student()           → constructor
│   └── display()           → prints student details
│
└── class Project           → main application logic
    ├── addstudent()         → creates and stores a new Student
    ├── viewStudents()       → loops through and prints all students
    ├── SearchStudents()     → finds a student by roll number
    ├── Updatestudent()      → edits an existing student's details
    ├── deleteStudent()      → removes a student and shifts the array
    └── main()               → shows the menu and routes user choices
```

---

## How to Run

1. Make sure you have the **Java Development Kit (JDK)** installed. Check with:
   ```bash
   java -version
   javac -version
   ```
2. Compile the program:
   ```bash
   javac Project.java
   ```
3. Run it:
   ```bash
   java Project
   ```
4. Follow the on-screen menu (enter a number from 1 to 6).

---

## Sample Menu

```
---Student management App
1. Add student
2. View student.
3. Search students.
4. Update students.
5. Delete students.
6. Exit program.
Enter Number (1 to 6):
```

---

## How Data is Managed

- Students are stored in a fixed-size array: `Student[] students = new Student[50]`.
- A separate `count` variable keeps track of how many students are currently stored, so the program knows how much of the array is actually in use.
- **Deleting** a student works by shifting every student after it one position to the left, then clearing the last slot and reducing `count`. This keeps the array without gaps.
- Since everything is stored **in memory only**, all data is lost when the program is closed — nothing is saved to a file or database yet.

---

## Known Limitations

Since this project was built while still learning, a few things are worth being aware of (and are good next steps to fix):

- **No data persistence** — records disappear when the program stops (no file or database storage yet).
- **Fixed array size** — the array can only hold 50 students; adding more would need a resizable structure like `ArrayList`.
- **No input validation** — entering text where a number is expected (e.g. for age or roll number) will crash the program with an exception.
- **Duplicate roll numbers are allowed** — there's no check to prevent adding two students with the same roll number.

---

## Possible Future Improvements

- Replace the array with an `ArrayList<Student>` to remove the 50-student limit
- Save/load student data to a file (`.txt` or `.csv`) or a database
- Add input validation with `try/catch` to handle invalid input gracefully
- Prevent duplicate roll numbers when adding a student
- Convert to a GUI application using JavaFX or Swing

---

## Author

**Rai Sanjaya**
Vocational student in Tokyo, Japan — learning HTML, CSS, JavaScript, Python, and Java, working toward becoming a Software Engineer.

This project was written as a hands-on exercise after one month of Java training to practice OOP, arrays, loops, and user input handling.
