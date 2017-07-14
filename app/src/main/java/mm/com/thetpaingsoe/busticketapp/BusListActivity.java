package mm.com.thetpaingsoe.busticketapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BusListActivity extends AppCompatActivity implements BusListAdapter.OnBusClickListener {

    @BindView(R.id.rv_bus_list)
    RecyclerView rvBusList;

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    private String mBusPath;
    private String[] busNames;
    private BusListAdapter mBusListAdapter;

    public static Intent newIntent(Context context, String busPath) {
        Intent intent = new Intent(context, BusListActivity.class);
        intent.putExtra("bus_path", busPath);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_list);
        ButterKnife.bind(this, this);
        setSupportActionBar(toolbar);

        mBusListAdapter = new BusListAdapter(this);
        rvBusList.setLayoutManager(new LinearLayoutManager(this));
        rvBusList.setAdapter(mBusListAdapter);

        mBusPath = getIntent().getStringExtra("bus_path");
        switch (mBusPath) {
            case "Pathein-Yangon":
                busNames = getResources().getStringArray(R.array.pathein_yangon);
                break;
            case "Pathein-Naypyidaw":
                busNames=getResources().getStringArray(R.array.pathein_Naypyidaw);
                break;
            case "Pathein-Mandalay":
                busNames=getResources().getStringArray(R.array.pathain_Mandaly);
                break;
            case "Pathein-Maylamyaing":
                busNames=getResources().getStringArray(R.array.pathain_mawlamyaing);
                break;
            case"Pathein-Chaungthar":
                busNames=getResources().getStringArray(R.array.pathain_chaungthar);
                break;
            case  "Pathein-NgwaSaung":
                busNames=getResources().getStringArray(R.array.pathain_ngwesaung);
                break;
            case "Pathein-MyaungMya":
                busNames=getResources().getStringArray(R.array.pathain_Myaungmya);
                break;
            case "Pathein-Pyay":
                busNames=getResources().getStringArray(R.array.pathain_pyay);
                break;
            case "Pathein-Taungkyi":
                busNames=getResources().getStringArray(R.array.pathain_taungkyi);
                break;
            case  "Pathein-Hintada":
                busNames=getResources().getStringArray(R.array.pathain_hintada);
                break;

        }

        if (mBusPath != null && busNames != null) {
            mBusListAdapter.setBusPath(mBusPath);
            mBusListAdapter.setBusNames(busNames);
        }
    }

    @Override
    public void onBusClick(String busName) {
        Toast.makeText(this, "Clicked: " + busName, Toast.LENGTH_SHORT).show();
    }
}
