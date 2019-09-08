package th.ac.su.sc.midterm07590507;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button loginButton = findViewById(R.id.button_edit);
        MyListener Listener = new MyListener();
        loginButton.setOnClickListener(Listener);


    }

    private class MyListener implements OnClickListener{

        @Override
        public void onClick(View view) {
            EditText user = findViewById(R.id.username_edit);
            EditText password = findViewById(R.id.password_edit);

            String InputUser = user.getText().toString();
            String InputPassword = password.getText().toString();

            if(InputUser.equals("aaa") && InputPassword.equals("111")){
                Intent intent = new Intent(LoginActivity.this,Profile_std.class);
                intent.putExtra("user","Nung'ning Nantawan");
                startActivity(intent);
                finish();
            }else if(InputUser.equals("bbb") && InputPassword.equals("222")){
                Intent intent = new Intent(LoginActivity.this,Profile_teach.class);
                intent.putExtra("user","Promlert Lovichit");
                startActivity(intent);
                finish();
            }else{
                final AlertDialog.Builder dialog = new AlertDialog.Builder(LoginActivity.this);
                dialog.setTitle("Error");
                dialog.setMessage(R.string.Invalid);

                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });

                dialog.show();
            }
        }
    }
}
