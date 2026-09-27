import java.sql.*;
import java.util.Scanner;

public class AddGuest {
    public static void add() {
        try {
            Connection con = DBConnection.getConnection();
            Scanner sc = new Scanner(System.in);

            System.out.print("Guest Name: ");
            String name = sc.nextLine();

            System.out.print("Phone: ");
            String phone = sc.nextLine();

            System.out.print("Room Number: ");
            int room = sc.nextInt();
            sc.nextLine();

            System.out.print("Room Type: ");
            String type = sc.nextLine();

            System.out.print("Check-in Date (YYYY-MM-DD): ");
            String checkIn = sc.nextLine();

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO guests(name, phone, room_number, room_type, check_in, bill) VALUES (?, ?, ?, ?, ?, ?)"
            );

            ps.setString(1, name);
            ps.setString(2, phone);
            ps.setInt(3, room);
            ps.setString(4, type);
            ps.setString(5, checkIn);
            ps.setDouble(6, 0);

            ps.executeUpdate();
            System.out.println("Guest Added Successfully!");
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
