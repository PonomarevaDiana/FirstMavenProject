package org.example.Task4;

public class Book {
    public static class Author {
        private String name;
        private String gender;
        private String email;
        public Author(String name, String gender, String email){
            this.name=name;
            this.gender=gender;
            this.email=email;
        }
        public Author(){

        }
        public String getName(){
            return name;
        }

        public String getGender(){
            return gender;
        }
        public String getEmail(){
            return email;
        }
        public void setName(String name){
            this.name=name;
        }
        public void setGender(String gender){
            this.gender=gender;
        }
        public void setEmail(String email){
            this.email=email;
        }
    }
    private String title;
    private Author author= new Author();
    private int year;
    public Book(String title, Author author, int year){
        this.title=title;
        this.author=author;
        this.year=year;
    }
    public Book(){

    }
    public String getTitle(){
        return title;
    }

    public Author getAuthor(){
        return author;
    }
    public int getYear(){
        return year;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(Author author){
        this.author=author;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void toString(boolean a){
        System.out.println("Книга: "+ title);
        System.out.println("Данные об авторе");
        System.out.println("Имя: "+ author.name);
        System.out.println("Пол: "+author.gender);
        System.out.println("Email: "+author.email);
        System.out.println("Год издания книги: "+year);
    }
}
