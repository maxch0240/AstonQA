package taskL13;

import java.util.*;

public class PhoneBook {
    private final Map<String, List<String>> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void add(String name, String phoneNumber) {
        List<String> phoneNumbers = contacts.getOrDefault(name, new ArrayList<>());
        phoneNumbers.add(phoneNumber);
        contacts.put(name, phoneNumbers);
    }

    public List<String> get(String name) {
        return contacts.getOrDefault(name, new ArrayList<>());
    }
}
