import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        String age = scanner.nextLine();
/*        if (age == 10) {
            System.out.println("Ты учишься в школе");
        } else if (age == 18) {
            System.out.println("Ты закончил школу");
        }
 */
        switch (age) {
            case "Ноль" :
                System.out.println("Ты родился");
                break;
            case "Семь" :
                System.out.println("Ты пошел в школу");
                break;
            case "Восемнадцать" :
                System.out.println("Ты закончил школу");
                break;
            default:
                System.out.println("Ни одно из предыдущих условий не подошло");
        }
    }
}
