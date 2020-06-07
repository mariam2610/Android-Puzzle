package ourpuzzle.com.puzzle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginactivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;
    private Button Forgot;
    private Object puzzleActivity;
    private int backpress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Name = (EditText)findViewById(R.id.et_name);
        Password = (EditText)findViewById(R.id.et_password);
        Login = (Button)findViewById(R.id.login_button);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check(Name.getText().toString(),Password.getText().toString());
            }
        });


    }

    private void check(String username,String userpassword) {
        checkLogIn cl=new checkLogIn ();
        if ((username.equals("Mariam")) && (userpassword.equals("12345"))) {
            cl.changeSignIn();
            Intent intent = new Intent(loginactivity.this, PuzzleActivity.class);
            startActivity(intent);

        } else if ((username.equals("Pranoti")) && (userpassword.equals("102030"))) {
            cl.changeSignIn();
            Intent intent = new Intent(loginactivity.this, SecPuzzle.class);
            startActivity(intent);

        } else if ((username.equals("Manasi")) && (userpassword.equals("100500"))) {
            cl.changeSignIn();
            Intent intent = new Intent (loginactivity.this, ThirdPuzzle.class);
            startActivity (intent);

        } else {
            Toast.makeText(loginactivity.this, "Please enter correct details", Toast.LENGTH_LONG).show();
        }

    }


    /*@Override
    public void onBackPressed () {
        backpress += 1;
        Toast.makeText (getApplicationContext (),"Press Back again to Exit",Toast.LENGTH_SHORT).show ();
       // this.finish ();
        //Intent intent = new Intent(SecondUser.this,loginactivity.class);
        //startActivity(intent);

        if (backpress > 1) {
            this.finish();

        }

    }*/


    /*private void check(String username,String userpassword) {
        if ((username.equals("Mariam")) && (userpassword.equals("12345"))) {
            Intent intent = new Intent(loginactivity.this, PuzzleActivity.class);
            startActivity(intent);
            PuzzleActivity puzzleActivity = new PuzzleActivity();
            ArrayList<PuzzlePiece> puzzlePieces = puzzleActivity.splitImage();

        } else if ((username.equals("Pranoti")) && (userpassword.equals("102030"))) {
            Intent intent = new Intent(loginactivity.this, PuzzleActivity.class);
            startActivity(intent);
            PuzzleActivity puzzleActivity = new PuzzleActivity();
            ArrayList<PuzzlePiece> puzzlePieces = puzzleActivity.splitImageTwo();

        }
            Toast.makeText(loginactivity.this, "Please enter correct details", Toast.LENGTH_LONG).show();
        }*/

}