package model;
import java.time.LocalDateTime;

public class Issue {
    private int issue_id;
    private int book_id;
    private int member_id;
    private LocalDateTime issue_date;
    private LocalDateTime return_date;
    private String status;

    public Issue() {
    }

    public int getIssue_id() {
        return issue_id;
    }

    public void setIssue_id(int issue_id) {
        this.issue_id = issue_id;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getMember_id() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public LocalDateTime getIssue_date() {
        return issue_date;
    }

    public void setIssue_date(LocalDateTime issue_date) {
        this.issue_date = issue_date;
    }

    public LocalDateTime getReturn_date() {
        return return_date;
    }

    public void setReturn_date(LocalDateTime return_date) {
        this.return_date = return_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Issue{" +
                "issue_id=" + issue_id +
                ", book_id=" + book_id +
                ", member_id=" + member_id +
                ", issue_date=" + issue_date +
                ", return_date=" + return_date +
                ", status='" + status + '\'' +
                '}';
    }
}

