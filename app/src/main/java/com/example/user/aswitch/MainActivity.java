package com.example.user.aswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4;
    Switch swtch;
    ToggleButton tb;
    LinearLayout ll1,ll2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        swtch = (Switch) findViewById(R.id.swtch);
        tb = (ToggleButton) findViewById(R.id.tb);
        ll1 = (LinearLayout) findViewById(R.id.ll1);
        ll2 = (LinearLayout) findViewById(R.id.ll2);


    }

    public void onswtch(View view) {
        if (swtch.isChecked())
            ll1.setBackgroundResource(R.drawable.spongebob);
        else
            ll1.setBackgroundResource(R.drawable.squidward);

        if (tb.isChecked())
            ll2.setBackgroundResource(R.drawable.mrkrab);
        else
            ll2.setBackgroundResource(R.drawable.patrickstar);
    }
}
