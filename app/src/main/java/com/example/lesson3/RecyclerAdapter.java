package com.example.lesson3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    private List<Students> list;
    private LayoutInflater inflater;

    public RecyclerAdapter(Context context){
        this.inflater = LayoutInflater.from(context);
        list = new ArrayList<>();
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_list, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public void setList(List<Students> list) {
        this.list = list;
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder{
        private TextView txtName;
        private TextView txtSecondName;
        private TextView txtAge;
        private TextView txtNumber;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.item_name_txt);
            txtSecondName = itemView.findViewById(R.id.item_secondname_txt);
            txtAge = itemView.findViewById(R.id.item_age_txt);
            txtNumber = itemView.findViewById(R.id.item_number_phone_txt);

        }
        public void bind(Students students){
            txtName.setText(students.getFirstName());
            txtSecondName.setText(students.getSecondName());
            txtAge.setText(students.getAge());
            txtNumber.setText(students.getPhone() + "");
        }
    }
}
