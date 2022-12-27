package JK.Lesson6;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
public class Main {
    public static void main(String[] args) throws IOException {

        //http://dataservice.accuweather.com/forecasts/v1/daily/5day/295212
        String PROTOKOL = "http";
        String BASE_HOST = "dataservice.accuweather.com";
        String FORECASTS = "forecasts";
        String VERSION = "v1";
        String DAILY = "daily";
        String ONE_DAY = "5day";
        String API_KEY = "aOG2Lri1OTwvApowHGCKWx1uxYG2G2h5";
        String API_KEY_QUERY_PARAM = "apikey";
        String LOCATIONS = "locations";
        String CITIES = "cities";
        String AUTOCOMPLETE = "autocomplete";




        URL url1 = new URL("http://dataservice.accuweather.com/forecasts/v1/daily/5day/295212");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url1.openConnection();

        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        String requetsBody = "{\n" +
                "    \"username\" : \"cavavad996@pro5g.com\",\n" +
                "    \"password\" : \"Valve97\",\n" +
                "}";

        try (BufferedWriter bufferedWriter = new BufferedWriter(
                new OutputStreamWriter(httpURLConnection.getOutputStream()))) {
            bufferedWriter.write(requetsBody);
        }

        try (BufferedReader bufferedReader1 = new BufferedReader(
                new InputStreamReader(httpURLConnection.getInputStream()))) {
            String temp;
            while ((temp = bufferedReader1.readLine()) != null) {
                System.out.println(temp);
            }
        }
    }
}
