package com.example.hua.custombannerapplication.banner.helper;

import android.content.Context;
import android.view.ViewGroup;

/**
 * Created by hua on 2017/12/11.
 */

public interface Holder<T> {
    ViewHolder createView(Context context,
                          ViewGroup parent, int position, int viewType);
    void UpdateUI(Context context, ViewHolder viewHolder, int position, T data);
    int getViewType(int position);

}
