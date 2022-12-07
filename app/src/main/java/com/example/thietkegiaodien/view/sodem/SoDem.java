package com.example.thietkegiaodien.view.sodem;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.thietkegiaodien.R;
import com.example.thietkegiaodien.basic.CustomAdapter;

public class SoDem extends AppCompatActivity {

    //Các hình ảnh của từng Item trong ListView
    public static int[] imgAvatar = {R.drawable.so1, R.drawable.so2,
            R.drawable.so3, R.drawable.so4, R.drawable.so5, R.drawable.so6,
            R.drawable.so7, R.drawable.so8, R.drawable.so9, R.drawable.so10};
    //Nội dung của từng Item trong ListView
    public static String[] tvNoiDung = {"Số một", "Số hai",
            "Số ba", "Số bốn", "Số năm", "Số sáu",
            "Số bảy", "Số tám", "Số chín", "Số mười"};

    ListView lvCustomListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.so_dem_activity);
        //get ListView theo ID từ layout xml
        lvCustomListView = (ListView) findViewById(R.id.lvCustomListView);
        //Khởi tạo đối tượng adapter và gán Data source --> gán Adapter vào Lisview
        //Ở bước này mình đã làm tắt đi 1 bước, chính xác là
//        //CustomAdapter adapter=new CustomAdapter(CustomListVIewActivity.this, tvNoiDung, imgAvatar);
//        //lvCustomListView.setAdapter(adapter);
        lvCustomListView.setAdapter(new CustomAdapter(SoDem.this, tvNoiDung, imgAvatar));

    }

}
