package taskL13;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Array of words: \n");
        Words.showUniquesAndDuplicates();

        System.out.println("\n\n\nPhonebook: \n");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Barr", "+123123123");
        phoneBook.add("Smith", "+999999999");
        phoneBook.add("Smith", "+33333333333");
        phoneBook.add("Lum", "+123456789");
        phoneBook.add("Johnson", "+447654747");
        phoneBook.add("Johnson", "+4444444123123");
        phoneBook.add("Johnson", "+7777777777");
        phoneBook.add("Brown", "+9998888999");
        phoneBook.add("Novak", "+7878123123");

        List<String> numbers = phoneBook.get("Smith");
        System.out.println("Phone numbers for Smith:");
        for(String e: numbers){
            System.out.println(e);
        }

        numbers = phoneBook.get("Lum");
        System.out.println("Phone numbers for Lum:");
        for(String e: numbers){
            System.out.println(e);
        }

        numbers = phoneBook.get("Johnson");
        System.out.println("Phone numbers for Johnson:");
        for(String e: numbers){
            System.out.println(e);
        }

        numbers = phoneBook.get("Novak");
        System.out.println("Phone numbers for Novak:");
        for(String e: numbers){
            System.out.println(e);
        }
    }
}
