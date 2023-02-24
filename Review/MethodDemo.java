package review;

class Student {
    String name;
    int rollNo;

    Student() {
        name = "null";
        rollNo = 1;
    }

    public void setDetails(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

class Exam extends Student {
    int m1;
    int m2;
    int m3;

    public void setMarks(int m1, int m2, int m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
}

class Result extends Exam {
    public int totalMark() {
        int res = m1 + m2 + m3;
        return res;
    }
}

public class MethodDemo {
    public static void main(String[] args) {
        Result ex = new Result();
        ex.setDetails("Jegan", 80);
        ex.setMarks(85, 70, 86);
        System.out.println("The total marks calculated for the student "+ex.name+" is "+ex.totalMark());
    }
}