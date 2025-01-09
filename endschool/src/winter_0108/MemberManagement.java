package winter_0108;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Member {
    private String name;
    private String gender;
    private int age;
    private String phoneNumber;
    private String address;
    private String note;
    
    LocalTime now = LocalTime.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH시 mm분 ss초");        
	private String time = now.format(formatter);

    public Member(String name, String gender, int age, String phoneNumber, String address, String note) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    @Override
    public String toString() {
        return "이름: " + name + ", 성별: " + gender + ", 나이: " + age +
                ", 전화번호: " + phoneNumber + ", 주소: " + address + ", 비고: " + note+", 가입시간: "+time;
    }
}

public class MemberManagement {
    private ArrayList<Member> members;

    public MemberManagement() {
        members = new ArrayList<>();
    }

    public void addMember(Member mem) {
        members.add(mem);
        System.out.println("회원이 등록되었습니다.");
    }

    public void updateMember(String name, Scanner sc) {
        for (Member mem : members) {
            if (mem.getName().equals(name)) {
                System.out.print("새 이름: ");
                mem.setName(sc.nextLine());
                System.out.print("새 성별: ");
                mem.setGender(sc.nextLine());
                System.out.print("새 나이: ");
                while (!sc.hasNextInt()) {
                    System.out.print("숫자를 입력해주세요: ");
                    sc.next();
                }
                mem.setAge(sc.nextInt());
                sc.nextLine(); // 버퍼 비우기
                System.out.print("새 전화번호: ");
                mem.setPhoneNumber(sc.nextLine());
                System.out.print("새 주소: ");
                mem.setAddress(sc.nextLine());
                System.out.print("새 비고: ");
                mem.setNote(sc.nextLine());
                System.out.println("회원 정보가 수정되었습니다.");
                return;
            }
        }
        System.out.println("해당 이름의 회원을 찾을 수 없습니다.");
    }

    public void deleteMember(String name) {
        Iterator<Member> it = members.iterator();
        while (it.hasNext()) {
            Member mem = it.next();
            if (mem.getName().equals(name)) {
                it.remove();
                System.out.println("회원이 삭제되었습니다.");
                return;
            }
        }
        System.out.println("해당 이름의 회원을 찾을 수 없습니다.");
    }

    public void searchMember(String name) {
        for (Member mem : members) {
            if (mem.getName().equals(name)) {
                System.out.println(mem);
                return;
            }
        }
        System.out.println("해당 이름의 회원을 찾을 수 없습니다.");
    }

    public void listMember() {
        if (members.isEmpty()) {
            System.out.println("등록된 회원이 없습니다.");
        } else {
            for (Member mem : members) {
                System.out.println("이름 : "+ mem.getName());
            }
        }
    }

    public static void main(String[] args) {
        MemberManagement m = new MemberManagement();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n회원 관리 프로그램");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 수정");
            System.out.println("3. 회원 삭제");
            System.out.println("4. 회원 검색");
            System.out.println("5. 회원 목록 확인");
            System.out.println("6. 종료");
            System.out.print("메뉴를 선택하세요: ");
            while (!sc.hasNextInt()) {
                System.out.print("숫자를 입력해주세요: ");
                sc.next();
            }
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("이름: ");
                    String name = sc.nextLine();
                    System.out.print("성별: ");
                    String gender = sc.nextLine();
                    System.out.print("나이: ");
                    while (!sc.hasNextInt()) {
                        System.out.print("숫자를 입력해주세요: ");
                        sc.next();
                    }
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("전화번호: ");
                    String phoneNumber = sc.nextLine();
                    System.out.print("주소: ");
                    String address = sc.nextLine();
                    System.out.print("비고: ");
                    String note = sc.nextLine();
                    m.addMember(new Member(name, gender, age, phoneNumber, address, note));
                    break;
                case 2:
                    System.out.print("수정할 회원 이름: ");
                   
                    m.updateMember(sc.nextLine(), sc);
                    break;
                case 3:
                    System.out.print("삭제할 회원 이름: ");
                    m.deleteMember(sc.nextLine());
                    break;
                case 4:
                    System.out.print("검색할 회원 이름: ");
                    m.searchMember(sc.nextLine());
                    break;
                case 5:
                    m.listMember();
                    break;
                case 6:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
    }
}
