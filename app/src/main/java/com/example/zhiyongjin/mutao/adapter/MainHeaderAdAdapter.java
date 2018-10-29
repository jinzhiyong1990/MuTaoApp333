package com.example.zhiyongjin.mutao.adapter;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class MainHeaderAdAdapter extends PagerAdapter {

    Context context;
    List<ImageView> imageViews;

//    构造方法: 主要是用来传输数据的
  public MainHeaderAdAdapter(Context context, List<ImageView> imageViews){
      this.context = context;
      this.imageViews=imageViews;
  }
    @Override
    public int getCount() {
//      判断一下: 如果现在集合是不等于空的, 那么就返回集合的大小, 否则返回0
        return imageViews!=null?imageViews.size():0;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
      container.addView(imageViews.get(position));
        return imageViews.get(position);

    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==o;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(imageViews.get(position));
    }
}
