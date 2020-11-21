package com.example.assigment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.viewHolder> {

    private Context context;
    private ArrayList<Model>list;

    public RecyclerAdapter(Context context, ArrayList<Model> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.item_row,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Model model=list.get(position);
        holder.thePicture.setImageResource(model.getItemPicture());
        holder.picture_name.setText(model.getItemName());
        holder.product_from.setText(model.getItemFrom());
        holder.product_price.setText(model.getItemPrice());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class viewHolder extends RecyclerView.ViewHolder {


        ImageView thePicture;
        TextView picture_name;
        TextView product_from;
        TextView product_price;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            thePicture=itemView.findViewById(R.id.the_picture);
            picture_name=itemView.findViewById(R.id.picture_name);
            product_from=itemView.findViewById(R.id.product_from);
            product_price=itemView.findViewById(R.id.product_price);
        }
    }
}
