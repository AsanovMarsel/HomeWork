public class EBook extends Book {
    private int  fileSize;

    @Override
    public String toString() {
        return "EBook{" +
                "fileSize=" + fileSize +
                '}';
    }

    public void download(){


    }

    public EBook(int fileSize,String title, String author, int pages) {
        super(title, author, pages);
        this.fileSize = fileSize;
    }
}
