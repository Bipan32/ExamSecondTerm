import model.T_shirt;
import model.order;

public class main{
    public static void main(String[] args) {
        T_shirt T_shirt = new T_shirt("Gorkhali Batman", " 572", 1235.0, "Karuna", "You either die a hero or live long enough to see yourself be a villain", new String[]{"XL", "Medium", "Large"});

        System.out.println(T_shirt.describeTShirt());
        System.out.println();

        order order1 = new order("Gopal Sharma", "0486756465", new String[]{"572", "681"}, new int[]{1235, 1780}, 3015);

        order1.describeOrder();
    }
}