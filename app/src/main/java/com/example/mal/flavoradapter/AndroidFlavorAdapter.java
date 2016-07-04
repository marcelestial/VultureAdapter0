package com.example.mal.flavoradapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mal on 7/3/2016.
 */
public class AndroidFlavorAdapter extends ArrayAdapter{
    public AndroidFlavorAdapter(Activity context, List<AndroidFlavor> androidFlavors){
        super(context, 0, androidFlavors);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        AndroidFlavor androidFlavor = (AndroidFlavor) getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_flavor, parent, false);
        }

        ImageView iconView = (ImageView) convertView.findViewById(R.id.list_item_icon);
        iconView.setImageResource(androidFlavor.image);

        /*TextView versionNameView = (TextView) convertView.findViewById(R.id.list_item_version_name);
        versionNameView.setText(androidFlavor.versionName);

        TextView versionNumberView = (TextView) convertView.findViewById(R.id.list_item_versionnumber_textview);
        versionNumberView.setText(androidFlavor.versionNumber);*/
        return convertView;
    }
}
