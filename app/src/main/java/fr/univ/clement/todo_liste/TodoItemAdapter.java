package fr.univ.clement.todo_liste;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mederic on 14/02/2018.
 */

public class TodoItemAdapter extends RecyclerView.Adapter<TodoItemAdapter.TodoItemHolder> {

    private ArrayList<TodoItem> listItem;

    public class TodoItemHolder extends RecyclerView.ViewHolder {

        public TextView label;
        public ImageView importance;
        public Switch fait;

        public TodoItemHolder (View itemView){
            super(itemView);
            label = (TextView) itemView.findViewById(R.id.label);
            importance = (ImageView) itemView.findViewById(R.id.importance);
            fait = (Switch) itemView.findViewById(R.id.fait);
        }
    }

    public TodoItemAdapter(ArrayList<TodoItem> itemList){
        this.listItem = itemList;
    }

    @Override
    public TodoItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        return new TodoItemHolder(itemView);
    }

    @Override
    public void onBindViewHolder(TodoItemHolder holder, int position) {
        TodoItem todoItem = listItem.get(position);
        holder.label.setText(todoItem.getLabel());
        holder.importance.setBackgroundColor(todoItem.getImportance());
        holder.fait.setChecked(todoItem.isFait());
    }

    @Override
    public int getItemCount() {
        return listItem.size();
    }
}
