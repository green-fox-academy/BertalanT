package BlogPost;

public class BlogPostMain {
  public static void main(String[] args) {

    BlogPost blogPost1 =
        new BlogPost("John Doe", "Lorem Ipsum", "Lorem ipsum dolor sit amet.", "2000.05.04");
    BlogPost blogPost2 = new BlogPost("Tim Urban", "Wait but why",
        "A popular long-form, stick-figure-illustrated blog about almost everything.",
        "2010.10.10");
    BlogPost blogPost3 =
        new BlogPost("William Turton", "One Engineer Is Trying to Get IBM to Reckon With Trump",
            "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.",
            "2017.03.28.");

    System.out.println(
        blogPost1.getAuthorName() + " " + blogPost1.getTitle() + " " + blogPost1.getText() + " " +
            blogPost1.getPublicationDate());
    System.out.println(
        blogPost2.getAuthorName() + " " + blogPost2.getTitle() + " " + blogPost2.getText() + " " +
            blogPost2.getPublicationDate());
    System.out.println(
        blogPost3.getAuthorName() + " " + blogPost3.getTitle() + " " + blogPost3.getText() + " " +
            blogPost3.getPublicationDate());

  }
}
