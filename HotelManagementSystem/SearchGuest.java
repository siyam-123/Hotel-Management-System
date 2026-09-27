import java.sql.*;
import java.util.Scanner;

public class SearchGuest {
    public static void search() {
        try {
            Connection con = DBConnection.getConnection();
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Room Number: ");
            int room = sc.nextInt();

            PreparedStatement ps =
                con.prepareStatement("SELECT * FROM guests WHERE room_number = ?");
            ps.setInt(1, room);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Guest: " + rs.getString("name"));
                System.out.println("Phone: " + rs.getString("phone"));
                System.out.println("Room Type: " + rs.getString("room_type"));
                System.out.println("Check-In: " + rs.getDate("check_in"));
            } else {
                System.out.println("No guest found.");
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
