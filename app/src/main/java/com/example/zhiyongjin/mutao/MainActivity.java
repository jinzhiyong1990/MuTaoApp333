package com.example.zhiyongjin.mutao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.zhiyongjin.mutao.fragment.FindFragment;
import com.example.zhiyongjin.mutao.fragment.MainFragment;
import com.example.zhiyongjin.mutao.fragment.MyFragment;

public class MainActivity extends AppCompatActivity {

    protected MainFragment mMainFragment = new MainFragment();//首页
    protected FindFragment mFindFragment = new FindFragment();//发现
    protected MyFragment mMyFragment = new MyFragment();//我的


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        获取管理类
//        beginTransaction: 开启事物

        this.getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container_content, mMainFragment)
                .add(R.id.container_content, mMyFragment)
                .hide(mMyFragment)
                .add(R.id.container_content, mFindFragment)
                .hide(mFindFragment)



//        事物添加  默认: 显示首页   其他页面: 隐藏




//        提交
        .commit();




    }
}
