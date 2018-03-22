package com.example.hieuminh.demoindicator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    TypingCustomView myView;
    Button btnClick;
    private boolean hasRun = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         myView = findViewById(R.id.myView);
          btnClick = findViewById(R.id.btnClick);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hasRun){
                    btnClick.setText("Ấn tao để chạy tiếp");
                    myView.stopAnimation();
                    hasRun = false;
                } else {
                    btnClick.setText("Ấn tao để dừng lại");
                    myView.startAnimation();
                    hasRun = true;
                }
            }
        });
//        myView.startAnimation();
    }
}
