package PostIt;

public class PostIt {
  private String backgroundColor;
  private String text;
  private String textColor;

  public PostIt (String backgroundColor, String text, String textColor) {
      this.backgroundColor = backgroundColor;
      this.text = text;
      this.textColor = textColor;
}

  public String getBackgroundColor() {
    return backgroundColor;
  }

  public String getText() {
    return text;
  }

  public String getTextColor() {
    return textColor;
  }

//Post-it (Cetli)
//Készíts egy PostIt osztályt, amelynek van
//backgroundColor (háttérszíne), amelyet egy string reprezentál
//text (szövege), amit ráírtak
//textColor (szöveg színe), amit szintén egy string reprezentál
//Készíts néhány minta post-it példányt:
//egy narancssárgát kék szöveggel: "Ötlet 1"
//egy rózsaszínt fekete szöveggel: "Csodálatos"
//egy citromsárgát zöld szöveggel: "Fenséges!"
}
