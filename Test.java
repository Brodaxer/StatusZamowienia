import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        OrderList test = new OrderList();
        System.out.println("Podaj status do wyszukania (Nowe,Oplacone,Wyslane,Dostarczone,Anulowane)");
        Scanner sc = new Scanner(System.in);
        String sratus = sc.nextLine();


        test.add(new Order("Zegarek", 45666, Status.NEW));
        test.add(new Order("Komp", 93399, Status.NEW));
        test.add(new Order("Hulajnoga", 9000, Status.PAID));
        test.add(new Order("Telefon", 12400, Status.NEW));
        test.add(new Order("Kupa", 1, Status.SHIPPED));


        test.find(sratus);
        System.out.println(test.info());


    }
}
