package in.finmantra.akash;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class Concatenate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concatenate);

        final TextView res;
        Button click;

        res=(TextView)findViewById(R.id.view1);
        click=(Button)findViewById(R.id.concatenate1);

//        Bundle bundle = getIntent().getExtras();
//        String text= bundle.getString("abc");

        String text= Static.v1;
                res.setText(text);


//        final String[] schoolbag2 = { "Books", "Pens", "Pencils", "Notebooks" };
//
//        click.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//
//
//
//
//
//                StringBuilder sb = new StringBuilder();
//                int size = schoolbag2.length;
//                for(int y=0; y < size; y++){
//
//
//                        sb.append('\n');
//
//
//                    sb.append(schoolbag2[y]);
//                }
//                res.setText(sb.toString());
//
//
//            }
//        });


    }

}
