package com.example.hua.custombannerapplication;

import android.content.Context;

import com.example.hua.custombannerapplication.banner.PageIndicatorListener;
import com.rd.PageIndicatorView;
import com.rd.animation.type.AnimationType;

import java.util.List;

/**
 * Created by hua on 2017/12/11.
 */

public class CustomIndicator implements PageIndicatorListener {

    private Context context;
    PageIndicatorView pageIndicatorView;

    public CustomIndicator(Context context) {
        this.context = context;
        pageIndicatorView = new PageIndicatorView(this.context);

        pageIndicatorView.setRadius(5);
        pageIndicatorView.setPadding(5);
        pageIndicatorView.setStrokeWidth(5);
        //set color
        pageIndicatorView.setUnselectedColor(Common.indicatorColors[0]);
        pageIndicatorView.setSelectedColor(Common.indicatorColors[2]);
        pageIndicatorView.setAnimationType(AnimationType.THIN_WORM);
    }

    public PageIndicatorView getPageIndicatorView() {
        return pageIndicatorView;
    }

    @Override
    public void setmDatas(List mDatas) {
        pageIndicatorView.setCount(mDatas.size());
    }

    @Override
    public List getmDatas() {
        return null;
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        pageIndicatorView.setSelection(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
