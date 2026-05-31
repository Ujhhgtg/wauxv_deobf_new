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
import androidx.lifecycle.C0000;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.AbstractActivityC1040;
import p000.AbstractC1037;
import p000.AbstractC1469;
import p000.AbstractC2235;
import p000.AbstractC2844;
import p000.AbstractC2902;
import p000.C0152;
import p000.C0348;
import p000.C0441;
import p000.C1036;
import p000.C1139;
import p000.C2038;
import p000.EnumC1792;
import p000.EnumC1793;
import p000.InterfaceC1797;
import p000.InterfaceC1800;
import p000.RunnableC0140;
import p000.RunnableC0349;

/* JADX INFO: renamed from: com.kongzue.dialogx.interfaces.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0034 implements InterfaceC1800 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static Thread f969;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static WeakReference f970;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static CopyOnWriteArrayList f971;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public static HashMap f972;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static WeakReference f973;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public WeakReference f974;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public WeakReference f975;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public WeakReference f976;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C0441 f978;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final boolean f979;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final int[] f980;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public boolean f981;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public boolean f982;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final AbstractC1469 f983;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final boolean f984;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public long f985;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final long f986;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public int f987;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final int[] f988;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public boolean f989;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final int f991;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final int f990 = AbstractC1037.f3790;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C0000 f977 = new C0000(this);

    public AbstractC0034() {
        this.f979 = true;
        new HashMap();
        this.f980 = new int[2];
        this.f985 = -1L;
        this.f986 = -1L;
        this.f988 = new int[4];
        this.f981 = true;
        this.f983 = AbstractC1037.f3785;
        this.f991 = AbstractC1037.f3789;
        this.f985 = -1L;
        this.f986 = -1L;
        this.f984 = true;
        this.f979 = AbstractC1037.f3788;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static void m877(View view) {
        if (view == null) {
            return;
        }
        AbstractC0034 abstractC0034 = (AbstractC0034) view.getTag();
        String str = abstractC0034.mo895() + ".dismiss";
        AbstractC1469 abstractC1469 = AbstractC1037.f3785;
        Log.i(">>>", str.toString());
        CopyOnWriteArrayList copyOnWriteArrayList = f971;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(abstractC0034);
        }
        WeakReference weakReference = abstractC0034.f975;
        if (weakReference != null) {
            weakReference.clear();
        }
        int iM4792 = AbstractC2844.m4792(abstractC0034.f990);
        int i = 1;
        if (iM4792 == 1) {
            AbstractC2235.m4197(view);
            return;
        }
        if (iM4792 != 2) {
            if (iM4792 != 3) {
                m882().post(new RunnableC0349(view, abstractC0034, i));
                return;
            }
            return;
        }
        WeakReference weakReference2 = abstractC0034.f976;
        if (weakReference2 == null || weakReference2.get() == null) {
            return;
        }
        ((C1036) abstractC0034.f976.get()).m2729(true, false);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static void m878(String str) {
        AbstractC1469 abstractC1469 = AbstractC1037.f3785;
        Log.e(">>>", str.toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static ArrayList m879(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                ArrayList arrayListM879 = m879(viewGroup.getChildAt(i));
                if (arrayListM879 != null) {
                    arrayList.addAll(arrayListM879);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static Application m880() {
        Application application;
        Application application2 = C0152.f1210;
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static FrameLayout m881(Activity activity) {
        if (activity == null || activity.getWindow() == null || !(activity.getWindow().getDecorView() instanceof FrameLayout)) {
            return null;
        }
        return (FrameLayout) activity.getWindow().getDecorView();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static Handler m882() {
        WeakReference weakReference = f973;
        if (weakReference != null && weakReference.get() != null) {
            return (Handler) f973.get();
        }
        WeakReference weakReference2 = new WeakReference(new Handler(Looper.getMainLooper()));
        f973 = weakReference2;
        return (Handler) weakReference2.get();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static ContextWrapper m883() {
        Activity activityM884 = m884();
        if (activityM884 != null) {
            return activityM884;
        }
        Application applicationM880 = m880();
        if (applicationM880 != null) {
            return applicationM880;
        }
        m878("DialogX 未初始化(E2)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static Activity m884() {
        WeakReference weakReference = f970;
        if (weakReference != null && weakReference.get() != null) {
            return (Activity) f970.get();
        }
        m885(null);
        WeakReference weakReference2 = f970;
        if (weakReference2 != null && weakReference2.get() != null) {
            return (Activity) f970.get();
        }
        Activity activityM1295 = C0152.m1295();
        m885(activityM1295);
        return activityM1295;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static void m885(Context context) {
        if (context == null) {
            context = C0152.m1295();
        }
        if (context instanceof Activity) {
            m886((Activity) context);
        }
        C0152.m1296(context, new C1139());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static void m886(Activity activity) {
        if (activity == null) {
            return;
        }
        for (String str : AbstractC1037.f3786) {
            if (activity.getClass().getName().contains(str)) {
                return;
            }
        }
        try {
            f969 = Looper.getMainLooper().getThread();
            f970 = new WeakReference(activity);
        } catch (Exception e) {
            e.printStackTrace();
            m878("DialogX.init: 初始化异常，找不到Activity的根布局");
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public static boolean m887(CharSequence charSequence) {
        String strValueOf = String.valueOf(charSequence);
        return charSequence == null || strValueOf.trim().isEmpty() || "null".equals(strValueOf) || "(null)".equals(strValueOf);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static void m888(Activity activity) {
        WeakReference weakReference;
        WeakReference weakReference2;
        int iM4792 = AbstractC2844.m4792(AbstractC1037.f3790);
        if (iM4792 != 1) {
            if (iM4792 != 2) {
                if (iM4792 != 3 && f971 != null) {
                    for (AbstractC0034 abstractC0034 : new CopyOnWriteArrayList(f971)) {
                        if (abstractC0034.m898() == activity) {
                            WeakReference weakReference3 = abstractC0034.f974;
                            if (weakReference3 != null) {
                                weakReference3.clear();
                            }
                            abstractC0034.f975 = null;
                            abstractC0034.f974 = null;
                            f971.remove(abstractC0034);
                        }
                    }
                }
            } else if (f971 != null) {
                for (AbstractC0034 abstractC0035 : new CopyOnWriteArrayList(f971)) {
                    if (abstractC0035.m898() == activity && (weakReference2 = abstractC0035.f976) != null && weakReference2.get() != null) {
                        ((C1036) abstractC0035.f976.get()).m2729(true, false);
                        f971.remove(abstractC0035);
                    }
                }
            }
        } else if (f971 != null) {
            for (AbstractC0034 abstractC0036 : new CopyOnWriteArrayList(f971)) {
                if (abstractC0036.m898() == activity && (weakReference = abstractC0036.f975) != null) {
                    AbstractC2235.m4197((View) weakReference.get());
                    f971.remove(abstractC0036);
                }
            }
        }
        if (activity == m884()) {
            WeakReference weakReference4 = f970;
            if (weakReference4 != null) {
                weakReference4.clear();
            }
            f970 = null;
            AbstractC1469 abstractC1469 = AbstractC1037.f3785;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static void m889(Runnable runnable) {
        AbstractC1469 abstractC1469 = AbstractC1037.f3785;
        if (f969 == null) {
            f969 = Looper.getMainLooper().getThread();
        }
        if (f969 != null) {
            Thread threadCurrentThread = Thread.currentThread();
            if (f969 == null) {
                f969 = Looper.getMainLooper().getThread();
            }
            if (threadCurrentThread == f969) {
                runnable.run();
                return;
            }
        }
        m882().post(runnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public static void m890(View view) {
        AbstractC0034 abstractC0034;
        if (view == null || (abstractC0034 = (AbstractC0034) view.getTag()) == null) {
            return;
        }
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (abstractC0034.f982) {
            if (abstractC0034.m897() != null) {
                abstractC0034.m897().setVisibility(0);
                return;
            }
            m878(((AbstractC0034) view.getTag()).mo895() + "已处于显示状态，请勿重复执行 show() 指令。");
            return;
        }
        abstractC0034.f975 = new WeakReference(view);
        StringBuilder sb = new StringBuilder();
        sb.append(abstractC0034.mo895());
        sb.append(".show on ");
        sb.append(abstractC0034.m902() ? abstractC0034.m898() : "window");
        String string = sb.toString();
        AbstractC1469 abstractC1469 = AbstractC1037.f3785;
        Log.i(">>>", string.toString());
        if (f971 == null) {
            f971 = new CopyOnWriteArrayList();
        }
        f971.add(abstractC0034);
        int iM4792 = AbstractC2844.m4792(abstractC0034.f990);
        if (iM4792 == 1) {
            Activity activityM898 = abstractC0034.m898();
            try {
                if (activityM898.getWindow().getDecorView().isAttachedToWindow()) {
                    AbstractC2235.m4215(activityM898, view);
                    return;
                } else {
                    activityM898.getWindow().getDecorView().post(new RunnableC0140(activityM898, view, 7, objArr == true ? 1 : 0));
                    return;
                }
            } catch (Exception unused) {
                if (activityM898 == null || activityM898.isDestroyed()) {
                    return;
                }
                AbstractC2235.m4215(activityM898, view);
                return;
            }
        }
        if (iM4792 == 2) {
            C1036 c1036 = new C1036();
            new WeakReference(abstractC0034.m898());
            abstractC0034.m898();
            Log.e(">>>", "DialogX.DialogFragment 模式无法支持非 AppCompatActivity 启动。");
            abstractC0034.f976 = new WeakReference(c1036);
            return;
        }
        if (iM4792 != 3) {
            if (abstractC0034.m900() == null) {
                return;
            }
            m889(new RunnableC0349(view, abstractC0034, i));
            return;
        }
        if (f972 == null) {
            f972 = new HashMap();
        }
        f972.put(abstractC0034.mo895(), new C0348((int) (objArr2 == true ? 1 : 0)));
        int i2 = AbstractActivityC1040.f3791;
        Intent intent = new Intent(m883(), (Class<?>) AbstractActivityC1040.class);
        if (abstractC0034.m898() == null) {
            intent.addFlags(268435456);
        }
        intent.putExtra("dialogXKey", abstractC0034.mo895());
        intent.putExtra("fromActivityUiStatus", (abstractC0034.m898() == null || m881(abstractC0034.m898()) == null) ? 0 : m881(abstractC0034.m898()).getSystemUiVisibility());
        intent.putExtra("from", m883().hashCode());
        m883().startActivity(intent);
        if (abstractC0034.m898() != null) {
            abstractC0034.m898().overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public static void m891(TextView textView, CharSequence charSequence) {
        if (textView == null) {
            return;
        }
        if (m887(charSequence)) {
            textView.setVisibility(8);
            textView.setText("");
        } else {
            textView.setVisibility(0);
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m892() {
        this.f989 = false;
        this.f974 = new WeakReference(m884());
        if (m898() == null && m902()) {
            m885(null);
            if (m898() == null) {
                m878("DialogX 未初始化(E5)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
                return;
            }
        }
        if (this.f990 != 1 && (m898() instanceof InterfaceC1800)) {
            ((InterfaceC1800) m898()).mo894().m97(new InterfaceC1797() { // from class: com.kongzue.dialogx.interfaces.BaseDialog$7
                @Override // p000.InterfaceC1797
                /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
                public final void mo0(InterfaceC1800 interfaceC1800, EnumC1792 enumC1792) {
                    if (enumC1792 == EnumC1792.ON_DESTROY) {
                        AbstractC0034.m888(this.f968.m898());
                    }
                }
            });
        }
        View currentFocus = m898().getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) m898().getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final View m893(int i) {
        if (!m902()) {
            return AbstractC2902.m4890(m880()).inflate(i, (ViewGroup) null);
        }
        if (m898() != null) {
            return AbstractC2902.m4890(m898()).inflate(i, (ViewGroup) null);
        }
        m878("DialogX 未初始化(E3)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
        return null;
    }

    @Override // p000.InterfaceC1800
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0000 mo894() {
        return this.f977;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public abstract String mo895();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final int m896(boolean z) {
        return this.f980[!z ? 1 : 0];
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final View m897() {
        WeakReference weakReference = this.f975;
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final Activity m898() {
        WeakReference weakReference = this.f974;
        if (weakReference == null || weakReference.get() == null) {
            this.f974 = new WeakReference(m884());
        }
        return (Activity) this.f974.get();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final Resources m899() {
        if (m898() != null) {
            return new C2038(m898()).getResources();
        }
        return m880() == null ? Resources.getSystem() : new C2038(m880()).getResources();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final FrameLayout m900() {
        FrameLayout frameLayoutM881;
        Activity activityM898 = m898();
        if (m902()) {
            if (activityM898 == null) {
                activityM898 = m884();
                if (activityM898 == null) {
                    m878("DialogX 错误：在 getRootFrameLayout() 时无法获取绑定的 activity，请确认是否正确初始化：\nDialogX.init(context);\n\n或者使用 .show(activity) 启动对话框\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
                    return null;
                }
                this.f974 = new WeakReference(activityM898);
            }
            frameLayoutM881 = m881(activityM898);
        } else {
            frameLayoutM881 = (FrameLayout) m897().getParent();
        }
        if (frameLayoutM881 != null) {
            return (FrameLayout) new WeakReference(frameLayoutM881).get();
        }
        m878("DialogX 错误：在 getRootFrameLayout() 时无法获 activity(" + activityM898 + ") 的 decorView，请检查该 activity 是否正常显示且可以使 DialogX 基于其显示。\n若该 activity 不可用，可通过以下代码配置豁免 DialogX 对话框绑定至该 activity，例如：\nDialogX.unsupportedActivitiesPackageNames = new String[]{\n        \"com.bytedance.sdk.openadsdk.stub.activity\",\n        \"com.mobile.auth.gatewayauth\",\n        \"com.google.android.gms.ads\"\n};\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final void m901(EditText editText, boolean z) {
        if (m898() == null) {
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) m898().getSystemService("input_method");
        if (z) {
            inputMethodManager.showSoftInput(editText, 0);
        } else {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public final boolean m902() {
        int i = this.f990;
        return i == 1 || i == 4 || i == 3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final boolean m903() {
        int i = this.f991;
        if (i == 3) {
            if (m880() == null) {
                if (i != 1) {
                    return false;
                }
            } else if ((m899().getConfiguration().uiMode & 48) != 16) {
                return false;
            }
        } else if (i != 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public abstract void mo904();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final void m905(EnumC1793 enumC1793) {
        C0000 c0000 = this.f977;
        if (c0000 != null) {
            try {
                c0000.m99("setCurrentState");
                c0000.m101(enumC1793);
            } catch (Exception unused) {
            }
        }
    }
}
