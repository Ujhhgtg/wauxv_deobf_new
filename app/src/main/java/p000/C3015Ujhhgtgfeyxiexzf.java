package p000;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.Log;
import android.view.View;
import com.kongzue.dialogx.interfaces.Ujhhgtgfeyxiexzf;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.concurrent.CopyOnWriteArrayList;
import me.hd.wauxv.R;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛴᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3015Ujhhgtgfeyxiexzf implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static C3015Ujhhgtgfeyxiexzf f9368Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static Application f9369Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public C3382feyxiexzfUjhhgtg f9370Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static Activity m4459Ujhhgtgfeyxiexzf() {
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static void m4460Ujhhgtgfeyxiexzf(Context context, C3382feyxiexzfUjhhgtg c3382feyxiexzfUjhhgtg) {
        if (context == null) {
            Application application = f9369Ujhhgtgfeyxiexzf;
            if (application != null) {
                m4460Ujhhgtgfeyxiexzf(application, c3382feyxiexzfUjhhgtg);
                return;
            }
            return;
        }
        Application application2 = (Application) context.getApplicationContext();
        if (application2 == null) {
            AbstractC3085Ujhhgtgfeyxiexzf abstractC3085Ujhhgtgfeyxiexzf = AbstractC3177feyxiexzfUjhhgtg.f9822Ujhhgtgfeyxiexzf;
            Log.e(">>>", "DialogX 未初始化(E1)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
            return;
        }
        f9369Ujhhgtgfeyxiexzf = application2;
        C3015Ujhhgtgfeyxiexzf c3015Ujhhgtgfeyxiexzf = f9368Ujhhgtgfeyxiexzf;
        if (c3015Ujhhgtgfeyxiexzf != null) {
            application2.unregisterActivityLifecycleCallbacks(c3015Ujhhgtgfeyxiexzf);
        }
        C3015Ujhhgtgfeyxiexzf c3015Ujhhgtgfeyxiexzf2 = new C3015Ujhhgtgfeyxiexzf();
        c3015Ujhhgtgfeyxiexzf2.f9370Ujhhgtgfeyxiexzf = c3382feyxiexzfUjhhgtg;
        f9368Ujhhgtgfeyxiexzf = c3015Ujhhgtgfeyxiexzf2;
        application2.registerActivityLifecycleCallbacks(c3015Ujhhgtgfeyxiexzf2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C3382feyxiexzfUjhhgtg c3382feyxiexzfUjhhgtg = this.f9370Ujhhgtgfeyxiexzf;
        if (c3382feyxiexzfUjhhgtg != null) {
            c3382feyxiexzfUjhhgtg.getClass();
            Ujhhgtgfeyxiexzf.m887Ujhhgtgfeyxiexzf(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (Ujhhgtgfeyxiexzf.m885Ujhhgtgfeyxiexzf() == activity) {
            WeakReference weakReference = Ujhhgtgfeyxiexzf.f984Ujhhgtgfeyxiexzf;
            if (weakReference != null) {
                weakReference.clear();
            }
            Ujhhgtgfeyxiexzf.f984Ujhhgtgfeyxiexzf = null;
            AbstractC3085Ujhhgtgfeyxiexzf abstractC3085Ujhhgtgfeyxiexzf = AbstractC3177feyxiexzfUjhhgtg.f9822Ujhhgtgfeyxiexzf;
        }
        if (Build.VERSION.SDK_INT < 29) {
            Ujhhgtgfeyxiexzf.m889feyxiexzfUjhhgtg(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            Ujhhgtgfeyxiexzf.m889feyxiexzfUjhhgtg(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreResumed(Activity activity) {
        if (Build.VERSION.SDK_INT < 29 || activity.isDestroyed() || activity.isFinishing()) {
            return;
        }
        Ujhhgtgfeyxiexzf.m887Ujhhgtgfeyxiexzf(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (activity.isDestroyed() || activity.isFinishing()) {
            return;
        }
        if (Build.VERSION.SDK_INT < 29 && !activity.isDestroyed() && !activity.isFinishing()) {
            Ujhhgtgfeyxiexzf.m887Ujhhgtgfeyxiexzf(activity);
        }
        if (Ujhhgtgfeyxiexzf.f985Ujhhgtgfeyxiexzf != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList(Ujhhgtgfeyxiexzf.f985Ujhhgtgfeyxiexzf);
            for (int size = copyOnWriteArrayList.size() - 1; size >= 0; size--) {
                Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf = (Ujhhgtgfeyxiexzf) copyOnWriteArrayList.get(size);
                if (ujhhgtgfeyxiexzf.m899Ujhhgtgfeyxiexzf() == activity && ujhhgtgfeyxiexzf.f996Ujhhgtgfeyxiexzf && ujhhgtgfeyxiexzf.m898Ujhhgtgfeyxiexzf() != null) {
                    View viewFindViewById = ujhhgtgfeyxiexzf.m898Ujhhgtgfeyxiexzf().findViewById(R.id.box_root);
                    if (viewFindViewById instanceof DialogXBaseRelativeLayout) {
                        DialogXBaseRelativeLayout dialogXBaseRelativeLayout = (DialogXBaseRelativeLayout) viewFindViewById;
                        if (dialogXBaseRelativeLayout.f1015Ujhhgtgfeyxiexzf) {
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
        if (f9369Ujhhgtgfeyxiexzf == null) {
            Ujhhgtgfeyxiexzf.m886Ujhhgtgfeyxiexzf(activity);
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
