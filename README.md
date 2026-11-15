# Java Student Transcript Generator

A Java console program that reads a student's name, ID, and marks for four subjects, then prints a formatted transcript with the total, average, and grade.

## Features

- Reads the student's name and ID
- Reads marks for **Java**, **Database**, **Networking**, and **Mathematics**
- Calculates the total and the average
- Assigns a grade from the average
- Prints everything as a transcript

## Grading Scale

| Average | Grade |
|---------|-------|
| 80 and above | A |
| 70 to 79.99 | B |
| 60 to 69.99 | C |
| 50 to 59.99 | D |
| Below 50 | F |

## Sample Run

```
Enter student name: Alice
Enter student ID: 101
Enter mark for Java: 85
Enter mark for Database: 78
Enter mark for Networking: 72
Enter mark for Mathematics: 90

===== STUDENT TRANSCRIPT =====
Student Name: Alice
Student ID: 101
------------------------------
Java: 85.0
Database: 78.0
Networking: 72.0
Mathematics: 90.0
------------------------------
Total Marks: 325.0
Average: 81.25
Grade: A
```

## Requirements

- Java Development Kit (JDK) 8 or higher

## Getting Started

```bash
git clone https://github.com/<your-username>/<your-repo-name>.git
cd <your-repo-name>
javac StudentTranscript.java
java StudentTranscript
```

## Notes

- The name and ID are read with `nextLine()` before the marks, which avoids the common `Scanner` problem where `nextLine()` after `nextDouble()` returns an empty line.
- Marks are not validated, so values below 0 or above 100 are accepted.
- Entering a non-numeric mark throws an `InputMismatchException`.

## Project Structure

```
.
├── StudentTranscript.java
└── README.md
```

## Possible Improvements

- Validate that marks are between 0 and 100
- Store the subjects and marks in arrays or a `Map` to support any number of subjects
- Show a grade for each subject
- Save the transcript to a file
