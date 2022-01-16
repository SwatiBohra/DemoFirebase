package com.example.demofirebase;

public class dataholder {

    String Name,Course,Duration;

    public dataholder(String Name, String Course, String Duration) {
        this.Name = Name;
        this.Course = Course;
        this.Duration = Duration;
    }

    public String getName() {
        return Name;
    }

    public String getCourse() {
        return Course;
    }

    public String getDuration() {
        return Duration;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setCourse(String Course) {
        this.Course = Course;
    }

    public void setDuration(String Duration) {
        this.Duration = Duration;
    }
}
