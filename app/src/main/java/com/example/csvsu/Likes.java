package com.example.csvsu;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import static com.example.csvsu.ImageViewHolder.i_likeOn;

public class Likes extends MainActivity {



    static Boolean[] listLikes = new Boolean[MainActivity.count];

    static  public void clickListen(int position) {
        if (listLikes[position] != null) {
            listLikes[position] = null;
            i_likeOn.setVisibility(View.GONE);
        }
        else{
            listLikes[position] = true;
            i_likeOn.setVisibility(View.VISIBLE);
        }
        Log.d("Tag", "Tap id " + position + ". True is " + listLikes[position]);
    }



//    public static void clickListen(int position) {
//        Log.d("Tag", "Tap id " + position);
//        if (listLikes[position] == true) {
//            listLikes[position] = null;
//            i_likeOn.setVisibility(View.GONE);
//        }
//        else{
//            listLikes[position] = true;
//            i_likeOn.setVisibility(View.VISIBLE);
//        }
//    }
}

