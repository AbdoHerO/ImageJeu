package com.example.abdohero.imagejeu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //-----------Déclaration des Objects--------
    private Button start;
    private TextView score;
    private ImageView button[][] = new ImageView[3][4];
    private Random random = new Random();
    private boolean visible = false;
    private int scorevaleur =0;
    private int k=0;
    /*private int T[]={R.drawable.image1,R.drawable.image1,R.drawable.image2,R.drawable.image2,R.drawable.image3,R.drawable.image3,
            R.drawable.image4,R.drawable.image4,R.drawable.image5,R.drawable.image5,R.drawable.image6,R.drawable.image6};*/

    //Déclaration Randon ---

    int x=random.nextInt(4);
    int y=random.nextInt(3);

    //----------------Méthode onCreate
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        //------ Button----------

        button[0][0]=(ImageView)findViewById(R.id.b00);
        button[0][1]=(ImageView)findViewById(R.id.b01);
        button[0][2]=(ImageView)findViewById(R.id.b02);
        button[1][0]=(ImageView)findViewById(R.id.b10);
        button[1][1]=(ImageView)findViewById(R.id.b11);
        button[1][2]=(ImageView)findViewById(R.id.b12);
        button[2][0]=(ImageView)findViewById(R.id.b20);
        button[2][1]=(ImageView)findViewById(R.id.b21);
        button[2][2]=(ImageView)findViewById(R.id.b22);
        button[3][0]=(ImageView)findViewById(R.id.b30);
        button[3][1]=(ImageView)findViewById(R.id.b31);
        button[3][2]=(ImageView)findViewById(R.id.b32);

        //-------------------------------------------

        score = (TextView)findViewById(R.id.score);
        start = (Button) findViewById(R.id.start);

        //-----Listeners Des Buttons-----------

        for(ImageView[] button1 : button){
            for (ImageView button : button1){
                button.setOnClickListener(this);
            }
        }





        if(button[x][y].getDrawable()==null){
            button[x][y].setImageResource(R.drawable.image1);

            x=random.nextInt(3);
            y=random.nextInt(3);
        }
        else {
            button[x][y].setVisibility(View.VISIBLE);
        }






    }

    @Override
    public void onClick(View v) {

    }
}
