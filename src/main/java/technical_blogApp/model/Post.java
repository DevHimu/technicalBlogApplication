package technical_blogApp.model;

import java.util.Date;

/***
 *
 *@Project technicalblog
 *@author Himandri on 1/4/2021
 *
 */
public class Post {
    private String title;
    private String body;
    private Date date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
