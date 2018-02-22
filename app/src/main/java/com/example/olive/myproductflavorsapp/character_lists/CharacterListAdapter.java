package com.example.olive.myproductflavorsapp.character_lists;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.olive.myproductflavorsapp.R;
import com.example.olive.myproductflavorsapp.data.network.model.RelatedTopic;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by olive on 21/02/2018.
 */

class CharacterListAdapter extends RecyclerView.Adapter<CharacterListAdapter.MyViewHolder> {
    Context applicationContext;
    List<RelatedTopic> results;
    int row;

    public CharacterListAdapter(Context applicationContext, List<RelatedTopic> results, int row) {
        this.applicationContext = applicationContext;
        this.results = results;
        this.row = row;
    }

    @Override
    public CharacterListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(row, parent, false));
    }

    @Override
    public void onBindViewHolder(CharacterListAdapter.MyViewHolder holder, int position) {
        holder.txtName.setText(results.get(position).getText());

        String url = results.get(position).getIcon().toString();
        Picasso.with(applicationContext).load(url).resize(230, 230).centerCrop().into(holder.imgV);
        //holder.txtName.setText(results.get(position).getIcon());
    }

    @Override
    public int getItemCount() {
        return results.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView txtName;
        private ImageView imgV;

        public MyViewHolder(View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.tView);
            imgV = itemView.findViewById(R.id.iView);
        }
    }
}
