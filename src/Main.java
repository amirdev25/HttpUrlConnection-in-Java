import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.BankCourseModelDTO;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        try {
            URL url = new URL("https://nbu.uz/en/exchange-rates/json/");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            int responseCode = httpURLConnection.getResponseCode();
            System.out.println(responseCode);
            InputStream inputStream;
            if (responseCode >= 200 & responseCode <= 299) {
                inputStream = httpURLConnection.getInputStream();
            } else {
                inputStream = httpURLConnection.getErrorStream();
            }
            InputStreamReader reader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(reader);
            StringBuilder stringBuilder = new StringBuilder();

            String str;
            while ((str = bufferedReader.readLine()) != null) {
                stringBuilder.append(str);
            }
            Type type = new TypeToken<ArrayList<BankCourseModelDTO>>() {
            }.getType();
            ArrayList<BankCourseModelDTO> users = gson.fromJson(String.valueOf(stringBuilder), type);
            user(users);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void user(ArrayList<BankCourseModelDTO> currency) {
        for (BankCourseModelDTO exchangerate : currency) {
            System.out.println("Valyuta: " + exchangerate.getTitle());
            System.out.println("Markaziy bank kursi: " + exchangerate.getCbPrice());
            System.out.println("Sanasi: " + exchangerate.getDate());
            System.out.println("--+--+--+--+--+--+--+--+--+--+--+");
        }

        System.out.println("1: USD->UZS, 2: UZS->USD");
    }
}
