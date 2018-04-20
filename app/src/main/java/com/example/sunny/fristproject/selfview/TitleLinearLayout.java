package com.example.sunny.fristproject.selfview;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.sunny.fristproject.R;

/**
 * Created by sunny on 2018/4/18.
 */

public class TitleLinearLayout extends LinearLayout {

    public TitleLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.activity_base,this);
        Button btn_cancel = (Button) findViewById(R.id.btn_cancel);
        Button btn_next = (Button) findViewById(R.id.btn_next);
        btn_cancel.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)getContext()).finish();
            }
        });
        btn_next.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"下一步",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
