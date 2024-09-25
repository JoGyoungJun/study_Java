package franchise;

import java.util.Arrays;

// 햄버거 5600 재료로 빵이랑 패티 샐러드
// print()
// 이 음식은 햄버거로 가격은 5600입니다. 재료로는 빵, 패티, 샐러드 가 존재합니다.
public class Food {
    String menu;
    int price;
    String[] materials;

    public Food(String menu, int price, String[] materials) {
        this.menu = menu;
        this.price = price;
        this.materials = materials;
    }

    @Override
    public String toString() {
        return "Food{" +
                "menu='" + menu + '\'' +
                ", price=" + price +
                ", materials=" + Arrays.toString(materials) +
                '}';
    }

    public void print() {
        System.out.print("이 음식은 " + menu + "로 가격은 " + price + "원입니다. 재료로는 ");
        for (int i = 0; i < materials.length; i++) {
            if(i == materials.length-1)System.out.print(materials[i] );
            else System.out.print(materials[i] + ", ");
        }
        System.out.println("가 존재합니다.");
    }
}
