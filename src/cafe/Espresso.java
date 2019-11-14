package cafe;

/* Espresso: 기본 요소 중 하나 */
public class Espresso extends Beverage {
    public Espresso(){
        description = "에스프레소";
    }
    public double cost(){
        return 1.99;    // 에스프레소 가격
    }
}