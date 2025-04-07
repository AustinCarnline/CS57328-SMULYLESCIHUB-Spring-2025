package org.example;

public class Job {
    private Long id;
    private String title;
    private String status;

    public Job() {} // default constructor

    public Job(Long id, String title, String status) {
        this.id = id;
        this.title = title;
        this.status = status;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
