package nyc.c4q.fizzfeed;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button quiz01;
    private Button quiz02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quiz01 = (Button) findViewById(R.id.button1);
        quiz02 = (Button) findViewById(R.id.button2);
        setButtonIntents(quiz01,quiz02);

    }
    public void setButtonIntents(Button quiz01, Button quiz02){
        quiz01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), Quiz01.class);
                startActivity(Intent);}
        });
        quiz02.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Quiz02.class);
                startActivity(intent);
            }
        });
    }


   }

