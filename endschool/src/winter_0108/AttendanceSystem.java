package winter_0108;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private boolean isPresent;

    public Student(String name) {
        this.name = name;
        this.isPresent = false;
    }

    public String getName() {
        return name;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void markPresent() {
        this.isPresent = true;
    }

    public void markAbsent() {
        this.isPresent = false;
    }
}


class AttendanceManager {
    private ArrayList<Student> students;

    public AttendanceManager() {
        students = new ArrayList<>();
    }

    public void addStudent(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                System.out.println("이미 등록된 학생입니다.");
                return;
            }
        }
        students.add(new Student(name));
        System.out.println(name + " 학생이 추가되었습니다.");
    }

    public void showStudentList() {
        if (students.isEmpty()) {
            System.out.println("등록된 학생이 없습니다.");
        } else {
            System.out.println("학생 목록:");
            for (int i = 0; i < students.size(); i++) {
                System.out.println((i + 1) + ". " + students.get(i).getName());
            }
        }
    }


    public void check(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                student.markPresent();
                System.out.println(name + " 학생 출석 처리되었습니다.");
                return;
            }
        }
        System.out.println(name + " 학생은 등록되지 않았습니다.");
    }

    public void show() {
    	if (students.isEmpty()) {
            System.out.println("등록된 학생이 없습니다.");
        } else {
            System.out.println("출석 현황:");
            for (Student student : students) {
                String status = student.isPresent() ? "출석" : "결석";
                System.out.println(student.getName() + ": " + status);
            }
        }
    }
}

public class AttendanceSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AttendanceManager man = new AttendanceManager();

        while (true) {
            System.out.println("\n======== 출석 관리 프로그램 ========");
            System.out.println("1.등록 2.목록 3.출석체크 4.출석현황 5.종료");
            System.out.print("선택: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("등록 학생 이름: ");
                    String nameadd = sc.nextLine();
                    man.addStudent(nameadd);
                    break;
                case 2:
                    man.showStudentList();
                    break;
                case 3:
                    System.out.print("출석 학생 이름: ");
                    String nameCheck = sc.nextLine();
                    man.check(nameCheck);
                    break;
                case 4:
                    man.show();
                    break;
                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 입력해주세요.");
            }
        }
    }
}
