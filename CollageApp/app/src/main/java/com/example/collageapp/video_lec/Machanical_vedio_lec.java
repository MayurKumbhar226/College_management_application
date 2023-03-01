package com.example.collageapp.video_lec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.example.collageapp.R;

public class Machanical_vedio_lec extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machanical_vedio_lec);

        setTitle("Machanical Video Lecturs");

    }
    public void showPopup(View v) {

        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_machanical_sem1);
        popup.show();
    }

    public void showPopup2(View v) {

        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_machanical_sem2);
        popup.show();
    }

    public void showPopup3(View v) {

        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_machanical_sem3);
        popup.show();
    }

    public void showPopup4(View v) {

        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_machanical_sem4);
        popup.show();
    }

    public void showPopup5(View v) {

        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_machanical_sem5);
        popup.show();
    }

    public void showPopup6(View v) {

        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_machanical_sem6);
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
                Toast.makeText(this, "Item 3 Engineering Drawing ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item4sem2:
                Toast.makeText(this, "Item 4 Machanical Engineering Workshop ", Toast.LENGTH_SHORT).show();
                return true;




            case R.id.item1sem3:
                Toast.makeText(this, "Item 1 Strength of Material ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2sem3:
                Toast.makeText(this, "Item 2 Basic Electrical and Thermal ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item3sem3:
                Toast.makeText(this, "Item 3 Machanical Workung Drawing ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item4sem3:
                Toast.makeText(this, "Item 4 Thermal Engineering", Toast.LENGTH_SHORT).show();
                return true;





            case R.id.item1sem4:
                Toast.makeText(this, "Item 1 Theory of Machines ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2sem4:
                Toast.makeText(this, "Item 2 Theory of StructuresMachanical Engineering Measurements ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item3sem4:
                Toast.makeText(this, "Item 3 Computer Aideed Studies ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item4sem4:
                Toast.makeText(this, "Item 4 Manufacturing Processes", Toast.LENGTH_SHORT).show();
                return true;





            case R.id.item1sem5:
                Toast.makeText(this, "Item 1 Management", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2sem5:
                Toast.makeText(this, "Item 2 Power Engineering and Refrigeration", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item3sem5:
                Toast.makeText(this, "Item 3 Advanced Manufacturing Processes", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item4sem5:
                Toast.makeText(this, "Item 4 Elements of Machanical Design", Toast.LENGTH_SHORT).show();
                return true;



            case R.id.item1sem6:
                Toast.makeText(this, "Item 1 Emerging Trends in Machanical Engineering", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item2sem6:
                Toast.makeText(this, "Item 2 Industrial Hydraulics and Pneumatics", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item3sem6:
                Toast.makeText(this, "Item 3 Automobial Engineering ", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item4sem6:
                Toast.makeText(this, "Item 4 Industrial Engineering and Quality Control", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return false;
        }


    }
}