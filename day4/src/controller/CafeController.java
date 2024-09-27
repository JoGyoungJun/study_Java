package controller;

import cafe.Coffee;
import service.CafeService;

import java.util.List;

import static global.Data.coffees;
import static global.Utils.sc;

// joystick
public class CafeController {
    public static CafeController getInstance(){
        if(cafeController == null){
            cafeController = new CafeController();
        }
        return cafeController;
    }
    private static CafeController cafeController;

    private CafeController() {
        cafeService = CafeService.getInstance();
    }

    private final CafeService cafeService;
    public void addCoffee(){
        System.out.println("입력해주세여");
        String st = sc.nextLine();
        String[] strings = st.split(" ");
        cafeService.coffeeAdd(strings);
        System.out.println("추가 완료");
    }
    public void removeCoffee(){
        String st = sc.nextLine();
        cafeService.coffeeAdd(new String[]{"fds","fds"});
    }

    public void printAllCoffees() {
        List<Coffee> coffeeList = cafeService.getAllCoffees();
        if(coffeeList.isEmpty()){
            System.out.println("없어요");
            return;
        }
        for (Coffee coffee : coffeeList) {
            System.out.println(coffee);
        }
    }
}
