package com.example.collageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.collageapp.video_lec.Civil_vedio_lec;
import com.example.collageapp.video_lec.Computer_video_lec;
import com.example.collageapp.video_lec.Electrical_vedio_lec;
import com.example.collageapp.video_lec.Machanical_vedio_lec;


public class VIdeo_Lectures extends AppCompatActivity {

    private Button comp_video, civil_video, macha_video, elec_video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_lectures);
        setTitle("Video Lecturs");

        comp_video = (Button) findViewById(R.id.comp_video);
        comp_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(VIdeo_Lectures.this, Computer_video_lec.class);
                startActivity(int1);
            }
        });
        civil_video = (Button) findViewById(R.id.civil_video);
        civil_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2 = new Intent(VIdeo_Lectures.this, Civil_vedio_lec.class);
                startActivity(int2);
            }
        });
        macha_video = (Button) findViewById(R.id.macha_video);
        macha_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3 = new Intent(VIdeo_Lectures.this, Machanical_vedio_lec.class);
                startActivity(int3);
            }
        });
        elec_video = (Button) findViewById(R.id.elec_video);
        elec_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3 = new Intent(VIdeo_Lectures.this, Electrical_vedio_lec.class);
                startActivity(int3);
            }
        });



    }
}