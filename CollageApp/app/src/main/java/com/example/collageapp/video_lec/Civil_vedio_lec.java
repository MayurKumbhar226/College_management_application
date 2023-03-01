package com.example.collageapp.video_lec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.example.collageapp.R;

public class Civil_vedio_lec extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_vedio_lec);

        setTitle("Civil Video Lecturs");
    }

    public void showPopup(View v) {

        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_civil_sem1);
        popup.show();
    }

    public void showPopup2(View v) {

        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_civil_sem2);
        popup.show();
    }

    public void showPopup3(View v) {

        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_civil_sem3);
        popup.show();
    }

    public void showPopup4(View v) {

        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_civil_sem4);
        popup.show();
    }

    public void showPopup5(View v) {

        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_civil_sem5);
        popup.show();
    }

    public void showPopup6(View v) {

        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_civil_sem6);
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
                Toast.makeText(this, "Item 2 Applied Mechanics ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item3sem2:
                Toast.makeText(this, "Item 3 Constraction Meterial ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item4sem2:
                Toast.makeText(this, "Item 4 civil Engineering Workshop and Practice ", Toast.LENGTH_SHORT).show();
                return true;




            case R.id.item1sem3:
                Toast.makeText(this, "Item 1 Advanced Surveying ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2sem3:
                Toast.makeText(this, "Item 2 Highway Engineering ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item3sem3:
                Toast.makeText(this, "Item 3 Building Construction ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item4sem3:
                Toast.makeText(this, "Item 4 Concreat Technology", Toast.LENGTH_SHORT).show();
                return true;





            case R.id.item1sem4:
                Toast.makeText(this, "Item 1 Hydraulics ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2sem4:
                Toast.makeText(this, "Item 2 Theory of Structures ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item3sem4:
                Toast.makeText(this, "Item 3 Geo-Technical Engineering ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item4sem4:
                Toast.makeText(this, "Item 4 Building Planning and Drawing", Toast.LENGTH_SHORT).show();
                return true;





            case R.id.item1sem5:
                Toast.makeText(this, "Item 1 Water Resource Engineering", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2sem5:
                Toast.makeText(this, "Item 2 Design of Steel and RCC Structure ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item3sem5:
                Toast.makeText(this, "Item 3 Estimating and Costing ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item4sem5:
                Toast.makeText(this, "Item 4 Public Health Engineering", Toast.LENGTH_SHORT).show();
                return true;



            case R.id.item1sem6:
                Toast.makeText(this, "Item 1 Contracts and Accounts", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2sem6:
                Toast.makeText(this, "Item 2 Emerging Trends in Civil Engineering ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item3sem6:
                Toast.makeText(this, "Item 3 Management ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item4sem6:
                Toast.makeText(this, "Item 4 Maintenance and Repairs of Structures", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return false;
        }


    }
}