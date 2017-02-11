package com.example.rr.billpayment;

import android.icu.text.NumberFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.R.*;

public class MainActivity extends AppCompatActivity {
   private static final String TOTAL_BILL= "TOTAL_BILL";
    private static final String Current_Tip= "Current_Tip";
    private static final String BILL_WITHOUT_TIP= "FINAL_BILL";

    private double billBeforeTip;
    private double tipAmount;
    private double finalBill;

    EditText et1;
    EditText et2;
    EditText et3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState == null){
            billBeforeTip=0.0;
            tipAmount=0.15;
            finalBill=0.0;
        }
        else{
            billBeforeTip=savedInstanceState.getDouble(BILL_WITHOUT_TIP);
            tipAmount=savedInstanceState.getDouble(Current_Tip);

            finalBill=savedInstanceState.getDouble(TOTAL_BILL);

        }

            et1=(EditText)findViewById(R.id.editText);
            et2=(EditText)findViewById(R.id.editText2);
            et3=(EditText)findViewById(R.id.editText3);

            et1.addTextChangedListener(billBeforeTipTipListener);




        }


    public TextWatcher billBeforeTipTipListener = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            try{
                billBeforeTip=Double.parseDouble(charSequence.toString());



            }catch (NumberFormatException e){
                billBeforeTip=0.0;

            }
            updateTipFinalBill();

        }

        @Override
        public void afterTextChanged(Editable editable) {

        }



        private void updateTipFinalBill(){
            double tipAmount=Double.parseDouble(et2.getText().toString());
            double finalBll= billBeforeTip +(billBeforeTip*tipAmount);
            et3.setText(String.format("%.02f",finalBll));



        }




    };






        };







