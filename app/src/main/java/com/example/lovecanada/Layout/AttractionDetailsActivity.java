package com.example.lovecanada.Layout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.lovecanada.R;
import com.example.lovecanada.models.CanadaAttraction;

import java.util.Objects;

public class AttractionDetailsActivity extends AppCompatActivity {
    private TextView lstDeatils;
    private ImageButton imgBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction_details);
        lstDeatils = findViewById(R.id.lstDeatils);
        imgBtn = findViewById(R.id.imgBtn);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Details ");
        Intent intent = getIntent();
        CanadaAttraction details = intent.getParcelableExtra("attractionDetail");
        int id = details.getPlaceId();
        //lstComplaint.setText(details.getData());

        Log.d("dddddd", String.valueOf(details));
        if(Objects.equals(id, 1)) {
            imgBtn.setBackgroundResource(R.drawable.park1);
        }
        else if(Objects.equals(id, 2)) {
            imgBtn.setBackgroundResource(R.drawable.ab);
        }
        else if(Objects.equals(id, 3)) {
            imgBtn.setBackgroundResource(R.drawable.ac);
        }
        else if(Objects.equals(id, 4)) {
            imgBtn.setBackgroundResource(R.drawable.ad);
        }
        else if(Objects.equals(id, 5)) {
            imgBtn.setBackgroundResource(R.drawable.ae);
        }
        else if(Objects.equals(id, 6)) {
            imgBtn.setBackgroundResource(R.drawable.af);
        }
        else if(Objects.equals(id, 7)) {
            imgBtn.setBackgroundResource(R.drawable.ag);
        }
        else if(Objects.equals(id, 8)) {
            imgBtn.setBackgroundResource(R.drawable.ah);
        }
        else if(Objects.equals(id, 9)) {
            imgBtn.setBackgroundResource(R.drawable.ai);
        }
        else if(Objects.equals(id, 10)) {
            imgBtn.setBackgroundResource(R.drawable.aj);
        }
        else if(Objects.equals(id, 11)) {
            imgBtn.setBackgroundResource(R.drawable.ak);
        }
        else if(Objects.equals(id, 12)) {
            imgBtn.setBackgroundResource(R.drawable.al);
        }
        else if(Objects.equals(id, 13)) {
            imgBtn.setBackgroundResource(R.drawable.am);
        }
        else if(Objects.equals(id, 14)) {
            imgBtn.setBackgroundResource(R.drawable.an);
        }
        else if(Objects.equals(id, 15)) {
            imgBtn.setBackgroundResource(R.drawable.ao);
        }
            lstDeatils.setText(details.getData());

    }
}
