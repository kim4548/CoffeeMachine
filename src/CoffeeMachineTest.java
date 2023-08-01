import java.util.Scanner;

public class CoffeeMachineTest {
    public static void main(String[] args) {

        Coffee espresso = new Coffee("에소프레소",4000,16,0,1,250);
        Coffee latte = new Coffee("라떼", 7000,20, 75, 1, 350);
        Coffee cappuccino = new Coffee("카푸치노", 6000,12, 100, 1, 200);

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Scanner scanner = new Scanner(System.in);

        int choice;
        int money;


        while (true){
            System.out.println("==========================================");
            System.out.println("옵션을 선택하세요!");
            System.out.println("1.잔량 | 2. 커피  | 3. 리필 | 4. 인출 | 5.종료");
            System.out.println("==========================================");
            System.out.print("선택 >  ");
             choice = scanner.nextInt();

             switch (choice){

                 case 1:
                     System.out.println("현재 커피머신 상태 입니다!");
                     coffeeMachine.now();
                     break;
                 case 2:
                     System.out.println("어떤 커피를 구매 하시겠습니까 ? ");
                     System.out.println("1. 에스프레소 ( 가격 : 4000원 )");
                     System.out.println("2. 라떼 ( 가격 : 7000원 )");
                     System.out.println("3. 카푸치노 ( 가격 : 6000원 )");
                     int choiceCoffeeNum = scanner.nextInt();
                     if (choiceCoffeeNum == 1 ) {
                         coffeeMachine.makeCoffee(espresso);
                         System.out.println();
                         coffeeMachine.now();
                     } else if (choiceCoffeeNum == 2) {
                         coffeeMachine.makeCoffee(latte);
                         System.out.println();
                         coffeeMachine.now();
                     } else if (choiceCoffeeNum ==3 ) {
                         coffeeMachine.makeCoffee(cappuccino);
                         System.out.println();
                         coffeeMachine.now();
                     }
                     break;

                 case 3:
                     System.out.println("무엇을 리필 하시겠습니까?");
                     System.out.println("==================================");
                     System.out.println("1.물 | 2. 우유| 3. 원두 | 4. 일회용 컵| 5.금액 충전  |6. 종료");
                     System.out.println("==================================");
                     int refillChoice = scanner.nextInt();
                     switch (refillChoice){
                         case 1:
                             System.out.println("물을 충전합니다!");
                             System.out.println("물을 리필 하실 양을 넣어주세요!");
                             int waterRefillAmount = scanner.nextInt();
                             coffeeMachine.refillWater(waterRefillAmount);
                             break;

                         case 2:
                             System.out.println("우유를 충전합니다 .");
                             System.out.println("우유를 리필 하실 양을 넣어 주세요");
                             int milkRefillAmount =scanner.nextInt();
                             coffeeMachine.refillMilk(milkRefillAmount);
                             break;

                         case 3:
                             System.out.println("원두를 충전합니다.");
                             System.out.println("원두를 리필하실 양을 넣어주세요!");
                             int beanRefillAmount =scanner.nextInt();
                             coffeeMachine.refillCoffeeBeans(beanRefillAmount);
                             break;

                         case 4:
                             System.out.println("일회용 컵을 충전합니다.");
                             System.out.println("일회용 컵을 넣어주세요!");
                             int cupRefillAmount = scanner.nextInt();
                             coffeeMachine.refillDisposableCup(cupRefillAmount);
                                break;
                         case 5:
                             System.out.println("금액을 투입하세요!");
                             money = scanner.nextInt();
                             coffeeMachine.insertCoin(money);
                             break;

                         case 6:
                             System.out.println("종료 합니다!");
                             break;
                     }
                 case 4:
                     System.out.println("금액을 인출합니다!");
                     int Exmoney = scanner.nextInt();
                     coffeeMachine.outCoin(Exmoney);
                     break;
                 case 5:
                     System.out.println("커피 머신기를 종료 합니다!");
                     break;

             }
        }
    }
}
