package com.example.lectures;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.Home);

    }

    HomeFragment homeFragment = new HomeFragment();
    HomeworkFragment homeworkFragment = new HomeworkFragment();
    ExaminationFragment examinationFragment = new ExaminationFragment();
    NoticeFragment noticeFragment = new NoticeFragment();
    AccountFragment accountFragment = new AccountFragment();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.Home:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();
                return true;

            case R.id.Homework:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, homeworkFragment).commit();
                return true;

            case R.id.Examination:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, examinationFragment).commit();
                return true;

            case R.id.Notice:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, noticeFragment).commit();
                return true;

            case R.id.Account:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, accountFragment).commit();
                return true;
        }
        return false;
    }
}