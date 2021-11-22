package com.example.newsappdevefy.topheadlines;

public class TopHeadlinesModel {
    String title, desp, source;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesp() {
        return desp;
    }

    public void setDesp(String desp) {
        this.desp = desp;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public TopHeadlinesModel(String title, String desp, String source) {
        this.title = title;
        this.desp = desp;
        this.source = source;
    }
}
