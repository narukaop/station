package com.example.station;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    CardView cardwatering,cardrunning,overview, history,tips;
    RadioButton btnradio1,radiobtn2;
    TextView overviewtext ,historytext,tipstext;

    LinearLayout overview1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        cardwatering = findViewById(R.id.cardwatering);
        cardrunning = findViewById(R.id.cardrunning);
        btnradio1 = findViewById(R.id.btnradio1);
        radiobtn2 = findViewById(R.id.radiobtn2);

        overview= findViewById(R.id.overview);
        history= findViewById(R.id.history);
        tips= findViewById(R.id.tips);
        overviewtext= findViewById(R.id.overviewtext);
        historytext= findViewById(R.id.historytext);
        tipstext =findViewById(R.id.tipstext);

        overview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                overview.setCardBackgroundColor(getColor(R.color.black));
                overviewtext.setTextColor(getColor(R.color.white));

                history.setCardBackgroundColor(getColor(R.color.white));
                historytext.setTextColor(getColor(R.color.black));

                tips.setCardBackgroundColor(getColor(R.color.white));
                tipstext.setTextColor(getColor(R.color.black));



            }
        });
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                history.setCardBackgroundColor(getColor(R.color.black));
                historytext.setTextColor(getColor(R.color.white));

                overview.setCardBackgroundColor(getColor(R.color.white));
                overviewtext.setTextColor(getColor(R.color.black));

                tips.setCardBackgroundColor(getColor(R.color.white));
                tipstext.setTextColor(getColor(R.color.black));


            }
        });
        tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tips.setCardBackgroundColor(getColor(R.color.black));
                tipstext.setTextColor(getColor(R.color.white));

                history.setCardBackgroundColor(getColor(R.color.white));
                historytext.setTextColor(getColor(R.color.black));

                overview.setCardBackgroundColor(getColor(R.color.white));
                overviewtext.setTextColor(getColor(R.color.black));


            }
        });


        cardwatering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnradio1.setChecked(true);
                radiobtn2.setChecked(false);

            }
        });

        cardrunning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                radiobtn2.setChecked(true);
                btnradio1.setChecked(false);

            }
        });

    }
}