package com.example.lenovo.viewpagerapp;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends FragmentActivity {

    private ViewPager _mViewPager;
    private ViewPagerAdapter _adapter;
    private Button _btn1, _btn2, _btn3;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // sliding screen create FragmentOne,FragmentTwo,FragmentThree
        setUpView();

        //setting buttons size and text with corresponding fragment
        setButtonWithFragment();


    }


    private void setUpView() {
        _mViewPager = (ViewPager) findViewById(R.id.viewPager);
        _adapter = new ViewPagerAdapter(getSupportFragmentManager());
        _mViewPager.setAdapter(_adapter);
        _mViewPager.setCurrentItem(0);
        initButton();
    }

    private void setButtonWithFragment() {
        _mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageScrollStateChanged(int position) {
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {
            }

            @Override
            public void onPageSelected(int position) {

                btnAction(position);
            }

        });

    }

    //According to the particular fragment position it sets all the three button
    // with the corresponding height,width and text
    private void btnAction(int action) {
        switch (action) {
            case 0:
                setButton(_btn1, "1", 40, 40);
                setButton(_btn2, "", 20, 20);
                setButton(_btn3, "", 20, 20);
                break;

            case 1:
                setButton(_btn2, "2", 40, 40);
                setButton(_btn1, "", 20, 20);
                setButton(_btn3, "", 20, 20);
                break;

            case 2:
                setButton(_btn3, "3", 40, 40);
                setButton(_btn1, "", 20, 20);
                setButton(_btn2, "", 20, 20);
                break;
        }
    }

    // Inisialize buttons and Bydefault setting buttons height,width and text
    private void initButton() {
        _btn1 = (Button) findViewById(R.id.btn_1);
        _btn2 = (Button) findViewById(R.id.btn_2);
        _btn3 = (Button) findViewById(R.id.btn_3);
        setButton(_btn1, "1", 40, 40);
        setButton(_btn2, "", 20, 20);
        setButton(_btn3, "", 20, 20);
    }

    //setting button with the corresponding height,width and text
    private void setButton(Button btn, String text, int h, int w) {
        btn.setWidth(w);
        btn.setHeight(h);
        btn.setText(text);
    }
}
