package com.example.thietkegiaodien.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.thietkegiaodien.R;
import com.example.thietkegiaodien.TKGiaoDienActivity;
import com.example.thietkegiaodien.view.chucai.ChuCai;
import com.example.thietkegiaodien.view.convat.ConVat;
import com.example.thietkegiaodien.view.mausac.Mausac;

public class ViewMainActivity extends AppCompatActivity {

    private Button buttonChuCai;
    private Button buttonConVat;
    private Button buttonMausac;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewmain_activity);

        buttonChuCai = (Button) findViewById(R.id.button_chu_cai);
        buttonChuCai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ViewMainActivity.this, ChuCai.class);
                startActivity(intent);
            }
        });

        buttonConVat = (Button) findViewById(R.id.button_con_vat);
        buttonConVat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ViewMainActivity.this, ConVat.class);
                startActivity(intent1);
            }
        });

        buttonMausac = (Button) findViewById(R.id.button_mau_sac);
        buttonMausac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ViewMainActivity.this, Mausac.class);
                startActivity(intent1);
            }
        });
    }
}