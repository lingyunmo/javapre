package comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student(1054, "张光", 18, 93);
        students[1] = new Student(1043, "李赋", 17, 65);
        students[2] = new Student(1065, "王天", 22, 84);
        students[3] = new Student(1023, "张帕", 24, 23);
        students[4] = new Student(1014, "李瑞", 21, 67);
        System.out.println("排序前：");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("按照id排序后：");
        print(students, new IdComparator());
        System.out.println("按照name排序后：");
        print(students, new NameComparator());
        System.out.println("按照age排序后：");
        print(students, new AgeComparator());
        System.out.println("按照score排序后：");
        print(students, new ScoreComparator());
    }

    public static void print(Student[] students, Comparator<Student> studentComparator) {
        Arrays.sort(students, studentComparator);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
