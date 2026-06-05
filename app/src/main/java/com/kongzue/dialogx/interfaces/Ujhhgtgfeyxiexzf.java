package com.kongzue.dialogx.interfaces;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.AbstractActivityC3180feyxiexzfUjhhgtg;
import p000.AbstractC0217Ujhhgtgfeyxiexzf;
import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.AbstractC3085Ujhhgtgfeyxiexzf;
import p000.AbstractC3177feyxiexzfUjhhgtg;
import p000.AbstractC3516feyxiexzfUjhhgtg;
import p000.C0323Ujhhgtgfeyxiexzf;
import p000.C2466feyxiexzfUjhhgtg;
import p000.C2579Ujhhgtgfeyxiexzf;
import p000.C3015Ujhhgtgfeyxiexzf;
import p000.C3176feyxiexzfUjhhgtg;
import p000.C3382feyxiexzfUjhhgtg;
import p000.EnumC0044Ujhhgtgfeyxiexzf;
import p000.InterfaceC0053Ujhhgtgfeyxiexzf;
import p000.InterfaceC0083Ujhhgtgfeyxiexzf;
import p000.RunnableC2462feyxiexzfUjhhgtg;
import p000.RunnableC3003feyxiexzfUjhhgtg;
import p000.Ujhhgtgfeyxiexzf;

