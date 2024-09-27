package controller;

import global.Utils;
// thread : 여러 사용자를 동시에 진행하려 사용
// 동시에 한다
public class MainController {
    public void start(){
        while (true) {
            System.out.println("뭐할껀가요 1. cafe관리 ");
            String keyword = Utils.sc.nextLine();
            if(keyword.equals("1")) {
                CafeController cafeController = CafeController.getInstance();
                System.out.println("cafe : 1. 보기  2. 추가");
                String mode = Utils.sc.nextLine();
                if(mode.equals("1")) cafeController.printAllCoffees();
                if(mode.equals("2")) cafeController.addCoffee();
            }
            if(keyword.equals("2")){
                // 주문 OrderController 주문 -> 결제 -> 커피 -> 반환
            }
            if(keyword.equals("end")){
                System.out.println("Goodbye");
                return;
            }
        }
    }
}
