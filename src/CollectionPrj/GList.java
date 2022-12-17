package CollectionPrj;

// 넘어온 Wrapper 클래스만 관리하는 리스트 클래스
public class GList<T> {

    // 배열의 크기, 인덱스 번호를 의미하는 변수들 선언
    // current == 현재위치
    private Object[] nums;
    private int current; // 0 > 현재위치
    private int capacity; // 용량
    private int amount; // 추가 증가량

    // 생성자
    public GList(){
        current = 0;
        capacity = 3;
        amount = 5;
        nums = new Object[capacity];
    }

    public void add(T num){
        // capacity가 3, curent가 3이면(0, 1, 2 중 2)
        // 즉 존재하지 않는 3을 가르키면 (3이랑 같아지면 or 3보다 크면)

        // 공간이 부족할 때 마다 실행되는 부분
        if (capacity <= current ){
            Object[] temp = new Object[capacity+amount];
            for(int i = 0; i < current; i++)
                temp[i] = nums[i];
            nums = temp;
            capacity += amount;
        }
        nums[current] = num ;
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
    public T get (int index) {
        if(current <= index)
            throw new IndexOutOfBoundsException();
        return (T)nums[index];
    }
}



