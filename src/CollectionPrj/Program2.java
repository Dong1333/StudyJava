package CollectionPrj;

public class Program2 {

    //  컬렉션이 가지고있는 가장 큰 특징인 가변배열을 사용하는 코드
    public static void main(String[] args) {
        GList<Integer> list = new GList<>();
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(7);

        list.add(10);
        list.add(5);
        list.add(6);
        list.add(7);

        list.add(3);
        list.add(5);
        list.add(6);
        list.add(7);


        for(int i = 0; i < list.size(); i++){
            System.out.printf("%d, ",list.get(i));
        }

    }
}
