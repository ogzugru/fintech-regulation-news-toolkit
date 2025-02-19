package org.example.domain;

import java.time.LocalDate;

public class Regulation {
    private String id;
    private String title;
    private String content;
    private LocalDate publicationDate;

    // Eklenen analiz sonucu veya özet gibi alanlar
    private String analysisResult;

    public Regulation() {
    }

    public Regulation(String id, String title, String content, LocalDate publicationDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.publicationDate = publicationDate;
    }

    // Getters & Setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public LocalDate getPublicationDate() {
        return publicationDate;
    }
    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }
    public String getAnalysisResult() {
        return analysisResult;
    }
    public void setAnalysisResult(String analysisResult) {
        this.analysisResult = analysisResult;
    }
}
