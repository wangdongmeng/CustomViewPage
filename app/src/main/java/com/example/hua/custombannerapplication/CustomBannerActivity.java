package com.example.hua.custombannerapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;

import com.example.hua.custombannerapplication.banner.DefaultPageIndicator;
import com.example.hua.custombannerapplication.banner.WenldBanner;

public class CustomBannerActivity extends AppCompatActivity {

    private WenldBanner wenldBanner;
    private DefaultPageIndicator defaultPageIndicator;

    private CustomIndicator customIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_banner);

        wenldBanner = (WenldBanner) findViewById(R.id.common_banner);

        defaultPageIndicator = new DefaultPageIndicator(this);
        defaultPageIndicator.setPageIndicator(Common.indicatorGrouop);


        customIndicator = new CustomIndicator(this);

        wenldBanner.setPages(Common.holder, Common.datas);

        //默认指示器
        switchDefaultIndicator();


        //能否能执行自动翻页
        wenldBanner.setCanTurn(true);
        // 是否循环
        wenldBanner.setCanLoop(true);
        //
        wenldBanner.setTouchScroll(true);

        //
        wenldBanner.setAutoTurnTime(1000);

        wenldBanner.setScrollDuration(1000);

        wenldBanner.setPageTransformer(new ZoomOutPageTransformer());

        wenldBanner.setPageIndicatorAlign(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.CENTER_HORIZONTAL);


        //自定义指示器
//        switchCustomIndicator();

        //能否能执行自动翻页
//        wenldBanner.setCanTurn(false);
        // 是否循环
//        wenldBanner.setCanLoop(false);
        //
//        wenldBanner.setTouchScroll(false);

        //
//        wenldBanner.setAutoTurnTime(10000);

//        wenldBanner.setScrollDuration(2000);


//        wenldBanner.setPageIndicatorAlign(RelativeLayout.CENTER_HORIZONTAL);

//        wenldBanner.setPageTransformer(new ScaleInOutTransformer());

    }

    private void switchCustomIndicator() {
        wenldBanner.setPageIndicatorListener(customIndicator)
                .setIndicatorView(customIndicator.getPageIndicatorView())
                .setPageIndicatorAlign(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.CENTER_HORIZONTAL);

    }

    private void switchDefaultIndicator() {
        wenldBanner.setPageIndicatorListener(defaultPageIndicator)
                .setIndicatorView(defaultPageIndicator)
                .setPageIndicatorAlign(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.CENTER_HORIZONTAL);

    }
}
