package com.example.instagramlogin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
//import glide

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MakananAdapter extends RecyclerView.Adapter<MakananAdapter.ViewHolder> {
    private Context context;
    private List<ModelMakanan> MakananList;
    private ItemClickListener mClickListener;

    public MakananAdapter(Context context, List<ModelMakanan> makananList) {
        this.context = context;
        this.MakananList = makananList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final ModelMakanan mkn = this.MakananList.get(position);
        holder.tvNama.setText(mkn.getNama());
        holder.tvHarga.setText(mkn.getNo());
        Glide.with(holder.itemView.getContext())
                .load(mkn.getImgSrc())
                .into(holder.imgMkn);
// glide
    }

    @Override
    public int getItemCount() {
        return this.MakananList.size();}

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvNama, tvHarga;
        ImageView imgMkn;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tvName);
            tvHarga = itemView.findViewById(R.id.tvno);
            imgMkn = itemView.findViewById(R.id.img);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }
    ModelMakanan getItem(int id) {
        return MakananList.get(id);
    }

    // allows clicks events to be caught
    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}