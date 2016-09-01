package in.finmantra.akash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText firstNumber;
        final EditText secondNumber;
        final TextView Result;
        Button   add;
        Button   subtract;
        Button   multiply;
        Button   divide;
        Button   concatenate;


        firstNumber = (EditText)findViewById(R.id.text1);
        secondNumber = (EditText)findViewById(R.id.text2);
        Result = (TextView)findViewById(R.id.view1);
        add = (Button)findViewById(R.id.add);
        subtract = (Button)findViewById(R.id.subtract);
        multiply = (Button)findViewById(R.id.multiply);
        divide = (Button)findViewById(R.id.divide);
        concatenate=(Button)findViewById(R.id.concatenate);

        final String v1="irfan";



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double num1, num2, sum;


                    num1 = Double.parseDouble(firstNumber.getText().toString());
                    num2 = Double.parseDouble(secondNumber.getText().toString());
                    sum = num1 + num2;
                    Result.setText(Double.toString(sum));
                } catch (Exception e) {
                    Log.e("error", "error");
                }


            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double num1, num2, sum;
                    num1 = Double.parseDouble(firstNumber.getText().toString());
                    num2 = Double.parseDouble(secondNumber.getText().toString());
                    sum = num1 - num2;
                    Result.setText(Double.toString(sum));
                }
                catch(Exception e)
                {
                    Log.e("error","error");
                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    double num1,num2,sum;
                    num1=Double.parseDouble(firstNumber.getText().toString());
                    num2=Double.parseDouble(secondNumber.getText().toString());
                    sum=num1*num2;
                    Result.setText(Double.toString(sum));
                }
                catch (Exception e)
                {
                    Log.e("error","error");
                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    double num1,num2,sum;
                    num1=Double.parseDouble(firstNumber.getText().toString());
                    num2=Double.parseDouble(secondNumber.getText().toString());
                    sum=num1/num2;
                    Result.setText(Double.toString(sum));
                }
                catch (Exception e)
                {
                    Log.e("error","error");
                }
            }
        });
        concatenate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Intent i= new Intent(getApplicationContext(),Concatenate.class);
//                Bundle b = new Bundle();
//                b.putString("abc", v1);
//                i.putExtras(b);
//                startActivity(i);

                Static.v1 = "Irfan";

                Intent i= new Intent(getApplicationContext(),Concatenate.class);
                startActivity(i);


            }
        });
    }
}
