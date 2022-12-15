package CollectionPrj;

public class Program {

    //  기존 IntList의 단점을 보완한 ObjectList를 사용해 보았다.
    //  하지만 아직도 코드 수정의 번거움과, 어떠한 타입이 담겨있다는 정보 알기가 편리하진 않다..
    //  이를 해결하고자 제네릭이란 것을 사용해야 한다
    public static void main(String[] args) {
        // IntList,ObjectList  사용할 메인 코드
        // list 객체 생성, list의 사이즈, list의 현재 값을 담을 변수 선언
        ObjectList list = new ObjectList();
        int size = 0;
        int num = 0;
        // list에 3, 5 추가 후 size값을 받고 출력
        list.add(3);
        list.add(5);
        size = list.size();
        System.out.printf("size : %d \n", size);

        // 클리어
        list.clear();

        // 클리어 후 배열 사이즈 출력
        size = list.size();
        System.out.printf("size : %d \n", size);

        // 7의 값 추가 후 배열의 0번째 값 받고 출력
        list.add(7);
        num = (Integer) list.get(0);
        System.out.printf("num :  %d \n", num);

        // 현재 배열 1(2번째 위치)에 값이 없으므로 오류 출력
        // num = (Integer) list.get(1);

    }
}
