package zsy.utils;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class ViewUtils {


    public static void addButton(LinearLayout ll, String text, View.OnClickListener onClickListener) {
        Button btn = new Button(ll.getContext());
        btn.setText(text);
        btn.setOnClickListener(onClickListener);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        ll.addView(btn, params);
    }
}