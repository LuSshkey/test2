package com.example.a123.shiyan2;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class UC3 extends AppCompatActivity {

    int sign=0;
    ImageView imageView;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uc3);
        imageView=findViewById(R.id.imageView);
        imageView.setSystemUiVisibility(View.INVISIBLE);
        imageView2=findViewById(R.id.imageView2);
        imageView2.setSystemUiVisibility(View.INVISIBLE);
        imageView3=findViewById(R.id.imageView3);
        imageView3.setSystemUiVisibility(View.INVISIBLE);
        imageView4=findViewById(R.id.imageView4);
        imageView4.setSystemUiVisibility(View.INVISIBLE);
        imageView5=findViewById(R.id.imageView5);
        imageView5.setSystemUiVisibility(View.INVISIBLE);

        final Handler mHandler=new Handler();
        Runnable r=new Runnable() {
            @Override
            public void run() {
                if (sign==0){
                    imageView.setVisibility(View.VISIBLE);
                    imageView5.setVisibility(View.INVISIBLE);
                }else if (sign==1){
                    imageView2.setVisibility(View.VISIBLE);
                    imageView.setVisibility(View.INVISIBLE);
                }else if (sign==2){
                    imageView3.setVisibility(View.VISIBLE);
                    imageView2.setVisibility(View.INVISIBLE);
                } else if (sign==3){
                    imageView4.setVisibility(View.VISIBLE);
                    imageView3.setVisibility(View.INVISIBLE);
                } else if (sign==4){
                    imageView5.setVisibility(View.VISIBLE);
                    imageView4.setVisibility(View.INVISIBLE);
                }
                sign=(sign+1)%5;
                mHandler.postDelayed(this, 2000);
            }
        };
        mHandler.postDelayed(r,2000);

    }
}
