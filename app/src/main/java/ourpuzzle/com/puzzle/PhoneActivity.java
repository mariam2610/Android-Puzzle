package ourpuzzle.com.puzzle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PhoneActivity extends AppCompatActivity {

    private EditText Phone_Number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);

        Phone_Number = (EditText)findViewById(R.id.et_number);

        Phone_Number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check(Phone_Number.getText().toString());
            }
        });
    }

    private void check(String number) {
        if ((number.equals("9657204747"))) {
            Intent intent = new Intent(PhoneActivity.this, MainActivity.class);
            startActivity(intent);
        }

    }
}
