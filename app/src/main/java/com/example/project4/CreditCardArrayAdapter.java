package com.example.project4;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;




public class CreditCardArrayAdapter extends ArrayAdapter
{
    private Context mContext;
    private CreditCard[] creditCardList;
    private int textViewResourceId;

    public CreditCardArrayAdapter(Context context, int textViewResourceId,
                                  CreditCard[] list)
    {
        super(context, textViewResourceId , list);
        this.mContext = context;
        this.creditCardList = list;
        this.textViewResourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {

        View listItem = convertView;
        if(listItem == null)
        {
            listItem = LayoutInflater.from(mContext).
                    inflate(this.textViewResourceId,parent,false);
        }


        TextView ccName = (TextView)listItem.findViewById(R.id.ccNameTV);
        TextView ccStartDate = (TextView)listItem.findViewById(R.id.ccStartDateTV);
        TextView ccMinSpend = (TextView)listItem.findViewById(R.id.ccMinSpendTV);
        TextView ccBonusPoints = (TextView)listItem.findViewById(R.id.ccBonusPointsTV);
        CreditCard cc = this.creditCardList[position];

        ccName.setText(cc.getName());
        ccStartDate.setText(cc.getStart_date());
        ccMinSpend.setText("" + cc.getMin_spend());
        ccBonusPoints.setText("" + cc.getPoint_bonus());

        return listItem;
    }
}
