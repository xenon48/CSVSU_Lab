package com.example.csvsu;

import java.util.ArrayList;
import java.util.List;

public class URLsList extends MainActivity {

    public static List<String> URLs = new ArrayList<>();
    static String imageURL;


//    public void main(String args[]){
//        setURLs();
//    }

    public static void setURLs(int count) {
        for (int i = 20; i < count; i++){
            imageURL = "https://picsum.photos/id/" + i + "/800/";
            URLs.add(imageURL);
        }
    }

    public static String getURL(int position){
        return URLs.get(position);
    }
}
