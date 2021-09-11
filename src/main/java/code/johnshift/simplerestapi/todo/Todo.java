package code.johnshift.simplerestapi.todo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Todo {
    private long id;
    private String username;
    private String description;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date targetDate;
    private boolean isDone;

    // needed for PUT request
    // default constructor
    protected Todo() {
    }

    public Todo(long id, String username, String description, Date targetDate, boolean isDone) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.isDone = isDone;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTargetDate() {
        return this.targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isIsDone() {
        return this.isDone;
    }

    public boolean getIsDone() {
        return this.isDone;
    }

    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        Todo other = (Todo) obj;
        if (id != other.id) {
            return false;
        }

        return true;
    }

}
