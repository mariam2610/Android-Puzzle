package ourpuzzle.com.puzzle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


public class SecondActivity extends AppCompatActivity {
    private int backpress;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_second);
    }

   /* @Override
    public void onBackPressed () {
        backpress += 1;
        Toast.makeText (getApplicationContext (), "Press Back again to Exit", Toast.LENGTH_SHORT).show ();
        //this.finish ();
        Intent intent = new Intent (SecondActivity.this,loginactivity.class);
        startActivity(intent;

     //    if (backpress > 1) this.finish ();
    }*/

    }
