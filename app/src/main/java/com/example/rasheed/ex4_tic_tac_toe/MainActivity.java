package com.example.rasheed.ex4_tic_tac_toe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    boolean p1 = true;

    int Counter = 0;

    Button b0;
    Button b1;
    Button b2;

    Button b3;
    Button b4;
    Button b5;

    Button b6;
    Button b7;
    Button b8;

    Button bRes;

    TextView TxtP1;
    TextView TxtP2;
    TextView TxtP1S;
    TextView TxtP2S;
    int[][] Game = new int[3][3];
    int scorep1=0;
    int scorep2=0;
    String result="";

public void onCreate(View view){

    TxtP1S=findViewById(R.id.txtP1S);
    TxtP2S=findViewById(R.id.txtP2S);

    b0 = (Button) findViewById(R.id.b0);
    b1 = (Button) findViewById(R.id.b1);
    b2 = (Button) findViewById(R.id.b2);

    b3 = (Button) findViewById(R.id.b3);
    b4 = (Button) findViewById(R.id.b4);
    b5 = (Button) findViewById(R.id.b5);

    b6 = (Button) findViewById(R.id.b6);
    b7 = (Button) findViewById(R.id.b7);
    b8 = (Button) findViewById(R.id.b8);
    bRes = (Button) findViewById(R.id.bRes);

    TxtP1=findViewById(R.id.txtP1);
    TxtP2=findViewById(R.id.txtP2);

    switch (view.getId()){
        case R.id.b0:
            if(p1){
                b0.setText("X");
                Game[0][0] = 1;
                p1=false;
            }
            else{
                b0.setText("0");
                Game[0][0] = 2;
                p1=true;
            }
            b0.setEnabled(false);
            Counter++;
            break;

        case R.id.b1:
            if(p1){
                b1.setText("X");
                Game[0][1] = 1;
                p1=false;
            }
            else{
                b1.setText("0");
                Game[0][1] = 2;
                p1=true;
            }
            b1.setEnabled(false);
            Counter++;
            break;

        case R.id.b2:
            if(p1){
                b2.setText("X");
                Game[0][2] = 1;
                p1=false;
            }
            else{
                b2.setText("0");
                Game[0][2] = 2;
                p1=true;
            }
            b2.setEnabled(false);
            Counter++;
            break;

        case R.id.b3:
            if(p1){
                b3.setText("X");
                Game[1][0] = 1;
                p1=false;
            }
            else{
                b3.setText("0");
                Game[1][0] = 2;
                p1=true;
            }
            b3.setEnabled(false);
            Counter++;
            break;

        case R.id.b4:
            if(p1){
                b4.setText("X");
                Game[1][1] = 1;
                p1=false;
            }
            else{
                b4.setText("0");
                Game[1][1] = 2;
                p1=true;
            }
            b4.setEnabled(false);
            Counter++;
            break;

        case R.id.b5:
            if(p1){
                b5.setText("X");
                Game[1][2] = 1;
                p1=false;
            }
            else{
                b5.setText("0");
                Game[1][2] = 2;
                p1=true;
            }
            b5.setEnabled(false);
            Counter++;
            break;

        case R.id.b6:
            if(p1){
                b6.setText("X");
                Game[2][0] = 1;
                p1=false;
            }
            else{
                b6.setText("0");
                Game[2][0] = 2;
                p1=true;
            }
            b6.setEnabled(false);
            Counter++;
            break;

        case R.id.b7:
            if(p1){
                b7.setText("X");
                Game[2][1] = 1;
                p1=false;
            }
            else{
                b7.setText("0");
                Game[2][1] = 2;
                p1=true;
            }
            b7.setEnabled(false);
            Counter++;
            break;

        case R.id.b8:
            if(p1){
                b8.setText("X");
                Game[2][2] = 1;
                p1=false;
            }
            else{
                b8.setText("0");
                Game[2][2] = 2;
                p1=true;
            }
            b8.setEnabled(false);
            Counter++;
            break;
        case R.id.bRes:
            ClearButtons();
            scorep1=0;
            scorep2=0;
            break;

        default:
            break;

    }
    if (p1){
        TxtP1.setTextColor(Color.RED);
        TxtP2.setTextColor(Color.BLACK);
    }else {
        TxtP2.setTextColor(Color.RED);
        TxtP1.setTextColor(Color.BLACK);
    }



    checkForWin();

}
    public void checkRowsForWin(){


        for(int i=0; i<3; i++){
            if(Game[i][0] == Game[i][1] && Game[i][0] == Game[i][2]){
                if (Game[i][0]==1){
                    result=("Player 1 winner");
                    scorep1++;
                    ClearButtons();
                    break;
                }
                else if (Game[i][0]==2) {
                    result=("Player 2 winner" );
                    scorep2++;
                    ClearButtons();
                    break;
                }
            }
        }

    }





    public void checkColumnsForWin(){

        for(int i=0; i<3; i++){
            if(Game[0][i] == Game[1][i] && Game[0][i] == Game[2][i]){
                if (Game[0][i]==1){
                    result=("Player 1 winner");
                    scorep1++;
                    ClearButtons();
                    break;
                }
                else if (Game[0][i]==2) {
                    result=("Player 2 winner");
                    scorep2++;
                    ClearButtons();
                    break;
                }
            }
        }

    }


    public void checkDiagonalsForWin(){
        if(Game[0][0] == Game[1][1] && Game[0][0] == Game[2][2]){
            if (Game[0][0]==1){
                result=("Player 1 winner");
                scorep1++;
                ClearButtons();
            }
            else if (Game[0][0]==2) {
                result=("Player 2 winner");
                scorep2++;
                ClearButtons();
            }
        }

        //Second diagonal
        if(Game[0][2] == Game[1][1] && Game[0][2] == Game[2][0]){
            if (Game[0][2]==1){
                result=("Player 1 winner");
                scorep1++;
                ClearButtons();
            }
            else if (Game[0][2]==2) {
                result=("Player 2 winner");
                scorep2++;
                ClearButtons();
            }
        }
    }






    public void checkForWin(){

        checkRowsForWin();
        checkDiagonalsForWin( );
        checkColumnsForWin();
        if(Counter==9){
            result=("Game Draw");
            ClearButtons();
        }
        TxtP1S.setText(scorep1+"");
        TxtP2S.setText(scorep2+"");


    }

    public void  ClearButtons(){
        if (result == "") {
            Toast.makeText(this,"Rest All",Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this,result,Toast.LENGTH_LONG).show();
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                Game[i][j] = -1;
            }
        }
        Counter=0;
        b0.setText("-");
        b0.setEnabled(true);
        b1.setText("-");
        b1.setEnabled(true);
        b2.setText("-");
        b2.setEnabled(true);
        b3.setText("-");
        b3.setEnabled(true);
        b4.setText("-");
        b4.setEnabled(true);
        b5.setText("-");
        b5.setEnabled(true);
        b6.setText("-");
        b6.setEnabled(true);
        b7.setText("-");
        b7.setEnabled(true);
        b8.setText("-");
        b8.setEnabled(true);
        result=("");

    }


}
