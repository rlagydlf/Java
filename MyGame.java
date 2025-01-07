package winter_0107;
import java.util.Scanner;

public class MyGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean j = false;
        boolean m = false;
        System.out.println("어둡고 깊은 숲속에 들어왔습니다. 어느 길로 가시겠습니까?");
        System.out.println("1. 왼쪽 길");
        System.out.println("2. 오른쪽 길");
        System.out.println("3. 직진");

        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("왼쪽 길을 선택했습니다. 갑자기 멧돼지가 튀어나왔습니다. 어떻게 할까요?");
                System.out.println("1. 도망간다");
                System.out.println("2. 싸운다");
                
                choice = scanner.nextInt();
                if (choice == 2) {
                    System.out.println("당신은 멧돼지를 사냥하여 맛있는 고기를 얻었습니다.");
                    System.out.println("당신이 멧돼지고기를 구워먹고 있는 사이에 누군가 찾아와서 고기를 나눠달라고 합니다.");
                    System.out.println("1. 나누어준다");
                    System.out.println("2. 나누어주지 않는다");
                    choice = scanner.nextInt();
                    
                    if(choice == 1) {
                    	System.out.println("당신이 준 고기를 맛본 사람은 당신에게 반하여 당신과 결혼 하고 싶어합니다 어떻게 할까요?");
                    	System.out.println("1. 수락");
                        System.out.println("2. 거절");
                        
                        choice = scanner.nextInt();
                        if(choice == 1) {
                        	System.out.println("당신은 그/그녀와 행복하게 살았답니다.");
                        	break;
                        }
                        else if(choice ==2) {
                        	System.out.println("당신은 그/그녀의 조건을 거절해서 화가난 그/그녀가 당신을 살해했습니다.");
                        	break;
                        }
                        
                    }
                    else if(choice ==2) {
                    	System.out.println("화가난 그/그녀가 당신을 살해해서 고기를 강탈했습니다.");
                    	break;
                    }
                    
                } else if(choice ==2) {
                    System.out.println("당신은 멧돼지로 부터 도망가다가 사망했습니다.");
                    break;
                }
                break;
            
            case 2:
                System.out.println("오른쪽 길을 선택했습니다. 오래된 성을 발견했습니다!");
                System.out.println("1. 성 안으로 들어간다");
                System.out.println("2. 성 주변을 탐험한다");
                
                choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.println("성 안으로 들어갔습니다. 오래된 책을 발견했습니다. 책에는 마법의 주문이 적혀있습니다. 가져갈까요?");
                    System.out.println("1. 가져간다");
                    System.out.println("2. 가져가지 않는다");
                    choice = scanner.nextInt();
                    if(choice == 1) {
                    	m = true;
                    }
                        System.out.println("당신은 책을 챙기고 성을 나가려던 찰나 성 앞에 거인을 발견했습니다.");
                        System.out.println("1. 싸운다");
                        System.out.println("2. 도망간다");
                        choice = scanner.nextInt();
                        if(choice == 1 && m==true) {
                        	System.out.println("당신은 책을 열어 마법을 외쳤습니다.\n 펑 \n 큰 소리와 함께 거인은 쓰러졌습니다.");
                        	System.out.println("당신은 거인의 사체를 팔아서 큰 돈을 벌고 행복하게 살았습니다.");
                        	break;
                        }
                        else if(choice ==1&& m==false) {
                        	System.out.println("아무것도 없는 당신은 멍청하게 거인에게 싸움을 신청했다가 멍청하게 죽었네요. 왜 그런 선택을 한거죠?");
                        	break;
                        }
                        else if(choice == 2&& m==true) {
                        	System.out.println("당신은 도망가다가 거인에게 발각되었습니다. 하지만 책에서 본 마법의 주문으로 겨우 살아남았네요.");
                        	break;
                        }
                        else if(choice == 2&& m==false) {
                        	System.out.println("당신은 도망가다가 거인에게 발각되었습니다. 마법도 없는 당신은 무자비하게 사망했네요. 불쌍해라...");
                        	break;
                        }
                    
                } else {
                    System.out.println("성 주변을 탐험하다 숨겨진 동굴을 발견했습니다. 동굴 안에는 한 상자가 놓여있습니다. 여시겠습니까?");
                    System.out.println("1. 상자를 연다");
                    System.out.println("2. 상자를 열지 않는다");
                    choice = scanner.nextInt();
                    if (choice == 1) {
                    	System.out.println("이런 상자가 아니라 상자로 위장한 몬스터인 미믹이였네요. 미믹은 당신을 꿀꺽 삼켰습니다.");
                    	break;
                    }
                    else {
                    	System.out.println("상자를 지나치고 더욱 가자 동굴 끝에 잠들고 있는 정령이 있었습니다. 어떻게 할까요?");
                    	System.out.println("1. 공격한다");
                        System.out.println("2. 조심히 깨운다");
                        choice = scanner.nextInt();
                        if (choice == 1) {
                        	System.out.println("당신이 공격하려고 한 순간 정령은 빠르게 당신의 공격을 피해 당신을 죽였습니다. 잠자는 정령을 건드리다니...");
                        	break;
                        }
                        else {
                        	System.out.println("잠에서 깨어난 정령은 당신의 동료가 되어서 함께 모험을 떠나자고 합니다. 당신의 여정은 지금부터 시작입니다.");
                        	break;
                        }
                    }
                }
                break;
            
            case 3:
                System.out.println("직진했습니다. 깊은 계곡에 도착했습니다.");
                System.out.println("1. 수영을 한다");
                System.out.println("2. 그냥 지나간다.");
                
                choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.println("당신은 수영중에 계곡 바닥에서 보석을 발견햇습니다.");
                    j=true;
                } else {
                    System.out.println("당신은 계곡을 그냥 지나쳣습니다. 큰 행운이 있었을텐데요...");
                }
                System.out.println("계곡을 지나서 . 당신은 공주의 성에 도착했습니다.");
                System.out.println("1. 프러포즈를 한다");
                System.out.println("2. 그냥 마을에서 산다.");
                
                
                choice = scanner.nextInt();
                if (choice == 1 && j == true) {
                	System.out.println("당신은 계곡에서 찾은 보석으로 공주에게 프러포즈르 성공해서 나중에 왕이 되어 큰 나라를 다스리게 되었습니다");
                	break;
                }
                else if(choice ==1 && j==false) {
                	System.out.println("당신은 아무것도 없이 공주에게 프러포즈를 신청 했습니다. 하지만 이게 뭐죠? 공주는 당신을 보고 감옥에 가두라고 하였습니다.");
                	System.out.println("당신은 감옥에서 썩겠네요. 잘가세요.");
                	break;
                }
                else if(choice == 2 && j==true) {
                	System.out.println("당신은 보석을 팔아 얻은 돈으로 가게를 차려 큰 성공을 해서 행복하게 살았습니다.");
                	break;
                }
                else if(choice ==2 && j==false) {
                	System.out.println("아무것도 없이 여기온 당신은 길바닥으로 내몰렸습니다. 아유 불쌍해라...");
                	break;
                }
                break;
            
            default:
                System.out.println("잘못된 선택입니다. 게임을 종료합니다.");
        }

        scanner.close();
        System.out.println("게임이 끝났습니다. 다음에 또 플레이해주세요!");
    }
}

