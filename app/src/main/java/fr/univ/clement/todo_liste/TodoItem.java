package fr.univ.clement.todo_liste;

import android.graphics.Color;
import android.nfc.Tag;

import java.util.ArrayList;

public class TodoItem {

    private String label;
    private enum Tags {Faible, Normal, Important}
    private int importance;
    private boolean fait = false;

    public TodoItem(Tags tag, String label){
        this.label = label;
        if (tag == Tags.Faible){
            this.importance = Color.rgb(102, 153, 0);
        }
        else if (tag == Tags.Normal){
            this.importance = Color.rgb(255, 136, 0);
        }
        else if (tag == Tags.Important) {
            this.importance = Color.rgb(204, 0, 0);
        }
    }

    public static ArrayList<TodoItem> getItems() {
        ArrayList<TodoItem> items = new ArrayList<TodoItem>();
        items.add(new TodoItem(TodoItem.Tags.Important, "Réviser ses cours"));
        items.add(new TodoItem(TodoItem.Tags.Normal, "Acheter du pain"));
        items.add(new TodoItem(TodoItem.Tags.Normal, "Marcher 30 mn par jour"));
        items.add(new TodoItem(TodoItem.Tags.Faible, "Manger 5 fruits et légumes"));
        items.add(new TodoItem(TodoItem.Tags.Normal, "Prendre des nouvelles des parents"));
        items.add(new TodoItem(TodoItem.Tags.Faible, "Préparer la prochaine soirée poker"));
        items.add(new TodoItem(TodoItem.Tags.Normal, "Révoir les premières saisons de Game of thrones"));
        items.add(new TodoItem(TodoItem.Tags.Faible, "Finir la vaisselle"));
        items.add(new TodoItem(TodoItem.Tags.Important, "Acheter un nouveau disque dur"));
        items.add(new TodoItem(TodoItem.Tags.Important, "Revoir les raccourcis clavier"));
        items.add(new TodoItem(TodoItem.Tags.Normal, "Tester une nouvelle techno"));
        items.add(new TodoItem(TodoItem.Tags.Faible, "Tester l'application en cours"));

        return items;
    }

    public int getImportance() {
        return importance;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isFait() {
        return fait;
    }

    public void setFait(boolean fait) {
        this.fait = fait;
    }
}
