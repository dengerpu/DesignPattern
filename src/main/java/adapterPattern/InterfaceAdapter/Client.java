package adapterPattern.InterfaceAdapter;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-24 16:04
 */
public class Client {
    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter(){
            @Override
            public void m1() {
                System.out.println("使用了m1的方法");
            }
        };
        absAdapter.m1();
    }

}
