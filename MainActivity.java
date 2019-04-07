package com.example.age;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.lang.String;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    ImageView img;
    Button but;
    EditText et, et1, et2, et3;
    TextView tv1;
    int current_month, current_year, current_date, final_date, final_month, final_year, p, t = 0;
    Calendar cal = Calendar.getInstance();
    String s;
    Random rand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = (ImageView) findViewById(R.id.img);
        but = (Button) findViewById(R.id.but);
        tv1 = (TextView) findViewById(R.id.tv1);
        et = (EditText) findViewById(R.id.et);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        et3 = (EditText) findViewById(R.id.et3);
        rand=new Random();



        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = et3.getText().toString();
                important();
                pic();
            }
        });

    }

    public void important()
    // public void result(View v)
    {
        int month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        current_month = cal.get(Calendar.MONTH);
        current_year = cal.get(Calendar.YEAR);
        current_date = cal.get(Calendar.DATE);
        current_month = current_month + 1;
        // System.out.println(Integer.parseInt(et.getText().toString()));
        // System.out.println(current_month);
//        System.out.println(current_year);


        if (Integer.parseInt(et.getText().toString()) > current_date) {
            current_date = current_date + month[Integer.parseInt(et1.getText().toString()) - 1];
            current_month = current_month - 1;
        }
        if (Integer.parseInt(et1.getText().toString()) > current_month) {
            current_year = current_year - 1;
            current_month = current_month + 12;
        }
        final_date = current_date - Integer.parseInt(et.getText().toString());
        final_month = current_month - Integer.parseInt(et1.getText().toString());
        final_year = current_year - Integer.parseInt(et2.getText().toString());


        tv1.setText("YOU HAVE LIVED FOR " + final_year + " " + "YEARS " + final_month + " " + "MONTHS AND " + final_date + " " + "DAYS");

    }

    public void pic() {
        if (s.equalsIgnoreCase("pankaj")) {
            img.setImageResource(R.drawable.pankaj);
            t = t + 1;
        } else if (s.equalsIgnoreCase("prnav")) {
            img.setImageResource(R.drawable.pranav);
            t = t + 1;
        } else if (s.equalsIgnoreCase("vidisha")) {
            img.setImageResource(R.drawable.vidisha);
            t = t + 1;
        } else if (s.equalsIgnoreCase("amandeep")) {
            img.setImageResource(R.drawable.amandeep);
            t = t + 1;
        } else if (s.equalsIgnoreCase("ankit")) {
            img.setImageResource(R.drawable.ankit);
            t = t + 1;
        } else if (s.equalsIgnoreCase("astha")) {
            img.setImageResource(R.drawable.astha);
            t = t + 1;
        } else if (s.equalsIgnoreCase("bhavya")) {
            img.setImageResource(R.drawable.bhavya);
            t = t + 1;
        } else if (s.equalsIgnoreCase("khapra")) {
            img.setImageResource(R.drawable.khapra);
            t = t + 1;
        } else if (s.equalsIgnoreCase("harsh")) {
            img.setImageResource(R.drawable.harsh);
            t = t + 1;
        } else if (s.equalsIgnoreCase("nimish")) {
            img.setImageResource(R.drawable.nimish);
            t = t + 1;
        } else if (s.equalsIgnoreCase("parmeet")) {
            img.setImageResource(R.drawable.parmeet);
            t = t + 1;
        } else if (s.equalsIgnoreCase("sushant")) {
            img.setImageResource(R.drawable.sushnat);
            t = t + 1;
        } else if (s.equalsIgnoreCase("sagar")) {
            img.setImageResource(R.drawable.sagar);
            t = t + 1;
        } else if (s.equalsIgnoreCase("amrit")) {
            img.setImageResource(R.drawable.banana);
            t = t + 1;
        } else if (s.equalsIgnoreCase("shefali")) {
            Toast.makeText(MainActivity.this, "Sale bhabhi ha tumhari", Toast.LENGTH_LONG).show();
        } else if (s.equalsIgnoreCase("akash")) {
            img.setImageResource(R.drawable.akash);
            t = t + 1;
        }
        else if(s.equalsIgnoreCase("satyam"))
        {
            img.setImageResource(R.drawable.satyam);
            t=t+1;
            Toast.makeText(MainActivity.this,"NAMASTE!!",Toast.LENGTH_SHORT).show();
        }

        else if (s.equalsIgnoreCase("deepanjan")) {
            img.setImageResource(R.drawable.deepanjan);
            t = t + 1;
        } else if (t == 0) {
            p = rand.nextInt(7-0)+0;
            switch (p) {
                case 0:
                    img.setImageResource(R.drawable.dog);
                    break;
                case 1:
                    img.setImageResource(R.drawable.khalifa);
                    break;
                case 2:
                    img.setImageResource(R.drawable.flower);
                    break;
                case 3:
                    img.setImageResource(R.drawable.jupiter);
                    break;
                case 4:
                    img.setImageResource(R.drawable.monkey);
                    break;
                case 5:
                    img.setImageResource((R.drawable.cave));
                    break;
                case 6:
                    img.setImageResource(R.drawable.model);
            }
        }
    }
}

