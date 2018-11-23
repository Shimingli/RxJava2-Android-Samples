package com.rxjava2.android.samples.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.rxjava2.android.samples.R;
import com.rxjava2.android.samples.ui.operators.AsyncSubjectExampleActivity;
import com.rxjava2.android.samples.ui.operators.BehaviorSubjectExampleActivity;
import com.rxjava2.android.samples.ui.operators.BufferExampleActivity;
import com.rxjava2.android.samples.ui.operators.CompletableObserverExampleActivity;
import com.rxjava2.android.samples.ui.operators.ConcatExampleActivity;
import com.rxjava2.android.samples.ui.operators.DebounceExampleActivity;
import com.rxjava2.android.samples.ui.operators.DeferExampleActivity;
import com.rxjava2.android.samples.ui.operators.DelayExampleActivity;
import com.rxjava2.android.samples.ui.operators.DisposableExampleActivity;
import com.rxjava2.android.samples.ui.operators.DistinctExampleActivity;
import com.rxjava2.android.samples.ui.operators.FilterExampleActivity;
import com.rxjava2.android.samples.ui.operators.FlowableExampleActivity;
import com.rxjava2.android.samples.ui.operators.IntervalExampleActivity;
import com.rxjava2.android.samples.ui.operators.LastOperatorExampleActivity;
import com.rxjava2.android.samples.ui.operators.MapExampleActivity;
import com.rxjava2.android.samples.ui.operators.MergeExampleActivity;
import com.rxjava2.android.samples.ui.operators.PublishSubjectExampleActivity;
import com.rxjava2.android.samples.ui.operators.ReduceExampleActivity;
import com.rxjava2.android.samples.ui.operators.ReplayExampleActivity;
import com.rxjava2.android.samples.ui.operators.ReplaySubjectExampleActivity;
import com.rxjava2.android.samples.ui.operators.ScanExampleActivity;
import com.rxjava2.android.samples.ui.operators.SimpleExampleActivity;
import com.rxjava2.android.samples.ui.operators.SingleObserverExampleActivity;
import com.rxjava2.android.samples.ui.operators.SkipExampleActivity;
import com.rxjava2.android.samples.ui.operators.SwitchMapExampleActivity;
import com.rxjava2.android.samples.ui.operators.TakeExampleActivity;
import com.rxjava2.android.samples.ui.operators.ThrottleFirstExampleActivity;
import com.rxjava2.android.samples.ui.operators.ThrottleLastExampleActivity;
import com.rxjava2.android.samples.ui.operators.TimerExampleActivity;
import com.rxjava2.android.samples.ui.operators.WindowExampleActivity;
import com.rxjava2.android.samples.ui.operators.ZipExampleActivity;

import androidx.appcompat.app.AppCompatActivity;

public class OperatorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operators);
    }

    /**
     * 简单的一个顺序执行的Demo
     * @param view
     */
    public void startSimpleActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, SimpleExampleActivity.class));
    }

    /**
     * 通过map运算符 处理网咯请求的Demo
     * @param view
     */
    public void startMapActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, MapExampleActivity.class));
    }

    /**
     * 两个复杂的操作放到子线程中去，然后在主线程中去处理  两队球迷的问题
     * @param view
     */
    public void startZipActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, ZipExampleActivity.class));
    }

    /**
     * 对一些耗时操作的问题，可以使用使用容器 Disposable
     * @param view
     */
    public void startDisposableActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, DisposableExampleActivity.class));
    }

    /**
     * 使用取算符，它只发出
     * *所需数量的值。这里只有5个中的3个
     * @param view
     */
    public void startTakeActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, TakeExampleActivity.class));
    }

    /**
     * 延迟两秒运行
     * @param view
     */
    public void startTimerActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, TimerExampleActivity.class));
    }

    /**
     * 定时器 不断重复的运行  使用RxJava运行  使用间隔2秒的间隔运行任务的简单示例
     * @param view
     */
    public void startIntervalActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, IntervalExampleActivity.class));
    }

    /**
     * 使用单观察者的简单例子
     * @param view
     */
    public void startSingleObserverActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, SingleObserverExampleActivity.class));
    }

    /**使用完全观测器的简单示例
     * @param view
     */
    public void startCompletableObserverActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, CompletableObserverExampleActivity.class));
    }
    /**
     *说白了 就是累加的过程 1+2+3+4+5  ====  使用Rxjava管理  这个带了一个初始值
     * 使用流动性的简单示例
     * @param view
     */
    public void startFlowableActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, FlowableExampleActivity.class));
    }
    /**
     *
     * 说白了 就是累加的过程 1+2+3+4+5  ====  使用Rxjava管理  这个没有带一个初始值
     * @param view
     */
    public void startReduceActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, ReduceExampleActivity.class));
    }
    /**
     * 一个buffer 缓冲取 ，我要从缓冲区中取数据，而且是跳着取数据，就要这样做
     * @param view
     */
    public void startBufferActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, BufferExampleActivity.class));
    }
    /**
     * 对数据中特定的信息 做处理
     * 使用过滤器操作符只发出偶数值的简单示例
     * @param view
     */
    public void startFilterActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, FilterExampleActivity.class));
    }
    /**
     * @param view
     */
    public void startSkipActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, SkipExampleActivity.class));
    }
    /**
     * @param view
     */
    public void startScanActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, ScanExampleActivity.class));
    }
    /**
     * @param view
     */
    public void startReplayActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, ReplayExampleActivity.class));
    }
    /**
     * @param view
     */
    public void startConcatActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, ConcatExampleActivity.class));
    }
    /**
     * @param view
     */
    public void startMergeActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, MergeExampleActivity.class));
    }
    /**
     * @param view
     */
    public void startDeferActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, DeferExampleActivity.class));
    }
    /**
     * @param view
     */
    public void startDistinctActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, DistinctExampleActivity.class));
    }
    /**
     * @param view
     */
    public void startLastOperatorActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, LastOperatorExampleActivity.class));
    }
    /**
     * @param view
     */
    public void startReplaySubjectActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, ReplaySubjectExampleActivity.class));
    }
    /**
     * @param view
     */
    public void startPublishSubjectActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, PublishSubjectExampleActivity.class));
    }
    /**
     * @param view
     */
    public void startBehaviorSubjectActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, BehaviorSubjectExampleActivity.class));
    }
    /**
     * @param view
     */
    public void startAsyncSubjectActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, AsyncSubjectExampleActivity.class));
    }
    /**
     * @param view
     */
    public void startThrottleFirstActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this,ThrottleFirstExampleActivity.class));
    }
    /**
     * @param view
     */
    public void startThrottleLastActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, ThrottleLastExampleActivity.class));
    }
    /**
     * @param view
     */
    public void startDebounceActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, DebounceExampleActivity.class));
    }
    /**
     * @param view
     */
    public void startWindowActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this,WindowExampleActivity.class));
    }
    /**
     * @param view
     */
    public void startDelayActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this,DelayExampleActivity.class));
    }
    /**
     * @param view
     */
    public void startSwitchMapActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, SwitchMapExampleActivity.class));
    }
}
