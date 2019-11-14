package cafe;

/*2. CondimentDecorator: 추상 클래스로 Decorator가 이에 해당된다. */
public abstract class CondimentDecorator extends Beverage {
    // getDesciption(): 추상 메소드인 이유는? 첨가물 데코레이터 클래스들이 새로 구현하기 위해
    public abstract String getDescription();
}
