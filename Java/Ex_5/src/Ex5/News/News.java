package Ex5.News;

import java.util.Scanner;

public class News implements INews {
    private int ID;
    private String Title;
    private String PublishDate;
    private String Author;
    private String Content;
    private float AverageRate;

    public News() {
        this.ID = 0;
        Title = "title";
        PublishDate = "publishDate";
        Author = "author";
        Content = "content";
        AverageRate = 0.0f;
    }

    public News(int ID, String title, String publishDate, String author, String content) {
        this.ID = ID;
        Title = title;
        PublishDate = publishDate;
        Author = author;
        Content = content;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    @Override
    public void Display() {
        System.out.println("Title: " + this.Title + "\nPublishDate: " + this.PublishDate + "\nAuthor: " + this.Author);
    }

    @Override
    public float Calculate() {
        Scanner scanner = new Scanner(System.in);
        int[] Rates = new int[3];
        for(int rate : Rates)
        {
            System.out.println("Nhập điểm đánh giá: ");
            rate = scanner.nextInt();
        }

        this.AverageRate = (Rates[0] + Rates[1] + Rates[2]) / 3;
        scanner.close();
        return this.AverageRate;

    }

    public void Insert()
    {
        System.out.println("Nhập lần lượt Title, PublishDate, Author, Content: ");
        Scanner scanner = new Scanner(System.in);
        this.Title = scanner.nextLine();
        this.PublishDate = scanner.nextLine();
        this.Author = scanner.nextLine();
        this.Content = scanner.nextLine();
        scanner.close();


    }
}
