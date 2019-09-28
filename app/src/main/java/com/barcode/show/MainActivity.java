package com.barcode.show;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

/**
 * @author：Auser
 * @create：2019/9/25.
 * @Describe： ConstraintLayout布局：https://www.jianshu.com/p/17ec9bd6ca8a
 */
public class MainActivity extends AppCompatActivity {

    private RecyclerView mRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_test);
        mRv = findViewById(R.id.recyclerView);
        TestAdapter adapter = new TestAdapter();
        mRv.setLayoutManager(new GridLayoutManager(this, 2));
        mRv.setAdapter(adapter);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add("");
        }
        adapter.setNewData(list);

    }
}
