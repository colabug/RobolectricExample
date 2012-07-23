package com.chariotsolutions.colabug;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NewActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity);

        View button = findViewById(R.id.crazy_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                doSomethingCrazy();
            }
        });
    }

    protected void doSomethingCrazy()
    {
    }

    public static Intent createIntent(Context context) {
        return new Intent(context, NewActivity.class);
    }
}
