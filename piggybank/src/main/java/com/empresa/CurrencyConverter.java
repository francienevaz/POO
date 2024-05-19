package com.empresa;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import org.json.JSONException;
import org.json.JSONObject;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Response response = null;

        // Get user input for currencies and amount
        System.out.println("Type currency to convert from: ");
        String convertFrom = scanner.nextLine().toUpperCase();
        System.out.println("Type currency to convert to: ");
        String convertTo = scanner.nextLine().toUpperCase();
        System.out.println("Type amount to convert: ");
        BigDecimal amount = scanner.nextBigDecimal();

        // Build the API request URL
        String urlString = "https://api.exchangerate.host/latest?base=" + convertFrom;

        try (Scanner sc = new Scanner(System.in)) {
            // Create OkHttpClient and build request
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .url(urlString)
                    .get()
                    .build();

            // Execute the request and get response
            response = client.newCall(request).execute();

            // Check for successful response
            if (!response.isSuccessful()) {
                throw new IOException("Failed to get exchange rate: " + response);
            }

            // Process the response if successful
            String responseBody = response.body().string();
            JSONObject jsonObject = new JSONObject(responseBody);
            JSONObject ratesObject = jsonObject.getJSONObject("rates");
            BigDecimal rate = ratesObject.getBigDecimal(convertTo);

            BigDecimal convertedAmount = rate.multiply(amount);
            System.out.println("Converted amount: " + convertedAmount);

        } catch (IOException | JSONException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            if (response != null) { // Check if response exists before closing
                response.body().close();
            }
        }

        scanner.close(); // Close the scanner
    }
}

