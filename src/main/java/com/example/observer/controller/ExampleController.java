package com.example.observer.controller;

import com.example.observer.service.NewsAgency;
import com.example.observer.service.NewsChannel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/test")
    public void test() {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addObserver(observer);
//        after setNews, the observer will be actived by notifyObservers(news);
        observable.setNews("news");
    }
}
