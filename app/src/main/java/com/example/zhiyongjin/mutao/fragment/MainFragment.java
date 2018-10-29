package com.example.zhiyongjin.mutao.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
//import android.support.v7.app.AlertController;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;

import com.example.zhiyongjin.mutao.R;
import com.example.zhiyongjin.mutao.adapter.MainHeaderAdAdapter;
import com.example.zhiyongjin.mutao.util.DateUtil;

import java.util.zip.Inflater;

/*
* 主界面视图
* */
public class MainFragment extends Fragment {

    protected ViewPager viewPager;
    protected int[] icons = {R.mipmap.header_pic_ad1,R.mipmap.header_pic_ad2, R.mipmap.header_pic_ad1};
    //菜单图标
    protected int[] menuIcons = {R.mipmap.menu_airport, R.mipmap.menu_car, R.mipmap.menu_course, R.mipmap.menu_hatol,
    R.mipmap.menu_nearby, R.mipmap.menu_ticket, R.mipmap.menu_train, R.mipmap.menu_trav};
    String[] menus; //菜单
    protected RecyclerView mRecycleViewMenu;//主菜单
    protected ViewPager mVPagerHeaderAd; //广告头

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        menus= this.getActivity().getResources().getStringArray(R.array.main_menu);
        viewPager=getView().findViewById(R.id.vpager_main_header);
        mRecycleViewMenu = getView().findViewById(R.id.revyvleView_main_mene);

        MainHeaderAdAdapter adAdapter = new MainHeaderAdAdapter(getActivity(), DateUtil.getHeaderAddInfo(getActivity(), icons));
        viewPager.setAdapter(adAdapter);
    }
}
