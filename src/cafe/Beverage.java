package cafe;

/*1. Beverage: 추상 클래스로 Component가 이에 해당된다. */
public abstract class Beverage {
    String description = "제목 없음";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}