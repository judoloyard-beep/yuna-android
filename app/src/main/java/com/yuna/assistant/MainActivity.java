
package com.yuna.assistant;

import android.app.*;
import android.os.*;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity {

    LinearLayout root;
    TextView status;
    TextView response;
    Button micButton;

    int purple = Color.rgb(174, 105, 255);
    int background = Color.rgb(11, 10, 22);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setStatusBarColor(background);
        getWindow().setNavigationBarColor(background);

        root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setGravity(Gravity.CENTER);
        root.setPadding(28, 30, 28, 30);
        root.setBackgroundColor(background);

        TextView logo = new TextView(this);
        logo.setText("Y U N A");
        logo.setTextSize(34);
        logo.setTextColor(purple);
        logo.setTypeface(null, Typeface.BOLD);
        logo.setGravity(Gravity.CENTER);

        TextView subtitle = new TextView(this);
        subtitle.setText("PERSONAL AI ASSISTANT");
        subtitle.setTextColor(Color.LTGRAY);
        subtitle.setTextSize(11);
        subtitle.setGravity(Gravity.CENTER);

        TextView orb = new TextView(this);
        orb.setText("✦");
        orb.setTextSize(75);
        orb.setTextColor(Color.WHITE);
        orb.setGravity(Gravity.CENTER);

        GradientDrawable orbBg = new GradientDrawable();
        orbBg.setShape(GradientDrawable.OVAL);
        orbBg.setColor(Color.rgb(95, 43, 160));
        orbBg.setStroke(3, purple);

        orb.setBackground(orbBg);
        LinearLayout.LayoutParams orbParams =
            new LinearLayout.LayoutParams(230, 230);
        orbParams.setMargins(0, 45, 0, 30);
        orb.setLayoutParams(orbParams);

        status = new TextView(this);
        status.setText("Yuna siap menemani kaka");
        status.setTextColor(purple);
        status.setTextSize(16);
        status.setGravity(Gravity.CENTER);

        response = new TextView(this);
        response.setText("Halo kaka! Aku Yuna. Senang bisa bertemu denganmu.");
        response.setTextColor(Color.WHITE);
        response.setTextSize(15);
        response.setGravity(Gravity.CENTER);
        response.setPadding(15, 25, 15, 25);

        micButton = new Button(this);
        micButton.setText("🎙  MULAI BERBICARA");
        micButton.setTextColor(Color.WHITE);
        micButton.setTextSize(14);

        GradientDrawable buttonBg = new GradientDrawable();
        buttonBg.setColor(purple);
        buttonBg.setCornerRadius(50);
        micButton.setBackground(buttonBg);

        micButton.setOnClickListener(v -> {
            status.setText("Mikrofon akan segera diaktifkan...");
            response.setText("Fitur suara sedang dalam tahap pembangunan.");
        });

        TextView footer = new TextView(this);
        footer.setText("YUNA AI • VERSION 1.0");
        footer.setTextColor(Color.GRAY);
        footer.setTextSize(10);
        footer.setGravity(Gravity.CENTER);

        root.addView(logo);
        root.addView(subtitle);
        root.addView(orb);
        root.addView(status);

        root.addView(response, new LinearLayout.LayoutParams(
            -1, -2
        ));

        LinearLayout.LayoutParams btnParams =
            new LinearLayout.LayoutParams(-1, 65);
        btnParams.setMargins(0, 20, 0, 35);
        root.addView(micButton, btnParams);

        root.addView(footer);

        setContentView(root);
    }
}
