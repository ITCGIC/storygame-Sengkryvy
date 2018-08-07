package gictitc.storygame.storygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import gictitc.storygame.storygame.horror_activity.HorrorStart;

public class MainActivity extends AppCompatActivity {

    Button btnHorror;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Horror(View view) {
        btnHorror = (Button)view;
        Intent i = new Intent(getApplicationContext(), HorrorStart.class);
        startActivity(i);
    }
}
