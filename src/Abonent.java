public class Abonent {
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private String address;
    private int all_phone_times;
    private int creditcard_number;
    private int debt;

    public Abonent(int id, String name, String surname, String patronymic, String address, int all_phone_times, int creditcard_number, int debt) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.address = address;
        this.all_phone_times = all_phone_times;
        this.creditcard_number = creditcard_number;
        this.debt = debt;
    }

}
