import java.sql.*;
import java.util.Scanner;

public class UpdateGuest {
    public static void update() {
        try {
            Connection con = DBConnection.getConnection();
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Room Number: ");
            int room = sc.nextInt();
            sc.nextLine();

            System.out.print("New Phone Number: ");
            String phone = sc.nextLine();

            PreparedStatement ps =
                con.prepareStatement("UPDATE guests SET phone = ? WHERE room_number = ?");
            ps.setString(1, phone);
            ps.setInt(2, room);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Record Updated.");
            else
                System.out.println("No Record Found.");

            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
