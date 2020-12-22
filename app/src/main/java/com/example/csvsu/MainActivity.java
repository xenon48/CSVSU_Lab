package com.example.csvsu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerAdapter adapter;
    RecyclerView.LayoutManager layoutManager;
    static int count = 1084;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv);

        layoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerAdapter();
        recyclerView.setAdapter(adapter);
        URLsList.setURLs(count);

    }



//    public void likeOff(View view) {
//        ImageView i_likeOff = findViewById(R.id.likeoff);
//        Button b_likeOff = findViewById(R.id.buttonoff);
//        ImageView i_likeOn = findViewById(R.id.likeon);
//        Button b_likeOn = findViewById(R.id.buttonon);
//
//        i_likeOff.setVisibility(View.GONE);
//        b_likeOff.setVisibility(View.GONE);
//        i_likeOn.setVisibility(View.VISIBLE);
//        b_likeOn.setVisibility(View.VISIBLE);
//
//    }
//
//    public void likeOn(View view) {
//        ImageView i_likeOff = findViewById(R.id.likeoff);
//        Button b_likeOff = findViewById(R.id.buttonoff);
//        ImageView i_likeOn = findViewById(R.id.likeon);
//        Button b_likeOn = findViewById(R.id.buttonon);
//
//        i_likeOn.setVisibility(View.GONE);
//        b_likeOn.setVisibility(View.GONE);
//        i_likeOff.setVisibility(View.VISIBLE);
//        b_likeOff.setVisibility(View.VISIBLE);
//
//    }















//    public void onClick(View view)
//    {
//        //"https://picsum.photos/id/1/800"
//
//        //i += 15;
//        //String adr = "https://picsum.photos/id/" + i + "/480/800";
//        String adr = "https://picsum.photos/800";
//        img = null;
//        Toast.makeText(this, adr, Toast.LENGTH_SHORT).show();
//
//        img = (ImageView) findViewById(R.id.img_xml);
//        Glide
//                .with(this)
//                .load(adr)
//                .apply(RequestOptions.skipMemoryCacheOf(true))
//                .apply(RequestOptions.diskCacheStrategyOf(DiskCacheStrategy.NONE))
//                .into(img);
//
//    }
}