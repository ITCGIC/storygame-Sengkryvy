package gictitc.storygame.storygame.sci_fi_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import gictitc.storygame.storygame.MainActivity;
import gictitc.storygame.storygame.R;

public class SciFiStart extends AppCompatActivity {
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sci_fi_start);
    }

    public void Next(View view) {
        btnNext = (Button)view;
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}
