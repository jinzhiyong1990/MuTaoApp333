package com.example.zhiyongjin.mutao.util;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.zhiyongjin.mutao.R;
import com.example.zhiyongjin.mutao.fragment.FindFragment;
import com.example.zhiyongjin.mutao.fragment.MainFragment;
import com.example.zhiyongjin.mutao.fragment.MyFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    protected LinearLayout mMenuMain;
    protected LinearLayout mMenuFind;
    protected LinearLayout mMenuMy;
    protected MainFragment mMainFragment = new MainFragment();//首页
    protected FindFragment mFindFragment = new FindFragment();//发现
    protected MyFragment mMyFragment = new MyFragment();//我的


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        获取管理类
//        beginTransaction: 开启事物
        initView();
        this.getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container_content, mMainFragment)
                .add(R.id.container_content, mFindFragment)
                .hide(mFindFragment)
                .add(R.id.container_content, mMyFragment)
                .hide(mMyFragment)


//        事物添加  默认: 显示首页   其他页面: 隐藏


//        提交
        .commit();

    }

//初始化视图

    public void initView(){
        mMenuMain = this.findViewById(R.id.menu_main);
        mMenuFind = this.findViewById(R.id.menu_find);
        mMenuMy = this.findViewById(R.id.menu_me);

        mMenuMain.setOnClickListener(this);
        mMenuFind.setOnClickListener(this);
        mMenuMy.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.menu_main: //首页
//                显示第一个, 另外两个隐藏
                this.getSupportFragmentManager()
                        .beginTransaction()
                        .show(mMainFragment)
                        .hide(mMyFragment)
                        .hide(mFindFragment)
                        .commit();
                break;
            case R.id.menu_find: //发现
                this.getSupportFragmentManager()
                        .beginTransaction()
                        .hide(mMainFragment)
                        .hide(mMyFragment)
                        .show(mFindFragment)
                        .commit();
                break;
            case R.id.menu_me: //我的
                this.getSupportFragmentManager()
                        .beginTransaction()
                        .hide(mMainFragment)
                        .show(mMyFragment)
                        .hide(mFindFragment)
                        .commit();
                break;
        }
    }
}
