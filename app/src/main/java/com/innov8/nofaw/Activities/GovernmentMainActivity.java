package com.innov8.nofaw.Activities;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.innov8.nofaw.Fragments.GovernmentFragments.HomeFragment;
import com.innov8.nofaw.Fragments.GovernmentFragments.MapFragment;
import com.innov8.nofaw.Fragments.GovernmentFragments.ProfileFragment;
import com.innov8.nofaw.Fragments.GovernmentFragments.ReportsFragment;
import com.innov8.nofaw.MapsActivity;
import com.innov8.nofaw.R;
import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;
import com.yarolegovich.slidingrootnav.SlidingRootNavBuilder;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GovernmentMainActivity extends AppCompatActivity {
    @BindView(R.id.main_viewpager)
    ViewPager viewPager;

    ArrayList<Fragment> fragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_government_main);
        ButterKnife.bind(this);

        SpaceNavigationView spaceNavigationView = (SpaceNavigationView) findViewById(R.id.space);
        spaceNavigationView.initWithSaveInstanceState(savedInstanceState);
        spaceNavigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_home_black_24dp));
        spaceNavigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_report_black_24dp));
        spaceNavigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_map_black_24dp));
        spaceNavigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_account_circle_black_24dp));
        spaceNavigationView.setSpaceOnClickListener(new SpaceOnClickListener() {
            @Override
            public void onCentreButtonClick() {

            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {
                if(itemIndex!=2)
                viewPager.setCurrentItem(itemIndex);
                else startActivity(new Intent(getApplicationContext(), MapsActivity.class));
            }

            @Override
            public void onItemReselected(int itemIndex, String itemName) {

            }
        });

        fragments.add(new HomeFragment());
        fragments.add(new ReportsFragment());
        fragments.add(new MapFragment());
        fragments.add(new ProfileFragment());

        // Setting viewpager adapter
        PagerAdapter adapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        new SlidingRootNavBuilder(this)
                .withSavedState(savedInstanceState) //If you call the method, layout will restore its opened/closed state
                .withContentClickableWhenMenuOpened(false)
                .withRootViewElevationPx(5)
                .withRootViewScale(0.65f)
                .withToolbarMenuToggle((Toolbar) findViewById(R.id.toolbar2))
                .withMenuLayout(R.layout.menu_drawer)
                .inject();

    }

    private class MyPagerAdapter extends FragmentPagerAdapter {
        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public Fragment getItem(int pos) {
            return fragments.get(pos>3 ? 3 : pos);
        }
        @Override
        public int getCount() {
            return fragments.size();
        }
    }
}
