package kr.hs.emirim.w2038.project11_1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class GridAdapter extends BaseAdapter {
    Context context;
    int[] posterIds = {R.drawable.anotherround, R.drawable.black, R.drawable.cripcamp, R.drawable.eurovision, R.drawable.hillbilly,
            R.drawable.lovesong, R.drawable.mank, R.drawable.marainey, R.drawable.minari, R.drawable.newoftheworld,
            R.drawable.nomadland, R.drawable.octopus, R.drawable.overthemoon, R.drawable.pieces, R.drawable.promising,
            R.drawable.quovadis, R.drawable.shaun, R.drawable.sound, R.drawable.thefather, R.drawable.trial};
    public GridAdapter(Context context){
        this.context= context;
    }
    @Override
    public int getCount() {
        return posterIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        ImageView imgv = new ImageView(context);
        imgv.setLayoutParams(new ViewGroup.LayoutParams(200, 300));
        imgv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imgv.setPadding(5, 5, 5, 5);
        imgv.setImageResource(posterIds[i]);
        return imgv;
    }
}