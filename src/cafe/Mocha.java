package cafe;

/* Mocha: 데코레이터 중 하나  */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;    // 자신이 감쌀 음료를 저장한다.
    }
    public String getDescription(){
        return beverage.getDescription() + ",  모카";   // 자신이 감싼 음료의 상세 설명 + 자신의 설명
    }
    public double cost(){
        return 0.2 + beverage.cost();     // 자신이 감싼 음료의 가격 + 자신의 가격
    }
}