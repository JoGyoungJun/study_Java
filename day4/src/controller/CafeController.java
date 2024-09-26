package controller;

import service.CafeService;
import static global.Utils.sc;

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
        String st = sc.nextLine();
        String[] strings = st.split(" ");
        cafeService.coffeeAdd(strings);
    }
    public void removeCoffee(){
        String st = sc.nextLine();
        cafeService.coffeeAdd(new String[]{"fds","fds"});
    }

}
