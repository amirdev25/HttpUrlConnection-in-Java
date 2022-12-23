package json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import json.model.Person;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();

        String str = """
                [
                {
                    "name": "Ilhom",
                    "age": 16,
                    "job": "Programmer"
                },
                {
                    "name": "Elbek",
                    "age": 20,
                    "job": "Musorchi"
                },
                {
                    "name": "Shohjahon",
                    "age": 12,
                    "job": "Android developer"
                },
                {
                    "name": "Doniyor",
                    "age": 17,
                    "job": "owner of ANIS"
                }
                ]
                """.trim();

        Type type = new TypeToken<ArrayList<Person>>() {
        }.getType();


        ArrayList<Person> users = gson.fromJson(str, type);

        for (Person user : users) {
            System.out.println("Ismi: " + user.getName());
            System.out.println("Yoshi: " + user.getAge());
            System.out.println("Kasbi: " + user.getJob());
            System.out.println("\n==========================================\n");
        }

    }
}
