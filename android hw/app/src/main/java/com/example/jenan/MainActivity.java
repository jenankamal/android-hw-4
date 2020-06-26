package com.example.jenan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText a = findViewById(R.id.1);
        final EditText b = findViewById(R.id.2);
        final EditText c = findViewById(R.id.3);
        final EditText d = findViewById(R.id.4);
        Button cal = findViewById(R.id.b1);
        Button res = findViewById(R.id.b2);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String 1String = a.getText().toString();
                String 2String = b.getText().toString();
                String 3String = c.getText().toString();
                String 4String = d.getText().toString();

                double 1 = Double.parseDouble(1String);
                double 2 = Double.parseDouble(2String);
                double 3 = Double.parseDouble(3String);
                double 4 = Double.parseDouble(4String);
                if (cal >= 90)
                    return ('A');
               else if (cal >= 80)
                    return ('B');
               else if (cal >= 70)
                    return ('C');
                else if (cal >= 60)
                    return ('D');
                else
                    return('F');

                double b1 = (a+b+c+d*100);
                System.out.println(b1);
                        double b2 = (0);
                        System.out.println(b2);

            }
        }

    }

}