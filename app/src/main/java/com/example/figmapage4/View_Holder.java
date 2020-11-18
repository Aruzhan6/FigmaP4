package com.example.figmapage4;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.view.menu.MenuView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class View_Holder extends RecyclerView.ViewHolder {

    CardView cv;
    TextView numbersTv;
    TextView nameTv;
    ImageView imageView;

    public View_Holder(View itemView) {
        super(itemView);
        cv = (CardView) itemView.findViewById(R.id.cardView);
        numbersTv = (TextView) itemView.findViewById(R.id.numbersTv);
        nameTv = (TextView) itemView.findViewById(R.id.nameTv);
        imageView = (ImageView) itemView.findViewById(R.id.imageView);
    }
}
