package com.example.tombalagame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.databinding.DataBindingUtil;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.tombalagame.databinding.ActivityMain2Binding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    private ActivityMain2Binding tasarim;
    private int pullar = 0;
    private int pc_bilinen = 0;
    private int benim_bilinen = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tasarim= DataBindingUtil.setContentView(this,R.layout.activity_main2);

        String sayi = "";
        int sayac = 0;
        int uretilen_sayi;

        ArrayList<Integer> torba = new ArrayList<>();

        for(int i=0 ; i<90 ; i++){
            torba.add(i+1);
        }
        Collections.shuffle(torba);

        ArrayList<Integer> pc_sayilar = new ArrayList<>();
        ArrayList<String> sayilarim = getIntent().getStringArrayListExtra("sayilarim");

        do{
            uretilen_sayi = (int)(Math.random() * 90) + 1;
            if(!sayi.contains(String.valueOf(uretilen_sayi))){
                pc_sayilar.add(uretilen_sayi);
                sayi += String.valueOf(uretilen_sayi);
                sayac++;
            }
        }while(sayac != 12);

        tasarim.pc1.setText(String.valueOf(pc_sayilar.get(0)));
        tasarim.pc2.setText(String.valueOf(pc_sayilar.get(1)));
        tasarim.pc3.setText(String.valueOf(pc_sayilar.get(2)));
        tasarim.pc4.setText(String.valueOf(pc_sayilar.get(3)));
        tasarim.pc5.setText(String.valueOf(pc_sayilar.get(4)));
        tasarim.pc6.setText(String.valueOf(pc_sayilar.get(5)));
        tasarim.pc7.setText(String.valueOf(pc_sayilar.get(6)));
        tasarim.pc8.setText(String.valueOf(pc_sayilar.get(7)));
        tasarim.pc9.setText(String.valueOf(pc_sayilar.get(8)));
        tasarim.pc10.setText(String.valueOf(pc_sayilar.get(9)));
        tasarim.pc11.setText(String.valueOf(pc_sayilar.get(10)));
        tasarim.pc12.setText(String.valueOf(pc_sayilar.get(11)));

        tasarim.my1.setText(sayilarim.get(0));
        tasarim.my2.setText(sayilarim.get(1));
        tasarim.my3.setText(sayilarim.get(2));
        tasarim.my4.setText(sayilarim.get(3));
        tasarim.my5.setText(sayilarim.get(4));
        tasarim.my6.setText(sayilarim.get(5));
        tasarim.my7.setText(sayilarim.get(6));
        tasarim.my8.setText(sayilarim.get(7));
        tasarim.my9.setText(sayilarim.get(8));
        tasarim.my10.setText(sayilarim.get(9));
        tasarim.my11.setText(sayilarim.get(10));
        tasarim.my12.setText(sayilarim.get(11));

        tasarim.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pullar == 90){
                    tasarim.torbaBtn.setText("");
                }
                else{
                    tasarim.torbaBtn.setText(String.valueOf(torba.get(pullar)));
                    if(tasarim.my1.getText().toString().equals(String.valueOf(torba.get(pullar)))){
                        ViewCompat.setBackgroundTintList(tasarim.my1, ColorStateList.valueOf(Color.parseColor("#41F500")));
                        benim_bilinen++;
                    }
                    if(tasarim.my2.getText().toString().equals(String.valueOf(torba.get(pullar)))){
                        ViewCompat.setBackgroundTintList(tasarim.my2, ColorStateList.valueOf(Color.parseColor("#41F500")));
                        benim_bilinen++;
                    }
                    if(tasarim.my3.getText().toString().equals(String.valueOf(torba.get(pullar)))){
                        ViewCompat.setBackgroundTintList(tasarim.my3, ColorStateList.valueOf(Color.parseColor("#41F500")));
                        benim_bilinen++;
                    }
                    if(tasarim.my4.getText().toString().equals(String.valueOf(torba.get(pullar)))){
                        ViewCompat.setBackgroundTintList(tasarim.my4, ColorStateList.valueOf(Color.parseColor("#41F500")));
                        benim_bilinen++;
                    }
                    if(tasarim.my5.getText().toString().equals(String.valueOf(torba.get(pullar)))){
                        ViewCompat.setBackgroundTintList(tasarim.my5, ColorStateList.valueOf(Color.parseColor("#41F500")));
                        benim_bilinen++;
                    }
                    if(tasarim.my6.getText().toString().equals(String.valueOf(torba.get(pullar)))){
                        ViewCompat.setBackgroundTintList(tasarim.my6, ColorStateList.valueOf(Color.parseColor("#41F500")));
                        benim_bilinen++;
                    }
                    if(tasarim.my7.getText().toString().equals(String.valueOf(torba.get(pullar)))){
                        ViewCompat.setBackgroundTintList(tasarim.my7, ColorStateList.valueOf(Color.parseColor("#41F500")));
                        benim_bilinen++;
                    }
                    if(tasarim.my8.getText().toString().equals(String.valueOf(torba.get(pullar)))){
                        ViewCompat.setBackgroundTintList(tasarim.my8, ColorStateList.valueOf(Color.parseColor("#41F500")));
                        benim_bilinen++;
                    }
                    if(tasarim.my9.getText().toString().equals(String.valueOf(torba.get(pullar)))){
                        ViewCompat.setBackgroundTintList(tasarim.my9, ColorStateList.valueOf(Color.parseColor("#41F500")));
                        benim_bilinen++;
                    }
                    if(tasarim.my10.getText().toString().equals(String.valueOf(torba.get(pullar)))){
                        ViewCompat.setBackgroundTintList(tasarim.my10, ColorStateList.valueOf(Color.parseColor("#41F500")));
                        benim_bilinen++;
                    }
                    if(tasarim.my11.getText().toString().equals(String.valueOf(torba.get(pullar)))){
                        ViewCompat.setBackgroundTintList(tasarim.my11, ColorStateList.valueOf(Color.parseColor("#41F500")));
                        benim_bilinen++;
                    }
                    if(tasarim.my12.getText().toString().equals(String.valueOf(torba.get(pullar)))){
                        ViewCompat.setBackgroundTintList(tasarim.my12, ColorStateList.valueOf(Color.parseColor("#41F500")));
                        benim_bilinen++;
                    }
                    if(tasarim.pc1.getText().toString().equals(String.valueOf(torba.get(pullar)))){
                        ViewCompat.setBackgroundTintList(tasarim.pc1, ColorStateList.valueOf(Color.parseColor("#41F500")));
                        pc_bilinen++;
                    }
                    if(tasarim.pc2.getText().toString().equals(String.valueOf(torba.get(pullar)))){
                        ViewCompat.setBackgroundTintList(tasarim.pc2, ColorStateList.valueOf(Color.parseColor("#41F500")));
                        pc_bilinen++;
                    }
                    if(tasarim.pc3.getText().toString().equals(String.valueOf(torba.get(pullar)))){
                        ViewCompat.setBackgroundTintList(tasarim.pc3, ColorStateList.valueOf(Color.parseColor("#41F500")));
                        pc_bilinen++;
                    }
                    if(tasarim.pc4.getText().toString().equals(String.valueOf(torba.get(pullar)))){
                        ViewCompat.setBackgroundTintList(tasarim.pc4, ColorStateList.valueOf(Color.parseColor("#41F500")));
                        pc_bilinen++;
                    }
                    if(tasarim.pc5.getText().toString().equals(String.valueOf(torba.get(pullar)))){
                        ViewCompat.setBackgroundTintList(tasarim.pc5, ColorStateList.valueOf(Color.parseColor("#41F500")));
                        pc_bilinen++;
                    }
                    if(tasarim.pc6.getText().toString().equals(String.valueOf(torba.get(pullar)))){
                        ViewCompat.setBackgroundTintList(tasarim.pc6, ColorStateList.valueOf(Color.parseColor("#41F500")));
                        pc_bilinen++;
                    }
                    if(tasarim.pc7.getText().toString().equals(String.valueOf(torba.get(pullar)))){
                        ViewCompat.setBackgroundTintList(tasarim.pc7, ColorStateList.valueOf(Color.parseColor("#41F500")));
                        pc_bilinen++;
                    }
                    if(tasarim.pc8.getText().toString().equals(String.valueOf(torba.get(pullar)))){
                        ViewCompat.setBackgroundTintList(tasarim.pc8, ColorStateList.valueOf(Color.parseColor("#41F500")));
                        pc_bilinen++;
                    }
                    if(tasarim.pc9.getText().toString().equals(String.valueOf(torba.get(pullar)))){
                        ViewCompat.setBackgroundTintList(tasarim.pc9, ColorStateList.valueOf(Color.parseColor("#41F500")));
                        pc_bilinen++;
                    }
                    if(tasarim.pc10.getText().toString().equals(String.valueOf(torba.get(pullar)))){
                        ViewCompat.setBackgroundTintList(tasarim.pc10, ColorStateList.valueOf(Color.parseColor("#41F500")));
                        pc_bilinen++;
                    }
                    if(tasarim.pc11.getText().toString().equals(String.valueOf(torba.get(pullar)))){
                        ViewCompat.setBackgroundTintList(tasarim.pc11, ColorStateList.valueOf(Color.parseColor("#41F500")));
                        pc_bilinen++;
                    }
                    if(tasarim.pc12.getText().toString().equals(String.valueOf(torba.get(pullar)))){
                        ViewCompat.setBackgroundTintList(tasarim.pc12, ColorStateList.valueOf(Color.parseColor("#41F500")));
                        pc_bilinen++;
                    }
                    pullar++;

                    if(pc_bilinen == 12){
                        tasarim.pcKazandi.setText("BİLGİSAYAR KAZANDI");
                        tasarim.torbaBtn.setText("");
                        tasarim.button.setEnabled(false);
                    }
                    else if(benim_bilinen == 12){
                        tasarim.kazandimTxt.setText("TEBRİKLER KAZANDINIZ");
                        tasarim.torbaBtn.setText("");
                        tasarim.button.setEnabled(false);
                    }


                }




            }
        });




    }
}