package in.silive.happyb_day.Activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import in.silive.happyb_day.Fragments.BestWishes;
import in.silive.happyb_day.Fragments.NavigationDrawer;
import in.silive.happyb_day.Fragments.TeacherLikeYou;
import in.silive.happyb_day.Fragments.WeUpto;
import in.silive.happyb_day.R;

public class MainActivity extends AppCompatActivity implements NavigationDrawer.NavigationDrawerListener {
    Toolbar mToolbar;
    NavigationDrawer navigationDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mToolbar.setTitle("Happy Birthday");
        navigationDrawer = (NavigationDrawer) getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        navigationDrawer.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), mToolbar);
        navigationDrawer.setDrawerListener(this);
        displayView(0);
    }

    @Override
    public void onDrawerItemSelected(View view, int position) {
        displayView(position);

    }

    private void displayView(int position) {
        Fragment fragment = null;
        String title = getString(R.string.app_name);
        switch (position) {
            case 0:
                fragment = new BestWishes();
                title = "Best wishes for you";
                break;
            case 1:
                fragment = new TeacherLikeYou();
                title = "A Teacher Like You";
                break;
            case 2:
                fragment = new WeUpto();
                title = "What are we up to";
                break;
            default:
                break;
        }

        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_body, fragment);
            fragmentTransaction.commit();

            // set the toolbar title
            getSupportActionBar().setTitle(title);
        }
    }
}
