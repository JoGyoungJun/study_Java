package service;

import cafe.Coffee;
import repository.CafeRepository;

public class CafeService {
    public void coffeeAdd(String[] strings){
        try {
            Coffee coffee = Coffee.of(strings);
            cafeRepository.save(coffee);
        }catch (NumberFormatException e){
            System.out.println("가격 입력 똑바로");
        }catch (IllegalArgumentException e){
            System.out.println("타입 똑바로");
        }
    }

    public static CafeService getInstance() {
        if(cafeService == null){
            cafeService = new CafeService();
        }
        return cafeService;
    }
    private static CafeService cafeService;
    private CafeService() {
        this.cafeRepository = CafeRepository.getInstance();
    }
    private final CafeRepository cafeRepository;
}
