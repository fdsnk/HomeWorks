package pro.sky.course2.lesson9.telephone.directory;

import java.util.HashMap;
import java.util.Objects;

public class TelephoneDirectory {

    HashMap<String, String> telephoneDirectory;

    public TelephoneDirectory() {
        this.telephoneDirectory = new HashMap<>();
    }
    public void addTelephoneOfPerson(String name, String number){
            Objects.requireNonNull(telephoneDirectory).put(name,number);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TelephoneDirectory that = (TelephoneDirectory) o;
        return Objects.equals(telephoneDirectory, that.telephoneDirectory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(telephoneDirectory);
    }

    @Override
    public String toString() {
        return "Телефонный справочник: " + telephoneDirectory;
    }
}
