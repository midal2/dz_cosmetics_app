package dz.cosmetics.app.main;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import dz.cosmetics.app.wowcosmetics.R;

public class CosmeticsMainActivity extends AppCompatActivity {

    RelativeLayout relFavorite, relUnFavorite, relRequest, relNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cosmetics_main);

        relFavorite = findViewById(R.id.relayfavorite);
        relUnFavorite = findViewById(R.id.relayUnfavorite);
        relRequest = findViewById(R.id.relayRequest);
        relNews = findViewById(R.id.relayNews);

        relFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "최애화장품 구현쫌!!!!!", Snackbar.LENGTH_LONG).show();
            }
        });

        relUnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "극혐화장품 구현쫌", Toast.LENGTH_LONG).show();
            }
        });

        relRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "추천화장품 구현쫌!!!!!", Snackbar.LENGTH_LONG).setAction("눌러봐", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "누르라고 누르냐..ㅋㅋㅋㅋ", Toast.LENGTH_LONG).show();
                    }
                }).show();
            }
        });

        relNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "뉴스 구현쫌!!!!!", Snackbar.LENGTH_LONG).show();
            }
        });

    }
}
