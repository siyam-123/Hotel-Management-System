import java.sql.*;
import java.util.Scanner;

public class DeleteGuest {
    public static void delete() {
        try {
            Connection con = DBConnection.getConnection();
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Room Number to Delete: ");
            int room = sc.nextInt();

            PreparedStatement ps =
                con.prepareStatement("DELETE FROM guests WHERE room_number = ?");
            ps.setInt(1, room);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Record Deleted.");
            else
                System.out.println("No Record Found.");

            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
