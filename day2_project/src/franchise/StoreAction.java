package franchise;

public interface StoreAction {
    /*
    가게 이름 : 매머드
     열리는 시간 : 9
      닫는 시간 19
       메뉴는 아메리카노, 라떼
        평균 가격은 1500
        메뉴는 총 2개
        메뉴의 총 가격은 3000원 입니다.
     */
    void print();
    // 메뉴 추가 하면 totalprice 계산 알아서, 평균도 알아서 , 메뉴 수 도 알아서
    boolean addMenu(Food food);
    // 메뉴 삭제 하면 totalprice 계산 알아서, 평균도 알아서 , 메뉴 수 도 알아서
    boolean removeMenu(String name);
//   메뉴들 {아메리카노, 1000, {샷,얼음,물} }, {라떼, 2000, {샷,얼음,우유} }
    String getMenuArr();
}
