package com.example.collageapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.collageapp.ebook.EbookActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView bottomNavigationView;
    private NavController navController;


    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private NavigationView navigationView;

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private int checkedItem;
    private String selected;

    private final String CHECKEDITEM = "checked_item";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        sharedPreferences = this.getSharedPreferences("theme", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();



        switch (getCheckedItem()){

            case 0:

                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
                break;
            case 1:
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

                break;
            case 2:
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

                break;

        }



        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        navController = Navigation.findNavController(this, R.id.frame_layout);

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigation_view);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.start, R.string.close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        navigationView.setNavigationItemSelectedListener(this);

        NavigationUI.setupWithNavController(bottomNavigationView, navController);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (toggle.onOptionsItemSelected(item)){

            return true;
        }

       // this if  are used to show menu
        int id = item.getItemId();
        if (id == R.id.sub){

            Intent inte = new Intent(MainActivity.this,menu1.class);
            startActivity(inte);

        }  if (id == R.id.sub2){

            Intent inte = new Intent(MainActivity.this,menu2.class);
            startActivity(inte);

        }  if (id == R.id.sub3){

            Intent inte = new Intent(MainActivity.this,menu3.class);
            startActivity(inte);

        }
        return super.onOptionsItemSelected(item);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

                case R.id.navigation_developer:

                    Intent int1 = new Intent(MainActivity.this, Developer_page.class);
                    startActivity(int1);

                   break;


                case R.id.navigation_video:

                    Intent int2 = new Intent(MainActivity.this, VIdeo_Lectures.class);
                    startActivity(int2);

                break;

                case R.id.navigation_rate:

                    Uri urI = Uri.parse("https://play.google.com/store/apps/details?id="+getApplicationContext().getPackageName());
                    Intent ii = new Intent(Intent.ACTION_VIEW,urI);
                    try {
                        startActivity(ii);
                    } catch (Exception e) {
                        Toast.makeText(this, "Unable to Open this App is not Uploaded on PlatStore"+e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                    break;


                case R.id.navigation_ebook:

                    startActivity(new Intent(this, EbookActivity.class));


                break;

                case R.id.navigation_theme:

                    showDialog();
                Toast.makeText(this, "Themes", Toast.LENGTH_SHORT).show();
                break;


                case R.id.navigation_website:


                    gotoURL("https://sspitpolytechnic.org/");
                break;


                case R.id.navigation_share:

                    try {

                        Intent i = new Intent(Intent.ACTION_SEND);
                        i.setType("text/plain");
                        i.putExtra(Intent.EXTRA_SUBJECT, "SSP Poly");
                        i.putExtra(Intent.EXTRA_TEXT,"https://play.google.com/store/apps/details?id="+getApplicationContext().getPackageName());
                        startActivity(Intent.createChooser(i,"Share With"));

                    }catch (Exception e){

                        Toast.makeText(this, "Unable to share this App", Toast.LENGTH_SHORT).show();


                    }



                break;
        }

        return true;
    }

    private void showDialog() {

        String[] theme = this.getResources().getStringArray(R.array.theme);

        MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(this);
        builder.setTitle("Select Theme");
        builder.setSingleChoiceItems(R.array.theme, getCheckedItem(), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            selected = theme[i];
            checkedItem = i;

            }
        });


        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                if (selected == null){

                    selected = theme[i];
                    checkedItem = i;
                }
                switch (selected){

                    case "System Default":

                        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
                        break;
                    case "Dark":
                        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

                        break;
                    case "Light":
                        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

                        break;

                }
                setCheckedItem(checkedItem);


            }
        });

        builder.setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                dialogInterface.dismiss();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();


    }

    private int getCheckedItem(){

        return sharedPreferences.getInt(CHECKEDITEM,0);

    }
    private void setCheckedItem(int i){

        editor.putInt(CHECKEDITEM, i);
        editor.apply();

    }

    private void gotoURL(String s) {

        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);

        }else

        super.onBackPressed();
    }
}