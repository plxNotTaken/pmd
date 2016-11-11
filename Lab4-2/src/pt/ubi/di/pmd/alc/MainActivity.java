package pt.ubi.di.pmd.alc;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity
{

    public final String Log_TAG = getClass().getSimpleName();
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void onStart() {
        super.onStart();
        Log.i(Log_TAG, "onStart() method was called");
    }

    public void onResume() {
        super.onResume();
        Log.i(Log_TAG, "onResume() method was called");
    }

    public void onPause() {
        super.onPause();
        Log.i(Log_TAG, "onPause() method was called");
    }

    public void onStop() {
        super.onStop();
        Log.i(Log_TAG, "onStop() method was called");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i(Log_TAG, "onDestroy() method was called");
    }
}
