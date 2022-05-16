package com.emre.tictac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button reset;
    Button exit;
    TextView textView;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
    }
    public void tanimla(){
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        reset = findViewById(R.id.reset);
        exit = findViewById(R.id.exit);
        textView = findViewById(R.id.winner);
    }
    public void click(View view){
        counter+=1;
        if(view.getTag().toString().equals("1")){
            if (counter % 2 == 0){
                button1.setText("O");
                button1.setEnabled(false);
            }
            else{
                button1.setText("X");
                button1.setEnabled(false);
            }
            if((button2.getText().toString().equals(button1.getText().toString())&& button3.getText().toString().equals(button1.getText().toString())) || (button4.getText().toString().equals(button1.getText().toString())&& button7.getText().toString().equals(button1.getText().toString())) || (button5.getText().toString().equals(button1.getText().toString())&& button9.getText().toString().equals(button1.getText().toString()))){
                textView.setText("WINNER :" +button1.getText().toString());
                Toast.makeText(this, "Winner : Player "+button1.getText().toString(), Toast.LENGTH_SHORT).show();
                disable();
                reset.setVisibility(View.VISIBLE);
                exit.setVisibility(View.VISIBLE);
            }
        }
        if(view.getTag().toString().equals("2")){
            if (counter % 2 == 0){
                button2.setText("O");
                button2.setEnabled(false);
            }
            else{
                button2.setText("X");
                button2.setEnabled(false);
            }
            if((button1.getText().toString().equals(button2.getText().toString())&& button3.getText().toString().equals(button2.getText().toString())) || (button5.getText().toString().equals(button2.getText().toString())&& button8.getText().toString().equals(button2.getText().toString()))){
                textView.setText("WINNER :" +button2.getText().toString());
                Toast.makeText(this, "Winner : Player "+button2.getText().toString(), Toast.LENGTH_SHORT).show();
                disable();
                reset.setVisibility(View.VISIBLE);
                exit.setVisibility(View.VISIBLE);
            }
        }
        if(view.getTag().toString().equals("3")){
            if (counter % 2 == 0){
                button3.setText("O");
                button3.setEnabled(false);
            }
            else{
                button3.setText("X");
                button3.setEnabled(false);
            }
            if((button1.getText().toString().equals(button3.getText().toString())&& button2.getText().toString().equals(button3.getText().toString())) || (button6.getText().toString().equals(button3.getText().toString())&& button9.getText().toString().equals(button3.getText().toString())) || (button5.getText().toString().equals(button3.getText().toString())&& button7.getText().toString().equals(button3.getText().toString()))){
                textView.setText("WINNER :" +button3.getText().toString());
                Toast.makeText(this, "Winner : Player "+button3.getText().toString(), Toast.LENGTH_SHORT).show();
                disable();
                reset.setVisibility(View.VISIBLE);
                exit.setVisibility(View.VISIBLE);
            }
        }
        if(view.getTag().toString().equals("4")){
            if (counter % 2 == 0){
                button4.setText("O");
                button4.setEnabled(false);
            }
            else{
                button4.setText("X");
                button4.setEnabled(false);
            }
            if((button1.getText().toString().equals(button4.getText().toString())&& button7.getText().toString().equals(button4.getText().toString())) || (button5.getText().toString().equals(button4.getText().toString())&& button6.getText().toString().equals(button4.getText().toString()))){
                textView.setText("WINNER :" +button4.getText().toString());
                Toast.makeText(this, "Winner : Player "+button4.getText().toString(), Toast.LENGTH_SHORT).show();
                disable();
                reset.setVisibility(View.VISIBLE);
                exit.setVisibility(View.VISIBLE);
            }
        }
        if(view.getTag().toString().equals("5")){
            if (counter % 2 == 0){
                button5.setText("O");
                button5.setEnabled(false);
            }
            else{
                button5.setText("X");
                button5.setEnabled(false);
            }
            if((button2.getText().toString().equals(button5.getText().toString())&& button8.getText().toString().equals(button5.getText().toString())) || (button4.getText().toString().equals(button5.getText().toString())&& button6.getText().toString().equals(button5.getText().toString())) || (button1.getText().toString().equals(button5.getText().toString())&& button9.getText().toString().equals(button5.getText().toString()))|| (button3.getText().toString().equals(button5.getText().toString())&& button7.getText().toString().equals(button5.getText().toString()))){
                textView.setText("WINNER :" +button5.getText().toString());
                Toast.makeText(this, "Winner : Player "+button5.getText().toString(), Toast.LENGTH_SHORT).show();
                disable();
                reset.setVisibility(View.VISIBLE);
                exit.setVisibility(View.VISIBLE);
            }
        }
        if(view.getTag().toString().equals("6")){
            if (counter % 2 == 0){
                button6.setText("O");
                button6.setEnabled(false);
            }
            else{
                button6.setText("X");
                button6.setEnabled(false);
            }
            if((button3.getText().toString().equals(button6.getText().toString())&& button9.getText().toString().equals(button6.getText().toString())) || (button4.getText().toString().equals(button6.getText().toString())&& button5.getText().toString().equals(button6.getText().toString()))){
                textView.setText("WINNER :" +button6.getText().toString());
                Toast.makeText(this, "Winner : Player "+button6.getText().toString(), Toast.LENGTH_SHORT).show();
                disable();
                reset.setVisibility(View.VISIBLE);
                exit.setVisibility(View.VISIBLE);
            }
        }
        if(view.getTag().toString().equals("7")){
            if (counter % 2 == 0){
                button7.setText("O");
                button7.setEnabled(false);
            }
            else{
                button7.setText("X");
                button7.setEnabled(false);
            }
            if((button3.getText().toString().equals(button7.getText().toString())&& button5.getText().toString().equals(button7.getText().toString())) || (button4.getText().toString().equals(button7.getText().toString())&& button1.getText().toString().equals(button7.getText().toString())) || (button8.getText().toString().equals(button7.getText().toString())&& button9.getText().toString().equals(button7.getText().toString()))){
                textView.setText("WINNER :" +button7.getText().toString());
                Toast.makeText(this, "Winner : Player "+button7.getText().toString(), Toast.LENGTH_SHORT).show();
                disable();
                reset.setVisibility(View.VISIBLE);
                exit.setVisibility(View.VISIBLE);
            }
        }
        if(view.getTag().toString().equals("8")){
            if (counter % 2 == 0){
                button8.setText("O");
                button8.setEnabled(false);
            }
            else{
                button8.setText("X");
                button8.setEnabled(false);
            }
            if((button7.getText().toString().equals(button8.getText().toString())&& button9.getText().toString().equals(button8.getText().toString())) || (button2.getText().toString().equals(button8.getText().toString())&& button5.getText().toString().equals(button8.getText().toString()))){
                textView.setText("WINNER :" +button8.getText().toString());
                Toast.makeText(this, "Winner : Player "+button8.getText().toString(), Toast.LENGTH_SHORT).show();
                disable();
                reset.setVisibility(View.VISIBLE);
                exit.setVisibility(View.VISIBLE);
            }
        }
        if(view.getTag().toString().equals("9")){
            if (counter % 2 == 0){
                button9.setText("O");
                button9.setEnabled(false);
            }
            else{
                button9.setText("X");
                button9.setEnabled(false);
            }
            if((button3.getText().toString().equals(button9.getText().toString())&& button6.getText().toString().equals(button9.getText().toString())) || (button7.getText().toString().equals(button9.getText().toString())&& button8.getText().toString().equals(button9.getText().toString())) || (button1.getText().toString().equals(button9.getText().toString())&& button5.getText().toString().equals(button9.getText().toString()))){
                textView.setText("WINNER :" +button9.getText().toString());
                Toast.makeText(this, "Winner : Player "+button9.getText().toString(), Toast.LENGTH_SHORT).show();
                disable();
                reset.setVisibility(View.VISIBLE);
                exit.setVisibility(View.VISIBLE);
            }
        }

    }
    public void disable(){
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
    }
    public void reset(View view){
        counter =0;
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");

        textView.setText("");


        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
    }
    public void exit(View view){
        
        System.exit(0);
    }
}