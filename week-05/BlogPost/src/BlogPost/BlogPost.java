package BlogPost;

public class BlogPost {
  private String authorName;
  private String title;
  private String text;
  private String publicationDate;

  public BlogPost(String authorName, String title, String text, String publicationDate) {
    this.authorName = authorName;
    this.title = title;
    this.text = text;
    this.publicationDate = publicationDate;
  }

  public String getAuthorName() {
    return authorName;
  }

  public String getTitle() {
    return title;
  }

  public String getText() {
    return text;
  }

  public String getPublicationDate() {
    return publicationDate;
  }
}


//Készíts egy BlogPost osztályt, amely rendelkezik a következő tulajdonságokkal:
//authorName (szerző neve)
//title (cím)
//text (szöveg)
//publicationDate (kiadási dátum)