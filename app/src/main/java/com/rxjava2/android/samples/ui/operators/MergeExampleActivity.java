package com.rxjava2.android.samples.ui.operators;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.rxjava2.android.samples.R;
import com.rxjava2.android.samples.utils.AppConstant;

import androidx.appcompat.app.AppCompatActivity;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;


public class MergeExampleActivity extends AppCompatActivity {

    private static final String TAG = MergeExampleActivity.class.getSimpleName();
    Button btn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);
        btn = findViewById(R.id.btn);
        textView = findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doSomeWork();
            }
        });
    }

    /*
     * Ex - "A1", "B1", "A2", "A3", "A4", "B2", "B3" - may be anything
     * *使用合并运算符组合可观察性：合并不维护
     *可观察的顺序。
     *将发出的所有7个值可能不按顺序
     *“A1”、“B1”、“A2”、“A3”、“A4”、“B2”、“B3”可能是任何东西。
     */
    //RxJava 合并组合两个（或多个）Observable数据源
    private void doSomeWork() {
        final String[] aStrings = {"A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12","A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",

                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "end end "
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "end end "
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "end end "
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "end end "
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "end end "
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "A1", "A2", "A3", "A4","1", "2", "3", "4","5", "6", "7", "8","9", "10", "11", "12",
                "end end "
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"
                , "A1", "A2", "A3", "A4"

        };
        final String[] bStrings = {"B1", "B2", "B3","B1", "B2", "B3","B1", "B2", "B3","B1", "B2", "B3","B1", "B2", "B3","B1", "B2", "B3","B1", "B2", "B3"};

        final Observable<String> aObservable = Observable.fromArray(aStrings);
        final Observable<String> bObservable = Observable.fromArray(bStrings);

        Observable.merge(aObservable, bObservable)
                .subscribe(getObserver());
    }


    private Observer<String> getObserver() {
        return new Observer<String>() {

            @Override
            public void onSubscribe(Disposable d) {
                Log.d(TAG, " onSubscribe : " + d.isDisposed());
            }

            @Override
            public void onNext(String value) {
                textView.append(" onNext : value : " + value);
                textView.append(AppConstant.LINE_SEPARATOR);
                Log.d(TAG, " onNext : value : " + value);
            }

            @Override
            public void onError(Throwable e) {
                textView.append(" onError : " + e.getMessage());
                textView.append(AppConstant.LINE_SEPARATOR);
                Log.d(TAG, " onError : " + e.getMessage());
            }

            @Override
            public void onComplete() {
                textView.append(" onComplete");
                textView.append(AppConstant.LINE_SEPARATOR);
                Log.d(TAG, " onComplete");
            }
        };
    }


}