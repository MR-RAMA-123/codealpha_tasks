import java.util.*;

public class MiniHotel {
    public static void main(String[] args) {
        boolean[] rooms = new boolean[5]; // 5 rooms
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. View  2. Book  3. Exit");
            int c = sc.nextInt();
            if (c == 1) {
                for (int i = 0; i < rooms.length; i++)
                    System.out.println("Room " + (i + 1) + ": " + (rooms[i] ? "Booked" : "Available"));
            } else if (c == 2) {
                for (int i = 0; i < rooms.length; i++) {
                    if (!rooms[i]) {
                        rooms[i] = true;
                        System.out.println("Room " + (i + 1) + " booked!");
                        break;
                    }
                    if (i == rooms.length - 1)
                        System.out.println("No rooms available.");
                }
            } else if (c == 3) break;
        }
    }
}