package dev.karim.latihandua;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by Karim on 9/22/2017.
 */

public class ContohActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_contoh);
        Button tmbl = (Button) findViewById(R.id.button1);
        tmbl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(ContohActivity.this, UtamaActivity.class);
                startActivity(in);
            }
        });
    }
}
