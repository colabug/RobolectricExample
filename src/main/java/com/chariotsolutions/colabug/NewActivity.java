package com.chariotsolutions.colabug;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class NewActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.new_activity);
    }

    public static Intent createIntent(Context context) {
        return new Intent(context, NewActivity.class);
    }
}
