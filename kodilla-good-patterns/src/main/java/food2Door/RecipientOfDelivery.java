package food2Door;

public class RecipientOfDelivery {

    private String name;
    private String surname;
    private String address;

    public RecipientOfDelivery(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "RecipientOfDelivery{" + "name='" + name + '\'' + ", surname='" + surname + '\'' + ", address='" + address + '\'' + '}';
    }
}
