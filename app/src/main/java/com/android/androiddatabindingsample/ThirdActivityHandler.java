package com.android.androiddatabindingsample;

import android.util.Log;
import android.view.View;
import android.widget.Button;


public class ThirdActivityHandler {

    public void onClickButton(View view) {
        Log.d("ThirdActivityHandler", "onClickButton");
        if(view instanceof Button){
            int times = Integer.parseInt(view.getTag().toString());
            times += 1;
            ((Button) view).setText("Clicked " + times + " times");
            view.setTag(times);
        }
    }

}
