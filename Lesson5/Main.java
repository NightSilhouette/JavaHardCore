package JK.Lesson5;

import java.io.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<AppData> appDataArrayList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("appData.txt"))) {
            String tempString;
            while ((tempString = bufferedReader.readLine()) != null) {
                String[] appDataParamsArray = tempString.split(";");
                appDataArrayList.add(new AppData(appDataParamsArray[0], Integer.parseInt(appDataParamsArray[1])));
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(appDataArrayList);

        try (PrintWriter printWriter = new PrintWriter("new_AppData.csv")) {
            for (AppData appData : appDataArrayList) {
                printWriter.println(appData.toString());
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}


