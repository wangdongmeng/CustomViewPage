package com.example.hua.custombannerapplication.banner;

import android.support.v4.view.ViewPager;

import java.util.List;

/**
 * Created by hua on 2017/12/11.
 */

public interface PageIndicatorListener<T> extends ViewPager.OnPageChangeListener {

    void setmDatas(List<T> mDatas);

    List<T> getmDatas();
}
