package cafe;

/* HoseBlend: 기본 요소 중 하나 */
public class HoseBlend extends Beverage {
    public HoseBlend(){
        description = "하우스 브랜드 커피";
    }
    public double cost(){
        return 0.89;    // 하우스 블랜드 커피 가격
    }
}