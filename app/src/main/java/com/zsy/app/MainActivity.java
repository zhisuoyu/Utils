package com.zsy.app;

import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

import zsy.framework.test.TestActivity;
import zsy.utils.ConvertUtils;
import zsy.utils.Utils;
import zsy.utils.dputils.ToastUtils;
import zsy.wrapper.lg.java.Lg;

public class MainActivity extends TestActivity {


    @Override
    public void init() {
        Utils.init(this);
        super.init();
    }

    @Override
    public List<String> getActions() {
        return Arrays.asList("Action1", "Action2", "Action3");
    }

    @Override
    public void onItemClick(int position) {
        switch (position) {
            case 0:
                Lg.i("30dp=>" + ConvertUtils.dp2px(this, 30) + "px");
                break;
            case 1:
                ToastUtils.showShort("Hello");
                break;
            case 2:
                Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
