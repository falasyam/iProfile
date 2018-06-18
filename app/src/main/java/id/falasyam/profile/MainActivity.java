package id.falasyam.profile;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private Toolbar tb;
    private DrawerLayout dl;
    private NavigationView nv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar();
    }

    private void Toolbar(){
        tb = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(tb);
        tb.setTitle("Profile");
        tb.setNavigationIcon(R.drawable.ic_menu);

        //Drawer Layout

        dl = (DrawerLayout) findViewById(R.id.drawer);
        dl.setDrawerListener(new ActionBarDrawerToggle(this, dl, R.string.nv_open, R.string.nv_close));

        //Navigation View
        nv = (NavigationView) findViewById(R.id.navigation_view);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.isChecked()) item.setChecked(false);
                else item.setChecked(true);

                dl.closeDrawers();

                switch (item.getItemId()) {
                    case R.id.about:
                        default:
                        return true;
                }
            }
        });

    }
}
