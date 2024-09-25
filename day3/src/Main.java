import gtest.Food;
import gtest.Order;
import gtest.Product;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.*;
// array 배열 길이가 선언시 정해진다
// list 길이가 가변
//        <type> 제네릭
//        StoreAction action = new Store()
public class Main{
    public static void main(String[] args) {
        String[] strs = {"h", "e", "l", "l", "o"};

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(9);
        list.add(3);
        int target = 9;
//      안에 있는 수 2개 더해서 target 이 되어야함
//      1 =< list 안에 있는 수 =< 10
//       answer는 순서 x
        int[] answer = new int[2];
        Integer[] tmp = new Integer[11];
        for(int i=0;i<list.size();i++){
            int num = list.get(i);
            if(tmp[num] ==null) tmp[num] = i;
        }
        System.out.println(Arrays.toString(tmp));
        for(int i=1;i<tmp.length;i++){
            if(tmp[i-1] == null)continue;
            if(target-i < tmp.length && tmp[target-i] != null){
                int a = tmp[i];
                int b = tmp[target-i];
                if(a<b){
                    answer[0] = i;
                    answer[1] = target-i;
                    break;
                }
                else {
                    answer[0] = target-i;
                    answer[1] = i;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}