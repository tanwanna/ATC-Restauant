package appewtc.masterung.ungrestaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private EditText userEditText;
    private EditText passwordEditText;
    private Button LoginButton;
    private String userString,passwordString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindwidget();
        //Button controller
        buttonController();
    }// main method

    private void buttonController() {
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Receive Value From Edit Text
                userString = userEditText.getText().toString().trim();
                passwordString = passwordEditText.getText().toString().trim();
                //Check Space
                if (userString.equals("")  || passwordString.equals("")) {
                    //No Space
                    Mynittaya mynittaya = new Mynittaya();
                   mynittaya.mynittaya(MainActivity.this, "มีช่องว่าง","กรุณากรอกทุกช่อง");

                } else {


                }



            }//onclick
        });
    }

    private void bindwidget() {
        userEditText = (EditText) findViewById(R.id.editText);
        passwordEditText = (EditText)findViewById(R.id.editText);
        LoginButton = (Button) findViewById(R.id.button);

    }

}// main class นี่คือ คลาสหลัก
