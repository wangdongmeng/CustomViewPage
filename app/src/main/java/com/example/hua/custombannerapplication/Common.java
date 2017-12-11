package com.example.hua.custombannerapplication;

import android.content.Context;
import android.view.ViewGroup;

import com.example.hua.custombannerapplication.banner.helper.Holder;
import com.example.hua.custombannerapplication.banner.helper.ViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hua on 2017/12/11.
 */

public class Common {

    public static List<String> datas;
    public static List<String> datas2;
    public static Holder<String> holder;
    public static int[] indicatorGrouop;
    public static int[] bgColors;
    public static int[] indicatorColors;

    static {
        datas = new ArrayList<>();        datas2 = new ArrayList<>();
        datas.add("第一个");
        datas.add("第二个");
        datas.add("第三个");

        datas2.add("datas 2第一个");
        datas2.add("datas 2第二个");
        datas2.add("datas 2第三个");
        datas2.add("datas 2第四个");
        datas2.add("datas 2第五个");
        datas2.add("datas 2第六个");

        bgColors = new int[]{0xff66cccc, 0xffccff66, 0xffff99cc};
        indicatorColors = new int[]{0xff993366, 0xffffff66, 0xff666633};

        holder = new Holder<String>() {
            @Override
            public ViewHolder createView(Context context, ViewGroup parent, int pos, int viewType) {
                return ViewHolder.createViewHolder(context, parent, R.layout.layout_text, getViewType(pos));
            }

            @Override
            public void UpdateUI(Context context, ViewHolder viewHolder, int position, String data) {
                viewHolder.setText(R.id.tv, data);
                viewHolder.setBackgroundColor(R.id.tv, bgColors[position % bgColors.length]);
            }

            @Override
            public int getViewType(int position) {
                return 0;
            }
        };

        indicatorGrouop = new int[]{R.mipmap.ic_page_indicator, R.mipmap.ic_page_indicator_focused};
    }
}
