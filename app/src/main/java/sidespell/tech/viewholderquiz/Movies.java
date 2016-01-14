package sidespell.tech.viewholderquiz;

/**
 * Created by User on 1/14/2016.
 */
public class Movies {


    public String title;
    public String description;
    public String genre;
    public String img;

    public Movies(String title, String description, String genre, String img) {
        this.title = title;
        this.description = description;
        this.genre = genre;
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getGenre() {
        return genre;
    }

    public String getImg() {
        return img;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setImg(String img) {
        this.img = img;
    }

}
