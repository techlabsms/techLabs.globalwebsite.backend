package entities;

// Entry class represents a single entry -> a news article
public class Entry {
    String title; 
    String content;

    public Entry(String title, String content) {
        this.title = title; 
        this.content = content;
    }

    public String toHTML() {
        return "<b>" + this.title + "</b><br>" + this.content;
    }

}

