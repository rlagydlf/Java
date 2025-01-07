package winter_0107;

import java.util.Random;
import java.util.Scanner;

public class Dice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사용자의 닉네임: ");
		User u = new User(sc.nextLine());
		User c = new User("computer");
		Random ran = new Random();

		while (true) {
			System.out.println("현재 score : " + u.getScore());
			System.out.println("현재 life : " + u.getLife());
			System.out.println("==============================");

			int udice = ran.nextInt(6) + 1;
			int cdice = ran.nextInt(6) + 1;

			System.out.println(u.getNickname() + "의 주사위: " + udice);
			System.out.println(c.getNickname() + "의 주사위: " + cdice);

			if (udice > cdice) {
				System.out.println(u.getNickname() + " 승리!");
				u.addScore(10);
			} else if (udice < cdice) {
				System.out.println(c.getNickname() + " 승리!");
				u.subtractLife(1);
			} else {
				System.out.println("무승부!");
			}
			
			 if (u.getScore() >= 100) {
	                System.out.println("축하합니다! " + u.getNickname() + "님이 승리하셨습니다!");
	                break;
	            }
	            
	            // 패배 조건 확인
	            if (u.getLife() <= 0) {
	                System.out.println(u.getNickname() + "님의 life가 0이 되어 게임에서 패배하셨습니다.");
	                break;
	            }
	            
			System.out.println("계속하시겠습니까? (y/n)");
			String re = sc.next();
			
			if(re.equals("y")) {
				if(u.getScore()==100) {
					System.out.println();
				}
				continue;
			}
			else if(re.equals("n")) {
				break;
			}
			
		
		}
		System.out.println("종료되었습니다.");
	}
}

class User {
	private String nickname;
	private int score;
	private int life;

	public User(String nickname) {
		this.nickname = nickname;
		score = 0;
		life = 10;
	}

	public String getNickname() {
		return nickname;
	}

	public int getScore() {
		return score;
	}

	public int getLife() {
		return life;
	}

	public void addScore(int amount) {
		score += amount;
	}

	public void subtractLife(int amount) {
		life -= amount;
	}
}