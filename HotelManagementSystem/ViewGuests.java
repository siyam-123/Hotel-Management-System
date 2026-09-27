import java.sql.*;

public class ViewGuests {
    public static void view() {
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM guests");

            System.out.println("\nID | Name | Phone | Room | Type | Check-In");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getString("phone") + " | " +
                    rs.getInt("room_number") + " | " +
                    rs.getString("room_type") + " | " +
                    rs.getDate("check_in")
                );
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
