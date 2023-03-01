package com.example.collageapp.video_lec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.example.collageapp.R;

public class Computer_video_lec extends AppCompatActivity  implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer_video_lec);
        setTitle("Computer Video Lecturs");



    }

    public void showPopup(View v){

        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_computer_sem1);
        popup.show();
    }
    public void showPopup2(View v){

        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_computer_sem2);
        popup.show();
    }
    public void showPopup3(View v){

        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_computer_sem3);
        popup.show();
    }
   public void showPopup4(View v){

        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_computer_sem4);
        popup.show();
    }
  public void showPopup5(View v){

        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_computer_sem5);
        popup.show();
    }
    public void showPopup6(View v){

        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_computer_sem6);
        popup.show();
    }




    @Override
    public boolean onMenuItemClick(MenuItem item) {

        switch (item.getItemId()){

            case R.id.item1sem1:


                Intent browserIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/_rOUP3zknJA"));
                startActivity(browserIntent1);
                //   Intent browserInten = new Intent(MainActivity.this, MainActivity_internet_map.class);
                // startActivity(browserInten);

                Toast.makeText(this,"English ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2sem1:

                Intent browserIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/kDHZhz74TtI"));
                startActivity(browserIntent2);
                Toast.makeText(this,"Item 2 Science ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item3sem1:


                Intent browserIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/m-J5_Oswfn0"));
                startActivity(browserIntent3);
                Toast.makeText(this,"Item 3 Mathematics ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item4sem1:

                Intent browserIntent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/2zZ94_1X474"));
                startActivity(browserIntent4);
                Toast.makeText(this,"Item 4 Enginnering Graphics ", Toast.LENGTH_SHORT).show();
                return true;






            case R.id.item1sem2:

                Intent browserIntent5 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/Vd2UJiIPbag"));
                startActivity(browserIntent5);
                Toast.makeText(this,"Item 1 electrical ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2sem2:

                Toast.makeText(this,"Item 2 Mathemathics ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item3sem2:

                Toast.makeText(this,"Item 3 Electronics ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item4sem2:

                Toast.makeText(this,"Item 4 Programming C ", Toast.LENGTH_SHORT).show();
                return true;





            case R.id.item1sem3:

                Toast.makeText(this,"Item 1 C++ ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2sem3:

                Toast.makeText(this,"Item 2 Data Structure ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item3sem3:

                Toast.makeText(this,"Item 3 Database ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item4sem3:

                Toast.makeText(this,"Item 4 Digital Techniques", Toast.LENGTH_SHORT).show();
                return true;




            case R.id.item1sem4:

                Toast.makeText(this,"Item 1 Java Programming ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2sem4:

                Toast.makeText(this,"Item 2 Software Engineering ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item3sem4:

                Toast.makeText(this,"Item 3 Data Communication ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item4sem4:

                Toast.makeText(this,"Item 4 Microprocessors", Toast.LENGTH_SHORT).show();
                return true;




            case R.id.item1sem5:

                Toast.makeText(this,"Item 1 Environmental", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2sem5:

                Toast.makeText(this,"Item 2 Operating ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item3sem5:

                Toast.makeText(this,"Item 3 Advanced Java ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item4sem5:

                Toast.makeText(this,"Item 4 Softer Testing", Toast.LENGTH_SHORT).show();
                return true;



            case R.id.item1sem6:

                Toast.makeText(this,"Item 1 Python", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2sem6:

                Toast.makeText(this,"Item 2 Mobial App ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item3sem6:

                Toast.makeText(this,"Item 3 Management ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item4sem6:

                Toast.makeText(this,"Item 4 Emerging Trends", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return false;
        }

    }
}