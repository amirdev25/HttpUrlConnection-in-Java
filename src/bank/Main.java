package bank;

import bank.model.CourseModel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();

        try {

            URL url = new URL("https://cbu.uz/uz/arkhiv-kursov-valyut/json/");
            System.out.println("Yuklanmoqda...");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            int responseCode = connection.getResponseCode();
            InputStream inputStream;
            if (responseCode >= 200 && responseCode <= 299) {
                inputStream = connection.getInputStream();
            } else {
                inputStream = connection.getErrorStream();
            }

            InputStreamReader reader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(reader);

            StringBuilder builder = new StringBuilder();
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                builder.append(str);
            }

            Type type = new TypeToken<ArrayList<CourseModel>>() {
            }.getType();

            ArrayList<CourseModel> courseList = gson.fromJson(String.valueOf(builder), type);

            showCourseList(courseList);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void showCourseList(ArrayList<CourseModel> courseList) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Code ni kiriting: ");
            String code = scanner.next();
            for (CourseModel courseModel : courseList) {
                if (courseModel.getCcy().equals(code)) {
                    System.out.println("Kurs nomi: " + courseModel.getCcyNmUZ());
                    System.out.println("Kurs code: " + courseModel.getCcy());
                    System.out.println("Kurs qiymati: " + courseModel.getRate() + " so'm");
                    System.out.println("Bugungi sana: " + courseModel.getDate());

                    System.out.println("\n<============================>\n");
                }
            }
        }

    }
}