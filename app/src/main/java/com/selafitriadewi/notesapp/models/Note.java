package com.selafitriadewi.notesapp.models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.String;

public class Note {
    String title;
    Date date;
    String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Note(String title, Date date, String content) {
        this.title = title;
        this.date = date;
        this.content = content;
    }

    public String getFormattedDate() {
        DateFormat formatter = new SimpleDateFormat("dd MMM yyyy");
        return formatter.format(date);
    }
}
