package com.example.project4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;



public class AddCreditCardActivity extends AppCompatActivity
{
    private EditText creditCardNameET, creditCardStartDateET,
            creditCardMinSpendET, creditCardBonusPointET;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_credit_card);

        this.creditCardNameET = (EditText)this.findViewById(R.id.creditCardNameET);
        this.creditCardStartDateET = (EditText)this.findViewById(R.id.creditCardStartDate);
        this.creditCardMinSpendET = (EditText)this.findViewById(R.id.creditCardMinSpendET);
        this.creditCardBonusPointET = (EditText)this.findViewById(R.id.creditCardBonusPointsET);

    }

    public void onSubmitButtonPressed(View v)
    {
        String creditCardName = this.creditCardNameET.getText().toString();
        String creditCardStartDate = this.creditCardStartDateET.getText().toString();
        int creditCardMinSpend = Integer.parseInt(this.creditCardMinSpendET.getText().toString());
        int creditCardBonusPoints = Integer.parseInt(this.creditCardBonusPointET.getText().toString());

        CreditCard cc = new CreditCard(creditCardName, creditCardStartDate,
                creditCardMinSpend,creditCardBonusPoints);
        cc.display();
        Core.addCreditCard(cc);
        this.finish();
    }
}
