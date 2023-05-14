package com.example.observer.service;

import java.util.Observable;

public class NewsAgency extends Observable {
    private String news;

    public void setNews(String news) {
        this.news = news;
        /**
         * Marks this {@code Observable} object as having been changed; the
         * {@code hasChanged} method will now return {@code true}.
         */
        setChanged();

        // If this object has changed, as indicated by the hasChanged method, then notify all of its observers and then call the clearChanged method to indicate that this object has no longer changed.
        // Each observer has its update method called with two arguments: this observable object and the arg argument.
        // Params:
        // arg – any object.
        // See Also:
        // clearChanged(), hasChanged(), Observer.update(Observable, Object)
        notifyObservers(news);
    }
}
