package fr.univ.clement.todo_liste;

/**
 * Created by cleme on 12/02/2018.
 */

public class Product{
    private String title;
    private String category;

    public Product(String title, String category){
        this.title = title;
        this.category = category;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getCategory(){
        return this.category;
    }

    public void setCategory(String category){
        this.category = category;
    }
}
