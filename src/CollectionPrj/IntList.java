package CollectionPrj;

// 정수형을 관리하는 컬랙션 만들어보기
// 추후 컬렉션 프레임 워크 사용 예정
public class IntList {

    // 배열의 크기, 인덱스 번호를 의미하는 변수들 선언
    // current == 현재위치
    private int[] nums;
    private int current;

    // 생성자
    public IntList(){
        nums = new int[3];
        current = 0;
    }

    // 정수형 배열에 num(값)을 하나씩 추가하고 현재위치 1증가
    public void add(int num){
        nums[current] = num;
        current++;
    }

    // 현재위치를 강제적으로 0으로 되돌려서 다음에 들어올 값을 덮어쓰게 하기 위함
    // 우선 직접 컬렉션을 구현하는 과정이니 이렇게 진행
    public void clear(){
        current = 0;
    }
    // 현재 사이즈를 반환하는 함수, 현재위치를 반환해도 된다.
    public int size() {
        return current;
    }
    // 배열에 있는 값을 가져오는 함수
    // 3의 크기 배열에 7을 매개값으로 받게되는경우 예외 처리 진행
    // 혹은 3을 매개 값으로 받아도 실제 배열은 (0,1,2) 이기 때문에 <= 를 사용
    public int get (int index) {

        if(current <= index)
            throw new IndexOutOfBoundsException();
        return nums[index];
    }
}


O


