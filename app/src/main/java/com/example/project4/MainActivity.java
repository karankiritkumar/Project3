package com.example.project4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.project4.R;

public class MainActivity extends AppCompatActivity {

    private ListView creditCardLV, loyaltyProgramLV;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinkedList ll = new LinkedList();
        for(int i = 0; i < 10; i++)
        {
            ll.addEnd(i);
        }

        for(int i = 0; i < ll.length(); i++)
        {
            System.out.println("LL: " + ll.getAtIndex(i));
        }

        for(int i = 0; i < 1000; i++)
        {
            Core.theLoyaltyProgramStrings[i] = "N/A";
            Core.theCreditCardStrings[i] = "N/A";
            Core.theCreditCards[i] = new CreditCard();
        }

        this.creditCardLV = (ListView)this.findViewById(R.id.creditCardListView);
        this.loyaltyProgramLV = (ListView)this.findViewById(R.id.loyaltyProgramListView);
        //Core.ccAdapter = new ArrayAdapter(this, R.layout.student_listview_row, Core.theCreditCardStrings);
        Core.ccCustomAdapter = new CreditCardArrayAdapterForLinkedLists(this, R.layout.custom_credit_card_row, Core.theCreditCardsLL);
        Core.lpAdapter = new ArrayAdapter(this, R.layout.student_listview_row, Core.theLoyaltyProgramStrings);

        this.creditCardLV.setAdapter(Core.ccCustomAdapter);
        this.loyaltyProgramLV.setAdapter(Core.lpAdapter);

    }

    public void onAddCreditCardButtonPressed(View v)
    {
        Intent i = new Intent(this, AddCreditCardActivity.class);
        this.startActivity(i);
    }

    public void onAddLoyaltyProgramButtonPressed(View v)
    {
        Intent i = new Intent(this, AddLoyaltyProgramActivity.class);
        this.startActivity(i);
    }

}
