package edu.tecii.android.fonts;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Typeface miPropiaTypeFace = Typeface.createFromAsset(getAssets(), "fonts/stocky.ttf");
        TextView helloPoker = (TextView)findViewById(R.id.poker);
        helloPoker.setTypeface(miPropiaTypeFace);
    }
}
