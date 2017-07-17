package mm.com.thetpaingsoe.busticketapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MoreDetail extends AppCompatActivity {

    RadioGroup rdGroup;
    TextView show;
    Button btncheck,btnpur;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_detail);
        rdGroup = (RadioGroup)findViewById(R.id.rdgroup);
        show = (TextView)findViewById(R.id.txt_view_items);
        btncheck = (Button)findViewById(R.id.btn_check);
        btnpur = (Button)findViewById(R.id.btn_purchase);
        btncheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (rdGroup.getCheckedRadioButtonId()-2131624100){
                    case 0 : show.setText("Cost 3500ks for 1 ticket");
                        break;
                    case 1 :show.setText("Cost 7000ks for 2 tickets");
                        break;
                    case 2 : show.setText("Cost 10500ks for 3 tickets");
                        break;
                    case 3 :show.setText("Cost 14000ks for 4 tickets");
                        break;
                    case 4 : show.setText("Cost 17500ks for 5 tickets");
                        break;
                    case 5 :show.setText("Cost 21000ks for 6 tickets");
                        break;
                    case 6 : show.setText("Cost 24500ks for 7 tickets");
                        break;
                    case 7 :show.setText("Cost 28000ks for 8 tickets");
                        break;
                    case 8 :show.setText("Cost 31500ks for 9 tickets");
                        break;
                }

            }
        });
        btnpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Please wait reply from sever",Toast.LENGTH_LONG).show();
            }
        });




        GridView gridview = (GridView) findViewById(R.id.grid_view);
        gridview.setAdapter(new BusChairAdapter(this));

    }
}
