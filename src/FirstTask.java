import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstTask {
    HashMap<String, String> hashMap = new HashMap<>();

    public HashMap<String, String> fillMap() {
        hashMap.put("123456", "Иванов");
        hashMap.put("321456", "Васильев");
        hashMap.put("234561", "Петрова");
        hashMap.put("234432", "Иванов");
        hashMap.put("654321", "Петрова");
        hashMap.put("345678", "Иванов");
        return hashMap;
    }

    public void getPassportsByFirstName(String name) {
        for (Map.Entry<String, String> stringStringEntry : fillMap().entrySet()) {
            if (stringStringEntry.getValue().equals(name)) {
                System.out.println(stringStringEntry.getKey());
            }
        }
    }
}

/*
Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов.

 */
