package com.example.thietkegiaodien.view.mausac;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.thietkegiaodien.R;
import com.example.thietkegiaodien.view.ViewMainActivity;
import com.example.thietkegiaodien.view.convat.ConVat;

public class Mausac extends AppCompatActivity {

    private Button buttonBack;
    private ImageButton buttonE;
    private ImageButton buttonD;
    private ImageButton buttonCh;
    private ImageButton buttonB;
    @Override
    protected void onCreate(@Nullable Bundle savledInstanceState) {
        super.onCreate(savledInstanceState);
        setContentView(R.layout.mausac_activity);

    buttonBack = (Button) findViewById(R.id.button_back);
        buttonBack.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(Mausac.this, ViewMainActivity.class);
            startActivity(intent);
        }
    });

    buttonE = (ImageButton) findViewById(R.id.imageButton);
        buttonE.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            showDialog(R.drawable.mau_do,"màu đỏ");
        }
    });

    buttonD = (ImageButton) findViewById(R.id.imageButton2);
        buttonD.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            showDialog(R.drawable.mau_vang,"màu vàng");
        }
    });

    buttonCh = (ImageButton) findViewById(R.id.imageButton3);
        buttonCh.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(Mausac.this, ViewMainActivity.class);
            startActivity(intent);
        }
    });

    buttonB = (ImageButton) findViewById(R.id.imageButton4);
        buttonB.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(Mausac.this, ViewMainActivity.class);
            startActivity(intent);
        }
    });
}

    private void showDialog(int a, String s) {
        AlertDialog.Builder builder = new AlertDialog.Builder(Mausac.this, R.style.AlertDialog);
        View view = LayoutInflater.from(Mausac.this).inflate(
                R.layout.dialog, findViewById(R.id.layoutDialog)
        );
        builder.setView(view);
        ImageView imageView = view.findViewById(R.id.image_con_vat);
        TextView textViewTitle = view.findViewById(R.id.textViewTitle);
        TextView textViewMess = view.findViewById(R.id.textMess);
        Button buttonOK = view.findViewById(R.id.buttonOK);

        textViewMess.setText(s);
        textViewTitle.setText(s);
        buttonOK.setText("OK");

        imageView.setImageResource(a);

        AlertDialog alertDialog = builder.create();

        buttonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.dismiss();
            }
        });

        if(alertDialog.getWindow() != null) {
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }

        alertDialog.show();
    }
}
