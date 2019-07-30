package zsy.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/**
 * Created by 24275 on 2016/7/27.
 */
public class ActUtils {

//    public static void act2Act(@NonNull Activity act, @NonNull Class<?> cls) {
//        Intent intent = new Intent(act, cls);
//        act.startActivity(intent);
//    }
//
//    public static void frag2Act(Fragment fragment, Class<?> cls) {
//        Intent intent = new Intent(fragment.getActivity(), cls);
//        fragment.startActivity(intent);
//    }

    public static boolean isActivityexist(Context context, String pkg, String cls) {
        Intent intent = new Intent();
        intent.setClassName(pkg, cls);
        return context.getPackageManager().resolveActivity(intent, 0) != null;
    }

    public static void startActivity(Context context, String pkg, String cls) {
        ComponentName componentName = new ComponentName(pkg, cls);
        Intent intent = new Intent();
        intent.setComponent(componentName);
        context.startActivity(intent);
    }

}
