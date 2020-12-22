package com.example.csvsu;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import static com.example.csvsu.Likes.listLikes;

public class ImageViewHolder extends RecyclerView.ViewHolder {
    ImageView Album;
    static ImageView i_likeOn;

    public ImageViewHolder(@NonNull View itemView) {
        super(itemView);
        Album = itemView.findViewById(R.id.album);
        i_likeOn = itemView.findViewById(R.id.likeon);
        i_likeOn.setImageResource(R.drawable.like);
    }

    public void setImages(String imageURL){

        Glide
                .with(itemView)
                .load(imageURL)
                .into(Album);
    }

    public void showAd(){
        Album.setImageResource(R.drawable.ads);
    }

    public static void checkLike(int position){
        if (listLikes[position] != null) {
            i_likeOn.setVisibility(View.VISIBLE);
        }
        else{
            i_likeOn.setVisibility(View.GONE);
        }
    }
}