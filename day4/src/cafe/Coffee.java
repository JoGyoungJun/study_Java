package cafe;

public class Coffee {
    private String name;
    private int price;
    private SeasonType season; // 봄 여름 가을 겨울 올
    private CategoryType category; // 커피 티 에이드
    private String status; // 저장중 -> 1초 -> 저장 완료
    public Coffee(String name, int price, SeasonType season, CategoryType category) {
        this.name = name;
        this.price = price;
        this.season = season;
        this.category = category;
        this.status = "저장중";
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //  팩토리 메서드
//   IllegalArgumentException :  No enum constant cafe.CategoryType.커피1  타입 입력 똑바로 하세요
//    NumberFormatException: For input string: "3000d" 가격 입력 똑바로 하세요
    public static Coffee of(String[] strings){
        String name = strings[0];
        int price = Integer.parseInt(strings[1]);
        SeasonType season = SeasonType.valueOf(strings[2]);
        CategoryType category = CategoryType.valueOf(strings[3]);
        return new Coffee(name, price, season, category);
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", season=" + season +
                ", category=" + category +
                ", status='" + status + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public SeasonType getSeason() {
        return season;
    }

    public CategoryType getCategory() {
        return category;
    }
}
