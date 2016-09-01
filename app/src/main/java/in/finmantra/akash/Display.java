package in.finmantra.akash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);


        EditText firstText;
        EditText secondText;
        EditText thirdText;
        Button display;

        firstText=(EditText)findViewById(R.id.text1);
        secondText=(EditText)findViewById(R.id.text2);
        thirdText=(EditText)findViewById(R.id.text3);
        display=(Button)findViewById(R.id.display);




        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i= new Intent(getApplicationContext(),result.class);
                startActivity(i);
                finish();
                //End of Method
                //Checking Testing Purpose
            }
        });
    }

}
