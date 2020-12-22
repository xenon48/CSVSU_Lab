package com.example.csvsu;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.csvsu.Likes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter<ImageViewHolder>{

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutIdForImagesList = R.layout.album_layout;

        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(layoutIdForImagesList, parent, false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ImageViewHolder holder, final int position) {
        if (position%12==0 && position!=0) {
            holder.showAd();
        }
        else {
            String imageURL = URLsList.getURL(position);
            holder.setImages(imageURL);
        }
        holder.checkLike(position);
        holder.Album.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Likes.clickListen(position);
                return true;
            }
        });

    }



    @Override
    public int getItemCount() {
        return MainActivity.count;
    }
}
