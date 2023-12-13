
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("size: ");
        int size = input.nextInt();
        Harsh x = new Harsh(size);
        System.out.println("-------------------------------------------------------------------------");
        while (true) {
            System.out.println("0 - exit");
            System.out.println("1 - add");
            System.out.println("2 - remove");
            System.out.println("3 - search");
            System.out.println("4 - print");
            System.out.print("Choose: ");
            int choose = input.nextInt();
            switch (choose) {
                case 0:
                    return;
                case 1:
                    System.out.print("id: ");
                    int id = input.nextInt();
                    System.out.print("name: ");
                    String name = input.next();
                    System.out.print("average: ");
                    int average = input.nextInt();
                    x.add(id, name, average);
                    break;
                case 2:
                    System.out.print("Enter the id that you want to delete: ");
                    int removeId = input.nextInt();
                    x.remove(removeId);
                    break;
                case 3:
                    System.out.print("Enter the id that you want to search: ");
                    int searchId = input.nextInt();
                    x.search(searchId);
                    System.out.println("");
                    break;
                case 4:
                    x.print();
                    break;
            }
            System.out.println("-------------------------------------------------------------------------");
        }
    }
}
