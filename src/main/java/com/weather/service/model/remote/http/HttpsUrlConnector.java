package com.weather.service.model.remote.http;

import com.weather.service.log.Log;
import org.springframework.stereotype.Service;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

@Service
public class HttpsUrlConnector implements Connector{

    private final String USER_AGENT = "Mozilla/5.0";

    public String sendGet(String url) {
        Log.logger().info("Sending 'GET' request to URL : " + url);
        URL obj  = null;
        try {
            obj = new URL("https://" + url + ":443");
        SSLContext sslContext = SSLContext.getInstance("TLSv1.2");
        sslContext.init(null, null, new SecureRandom());
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
        con.setSSLSocketFactory(sslContext.getSocketFactory());
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        int responseCode = con.getResponseCode();

        Log.logger().info("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        final StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        return response.toString();
        } catch (IOException e) {
            Log.logger().debug("Remote call error:");
            Log.logger().error(e);
        } catch (NoSuchAlgorithmException ex) {
            Log.logger().error("SSL algorithm error");
            Log.logger().error(ex);
        } catch (KeyManagementException ex) {
            Log.logger().error("Key error");
            Log.logger().error(ex);
        }
        return "";
    }
}
