package com.haizhi.viewevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "ViewEvent";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        int action = ev.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, "action = ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i(TAG, "action = ACTION_MOVE");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.i(TAG, "action = ACTION_CANCEL");
                break;
            case MotionEvent.ACTION_UP:
                Log.i(TAG, "action = ACTION_UP");
                break;
        }
        return super.dispatchTouchEvent(ev);
    }
}
