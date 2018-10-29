package com.example.zhiyongjin.mutao.util;

import android.content.Context;
import android.widget.ImageView;
import android.widget.MediaController;

import com.example.zhiyongjin.mutao.entity.Menu;

import java.util.ArrayList;
import java.util.List;

//主要是添加数据
public class DateUtil {
    /**
     * @param context
     * @param icons
     * @return
     */

    public static List<ImageView> getHeaderAddInfo(Context context, int icons[]) {
        List<ImageView> dates = new ArrayList<>();

        for (int i = 0; i < icons.length; i++) {
            ImageView icon = new ImageView(context);
            icon.setScaleType(ImageView.ScaleType.CENTER_CROP);
            icon.setImageResource(icons[i]);
            dates.add(icon);
        }


        return dates;
    }

    public static List<Menu> getMainMenus(int icons[], String name[]) {
        List<Menu> menus = new ArrayList<>();


        for (int i = 0; i < icons.length; i++) {
            Menu menu = new Menu(icons[i], name[i]);
            menus.add(menu);
        }


        return menus;
    }

}
