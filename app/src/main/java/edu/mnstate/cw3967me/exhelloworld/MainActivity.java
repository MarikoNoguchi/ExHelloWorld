package edu.mnstate.cw3967me.exhelloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvLastName;

    //declare modele-level attributes for each of the resources
    EditText etFirstName, etLastName;
    Button btnSubmit, btnGreet1, btnGreet2;
    TextView tvGreeting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        //get references for each resources on the interface
        etFirstName = (EditText) findViewById(R.id.etFirstName);
        etLastName = (EditText) findViewById(R.id.etLastName);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnGreet1 = (Button) findViewById(R.id.btnGreet1);
        btnGreet2 = (Button) findViewById(R.id.btnGreet2);
        tvGreeting = (TextView) findViewById(R.id.tvGreeting);

        btnGreet1.setOnClickListener(this);


        //Create a root node -- linear layout
        /*LinearLayout llRoot = new LinearLayout(this);
        llRoot.setOrientation(LinearLayout.VERTICAL);
        llRoot.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        ));
        tvLastName = new TextView(this);
        tvLastName.setText("Jones");
        tvLastName.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        //llRoot.addView(tvLastName);


        setContentView(llRoot);*/

        btnGreet2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tvGreeting.setText("Greetings "
                        + etFirstName.getText()
                );
            }
        });
    }

    public void submit_onClick(View v) {
        tvGreeting.setText("Hello there "
                + etFirstName.getText() + " "
                + etLastName.getText()
        );
    }

    @Override
    public void onClick(View v) {
        System.out.println("onClick");
        if (v.getId() == R.id.btnGreet1) {
            tvGreeting.setText("Goodbye "
                    + etLastName.getText()
            );
        }
    }


}
