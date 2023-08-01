public class CoffeeMachine implements  ICoffeeMachine{
   private int balance;   //잔고
   private int waterlevel;   //물의 잔량

    private int milk;        // 우유의 잔량
    private int disposableCup;        // 일회용 컵 수
    private int coffeeBeans; // 원두의 잔량


    public CoffeeMachine() {
        this.balance = 50000;
        this.waterlevel = 400;
        this.milk = 540;
        this.disposableCup = 9;
        this.coffeeBeans = 120;
    }

    public int getBalance() {
        return balance;
    }

    public int getWaterlevel() {
        return waterlevel;
    }

    public int getMilk() {
        return milk;
    }

    public int getDisposableCup() {
        return disposableCup;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    // 초기 셋팅 커피 머신은 돈 50000원
    // 400ml 물 ,540ml 우유 , 120g 원두 , 9개의 일회용 컵 초기 셋팅

    //에소프레소 소모량 물 250ml ,원두 16g
    // 라떼 물 350ml , 우유 75ml , 원두 20g
    // 카푸치노 : 물 200ml 우유 100ml 원두 16g;

    Coffee coffee =new Coffee();



    @Override
    public void makeCoffee(Coffee coffee) {
        if (this.balance >= coffee.getCoffeePrice() &&
                this.waterlevel >= 200 &&
                this.coffeeBeans >= 16   &&
                this.milk >= 75 &&
                this.disposableCup >= 1) {
            System.out.println("커피를 구매 하셨습니다! 감사합니다");
            System.out.println(coffee.getCoffeeName() + " 가 준비되었습니다! 맛있게 드세요!");
            this.balance -=coffee.getCoffeePrice();
            this.waterlevel -=coffee.getWater();
            this.coffeeBeans -=coffee.getCoffeeBean();
            this.milk -= coffee.getMilk();
            this.disposableCup--;

        }  else if(this.balance < this.coffee.getCoffeePrice()){
          System.out.println("금액이 부족합니다! " + (coffee.getCoffeePrice() - this.balance) + " 금액이 필요합니다");
      }else if (this.coffee.getMilk() < coffee.getMilk()){
            System.out.println("우유를 리필 해주세요!");
      } else if (this.coffee.getCoffeeBean() < coffee.getCoffeeBean()) {
            System.out.println("원두를 리필 해주세요!");
        }  else if (this.coffee.getDisposableCup() < coffee.getDisposableCup()){
            System.out.println("일회용 컵을 채워주세요!");
        }
    }
    @Override
    public void insertCoin(int amount) {
        this.balance += amount;
        System.out.println(amount + " 원 충전됩니다!" + " 현재 잔고는  " +  this.balance + " 입니다 .");

    }
    @Override
    public void outCoin(int amount){
        this.balance -=amount;
        System.out.println(amount + " 원 인출 되었습니다!");
    }




    @Override
    public void refillWater(int amount) {
        this.waterlevel += amount;
        System.out.println(amount + " ml 충전 됩니다!");

    }

    public void refillMilk(int amount){
        this.milk += amount;
        System.out.println(amount + " ml 충전 됩니다!");
    }


    public void refillCoffeeBeans(int amount){
        this.coffeeBeans += amount;
        System.out.println(amount + " g 충전 됩니다!");
    }


    public void refillDisposableCup(int amount){
        this.disposableCup += amount;
        System.out.println(amount + " 개 충전됩니다!");
    }

@Override
    public void now(){
        System.out.println("남은 재료와 돈상태 : ");
        System.out.println("현재 잔고 :  " + getBalance());
        System.out.println("현재 물(ml)  :  " + getWaterlevel());
        System.out.println("현재 일회용 컵 갯수 : " + getDisposableCup());
        System.out.println("현재 원두(g) :  " + getCoffeeBeans());
        System.out.println("현재 우유(ml)   " + getMilk());
    }



}
