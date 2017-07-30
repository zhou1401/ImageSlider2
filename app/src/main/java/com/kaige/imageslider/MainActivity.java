package com.kaige.imageslider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.Indicators.PagerIndicator;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;

public class MainActivity extends AppCompatActivity {

    private SliderLayout sliderLayout;
    private PagerIndicator indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sliderLayout = (SliderLayout) findViewById(R.id.slider);

        indicator = (PagerIndicator)findViewById(R.id.custom_indicator);
        initSlider();
    }

    private void initSlider() {
        TextSliderView textSliderView = new TextSliderView(this);
        textSliderView
                .description("新品推荐")
                .image("http://m.360buyimg.com/mobilecms/s300x98_jfs/t2416/102/20949846/13425/a3027ebc/55e6d1b9Ne6fd6d8f.jpg");

        sliderLayout.addSlider(textSliderView);
        textSliderView.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {

                Toast.makeText(getApplicationContext(), "新品推荐", Toast.LENGTH_LONG).show();

            }
        });


        TextSliderView textSliderView2 = new TextSliderView(this);
        textSliderView2.image("http://m.360buyimg.com/mobilecms/s300x98_jfs/t1507/64/486775407/55927/d72d78cb/558d2fbaNb3c2f349.jpg");
        textSliderView2.description("时尚男装");
        textSliderView2.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {

                Toast.makeText(getApplicationContext(), "时尚男装", Toast.LENGTH_LONG).show();

            }
        });

        TextSliderView textSliderView3 = new TextSliderView(this);
        textSliderView3.image("http://m.360buyimg.com/mobilecms/s300x98_jfs/t1363/77/1381395719/60705/ce91ad5c/55dd271aN49efd216.jpg");
        textSliderView3.description("家电秒杀");
        textSliderView3.setOnSliderClickListener(new BaseSliderView.OnSliderClickListener() {
            @Override
            public void onSliderClick(BaseSliderView baseSliderView) {

                Toast.makeText(getApplicationContext(), "家电秒杀", Toast.LENGTH_LONG).show();

            }
        });

        sliderLayout.addSlider(textSliderView);
        sliderLayout.addSlider(textSliderView2);
        sliderLayout.addSlider(textSliderView3);

        sliderLayout.setCustomIndicator(indicator);
        sliderLayout.setCustomAnimation(new DescriptionAnimation());
        sliderLayout.setPresetTransformer(SliderLayout.Transformer.RotateUp);
        sliderLayout.setDuration(3000);

        sliderLayout.addOnPageChangeListener(new ViewPagerEx.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {
            }

            @Override
            public void onPageSelected(int i) {
            }
            @Override
            public void onPageScrollStateChanged(int i) {
            }
        });


    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        sliderLayout.stopAutoCycle();
    }
    //sfjkdfjd
}
