package Exercise;

public class Book {
    private String titel;
    private int year;
    private int ISBNNumber;

    public Book(String titel, int year, int ISBNNumber){
        this.titel = titel;
        this.year = year;
        this.ISBNNumber = ISBNNumber;
    }

    public int getISBNNumber() {
        return ISBNNumber;
    }

    public int getYear() {
        return year;
    }

    public String getTitel() {
        return titel;
    }

    public void setISBNNumber(int ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    @Override
    public String toString() {
        return "This Book is " +
                titel +
                " and was released in " + year +
                ", ISBNNumber= " + ISBNNumber;

    }
}

