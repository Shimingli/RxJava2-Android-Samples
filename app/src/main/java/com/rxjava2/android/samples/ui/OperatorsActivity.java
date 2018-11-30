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

/**
 * Rxjava的 Operators
 */
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
     * 使用取算符，它只发出所需数量的值。这里只有5个中的3个
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
     * 使用跳过操作符，它不会发出前2个值。 对前面两个值不会操作
     * @param view
     */
    public void startSkipActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, SkipExampleActivity.class));
    }
    /**
     * 使用扫描算子，它也发送先前的结果。 意思就是 我关心每次运算的结果 ，是每次运算的结果
     * 这个有个关键的地方 subscribe 里面的 观察者 onNext的方法是先行执行的
     * @param view
     */
    public void startScanActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, ScanExampleActivity.class));
    }
    /**
     * PublishSubject 我个人理解的话，就是一堆数据我要发送给别人，但是呢最后几个数字我又要发送给其他人，所以就需要使用到这个
     * @param view
     */
    public void startReplayActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, ReplayExampleActivity.class));
    }
    /**
     * 依次的发送两个数组，而且里面两个数组的是有序的输出的，所以就要使用到这个里面的
     * @param view
     */
    public void startConcatActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, ConcatExampleActivity.class));
    }
    /**
     * 依次的发送两个数组，而且里面两个数组的不是有序的输出的，但是我始终没有测出来结果，哎哎 难受的很  日了狗！
     * @param view
     */
    public void startMergeActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, MergeExampleActivity.class));
    }
    /**
     * 即使我们在创建了可观察的品牌之后设置了品牌，我们也会得到宝马的品牌。如果我们不使用延迟器，我们将没有作为品牌。
     * 说通俗一点就是我们设置一个bean的属性，这个属性能跟着观察者走下去
     * @param view
     */
    public void startDeferActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, DeferExampleActivity.class));
    }
    /**
     * 去重，对数据源，进行去重的操作
     * @param view
     */
    public void startDistinctActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, DistinctExampleActivity.class));
    }


    /**
     * 对数据源传递，但是只不过是取最后一个数，把前面的都不需要了
     * @param view
     */
    public void startLastOperatorActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, LastOperatorExampleActivity.class));
    }

    /**
     * 就是同一个消息队列，直接两个观察者共享这个消息
     * @param view
     */
    public void startReplaySubjectActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, ReplaySubjectExampleActivity.class));
    }

    /**
     * 感觉就是两个订阅者，分开订阅 ，其中一个订阅者只关心一个结果
     * @param view
     */
    public void startPublishSubjectActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, PublishSubjectExampleActivity.class));
    }

    /**
     * BehaviorSubject 发出一个消息，然后订阅了，另外一个订阅者就会马上走这个结果输出，而且是交替输出的，不是单独输出的
     * @param view
     */
    public void startBehaviorSubjectActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, BehaviorSubjectExampleActivity.class));
    }

    /**
     * AsyncSubject 就只能观察到最后一个值，另个订阅者 就只能接收到一个值
     * @param view
     */
    public void startAsyncSubjectActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, AsyncSubjectExampleActivity.class));
    }


    /**
     * 这个牛逼啊，todo 真的牛逼啊，我只去一次的事件，而不是乱取某个时间，和这个时间段内我只去一个事件
     * throttleFirst  一定时间内取第一次发送的事件。例子：防止按钮的连续点击  开头
     * @param view
     */
    public void startThrottleFirstActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this,ThrottleFirstExampleActivity.class));
    }


    /**
     * 这个牛逼啊，todo 真的牛逼啊，我只去一次的事件，而不是乱取某个时间，和这个时间段内我只去一个事件
     * throttleLast 这个是结尾啊 ，取这段时间的结尾 ，而不是开头的时间
     * 一定时间内取第一次发送的事件。例子：防止按钮的连续点击  开头
     * @param view
     */
    public void startThrottleLastActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, ThrottleLastExampleActivity.class));
    }

    /**
     *  第一个事件1发送出来以后过了400毫秒后发送出了第二个事件，此时不事件1不满足时间的条件被遗弃，然后重新计时；
     * 2发出后休眠了505毫秒，超过了500毫秒，所以2被发射了出来，被观察者收到；
     * 3发出来后又过了100毫秒4发出来，所以3被遗弃，从4重新计时，后又过了605毫秒下一个事件才发出，所以4被发射了出来；
     * 同理，5之后的0.5秒内也没有再发出别的事件，所以最终5也被发射了出来。
     *
     * 类似一个弹簧，如果一个事件相当于挤压它一下的话，它回到初始状态需要一段时间，那如果一直有事件不断的挤压它，那它一直回不到初始状态，就一个事件也弹不出来。一旦有一段时间里面没有人挤压它，他就把最后一个弹出来了。周而复始
     *  TODO 某个事件，消费了 多少秒   达到以后 才能消费这个时间
     *  @param view
     */
    public void startDebounceActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this, DebounceExampleActivity.class));
    }


    /**
     * RxJava的window()函数和buffer()很像，但是它发射的是Observable而不是列表。下图展示了window()如何缓存3个数据项并把它们作为一个新的Observable发射出去。
     * @param view
     */
    public void startWindowActivity(View view) {
        startActivity(new Intent(OperatorsActivity.this,WindowExampleActivity.class));
    }

    /**
     * 使用延迟2秒后发射的简单示例
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
