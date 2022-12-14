package CollectionPrj;

public class Program {
    public static void main(String[] args) {
        // IntList 사용할 메인 코드
        // list 객체 생성, size, 현재 값 을 담을 변수 선언
        IntList list = new IntList();
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
        num = list.get(0);
        System.out.printf("num :  %d \n", num);

        // 현재 배열 1(2번째 위치)에 값이 없으므로 오류 출력
        num = list.get(1);

    }
}
