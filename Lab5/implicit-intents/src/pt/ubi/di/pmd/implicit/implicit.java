package pt.ubi.di.pmd.implicit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class implicit extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void sendMessage(View v) {
        Intent iSendMsg = new Intent(Intent.ACTION_SEND);
        iSendMsg.putExtra(Intent.EXTRA_TEXT, "this is the message iam sending");
        iSendMsg.setType("text/plain");
        if (iSendMsg.resolveActivity(getPackageManager()) != null) startActivity(iSendMsg);
    }
}
