package gictitc.storygame.storygame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import gictitc.storygame.storygame.drama_activity.DramaStart;
import gictitc.storygame.storygame.horror_activity.HorrorStart;
import gictitc.storygame.storygame.sci_fi_activity.SciFiStart;

public class MainActivity extends AppCompatActivity {

    Button btnHorror, btnDrama, btnSciFi;

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

    public void Drama(View view) {
        btnDrama = (Button)view;
        Intent i = new Intent(getApplicationContext(), DramaStart.class);
        startActivity(i);
    }

    public void SciFi(View view) {
        btnSciFi = (Button)view;
        Intent i = new Intent(getApplicationContext(), SciFiStart.class);
        startActivity(i);
    }
}
