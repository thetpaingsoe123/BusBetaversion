package mm.com.thetpaingsoe.busticketapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private Button click;
    private EditText email,pass;
    String input_email,input_pass;
    private Button register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    click=(Button)findViewById(R.id.loginBtn);
    email=(EditText)findViewById(R.id.login_email);
    pass=(EditText)findViewById(R.id.login_password);

    register=(Button)findViewById(R.id.btnregister);

    register.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent i=new Intent(Login.this,User_Register.class);
            startActivity(i);

        }
    });

     input_email=email.getText().toString();
     input_pass=pass.getText().toString();

    click.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

                Intent i=new Intent(Login.this,MainActivity.class);
                startActivity(i);


        }
    });


    }
}
