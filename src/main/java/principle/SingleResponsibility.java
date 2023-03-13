package principle;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-13 22:31
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {

    }

    class Vehicle {
        public void run(String vehicle) {
            System.out.println(vehicle + "在公路上运行");
        }
    }
}
