import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        }
    }
}
