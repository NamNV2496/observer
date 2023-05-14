package com.example.observer.service;
import org.springframework.stereotype.Service;

import java.util.Observable;
import java.util.Observer;

@Service
public class NewsChannel implements Observer {
    private String news;

    private void setNews(String news) {
        this.news = news;
    }

    @Override
    public void update(Observable o, Object arg) {
        this.setNews((String) arg);
        System.out.println("NewsChannel.update is called");
        System.out.println("count observer: " + o.countObservers() + " and observer is notified: " + news);
    }
}