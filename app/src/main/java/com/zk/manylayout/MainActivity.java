package com.zk.manylayout;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static android.support.v7.widget.LinearLayoutManager.*;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecy;
    ListView     mLv;
    //    List<Integer> mList = new ArrayList<>();
    List<Bean> mList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initList();
        initView();

    }

    private void initList() {
        //随机数 用来标记item界面的类型
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int nextInt = random.nextInt(3);
            Bean bean = new Bean();
            //nexInte(3) 随机 生成的0，1，2
            //每循环一次 就给当前位置的条目设置一个标签类型
            bean.type = nextInt;
            mList.add(bean);
            Log.e("随机数",nextInt+"/n");
        }
    }

    private void initView() {
        mRecy = findViewById(R.id.mRecy);
        mLv = findViewById(R.id.mLv);
        mRecy.setLayoutManager(new LinearLayoutManager(this));
        //TODO 分割线
        DividerItemDecoration itemDecoration = new DividerItemDecoration(MainActivity.this, DividerItemDecoration.HORIZONTAL);
        mRecy.addItemDecoration ( itemDecoration);
        //        mRecy.setAdapter(new MyAdapter(this, mList));
        //        mLv.setAdapter(new MyAdapter2(mList,this));
        mRecy.setAdapter(new MyAdapter3(this, mList));

    }
}
