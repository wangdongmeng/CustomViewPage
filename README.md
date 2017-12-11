# CustomViewPage

转：http://www.jianshu.com/p/a175a6bd80ca

1、引用:

版本号： 

// root build.gradle

repositories {
    jcenter()
    maven { url "https://www.jitpack.io" }
}

// yout project build.gradle
dependencies {
        compile 'com.github.LidongWen:WenldBanner:xxx'
}



2. 使用 WenldBanner:

2.1. xml

```
    <com.wenld.wenldbanner.WenldBanner
        xmlns:app="http://schemas.android.com/apk/res-auto"
        android:id="@+id/commonBanner"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:canLoop="true"    //设置是否循环
        app:canTurn="true"  //是否可以跳转
        app:autoTurnTime="5000"// 页面切换间隔
        app:scrollDuration="2000"//页面切换持续时间
        app:isTouchScroll="true" //是否支持手动滑动
        app:reverse="true" // 是否反向切换页面（切换方向）
   />
```
2.2. Java代码中设置属性

        wenldBanner = (WenldBanner) findViewById(R.id.commonBanner);
        //初始化指示器
        defaultPageIndicator = new DefaultPageIndicator(this);
       //设置指示器样式  选中图标与未选中图标
        defaultPageIndicator.setPageIndicator(new int[]{R.mipmap.ic_page_indicator, R.mipmap.ic_page_indicator_focused});

        //设置 view 与 数据
        wenldBanner.setPages(Common.holder, Common.datas);
        wenldBanner
                .setPageIndicatorListener(defaultPageIndicator)  //设置指示器监听
                .setIndicatorView(defaultPageIndicator)  //设置指示器VIew
                .setPageIndicatorAlign(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.CENTER_HORIZONTAL);    //设置指示器位置
