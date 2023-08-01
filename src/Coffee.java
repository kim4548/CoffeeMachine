public class Coffee {
    private String coffeeName;  //커피 이름
    private int coffeePrice;     //커피 가격
    private int coffeeBean;   // 원두양
    private int milk;     // 우유

    private int water; // 물량

    private int disposableCup;


    public Coffee() {
    }



    public Coffee(String coffeeName, int coffeePrice, int coffeeBean, int milk, int disposableCup ,int water) {
        this.coffeeName = coffeeName;
        this.coffeePrice = coffeePrice;
        this.coffeeBean = coffeeBean;
        this.milk = milk;
        this.disposableCup = disposableCup;
        this.water = water;
    }

    public int getCoffeeBean() {
        return coffeeBean;
    }

    public int getMilk() {
        return milk;
    }

    public int getWater(){
        return water;
    }


    public int getDisposableCup() {
        return disposableCup;
    }



    public String getCoffeeName() {
        return coffeeName;
    }

    public int getCoffeePrice() {
        return coffeePrice;
    }
}

