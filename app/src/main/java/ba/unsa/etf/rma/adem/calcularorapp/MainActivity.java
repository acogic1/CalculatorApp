package ba.unsa.etf.rma.adem.calcularorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edit_input1;
    private EditText edit_input2;
    private Button addition;
    private Button substraction;
    private Button multiplication;
    private Button division;
    private Button clear;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_input1=(EditText) findViewById(R.id.first_input);
        edit_input2=(EditText) findViewById(R.id.second_input);
        addition=(Button) findViewById(R.id.addition_btn);
        substraction=(Button) findViewById(R.id.substracion_btn);
        multiplication=(Button) findViewById(R.id.multiplication_btn);
        division=(Button) findViewById(R.id.division_btn);
        clear=(Button) findViewById(R.id.clear_btn);
        result=(TextView) findViewById(R.id.display_result);

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit_input1.getText().length()>0 && edit_input2.getText().length()>0) {
                    Double input1 = Double.parseDouble(edit_input1.getText().toString());
                    Double input2 = Double.parseDouble(edit_input2.getText().toString());

                    Double final_result = input1 + input2;
                    result.setText(Double.toString(final_result));
                }
                else {
                    Toast.makeText(MainActivity.this, "Please write numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
        substraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit_input1.getText().length()>0 && edit_input2.getText().length()>0) {
                    Double input1 = Double.parseDouble(edit_input1.getText().toString());
                    Double input2 = Double.parseDouble(edit_input2.getText().toString());

                    Double final_result = input1 - input2;
                    result.setText(Double.toString(final_result));
                }
                else {
                    Toast.makeText(MainActivity.this, "Please write numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit_input1.getText().length()>0 && edit_input2.getText().length()>0) {
                    Double input1 = Double.parseDouble(edit_input1.getText().toString());
                    Double input2 = Double.parseDouble(edit_input2.getText().toString());

                    Double final_result = input1 * input2;
                    result.setText(Double.toString(final_result));
                }
                else {
                    Toast.makeText(MainActivity.this, "Please write numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit_input1.getText().length()>0 && edit_input2.getText().length()>0) {
                    Double input1 = Double.parseDouble(edit_input1.getText().toString());
                    Double input2 = Double.parseDouble(edit_input2.getText().toString());

                    Double final_result = input1 / input2;
                    result.setText(Double.toString(final_result));
                }
                else {
                    Toast.makeText(MainActivity.this, "Please write numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit_input1.setText("");
                edit_input2.setText("");
                result.setText("0.00");

                edit_input1.requestFocus();
            }
        });
    }
}
