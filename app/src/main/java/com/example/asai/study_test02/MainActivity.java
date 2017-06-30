package com.example.asai.study_test02;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v)
    {
        switch (v.getId())
        {
            //タッチされたボタンがお知らせの場合
            case R.id.Button01:

                Intent intent = new Intent(MainActivity.this, announce.class);
                startActivity(intent);
                break;
            case R.id.Button02:

                intent = new Intent(MainActivity.this, production.class);
                startActivity(intent);
                break;
            case R.id.Button03:

                intent = new Intent(MainActivity.this, StageEvent.class);
                startActivity(intent);
                break;
            case R.id.Button04:

                intent = new Intent(MainActivity.this, map.class);
                startActivity(intent);
                break;
            case R.id.Button05:

                intent = new Intent(MainActivity.this, plan.class);
                startActivity(intent);
                break;
            case R.id.Button06:

//                SharedPreferencesJson sharedPreferencesJson = new SharedPreferencesJson();
//                favoriteIDList = sharedPreferencesJson.getFavoriteIDList(this);
//                if(favoriteIDList.size() != 0) {
//                    intent = new Intent(MainActivity.this, favorite.class);
//                }else {
//                    intent = new Intent(MainActivity.this, No_favorite.class);
//                }

                intent = new Intent(MainActivity.this, favorite.class);
                startActivity(intent);
                break;
        }

    }
}
