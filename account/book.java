package account;

public class book {
    private int book_id;
    private String book_name;
    private double book_price;
    private int book_available;
    private int dis_id;
    private int author_id;
    private int genre_id;

    public book(int book_id, String book_name,double book_price,int book_available, int dis_id, int author_id, int genre_id){
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_price = book_price;
        this.book_available = book_available;
        this.dis_id = dis_id;
        this.author_id = author_id;
        this.genre_id = genre_id;
    }

    public int getBookId(){
        return this.book_id;
    }

    public void setBookId(int book_id){
        this.book_id = book_id;
    }


    public String getName() {
        return book_name;
    }

    public void setName(String book_name) {
        this.book_name = book_name;
    }

    public double getPrice() {
        return book_price;
    }

    public void setPrice(double book_price) {
        this.book_price = book_price;
    }

    public int getQty() {
        return book_available;
    }

    public void setQty(int book_available) {
        this.book_available = book_available;
    }

    public int getDisID(){ return dis_id;}

    public void setDisID(int dis_id){ this.dis_id = dis_id;}

    public int getAuthorID(){return author_id;}

    public void setAuthorID(int author_id) { this.author_id = author_id;}

    public int getGenreID(){return genre_id;}

    public void setGenreID(int genre_id){this.genre_id = genre_id;}

    @Override
    public String toString() {
        return "Book{" +
                ", id = " + this.book_id +
                ", name = " + this.book_name +
                ", book_price =" + this.book_price +
                ", book_available =" + this.book_available +
                ", dis_id =" + this.dis_id +
                ", author_id =" + this.author_id +
                ", genre_id =" + this.genre_id +
                '}';
    }
}
