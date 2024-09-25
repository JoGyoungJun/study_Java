package franchise;


public class Store implements StoreAction{
    private String name;
    private int openTime;
    private int closeTime;
    private Food[] menus;
    private double averagePrice;
    private int menuCount;
    private long totalPrice;
    /*
    가게 이름 : 매머드
     열리는 시간 : 9
      닫는 시간 19
       메뉴는 아메리카노, 라떼
        평균 가격은 1500
        메뉴는 총 2개
        메뉴의 총 가격은 3000원 입니다.
     */

    public Store(String name, int openTime, int closeTime, Food[] menus) {
        this.name = name;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.menus = menus;
        this.averagePrice = getAveragePrice();
        this.menuCount = getMenuCount();
        this.totalPrice = getTotalPrice();
    }

    @Override
    public void print() {
        String memustr = "";
        for (int i = 0; i < menus.length; i++) {
            if(menus[i] != null) {
                memustr += menus[i].menu + " ";
            }
        }

        System.out.println(
                "가계 이름 : " + name + "\n" +
                "열리는 시간 :" + openTime + "\n" +
                "닫는 시간 :" + closeTime + "\n" +
                "메뉴는 " + memustr + "\n" +
                "평균 가격은 " + getAveragePrice() + "\n" +
                "메뉴는 총 " + getMenuCount() + "개 \n" +
                "메뉴의 총 가격은 " + getTotalPrice()
                );
    }

    @Override
    public boolean addMenu(Food food) {
        for(int i = 0; i < menus.length; i++) {
            if(menus[i] == null) {
                menus[i] = food;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removeMenu(String name) {
        for(int i = 0; i < menus.length; i++) {
            if (menus[i].menu.equals(name)) {
                menus[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public String getMenuArr() {
        String menuArr = "";
        for(int i = 0; i < menus.length; i++) {
            if(menus[i] != null) {
                menuArr += menus[i].menu;
            }
        }
        return menuArr;
    }

    public int getMenuCount() {
        int menuCount = 0;
        for(int i = 0; i < menus.length; i++) {
            if(menus[i] != null) {
                menuCount++;
            }
        }
        return menuCount;
    }

    public double getAveragePrice() {
        double averagePrice = 0;
        for(int i = 0; i < menus.length; i++) {
            if(menus[i] != null) {
                averagePrice += menus[i].price;
            }
        }
        return averagePrice/getMenuCount();
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for(int i = 0; i < menus.length; i++) {
            if(menus[i] != null) {
                totalPrice += menus[i].price;
            }
        }
        return totalPrice;
    }
}
