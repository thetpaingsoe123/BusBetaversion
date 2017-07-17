package mm.com.thetpaingsoe.busticketapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
<<<<<<< HEAD

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;

import java.util.HashMap;
=======
import android.widget.Toast;
>>>>>>> 3ad9437daf05ecfceb781ac203c8e9539808e294

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,
        RecyclerAdapter.OnItemClickListener{

    @BindView(R.id.rv_bus_list)
    RecyclerView rvBusList;

    private ListView listV;
    private String[] arg;
    private NavListAdapter listadapter;
<<<<<<< HEAD
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

=======


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       //List view for nav
>>>>>>> 3ad9437daf05ecfceb781ac203c8e9539808e294
        listV = (ListView)findViewById(R.id.listview);
        arg = getResources().getStringArray(R.array.items);
        listadapter = new NavListAdapter(getApplicationContext(),arg);
        listV.setAdapter(listadapter);
        listV.setOnItemClickListener(new navchoice());
<<<<<<< HEAD

=======
>>>>>>> 3ad9437daf05ecfceb781ac203c8e9539808e294
        ButterKnife.bind(this, this);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        rvBusList.setLayoutManager(new LinearLayoutManager(this));
        RecyclerAdapter adapter = new RecyclerAdapter(this);
        rvBusList.setAdapter(adapter);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main_drawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.nav_uploaduser){
            Intent upload = new Intent(MainActivity.this,UploadProfile.class);
            startActivity(upload);
        }
        return true;
    }

    @Override
    public void onItemClick(String name) {
        startActivity(BusListActivity.newIntent(this,name));
    }

    public class navchoice implements AdapterView.OnItemClickListener{

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
<<<<<<< HEAD
            int choice = position;
=======
             int choice = position;
>>>>>>> 3ad9437daf05ecfceb781ac203c8e9539808e294
            if (choice == 0){
                Intent upload = new Intent(MainActivity.this,UploadProfile.class);
                startActivity(upload);
            }
            else if (choice == 2){
                Intent upload = new Intent(MainActivity.this,MoreDetail.class);
                startActivity(upload);
            }
        }
    }
}
