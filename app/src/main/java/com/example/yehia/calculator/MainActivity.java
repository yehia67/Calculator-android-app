package com.example.yehia.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button plus,neg,mult,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plus = (Button) findViewById(R.id.pos);
        neg = (Button) findViewById(R.id.neg);
        mult = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
    }
public void caclulate(View view){


}
}
