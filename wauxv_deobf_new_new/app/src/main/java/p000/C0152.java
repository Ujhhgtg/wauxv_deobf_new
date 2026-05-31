package p000;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.Log;
import android.view.View;
import com.kongzue.dialogx.interfaces.AbstractC0034;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.concurrent.CopyOnWriteArrayList;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲁᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0152 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static C0152 f1209;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static Application f1210;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public C1139 f1211;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static Activity m1295() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("currentActivityThread", null).invoke(null, null);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(objInvoke);
            if (arrayMap.size() < 1) {
                return null;
            }
            for (Object obj : arrayMap.values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    return (Activity) declaredField3.get(obj);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m1296(Context context, C1139 c1139) {
        if (context == null) {
            Application application = f1210;
            if (application != null) {
                m1296(application, c1139);
                return;
            }
            return;
        }
        Application application2 = (Application) context.getApplicationContext();
        if (application2 == null) {
            AbstractC1469 abstractC1469 = AbstractC1037.f3785;
            Log.e(">>>", "DialogX 未初始化(E1)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
            return;
        }
        f1210 = application2;
        C0152 c0152 = f1209;
        if (c0152 != null) {
            application2.unregisterActivityLifecycleCallbacks(c0152);
        }
        C0152 c0153 = new C0152();
        c0153.f1211 = c1139;
        f1209 = c0153;
        application2.registerActivityLifecycleCallbacks(c0153);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C1139 c1139 = this.f1211;
        if (c1139 != null) {
            c1139.getClass();
            AbstractC0034.m886(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (AbstractC0034.m884() == activity) {
            WeakReference weakReference = AbstractC0034.f970;
            if (weakReference != null) {
                weakReference.clear();
            }
            AbstractC0034.f970 = null;
            AbstractC1469 abstractC1469 = AbstractC1037.f3785;
        }
        if (Build.VERSION.SDK_INT < 29) {
            AbstractC0034.m888(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0034.m888(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreResumed(Activity activity) {
        if (Build.VERSION.SDK_INT < 29 || activity.isDestroyed() || activity.isFinishing()) {
            return;
        }
        AbstractC0034.m886(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (activity.isDestroyed() || activity.isFinishing()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 29 && !activity.isDestroyed() && !activity.isFinishing()) {
            AbstractC0034.m886(activity);
        }
        if (AbstractC0034.f971 != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(AbstractC0034.f971);
            for (int size = copyOnWriteArrayList.size() - 1; size >= 0; size--) {
                AbstractC0034 abstractC0034 = (AbstractC0034) copyOnWriteArrayList.get(size);
                if (abstractC0034.m898() == activity && abstractC0034.f982 && abstractC0034.m897() != null) {
                    View viewFindViewById = abstractC0034.m897().findViewById(R.id.box_root);
                    if (viewFindViewById instanceof DialogXBaseRelativeLayout) {
                        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) viewFindViewById;
                        if (dialogXBaseRelativeLayout.f1001) {
                            View viewFindFocus = dialogXBaseRelativeLayout.findFocus();
                            if (viewFindFocus == null || viewFindFocus == dialogXBaseRelativeLayout) {
                                dialogXBaseRelativeLayout.requestFocus();
                                return;
                            } else {
                                viewFindFocus.requestFocus();
                                return;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (f1210 == null) {
            AbstractC0034.m885(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
