package kr.hs.emirim.w2038.project11_1;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class GridAdapter extends BaseAdapter {
    Context context;
    int[] posterIds = {R.drawable.anotherround, R.drawable.black, R.drawable.cripcamp, R.drawable.eurovision, R.drawable.hillbilly,
            R.drawable.lovesong, R.drawable.mank, R.drawable.marainey, R.drawable.minari, R.drawable.newoftheworld,
            R.drawable.nomadland, R.drawable.octopus, R.drawable.overthemoon, R.drawable.pieces, R.drawable.promising,
            R.drawable.quovadis, R.drawable.shaun, R.drawable.sound, R.drawable.thefather, R.drawable.trial};
    String[] posterNames = {"어나더 라운드", "유다 그리고 블랙 메시아", "크립 캠프", "유로비전 송 콘테스트", "힐빌리의 노래",
                            "러브 송 포 라타샤", "맹크", "마 레이니, 그녀가 블루스", "미나리", "뉴스 오브 더 월드",
                            "노매드랜드", "나의 문어 선생님", "오버 더 문", "그녀의 조각들", "프라미싱 영 우먼",
                            "쿠오바디스, 아이다", "숀더쉽 더 무비", "사운드 오브 메탈", "더 파더", "트라이얼 오브 더 시카고7"};
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

        final int pos = i;
        imgv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(context);
                View dialogView = View.inflate(context, R.layout.dialog1, null);
                ImageView imgvLarge = dialogView.findViewById(R.id.imgv_large);
                imgvLarge.setImageResource(posterIds[pos]);
                dialog.setTitle(posterNames[pos]);
                dialog.setIcon(R.drawable.movie_icon);
                dialog.setView(dialogView);
                dialog.setNegativeButton("close", null);
                dialog.show();
            }
        });

        return imgv;
    }
}
