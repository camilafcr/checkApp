package com.checkapp.domain;

import java.net.HttpURLConnection;
import java.net.URL;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class UrlService {

  public String checkWebSite(String urlParam) {
    try {
      URL url = new URL(urlParam);
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.setRequestMethod("GET");
      HttpStatus httpStatus = HttpStatus.valueOf(conn.getResponseCode());

      if (httpStatus.is2xxSuccessful() || httpStatus.is3xxRedirection()) {
        return "Website is up.";
      } else {
        return "Website is down.";
      }

    } catch (Exception e) {
      return "URL is incorrect.";
    }
  }
}
