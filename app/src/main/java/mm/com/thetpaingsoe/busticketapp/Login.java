package mm.com.thetpaingsoe.busticketapp;

import android.content.Intent;
import android.os.Bundle;
<<<<<<< HEAD
import android.support.v7.app.AppCompatActivity;
=======
>>>>>>> 3ad9437daf05ecfceb781ac203c8e9539808e294
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private Button click;
    private EditText phone,pass;
    String input_phone,input_pass;
    private Button register;
    private CheckBox show_pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    click=(Button)findViewById(R.id.loginBtn);
    phone=(EditText)findViewById(R.id.login_phone);
    pass=(EditText)findViewById(R.id.login_password);
    show_pass = (CheckBox)findViewById(R.id.show_hide_password);
    register=(Button)findViewById(R.id.btnregister);


    register.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent i=new Intent(Login.this,User_Register.class);
            startActivity(i);

        }
    });




    click.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            input_phone=phone.getText().toString();
            input_pass=pass.getText().toString();
                if(input_phone.equalsIgnoreCase("106")&& input_pass.equalsIgnoreCase("admin")){
                    Intent i=new Intent(Login.this,MainActivity.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(getApplicationContext(),"Please enter correct email and password",Toast.LENGTH_LONG).show();
                }

        }
    });

    show_pass.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
            if (!checked){
                    pass.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            else {
                pass.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            }
        }
    });
    }
}
