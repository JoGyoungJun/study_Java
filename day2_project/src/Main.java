import franchise.Food;
import franchise.Store;

public class Main {
    public static void main(String[] args) {
        String[] f1ma = {"샷","얼음","물"};
        Food f1 = new Food("아메리카노", 1000, f1ma);
        String[] f2ma = {"샷","얼음","우유"};
        Food f2 = new Food("라떼", 2000, f2ma);
        Food[] farr = {f1,f2,null,null,null,null,null};
        Store store = new Store("메머드", 9, 19, farr);
        store.print();
        Food f =new Food("슬러쉬", 3000, null);
        System.out.println(store.addMenu(f));
        // 총 수가 올라가야 하고 , 총 금액 올라가야하고 , 평균 도 올라가야하고
        store.print();
//        이거로 잘들어 갔나 확인도 해보고
        System.out.println(store.getMenuArr());
        System.out.println(store.removeMenu("아메리카노"));
        store.print();
//        이거로 잘들어 갔나 확인도 해보고
        System.out.println(store.getMenuArr());
    }
}