package com.pradeep.nanodegree.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener {

    Button btnSpotifyStreamer, btnScoresApp, btnLibraryApp, btnBuildItBigger, btnXyzReader, btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSpotifyStreamer = (Button) findViewById(R.id.btnSpotifyStreamer);
        btnScoresApp = (Button) findViewById(R.id.btnScoresApp);
        btnLibraryApp = (Button) findViewById(R.id.btnLibraryApp);
        btnBuildItBigger = (Button) findViewById(R.id.btnBuildItBigger);
        btnXyzReader = (Button) findViewById(R.id.btnXyzReader);
        btnCapstone = (Button) findViewById(R.id.btnCapstone);

        btnSpotifyStreamer.setOnClickListener(this);
        btnScoresApp.setOnClickListener(this);
        btnBuildItBigger.setOnClickListener(this);
        btnLibraryApp.setOnClickListener(this);
        btnXyzReader.setOnClickListener(this);
        btnCapstone.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSpotifyStreamer:
                makeToast("Spotify Streamer");
                break;
            case R.id.btnScoresApp:
                makeToast("Scores");
                break;
            case R.id.btnLibraryApp:
                makeToast("Library");
                break;
            case R.id.btnBuildItBigger:
                makeToast("Build it Bigger");
                break;
            case R.id.btnXyzReader:
                makeToast("XYZ Reader");
                break;
            case R.id.btnCapstone:
                makeToast("Capstone");
                break;

        }
    }

    public void makeToast(String input) {
        String textToDisplay = "This button will launch my " + input + " App!";
        Toast.makeText(getApplicationContext(), textToDisplay, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
