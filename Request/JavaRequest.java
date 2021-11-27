package javaRequestExample;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class JavaRequest {

    public static void main(String[] args) {
        String userName;
        URL url;

        String jsonString;

        // username input
        System.out.println("Enter github user name: ");
        Scanner sc = new Scanner(System.in);
        userName = sc.next();

        // making the http request
        try {
            url = new URL("https://api.github.com/users/"+userName);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");


            System.out.println("Request response "+con.getResponseMessage() + " "+ con.getResponseCode());

            InputStream response = con.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(response));



            StringBuilder responseString = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                responseString.append(line);
                responseString.append('\r');
            }
            rd.close();

            // getting the json string
            jsonString = responseString.toString();

            // serializing json string to java object
            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson gson = gsonBuilder.create();

            assert jsonString.isEmpty() : "NULL response u noob";
            UserModel userModel = gson.fromJson(jsonString,UserModel.class);

            userModel.printUser();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
