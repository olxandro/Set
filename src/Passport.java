import java.util.*;

public class Passport {
    private Integer numberPassport;
    private String surName;
    private String name;
    private String patronymic;
    private Date birthDay;

    public Passport(Integer numberPassport, String surName, String name, String patronymic, Date birthDay) {
        this.numberPassport = numberPassport;
        if (surName != null) {
            this.surName = surName;
        }
        if (name != null) {
            this.name = name;
        }
            this.patronymic = patronymic;
        if (birthDay != null) {
            this.birthDay = birthDay;
        }
    }

    public Integer getNumberPassport() {
        return numberPassport;
    }

    public void setNumberPassport(Integer numberPassport) {
        this.numberPassport = numberPassport;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

        Passport vova = new Passport(234958, "Петров", "Петр", "Петрович", new Date(2013/3/23));
        Passport zina = new Passport(234098, "Васькова", "Зинаида", "Ивановна", new Date(1983/4/12));
        Passport katya = new Passport(987347, "Катеева", "Екатерина", null, new Date(1974/7/19));
        Passport vasya = new Passport(456176, "Васильев", "Василий", "Васильевич", new Date(1963/12/28));
        Passport anna = new Passport(162903, "Катурова", "Анна", "Пупкиновна", new Date(1995/11/2));
        Passport olya = new Passport(176230, "Ильина", "Ольга", "Торопыговна", new Date(2000/6/15));
        Map<Integer, Passport> passports = new HashMap<>();
        passports.put(vova.numberPassport, vova);
        passports.put(zina.numberPassport, zina);
        passports.put(katya.numberPassport, katya);
        passports.put(vasya.numberPassport, vasya);
        passports.put(anna.numberPassport, anna);
        passports.put(olya.numberPassport, olya);
        passports.put(olya.numberPassport, olya);
        System.out.println(passports);

    }

    public void searchPassport(Double numberPassport) {
    }
}
