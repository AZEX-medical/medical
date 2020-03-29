package com.example.bottomnavigationbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.Toast;

import com.luseen.spacenavigation.SpaceItem;
import com.luseen.spacenavigation.SpaceNavigationView;
import com.luseen.spacenavigation.SpaceOnClickListener;

public class MainActivity extends AppCompatActivity {
    SpaceNavigationView spaceNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spaceNavigationView = findViewById(R.id.space);
        spaceNavigationView.initWithSaveInstanceState(savedInstanceState);
        spaceNavigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_favorite_black_24dp));
        spaceNavigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_history_black_24dp));
        spaceNavigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_add_black_24dp));
        spaceNavigationView.addSpaceItem(new SpaceItem("", R.drawable.ic_settings_black_24dp));
        spaceNavigationView.setCentreButtonSelectable(true);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new HomeFragment()).commit();
//        spaceNavigationView.setCentreButtonColor(ContextCompat.getColor(this, R.color.red_light));



        spaceNavigationView.setSpaceOnClickListener(new SpaceOnClickListener() {
            @Override
            public void onCentreButtonClick() {
//                Toast.makeText(MainActivity.this, "onCentreButtonClick", Toast.LENGTH_SHORT).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new HomeFragment()).commit();
            }

            @Override
            public void onItemClick(int itemIndex, String itemName) {
//                Toast.makeText(MainActivity.this, itemIndex + " " + itemName, Toast.LENGTH_SHORT).show();
                Fragment selectedFragment = null;
                switch (itemIndex) {
                    case 0:
                        selectedFragment = new FavoriteFragment();
                        break;
                    case 1:
                        selectedFragment = new HistoryFragment();
                        break;
                    case 2:
                        selectedFragment = new AddFragment();
                        break;
                    case 3:
                        selectedFragment = new SettingFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        selectedFragment).commit();

            }

            @Override
            public void onItemReselected(int itemIndex, String itemName) {
//                Toast.makeText(MainActivity.this, itemIndex + " " + itemName, Toast.LENGTH_SHORT).show();
                Fragment selectedFragment = null;
                switch (itemIndex) {
                    case 0:
                        selectedFragment = new FavoriteFragment();
                        break;
                    case 1:
                        selectedFragment = new HistoryFragment();
                        break;
                    case 2:
                        selectedFragment = new SettingFragment();
                        break;
                    case 3:
                        selectedFragment = new AddFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        selectedFragment).commit();
            }
        });
    }
}
