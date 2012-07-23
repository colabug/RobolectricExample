package com.chariotsolutions.colabug;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MyActivity extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        View welcomeText = findViewById(R.id.welcome_text_view);
        welcomeText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                shortToast(getResources().getString(R.string.WELCOME_TOAST));
            }
        });
    }

    public void shortToast(String string) {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }
}
