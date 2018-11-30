package com.rxjava2.android.samples.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.rxjava2.android.samples.MyApplication;
import com.rxjava2.android.samples.R;
import com.rxjava2.android.samples.ui.compose.ComposeOperatorExampleActivity;
import com.rxjava2.android.samples.ui.networking.NetworkingActivity;
import com.rxjava2.android.samples.ui.pagination.PaginationActivity;
import com.rxjava2.android.samples.ui.rxbus.RxBusActivity;
import com.rxjava2.android.samples.ui.search.SearchActivity;

import androidx.appcompat.app.AppCompatActivity;

/**
 * rukou
 */
public class SelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
    }


    public void startOperatorsActivity(View view) {
        startActivity(new Intent(SelectionActivity.this, OperatorsActivity.class));
    }

    public void startNetworkingActivity(View view) {
        startActivity(new Intent(SelectionActivity.this, NetworkingActivity.class));
    }


    /**
     * 打开RxBus 接受事件----
     * @param view
     */
    public void startRxBusActivity(View view) {
        // 延迟2s 开启一个事件
        ((MyApplication) getApplication()).sendAutoEvent();
        startActivity(new Intent(SelectionActivity.this, RxBusActivity.class));
    }

    /**
     * 分页   使用 RxJava 去分页
     * @param view
     */
    public void startPaginationActivity(View view) {
        startActivity(new Intent(SelectionActivity.this, PaginationActivity.class));
    }

    /**
     * 编写可重用代码。
     * @param view
     */
    public void startComposeOperator(View view) {
        startActivity(new Intent(SelectionActivity.this, ComposeOperatorExampleActivity.class));
    }


    /**
     * 感觉就是 连续的操作符  连续加在一起的效果
     * @param view
     */
    public void startSearchActivity(View view) {
        startActivity(new Intent(SelectionActivity.this, SearchActivity.class));
    }

}
