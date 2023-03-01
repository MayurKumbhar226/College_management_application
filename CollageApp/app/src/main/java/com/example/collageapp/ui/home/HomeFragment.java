package com.example.collageapp.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.collageapp.R;
import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderLayout;


public class HomeFragment extends Fragment {

    private SliderLayout sliderLayout;
    private ImageView map;

      @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);

        sliderLayout = view.findViewById(R.id.slider);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderLayout.setScrollTimeInSec(1);


        setSliderView();

        map = view.findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openMap();
            }
        });

        return view;
    }

    private void openMap() {

        Uri uri = Uri.parse("geo:0, 0?q=Sharachchandrika suresh patil polytechnic chopda");

        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void setSliderView() {

          for (int i = 0; i< 5; i++)
          {
              DefaultSliderView sliderView = new DefaultSliderView(getContext());

              switch (i) {

                  case 0:
                      sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/my-collage-app-ba03f.appspot.com/o/Upload%20Image%2FIMG_20210408_153705.JPG?alt=media&token=9b4c3d07-3838-41b3-8f3c-e3c69fe59ad1");
                      break;

                  case 1:
                      sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/my-collage-app-ba03f.appspot.com/o/Upload%20Image%2FIMG_20210408_153721.JPG?alt=media&token=296d1323-ca95-473a-b754-921139b4c1f1");
                      break;

                  case 2:
                      sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/my-collage-app-ba03f.appspot.com/o/Upload%20Image%2FIMG_20210408_153734.JPG?alt=media&token=10f832d9-a8cf-427e-8ac5-89948ed54eb1");
                      break;

                  case 3:
                      sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/my-collage-app-ba03f.appspot.com/o/Upload%20Image%2FIMG_20210408_153754.JPG?alt=media&token=15bef026-1861-4d34-af16-b8d5fb1126b8");
                      break;

                  case 4:
                      sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/my-collage-app-ba03f.appspot.com/o/Upload%20Image%2FIMG_20210408_153812.JPG?alt=media&token=19f3f5c2-54ab-433e-8af6-78da865c31d4");
                      break;

              }
              sliderView.setImageScaleType(ImageView.ScaleType.FIT_XY);

             sliderLayout.addSliderView(sliderView);
          }

    }
}