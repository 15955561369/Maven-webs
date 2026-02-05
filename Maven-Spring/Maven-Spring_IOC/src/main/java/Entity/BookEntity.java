package Entity;

public class BookEntity {
    private String bookName;
    private Double bookPrice;
    public BookEntity(){
        System.out.println("book无参构造方法");
    }

    public void setBookPrice(Double bookPrice) {
        System.out.println("<property>属性注入");
        this.bookPrice = bookPrice;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

//    @Override
//    public String toString() {
//        return "BookEntity{" +
//                "bookName='" + bookName + '\'' +
//                ", bookPrice=" + bookPrice +
//                '}';
//    }
}
