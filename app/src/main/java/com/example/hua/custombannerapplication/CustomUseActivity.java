package com.example.hua.custombannerapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.hua.custombannerapplication.banner.AutoTurnViewPager;
import com.example.hua.custombannerapplication.banner.DefaultPageIndicator;
import com.example.hua.custombannerapplication.banner.helper.UIContact;

public class CustomUseActivity extends AppCompatActivity {

    private AutoTurnViewPager viewPager;
    private DefaultPageIndicator indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_user);

        viewPager = (AutoTurnViewPager) findViewById(R.id.auto_turn_view_pager);

        indicator = (DefaultPageIndicator) findViewById(R.id.default_page_indicator);

        viewPager.setPages(Common.holder).setCanTurn(true).setScrollDuration(2000);

        viewPager.setPageTransformer(new ZoomOutPageTransformer());

        indicator.setPageIndicator(Common.indicatorGrouop);

        UIContact.with(viewPager, indicator).setData(Common.datas2);

    }

    public void notifyDataSetChanged(View view) {
        viewPager.getAdapter().notifyDataSetChanged();
    }


}
