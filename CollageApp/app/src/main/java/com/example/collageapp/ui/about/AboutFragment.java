package com.example.collageapp.ui.about;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.collageapp.R;

import java.util.ArrayList;
import java.util.List;


public class AboutFragment extends Fragment {

    private ViewPager viewPager;
    private BranchAdapter adapter;
    private List<BranchModel>list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);



        list = new ArrayList<>();
        list.add(new BranchModel(R.drawable.ic_comp, "Computer Engineering", "Compuer Diploma in Engineering Now the institute stands tall among its contemporaries and boosts of a reputation that it has been able to maintain over these years"));
        list.add(new BranchModel(R.drawable.ic_mech, "Mechanical Engineering", "Mechanical Diploma in Engineering Now the institute stands tall among its contemporaries and boosts of a reputation that it has been able to maintain over these years"));
        list.add(new BranchModel(R.drawable.ic_civil, "Civil Engineering", "Civil Diploma in Engineering Now the institute stands tall among its contemporaries and boosts of a reputation that it has been able to maintain over these years"));
        list.add(new BranchModel(R.drawable.ic_elec, "Electrical Engineering", "Electrical  Diploma in Engineering Now the institute stands tall among its contemporaries and boosts of a reputation that it has been able to maintain over these years"));

        adapter = new BranchAdapter(getContext(), list);

        viewPager = view.findViewById(R.id.viewPager);

        viewPager.setAdapter(adapter);

        ImageView imageView = view.findViewById(R.id.collage_image);

        /*Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/my-collage-app-ba03f.appspot.com/o/Upload%20Image%2FIMG_20210408_153705.JPG?alt=media&token=9b4c3d07-3838-41b3-8f3c-e3c69fe59ad1")
                .into(imageView);*/
        return view;
    }
}