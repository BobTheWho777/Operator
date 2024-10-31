import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Abonent> abonents = new ArrayList<>();
        abonents.add(new Abonent(12345, "Иванов", "Иван", "Иванович", "Москва, ул. Ленина, 1", 120, "1111-2222-3333-4444", 0));
        abonents.add(new Abonent(67890, "Петров", "Петр", "Петрович", "Санкт-Петербург, ул. Пушкина, 2", 60, "5555-6666-7777-8888", 100));
        abonents.add(new Abonent(54321, "Сидоров", "Сидор", "Сидорович", "Новосибирск, ул. Чехова, 3", 150, "9999-0000-1111-2222", 50));
        abonents.add(new Abonent(11111, "Кузнецов", "Алексей", "Алексеевич", "Екатеринбург, ул. Горького, 4", 30, "3333-4444-5555-6666", 200));

        System.out.println("Сколько минимум абонент должен был наговорить?");
        int minCallTime = scanner.nextInt();


        System.out.println("Абоненты с разговорами более " + minCallTime + " минут:");
        for (Abonent abonent : abonents) {
            if (abonent.getTotalCallTime() > minCallTime) {
                System.out.println(abonent);

            }
        }
    }
}