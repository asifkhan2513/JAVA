// Parent class for all students
class Student {
    String name;
    int rollNo;

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}

// Child class for creating student mark sheet
class MarkSheet extends Student {
    int subject1Marks;
    int subject2Marks;
    int subject3Marks;
    int subject4Marks;
    int subject5Marks;

    public MarkSheet(String name, int rollNo, int subject1Marks, int subject2Marks, int subject3Marks,
            int subject4Marks, int subject5Marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
        this.subject4Marks = subject4Marks;
        this.subject5Marks = subject5Marks;
    }

    public int getTotalMarks() {
        return subject1Marks + subject2Marks + subject3Marks + subject4Marks + subject5Marks;
    }

    public float getPercentage() {
        return (float) getTotalMarks() / 5;
    }

    public void printMarkSheet() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Subject 1: " + subject1Marks);
        System.out.println("Subject 2: " + subject2Marks);
        System.out.println("Subject 3: " + subject3Marks);
        System.out.println("Subject 4: " + subject4Marks);
        System.out.println("Subject 5: " + subject5Marks);
        System.out.println("Total Marks: " + getTotalMarks());
        System.out.println("Percentage: " + getPercentage());
    }
}

// Sample usage
class Main {
    public static void main(String[] args) {
        MarkSheet tu= new MarkSheet("John", 1, 90, 85, 95, 80, 75);
        tu.printMarkSheet();
    }
}