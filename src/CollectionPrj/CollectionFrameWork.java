package CollectionPrj;

import java.util.*;

// 자바의 3대 컬렉션 예제
public class CollectionFrameWork {
    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();

        // 값 저장
        list.add(1); // 0번째 인덱스에 3이라는 값 저장
        list.add(3); // 1번째 인덱스에 3이라는 값 저장
        list.add(6); // 2번째 인덱스에 6이라는 값 저장

        // 값 꺼내기
        // 인덱스(0, 1, 2) 자동생성 식별자
        System.out.println(""+list.get(1)); // 2(1)번째 인덱스 값인 '3'출력
        System.out.println(""+list.get(2)); // error > 4(3)번째 인덱스 값은 없음


        Set<Integer> set = new HashSet<>();

        // 값 저장
        set.add(1); // '1'이라는 식별자롤 '1'이라는 값 저장
        set.add(2); // '2'이라는 식별자롤 '2'이라는 값 저장
        set.add(2); // error > 식별자('2') 중복

        // 값 꺼내기
        // Set은 iterator, foreach 등을 사용
        Iterator <Integer>iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println((iterator.next())); // '1'과 '2'출력
        }

        Map<String, Object> map = new HashMap<>();

        // 값 저장
        map.put("손흥민", "공격수");
        map.put("반지름", 3.14);
        map.put("헤리케인", "토트넘 선수"); // 값의 중복은 허용
        map.put("손흥민", "토트넘 선수"); // (식별자 중복 불가) value "공격수"에서 "토트넘 선수"로 변환

        // 값 꺼내기
        System.out.printf((String) map.get("손흥민")); // '토트넘 선수' 출력
    }
}
