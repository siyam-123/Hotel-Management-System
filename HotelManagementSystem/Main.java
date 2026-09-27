import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== HOTEL MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Guest");
            System.out.println("2. View Guests");
            System.out.println("3. Search Guest");
            System.out.println("4. Update Guest");
            System.out.println("5. Delete Guest");
            System.out.println("6. Exit");
            System.out.print("Choose Option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: AddGuest.add(); break;
                case 2: ViewGuests.view(); break;
                case 3: SearchGuest.search(); break;
                case 4: UpdateGuest.update(); break;
                case 5: DeleteGuest.delete(); break;
                case 6:
                    System.out.println("Thank You!");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