/* JADX INFO: renamed from: com.kongzue.dialogx.interfaces.上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: invalid class name */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class Ujhhgtgfeyxiexzf implements InterfaceC0083Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static Thread f983Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static WeakReference f984Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static CopyOnWriteArrayList f985Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static HashMap f986Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public static WeakReference f987feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public WeakReference f988Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public WeakReference f989Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public WeakReference f990Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public C2579Ujhhgtgfeyxiexzf f992Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final boolean f993Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final int[] f994Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f995Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public boolean f996Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final AbstractC3085Ujhhgtgfeyxiexzf f997Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final boolean f998Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public long f999Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final long f1000Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f1001Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final int[] f1002Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f1003Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final int f1005Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final int f1004Ujhhgtgfeyxiexzf = AbstractC3177feyxiexzfUjhhgtg.f9827Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final androidx.lifecycle.Ujhhgtgfeyxiexzf f991Ujhhgtgfeyxiexzf = new androidx.lifecycle.Ujhhgtgfeyxiexzf(this);

    public Ujhhgtgfeyxiexzf() {
        this.f993Ujhhgtgfeyxiexzf = true;
        new HashMap();
        this.f994Ujhhgtgfeyxiexzf = new int[2];
        this.f999Ujhhgtgfeyxiexzf = -1L;
        this.f1000Ujhhgtgfeyxiexzf = -1L;
        this.f1002Ujhhgtgfeyxiexzf = new int[4];
        this.f995Ujhhgtgfeyxiexzf = true;
        this.f997Ujhhgtgfeyxiexzf = AbstractC3177feyxiexzfUjhhgtg.f9822Ujhhgtgfeyxiexzf;
        this.f1005Ujhhgtgfeyxiexzf = AbstractC3177feyxiexzfUjhhgtg.f9826Ujhhgtgfeyxiexzf;
        this.f999Ujhhgtgfeyxiexzf = -1L;
        this.f1000Ujhhgtgfeyxiexzf = -1L;
        this.f998Ujhhgtgfeyxiexzf = true;
        this.f993Ujhhgtgfeyxiexzf = AbstractC3177feyxiexzfUjhhgtg.f9825Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static void m878Ujhhgtgfeyxiexzf(View view) {
        if (view == null) {
            return;
        }
        Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf = (Ujhhgtgfeyxiexzf) view.getTag();
        String str = ujhhgtgfeyxiexzf.mo896Ujhhgtgfeyxiexzf() + ".dismiss";
        AbstractC3085Ujhhgtgfeyxiexzf abstractC3085Ujhhgtgfeyxiexzf = AbstractC3177feyxiexzfUjhhgtg.f9822Ujhhgtgfeyxiexzf;
        Log.i(">>>", str.toString());
        CopyOnWriteArrayList copyOnWriteArrayList = f985Ujhhgtgfeyxiexzf;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(ujhhgtgfeyxiexzf);
        }
        WeakReference weakReference = ujhhgtgfeyxiexzf.f989Ujhhgtgfeyxiexzf;
        if (weakReference != null) {
            weakReference.clear();
        }
        int iM2713feyxiexzfUjhhgtg = AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(ujhhgtgfeyxiexzf.f1004Ujhhgtgfeyxiexzf);
        int i = 1;
        if (iM2713feyxiexzfUjhhgtg == 1) {
            AbstractC3516feyxiexzfUjhhgtg.m5057Ujhhgtgfeyxiexzf(view);
            return;
        }
        if (iM2713feyxiexzfUjhhgtg != 2) {
            if (iM2713feyxiexzfUjhhgtg != 3) {
                m883Ujhhgtgfeyxiexzf().post(new RunnableC2462feyxiexzfUjhhgtg(view, ujhhgtgfeyxiexzf, i));
                return;
            }
            return;
        }
        WeakReference weakReference2 = ujhhgtgfeyxiexzf.f990Ujhhgtgfeyxiexzf;
        if (weakReference2 == null || weakReference2.get() == null) {
            return;
        }
        ((C3176feyxiexzfUjhhgtg) ujhhgtgfeyxiexzf.f990Ujhhgtgfeyxiexzf.get()).m4676Ujhhgtgfeyxiexzf(true, false);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static void m879Ujhhgtgfeyxiexzf(String str) {
        AbstractC3085Ujhhgtgfeyxiexzf abstractC3085Ujhhgtgfeyxiexzf = AbstractC3177feyxiexzfUjhhgtg.f9822Ujhhgtgfeyxiexzf;
        Log.e(">>>", str.toString());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static ArrayList m880Ujhhgtgfeyxiexzf(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                ArrayList arrayListM880Ujhhgtgfeyxiexzf = m880Ujhhgtgfeyxiexzf(viewGroup.getChildAt(i));
                if (arrayListM880Ujhhgtgfeyxiexzf != null) {
                    arrayList.addAll(arrayListM880Ujhhgtgfeyxiexzf);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static Application m881Ujhhgtgfeyxiexzf() {
        Application application;
        Application application2 = C3015Ujhhgtgfeyxiexzf.f9369Ujhhgtgfeyxiexzf;
        if (application2 != null) {
            return application2;
        }
        try {
            try {
                try {
                    return (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null);
                } catch (Exception unused) {
                    Class<?> cls = Class.forName("android.app.ActivityThread");
                    application = (Application) cls.getDeclaredMethod("getApplication", null).invoke(cls.getDeclaredMethod("currentActivityThread", null).invoke(null, null), null);
                    return application;
                }
            } catch (Exception unused2) {
                return null;
            }
        } catch (Exception unused3) {
            application = (Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
            return application;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static FrameLayout m882Ujhhgtgfeyxiexzf(Activity activity) {
        if (activity == null || activity.getWindow() == null || !(activity.getWindow().getDecorView() instanceof FrameLayout)) {
            return null;
        }
        return (FrameLayout) activity.getWindow().getDecorView();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static Handler m883Ujhhgtgfeyxiexzf() {
        WeakReference weakReference = f987feyxiexzfUjhhgtg;
        if (weakReference != null && weakReference.get() != null) {
            return (Handler) f987feyxiexzfUjhhgtg.get();
        }
        WeakReference weakReference2 = new WeakReference(new Handler(Looper.getMainLooper()));
        f987feyxiexzfUjhhgtg = weakReference2;
        return (Handler) weakReference2.get();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static ContextWrapper m884Ujhhgtgfeyxiexzf() {
        Activity activityM885Ujhhgtgfeyxiexzf = m885Ujhhgtgfeyxiexzf();
        if (activityM885Ujhhgtgfeyxiexzf != null) {
            return activityM885Ujhhgtgfeyxiexzf;
        }
        Application applicationM881Ujhhgtgfeyxiexzf = m881Ujhhgtgfeyxiexzf();
        if (applicationM881Ujhhgtgfeyxiexzf != null) {
            return applicationM881Ujhhgtgfeyxiexzf;
        }
        m879Ujhhgtgfeyxiexzf("DialogX 未初始化(E2)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static Activity m885Ujhhgtgfeyxiexzf() {
        WeakReference weakReference = f984Ujhhgtgfeyxiexzf;
        if (weakReference != null && weakReference.get() != null) {
            return (Activity) f984Ujhhgtgfeyxiexzf.get();
        }
        m886Ujhhgtgfeyxiexzf(null);
        WeakReference weakReference2 = f984Ujhhgtgfeyxiexzf;
        if (weakReference2 != null && weakReference2.get() != null) {
            return (Activity) f984Ujhhgtgfeyxiexzf.get();
        }
        Activity activityM4459Ujhhgtgfeyxiexzf = C3015Ujhhgtgfeyxiexzf.m4459Ujhhgtgfeyxiexzf();
        m886Ujhhgtgfeyxiexzf(activityM4459Ujhhgtgfeyxiexzf);
        return activityM4459Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public static void m886Ujhhgtgfeyxiexzf(Context context) {
        if (context == null) {
            context = C3015Ujhhgtgfeyxiexzf.m4459Ujhhgtgfeyxiexzf();
        }
        if (context instanceof Activity) {
            m887Ujhhgtgfeyxiexzf((Activity) context);
        }
        C3015Ujhhgtgfeyxiexzf.m4460Ujhhgtgfeyxiexzf(context, new C3382feyxiexzfUjhhgtg());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static void m887Ujhhgtgfeyxiexzf(Activity activity) {
        if (activity == null) {
            return;
        }
        for (String str : AbstractC3177feyxiexzfUjhhgtg.f9823Ujhhgtgfeyxiexzf) {
            if (activity.getClass().getName().contains(str)) {
                return;
            }
        }
        try {
            f983Ujhhgtgfeyxiexzf = Looper.getMainLooper().getThread();
            f984Ujhhgtgfeyxiexzf = new WeakReference(activity);
        } catch (Exception e) {
            e.printStackTrace();
            m879Ujhhgtgfeyxiexzf("DialogX.init: 初始化异常，找不到Activity的根布局");
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static boolean m888Ujhhgtgfeyxiexzf(CharSequence charSequence) {
        String strValueOf = String.valueOf(charSequence);
        return charSequence == null || strValueOf.trim().isEmpty() || "null".equals(strValueOf) || "(null)".equals(strValueOf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public static void m889feyxiexzfUjhhgtg(Activity activity) {
        WeakReference weakReference;
        WeakReference weakReference2;
        int iM2713feyxiexzfUjhhgtg = AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(AbstractC3177feyxiexzfUjhhgtg.f9827Ujhhgtgfeyxiexzf);
        if (iM2713feyxiexzfUjhhgtg != 1) {
            if (iM2713feyxiexzfUjhhgtg != 2) {
                if (iM2713feyxiexzfUjhhgtg != 3 && f985Ujhhgtgfeyxiexzf != null) {
                    for (Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf : new CopyOnWriteArrayList(f985Ujhhgtgfeyxiexzf)) {
                        if (ujhhgtgfeyxiexzf.m899Ujhhgtgfeyxiexzf() == activity) {
                            WeakReference weakReference3 = ujhhgtgfeyxiexzf.f988Ujhhgtgfeyxiexzf;
                            if (weakReference3 != null) {
                                weakReference3.clear();
                            }
                            ujhhgtgfeyxiexzf.f989Ujhhgtgfeyxiexzf = null;
                            ujhhgtgfeyxiexzf.f988Ujhhgtgfeyxiexzf = null;
                            f985Ujhhgtgfeyxiexzf.remove(ujhhgtgfeyxiexzf);
                        }
                    }
                }
            } else if (f985Ujhhgtgfeyxiexzf != null) {
                for (Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf2 : new CopyOnWriteArrayList(f985Ujhhgtgfeyxiexzf)) {
                    if (ujhhgtgfeyxiexzf2.m899Ujhhgtgfeyxiexzf() == activity && (weakReference2 = ujhhgtgfeyxiexzf2.f990Ujhhgtgfeyxiexzf) != null && weakReference2.get() != null) {
                        ((C3176feyxiexzfUjhhgtg) ujhhgtgfeyxiexzf2.f990Ujhhgtgfeyxiexzf.get()).m4676Ujhhgtgfeyxiexzf(true, false);
                        f985Ujhhgtgfeyxiexzf.remove(ujhhgtgfeyxiexzf2);
                    }
                }
            }
        } else if (f985Ujhhgtgfeyxiexzf != null) {
            for (Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf3 : new CopyOnWriteArrayList(f985Ujhhgtgfeyxiexzf)) {
                if (ujhhgtgfeyxiexzf3.m899Ujhhgtgfeyxiexzf() == activity && (weakReference = ujhhgtgfeyxiexzf3.f989Ujhhgtgfeyxiexzf) != null) {
                    AbstractC3516feyxiexzfUjhhgtg.m5057Ujhhgtgfeyxiexzf((View) weakReference.get());
                    f985Ujhhgtgfeyxiexzf.remove(ujhhgtgfeyxiexzf3);
                }
            }
        }
        if (activity == m885Ujhhgtgfeyxiexzf()) {
            WeakReference weakReference4 = f984Ujhhgtgfeyxiexzf;
            if (weakReference4 != null) {
                weakReference4.clear();
            }
            f984Ujhhgtgfeyxiexzf = null;
            AbstractC3085Ujhhgtgfeyxiexzf abstractC3085Ujhhgtgfeyxiexzf = AbstractC3177feyxiexzfUjhhgtg.f9822Ujhhgtgfeyxiexzf;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public static void m890feyxiexzfUjhhgtg(Runnable runnable) {
        AbstractC3085Ujhhgtgfeyxiexzf abstractC3085Ujhhgtgfeyxiexzf = AbstractC3177feyxiexzfUjhhgtg.f9822Ujhhgtgfeyxiexzf;
        if (f983Ujhhgtgfeyxiexzf == null) {
            f983Ujhhgtgfeyxiexzf = Looper.getMainLooper().getThread();
        }
        if (f983Ujhhgtgfeyxiexzf != null) {
            Thread threadCurrentThread = Thread.currentThread();
            if (f983Ujhhgtgfeyxiexzf == null) {
                f983Ujhhgtgfeyxiexzf = Looper.getMainLooper().getThread();
            }
            if (threadCurrentThread == f983Ujhhgtgfeyxiexzf) {
                runnable.run();
                return;
            }
        }
        m883Ujhhgtgfeyxiexzf().post(runnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public static void m891feyxiexzfUjhhgtg(View view) {
        Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf;
        if (view == null || (ujhhgtgfeyxiexzf = (Ujhhgtgfeyxiexzf) view.getTag()) == null) {
            return;
        }
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (ujhhgtgfeyxiexzf.f996Ujhhgtgfeyxiexzf) {
            if (ujhhgtgfeyxiexzf.m898Ujhhgtgfeyxiexzf() != null) {
                ujhhgtgfeyxiexzf.m898Ujhhgtgfeyxiexzf().setVisibility(0);
                return;
            }
            m879Ujhhgtgfeyxiexzf(((Ujhhgtgfeyxiexzf) view.getTag()).mo896Ujhhgtgfeyxiexzf() + "已处于显示状态，请勿重复执行 show() 指令。");
            return;
        }
        ujhhgtgfeyxiexzf.f989Ujhhgtgfeyxiexzf = new WeakReference(view);
        StringBuilder sb = new StringBuilder();
        sb.append(ujhhgtgfeyxiexzf.mo896Ujhhgtgfeyxiexzf());
        sb.append(".show on ");
        sb.append(ujhhgtgfeyxiexzf.m903Ujhhgtgfeyxiexzf() ? ujhhgtgfeyxiexzf.m899Ujhhgtgfeyxiexzf() : "window");
        String string = sb.toString();
        AbstractC3085Ujhhgtgfeyxiexzf abstractC3085Ujhhgtgfeyxiexzf = AbstractC3177feyxiexzfUjhhgtg.f9822Ujhhgtgfeyxiexzf;
        Log.i(">>>", string.toString());
        if (f985Ujhhgtgfeyxiexzf == null) {
            f985Ujhhgtgfeyxiexzf = new CopyOnWriteArrayList();
        }
        f985Ujhhgtgfeyxiexzf.add(ujhhgtgfeyxiexzf);
        int iM2713feyxiexzfUjhhgtg = AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(ujhhgtgfeyxiexzf.f1004Ujhhgtgfeyxiexzf);
        if (iM2713feyxiexzfUjhhgtg == 1) {
            Activity activityM899Ujhhgtgfeyxiexzf = ujhhgtgfeyxiexzf.m899Ujhhgtgfeyxiexzf();
            try {
                if (activityM899Ujhhgtgfeyxiexzf.getWindow().getDecorView().isAttachedToWindow()) {
                    AbstractC3516feyxiexzfUjhhgtg.m5073feyxiexzfUjhhgtg(activityM899Ujhhgtgfeyxiexzf, view);
                    return;
                } else {
                    activityM899Ujhhgtgfeyxiexzf.getWindow().getDecorView().post(new RunnableC3003feyxiexzfUjhhgtg(activityM899Ujhhgtgfeyxiexzf, view, 7, objArr == true ? 1 : 0));
                    return;
                }
            } catch (Exception unused) {
                if (activityM899Ujhhgtgfeyxiexzf == null || activityM899Ujhhgtgfeyxiexzf.isDestroyed()) {
                    return;
                }
                AbstractC3516feyxiexzfUjhhgtg.m5073feyxiexzfUjhhgtg(activityM899Ujhhgtgfeyxiexzf, view);
                return;
            }
        }
        if (iM2713feyxiexzfUjhhgtg == 2) {
            C3176feyxiexzfUjhhgtg c3176feyxiexzfUjhhgtg = new C3176feyxiexzfUjhhgtg();
            new WeakReference(ujhhgtgfeyxiexzf.m899Ujhhgtgfeyxiexzf());
            ujhhgtgfeyxiexzf.m899Ujhhgtgfeyxiexzf();
            Log.e(">>>", "DialogX.DialogFragment 模式无法支持非 AppCompatActivity 启动。");
            ujhhgtgfeyxiexzf.f990Ujhhgtgfeyxiexzf = new WeakReference(c3176feyxiexzfUjhhgtg);
            return;
        }
        if (iM2713feyxiexzfUjhhgtg != 3) {
            if (ujhhgtgfeyxiexzf.m901Ujhhgtgfeyxiexzf() == null) {
                return;
            }
            m890feyxiexzfUjhhgtg(new RunnableC2462feyxiexzfUjhhgtg(view, ujhhgtgfeyxiexzf, i));
            return;
        }
        if (f986Ujhhgtgfeyxiexzf == null) {
            f986Ujhhgtgfeyxiexzf = new HashMap();
        }
        f986Ujhhgtgfeyxiexzf.put(ujhhgtgfeyxiexzf.mo896Ujhhgtgfeyxiexzf(), new C2466feyxiexzfUjhhgtg((int) (objArr2 == true ? 1 : 0)));
        int i2 = AbstractActivityC3180feyxiexzfUjhhgtg.f9828Ujhhgtgfeyxiexzf;
        Intent intent = new Intent(m884Ujhhgtgfeyxiexzf(), (Class<?>) AbstractActivityC3180feyxiexzfUjhhgtg.class);
        if (ujhhgtgfeyxiexzf.m899Ujhhgtgfeyxiexzf() == null) {
            intent.addFlags(268435456);
        }
        intent.putExtra("dialogXKey", ujhhgtgfeyxiexzf.mo896Ujhhgtgfeyxiexzf());
        intent.putExtra("fromActivityUiStatus", (ujhhgtgfeyxiexzf.m899Ujhhgtgfeyxiexzf() == null || m882Ujhhgtgfeyxiexzf(ujhhgtgfeyxiexzf.m899Ujhhgtgfeyxiexzf()) == null) ? 0 : m882Ujhhgtgfeyxiexzf(ujhhgtgfeyxiexzf.m899Ujhhgtgfeyxiexzf()).getSystemUiVisibility());
        intent.putExtra("from", m884Ujhhgtgfeyxiexzf().hashCode());
        m884Ujhhgtgfeyxiexzf().startActivity(intent);
        if (ujhhgtgfeyxiexzf.m899Ujhhgtgfeyxiexzf() != null) {
            ujhhgtgfeyxiexzf.m899Ujhhgtgfeyxiexzf().overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public static void m892feyxiexzfUjhhgtg(TextView textView, CharSequence charSequence) {
        if (textView == null) {
            return;
        }
        if (m888Ujhhgtgfeyxiexzf(charSequence)) {
            textView.setVisibility(8);
            textView.setText("");
        } else {
            textView.setVisibility(0);
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m893Ujhhgtgfeyxiexzf() {
        this.f1003Ujhhgtgfeyxiexzf = false;
        this.f988Ujhhgtgfeyxiexzf = new WeakReference(m885Ujhhgtgfeyxiexzf());
        if (m899Ujhhgtgfeyxiexzf() == null && m903Ujhhgtgfeyxiexzf()) {
            m886Ujhhgtgfeyxiexzf(null);
            if (m899Ujhhgtgfeyxiexzf() == null) {
                m879Ujhhgtgfeyxiexzf("DialogX 未初始化(E5)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
                return;
            }
        }
        if (this.f1004Ujhhgtgfeyxiexzf != 1 && (m899Ujhhgtgfeyxiexzf() instanceof InterfaceC0083Ujhhgtgfeyxiexzf)) {
            ((InterfaceC0083Ujhhgtgfeyxiexzf) m899Ujhhgtgfeyxiexzf()).mo895Ujhhgtgfeyxiexzf().m97Ujhhgtgfeyxiexzf(new InterfaceC0053Ujhhgtgfeyxiexzf() { // from class: com.kongzue.dialogx.interfaces.BaseDialog$7
                @Override // p000.InterfaceC0053Ujhhgtgfeyxiexzf
                /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
                public final void mo0Ujhhgtgfeyxiexzf(InterfaceC0083Ujhhgtgfeyxiexzf interfaceC0083Ujhhgtgfeyxiexzf, Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf) {
                    if (ujhhgtgfeyxiexzf == Ujhhgtgfeyxiexzf.ON_DESTROY) {
                        Ujhhgtgfeyxiexzf.m889feyxiexzfUjhhgtg(this.f982Ujhhgtgfeyxiexzf.m899Ujhhgtgfeyxiexzf());
                    }
                }
            });
        }
        View currentFocus = m899Ujhhgtgfeyxiexzf().getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) m899Ujhhgtgfeyxiexzf().getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final View m894Ujhhgtgfeyxiexzf(int i) {
        if (!m903Ujhhgtgfeyxiexzf()) {
            return AbstractC0217Ujhhgtgfeyxiexzf.m1328Ujhhgtgfeyxiexzf(m881Ujhhgtgfeyxiexzf()).inflate(i, (ViewGroup) null);
        }
        if (m899Ujhhgtgfeyxiexzf() != null) {
            return AbstractC0217Ujhhgtgfeyxiexzf.m1328Ujhhgtgfeyxiexzf(m899Ujhhgtgfeyxiexzf()).inflate(i, (ViewGroup) null);
        }
        m879Ujhhgtgfeyxiexzf("DialogX 未初始化(E3)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
        return null;
    }

    @Override // p000.InterfaceC0083Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final androidx.lifecycle.Ujhhgtgfeyxiexzf mo895Ujhhgtgfeyxiexzf() {
        return this.f991Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public abstract String mo896Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final int m897Ujhhgtgfeyxiexzf(boolean z) {
        return this.f994Ujhhgtgfeyxiexzf[!z ? 1 : 0];
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final View m898Ujhhgtgfeyxiexzf() {
        WeakReference weakReference = this.f989Ujhhgtgfeyxiexzf;
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final Activity m899Ujhhgtgfeyxiexzf() {
        WeakReference weakReference = this.f988Ujhhgtgfeyxiexzf;
        if (weakReference == null || weakReference.get() == null) {
            this.f988Ujhhgtgfeyxiexzf = new WeakReference(m885Ujhhgtgfeyxiexzf());
        }
        return (Activity) this.f988Ujhhgtgfeyxiexzf.get();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final Resources m900Ujhhgtgfeyxiexzf() {
        if (m899Ujhhgtgfeyxiexzf() != null) {
            return new C0323Ujhhgtgfeyxiexzf(m899Ujhhgtgfeyxiexzf()).getResources();
        }
        return m881Ujhhgtgfeyxiexzf() == null ? Resources.getSystem() : new C0323Ujhhgtgfeyxiexzf(m881Ujhhgtgfeyxiexzf()).getResources();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final FrameLayout m901Ujhhgtgfeyxiexzf() {
        FrameLayout frameLayoutM882Ujhhgtgfeyxiexzf;
        Activity activityM899Ujhhgtgfeyxiexzf = m899Ujhhgtgfeyxiexzf();
        if (m903Ujhhgtgfeyxiexzf()) {
            if (activityM899Ujhhgtgfeyxiexzf == null) {
                activityM899Ujhhgtgfeyxiexzf = m885Ujhhgtgfeyxiexzf();
                if (activityM899Ujhhgtgfeyxiexzf == null) {
                    m879Ujhhgtgfeyxiexzf("DialogX 错误：在 getRootFrameLayout() 时无法获取绑定的 activity，请确认是否正确初始化：\nDialogX.init(context);\n\n或者使用 .show(activity) 启动对话框\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
                    return null;
                }
                this.f988Ujhhgtgfeyxiexzf = new WeakReference(activityM899Ujhhgtgfeyxiexzf);
            }
            frameLayoutM882Ujhhgtgfeyxiexzf = m882Ujhhgtgfeyxiexzf(activityM899Ujhhgtgfeyxiexzf);
        } else {
            frameLayoutM882Ujhhgtgfeyxiexzf = (FrameLayout) m898Ujhhgtgfeyxiexzf().getParent();
        }
        if (frameLayoutM882Ujhhgtgfeyxiexzf != null) {
            return (FrameLayout) new WeakReference(frameLayoutM882Ujhhgtgfeyxiexzf).get();
        }
        m879Ujhhgtgfeyxiexzf("DialogX 错误：在 getRootFrameLayout() 时无法获 activity(" + activityM899Ujhhgtgfeyxiexzf + ") 的 decorView，请检查该 activity 是否正常显示且可以使 DialogX 基于其显示。\n若该 activity 不可用，可通过以下代码配置豁免 DialogX 对话框绑定至该 activity，例如：\nDialogX.unsupportedActivitiesPackageNames = new String[]{\n        \"com.bytedance.sdk.openadsdk.stub.activity\",\n        \"com.mobile.auth.gatewayauth\",\n        \"com.google.android.gms.ads\"\n};\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final void m902Ujhhgtgfeyxiexzf(EditText editText, boolean z) {
        if (m899Ujhhgtgfeyxiexzf() == null) {
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) m899Ujhhgtgfeyxiexzf().getSystemService("input_method");
        if (z) {
            inputMethodManager.showSoftInput(editText, 0);
        } else {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean m903Ujhhgtgfeyxiexzf() {
        int i = this.f1004Ujhhgtgfeyxiexzf;
        return i == 1 || i == 4 || i == 3;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final boolean m904Ujhhgtgfeyxiexzf() {
        int i = this.f1005Ujhhgtgfeyxiexzf;
        if (i == 3) {
            if (m881Ujhhgtgfeyxiexzf() == null) {
                if (i != 1) {
                    return false;
                }
            } else if ((m900Ujhhgtgfeyxiexzf().getConfiguration().uiMode & 48) != 16) {
                return false;
            }
        } else if (i != 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public abstract void mo905feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m906feyxiexzfUjhhgtg(EnumC0044Ujhhgtgfeyxiexzf enumC0044Ujhhgtgfeyxiexzf) {
        androidx.lifecycle.Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf = this.f991Ujhhgtgfeyxiexzf;
        if (ujhhgtgfeyxiexzf != null) {
            try {
                ujhhgtgfeyxiexzf.m99Ujhhgtgfeyxiexzf("setCurrentState");
                ujhhgtgfeyxiexzf.m101Ujhhgtgfeyxiexzf(enumC0044Ujhhgtgfeyxiexzf);
            } catch (Exception unused) {
            }
        }
    }
}
