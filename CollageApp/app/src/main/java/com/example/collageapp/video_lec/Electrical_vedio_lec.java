package com.example.collageapp.video_lec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.example.collageapp.R;

public class Electrical_vedio_lec extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electrical_vedio_lec);

        setTitle("Electrical Video Lecturs");

    }
    public void showPopup(View v) {

        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_electrical_sem1);
        popup.show();
    }

    public void showPopup2(View v) {

        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_electrical_sem2);
        popup.show();
    }

    public void showPopup3(View v) {

        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_electrical_sem3);
        popup.show();
    }

    public void showPopup4(View v) {

        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_electrical_sem4);
        popup.show();
    }

    public void showPopup5(View v) {

        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_electrical_sem5);
        popup.show();
    }

    public void showPopup6(View v) {

        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_electrical_sem6);
        popup.show();
    }


    @Override
    public boolean onMenuItemClick(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.item1sem1:
                Toast.makeText(this, "Item 1 English ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2sem1:
                Toast.makeText(this, "Item 2 Science ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item3sem1:
                Toast.makeText(this, "Item 3 Mathematics ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item4sem1:
                Toast.makeText(this, "Item 4 Graphics ", Toast.LENGTH_SHORT).show();
                return true;



            case R.id.item1sem2:
                Toast.makeText(this, "Item 1 Applied Mathematics ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2sem2:
                Toast.makeText(this, "Item 2 Fundamentals of Electrical Engineering ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item3sem2:
                Toast.makeText(this, "Item 3 Elements of Electronics ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item4sem2:
                Toast.makeText(this, "Item 4 Basic Communication Using Computer ", Toast.LENGTH_SHORT).show();
                return true;




            case R.id.item1sem3:
                Toast.makeText(this, "Item 1 Electrical Circuits ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2sem3:
                Toast.makeText(this, "Item 2 Elements of Electronics Mesurements ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item3sem3:
                Toast.makeText(this, "Item 3 Electrical Power Generation ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item4sem3:
                Toast.makeText(this, "Item 4 Electrical Materials Wiring Pratice", Toast.LENGTH_SHORT).show();
                return true;





            case R.id.item1sem4:
                Toast.makeText(this, "Item 1 Electric Motors and Transformers ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2sem4:
                Toast.makeText(this, "Item 2 Industrial Mesurements", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item3sem4:
                Toast.makeText(this, "Item 3 Digital Electronics", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item4sem4:
                Toast.makeText(this, "Item 4 Electrical Drawing and CAD", Toast.LENGTH_SHORT).show();
                return true;





            case R.id.item1sem5:
                Toast.makeText(this, "Item 1 Management", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2sem5:
                Toast.makeText(this, "Item 2 Industrial AC Machines", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item3sem5:
                Toast.makeText(this, "Item 3 Switchgear and Protection", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item4sem5:
                Toast.makeText(this, "Item 4 Energy Conservation and Audit", Toast.LENGTH_SHORT).show();
                return true;



            case R.id.item1sem6:
                Toast.makeText(this, "Item 1 Maintenance of Electrical Equipment", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2sem6:
                Toast.makeText(this, "Item 2 Utilization of Electrical Energy", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item3sem6:
                Toast.makeText(this, "Item 3 Electrical Estimation and Contracting ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item4sem6:
                Toast.makeText(this, "Item 4 Emerging Trends and Electrical Engineering", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return false;
        }


    }
}