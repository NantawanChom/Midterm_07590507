package th.ac.su.sc.midterm07590507;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Profile_std extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_std);

        Intent intent = getIntent();
        String user = intent.getStringExtra("user");

        Toast t = Toast.makeText(Profile_std.this ,R.string.welcome + user, Toast.LENGTH_SHORT);
        t.show();

    }
}
