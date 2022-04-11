package br.edu.fatecfranca.ex4;

public class Comment {
    private int code;
    private String text, author;

    public Comment() {
    }

    public Comment(int code, String text, String author) {
        this.code = code;
        this.text = text;
        this.author = author;
    }

    public int getcode() {
        return code;
    }

    public void setcode(int code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "\n Comment{" + "code=" + code + ", text=" + text + ", author=" + author + '}';
    }
    
    
}
