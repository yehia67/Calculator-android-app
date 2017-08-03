package com.example.yehia.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
private Button plus,neg,mult,div;
private EditText ed;
    double tempf,temps,result ;
   int op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plus = (Button) findViewById(R.id.pos);
        neg = (Button) findViewById(R.id.neg);
        mult = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        ed = (EditText) findViewById(R.id.editText2);
    }
    public void getTempf() {



      try {

          tempf = Double.parseDouble(ed.getText().toString());


          }catch (NumberFormatException e){
          Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
          tempf = 0;
      }

        ed.setText("");

    }

public void caclulate(View view){
   getTempf();

    switch (view.getId())
    {
        case R.id.pos:
           op = 1;
            break;
        case R.id.neg:
            op = 2;
            break;
        case R.id.mul:
            op = 3;
            break;
        case R.id.div:
            op = 4;
            break;
    }

}
 public void setResult(View view){
    try{
     temps = Double.parseDouble(ed.getText().toString());}

 catch (NumberFormatException e){
        Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        tempf = 0;}


    switch (op)
    {
        case 1:
            ed.setText((Double.toString(tempf + temps )));
            break;
        case 2:
            ed.setText((Double.toString(tempf - temps )));
            break;
        case 3:
            ed.setText((Double.toString(tempf * temps )));
            break;
        case 4:
            ed.setText((Double.toString(tempf / temps )));
            break;

    }

}
}
