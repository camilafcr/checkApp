package com.checkapp.api;

import com.checkapp.domain.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/check")
public class UrlController {

  @Autowired
  private UrlService urlService;

  @GetMapping
  public String checkWebSite(@RequestParam("url") String url) {

    return urlService.checkWebSite(url);
  }
}
