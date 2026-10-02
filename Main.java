import javax.swing.JFrame;
import javax.swing.JLabel;

import java.util.Scanner;
import java.sql.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String db = "LIMT";
        String url = "jdbc:mysql://localhost:3306/" + db;
        String user = "root";
        String password = "";

        try {

            System.out.print("Enter username: ");
            String username = scan.nextLine();

            System.out.print("Enter password: ");
            String pass = scan.nextLine();

            String query = "INSERT INTO LOGIN (name, password) VALUES (?, ?)";

            Connection connection = DriverManager.getConnection(url, user, password);

            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, username);
            statement.setString(2, pass);

            statement.executeUpdate();

            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        scan.close();
    }

    // JFrame frame = new JFrame();
    // JLabel label = new JLabel();
    // label.setText("HELLO");
    // frame.setSize(500, 500);
    // frame.setVisible(true);
    // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // frame.add(label); gonna work on the main shit

}