package com.sample.foo.databindingsample;

import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by Obaro on 15/08/2016.
 */
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
