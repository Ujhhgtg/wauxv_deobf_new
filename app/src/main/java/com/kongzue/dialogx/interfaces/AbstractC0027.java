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
import p000.AbstractActivityC1037;
import p000.AbstractC1034;
import p000.AbstractC1460;
import p000.AbstractC1574;
import p000.AbstractC2205;
import p000.AbstractC2784;
import p000.C0144;
import p000.C0373;
import p000.C0466;
import p000.C1033;
import p000.C1133;
import p000.C2008;
import p000.EnumC1769;
import p000.EnumC1770;
import p000.InterfaceC1774;
import p000.InterfaceC1777;
import p000.RunnableC0132;
import p000.RunnableC0374;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0027 implements InterfaceC1777 {

    public static Thread f903;

    public static WeakReference f904;

    public static CopyOnWriteArrayList f905;

    public static HashMap f906;

    public static WeakReference f907;

    public WeakReference f908;

    public WeakReference f909;

    public WeakReference f910;

    public C0466 f912;

    public final boolean f913;

    public final int[] f914;

    public boolean f915;

    public boolean f916;

    public final AbstractC2205 f917;

    public final boolean f918;

    public long f919;

    public final long f920;

    public int f921;

    public final int[] f922;

    public boolean f923;

    public final int f925;

    public final int f924 = AbstractC1034.f3783;

    public final C0000 f911 = new C0000(this);

    public AbstractC0027() {
        this.f913 = true;
        new HashMap();
        this.f914 = new int[2];
        this.f919 = -1L;
        this.f920 = -1L;
        this.f922 = new int[4];
        this.f915 = true;
        this.f917 = AbstractC1034.f3778;
        this.f925 = AbstractC1034.f3782;
        this.f919 = -1L;
        this.f920 = -1L;
        this.f918 = true;
        this.f913 = AbstractC1034.f3781;
    }

    public static void m733(View view) {
        if (view == null) {
            return;
        }
        AbstractC0027 abstractC0027 = (AbstractC0027) view.getTag();
        String str = abstractC0027.mo751() + ".dismiss";
        AbstractC2205 abstractC2205 = AbstractC1034.f3778;
        Log.i(">>>", str.toString());
        CopyOnWriteArrayList copyOnWriteArrayList = f905;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(abstractC0027);
        }
        WeakReference weakReference = abstractC0027.f909;
        if (weakReference != null) {
            weakReference.clear();
        }
        int iM4759 = AbstractC2784.m4759(abstractC0027.f924);
        int i = 1;
        if (iM4759 == 1) {
            AbstractC1574.m3294(view);
            return;
        }
        if (iM4759 != 2) {
            if (iM4759 != 3) {
                m738().post(new RunnableC0374(view, abstractC0027, 1));
                return;
            }
            return;
        }
        WeakReference weakReference2 = abstractC0027.f910;
        if (weakReference2 == null || weakReference2.get() == null) {
            return;
        }
        ((C1033) abstractC0027.f910.get()).m2605(true, false);
    }

    public static void m734(String str) {
        AbstractC2205 abstractC2205 = AbstractC1034.f3778;
        Log.e(">>>", str.toString());
    }

    public static ArrayList m735(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                ArrayList arrayListM735 = m735(viewGroup.getChildAt(i));
                if (arrayListM735 != null) {
                    arrayList.addAll(arrayListM735);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static Application m736() {
        Application application;
        Application application2 = C0144.f1142;
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

    public static FrameLayout m737(Activity activity) {
        if (activity == null || activity.getWindow() == null || !(activity.getWindow().getDecorView() instanceof FrameLayout)) {
            return null;
        }
        return (FrameLayout) activity.getWindow().getDecorView();
    }

    public static Handler m738() {
        WeakReference weakReference = f907;
        if (weakReference != null && weakReference.get() != null) {
            return (Handler) f907.get();
        }
        WeakReference weakReference2 = new WeakReference(new Handler(Looper.getMainLooper()));
        f907 = weakReference2;
        return (Handler) weakReference2.get();
    }

    public static ContextWrapper m739() {
        Activity activityM740 = m740();
        if (activityM740 != null) {
            return activityM740;
        }
        Application applicationM736 = m736();
        if (applicationM736 != null) {
            return applicationM736;
        }
        m734("DialogX 未初始化(E2)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
        return null;
    }

    public static Activity m740() {
        WeakReference weakReference = f904;
        if (weakReference != null && weakReference.get() != null) {
            return (Activity) f904.get();
        }
        m741(null);
        WeakReference weakReference2 = f904;
        if (weakReference2 != null && weakReference2.get() != null) {
            return (Activity) f904.get();
        }
        Activity activityM1149 = C0144.m1149();
        m741(activityM1149);
        return activityM1149;
    }

    public static void m741(Context context) {
        if (context == null) {
            context = C0144.m1149();
        }
        if (context instanceof Activity) {
            m742((Activity) context);
        }
        C0144.m1150(context, new C1133());
    }

    public static void m742(Activity activity) {
        if (activity == null) {
            return;
        }
        for (String str : AbstractC1034.f3779) {
            if (activity.getClass().getName().contains(str)) {
                return;
            }
        }
        try {
            f903 = Looper.getMainLooper().getThread();
            f904 = new WeakReference(activity);
        } catch (Exception e) {
            e.printStackTrace();
            m734("DialogX.init: 初始化异常，找不到Activity的根布局");
        }
    }

    public static boolean m743(CharSequence charSequence) {
        String strValueOf = String.valueOf(charSequence);
        return charSequence == null || strValueOf.trim().isEmpty() || "null".equals(strValueOf) || "(null)".equals(strValueOf);
    }

    public static void m744(Activity activity) {
        WeakReference weakReference;
        WeakReference weakReference2;
        int iM4759 = AbstractC2784.m4759(AbstractC1034.f3783);
        if (iM4759 != 1) {
            if (iM4759 != 2) {
                if (iM4759 != 3 && f905 != null) {
                    for (AbstractC0027 abstractC0027 : new CopyOnWriteArrayList(f905)) {
                        if (abstractC0027.m754() == activity) {
                            WeakReference weakReference3 = abstractC0027.f908;
                            if (weakReference3 != null) {
                                weakReference3.clear();
                            }
                            abstractC0027.f909 = null;
                            abstractC0027.f908 = null;
                            f905.remove(abstractC0027);
                        }
                    }
                }
            } else if (f905 != null) {
                for (AbstractC0027 abstractC0028 : new CopyOnWriteArrayList(f905)) {
                    if (abstractC0028.m754() == activity && (weakReference2 = abstractC0028.f910) != null && weakReference2.get() != null) {
                        ((C1033) abstractC0028.f910.get()).m2605(true, false);
                        f905.remove(abstractC0028);
                    }
                }
            }
        } else if (f905 != null) {
            for (AbstractC0027 abstractC0029 : new CopyOnWriteArrayList(f905)) {
                if (abstractC0029.m754() == activity && (weakReference = abstractC0029.f909) != null) {
                    AbstractC1574.m3294((View) weakReference.get());
                    f905.remove(abstractC0029);
                }
            }
        }
        if (activity == m740()) {
            WeakReference weakReference4 = f904;
            if (weakReference4 != null) {
                weakReference4.clear();
            }
            f904 = null;
            AbstractC2205 abstractC2205 = AbstractC1034.f3778;
        }
    }

    public static void m745(Runnable runnable) {
        AbstractC2205 abstractC2205 = AbstractC1034.f3778;
        if (f903 == null) {
            f903 = Looper.getMainLooper().getThread();
        }
        if (true) {
            Thread threadCurrentThread = Thread.currentThread();
            if (f903 == null) {
                f903 = Looper.getMainLooper().getThread();
            }
            if (threadCurrentThread == f903) {
                runnable.run();
                return;
            }
        }
        m738().post(runnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void m746(View view) {
        AbstractC0027 abstractC0027;
        if (view == null || (abstractC0027 = (AbstractC0027) view.getTag()) == null) {
            return;
        }
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (abstractC0027.f916) {
            if (abstractC0027.m753() != null) {
                abstractC0027.m753().setVisibility(0);
                return;
            }
            m734(((AbstractC0027) view.getTag()).mo751() + "已处于显示状态，请勿重复执行 show() 指令。");
            return;
        }
        abstractC0027.f909 = new WeakReference(view);
        StringBuilder sb = new StringBuilder();
        sb.append(abstractC0027.mo751());
        sb.append(".show on ");
        sb.append(abstractC0027.m758() ? abstractC0027.m754() : "window");
        String string = sb.toString();
        AbstractC2205 abstractC2205 = AbstractC1034.f3778;
        Log.i(">>>", string.toString());
        if (f905 == null) {
            f905 = new CopyOnWriteArrayList();
        }
        f905.add(abstractC0027);
        int iM4759 = AbstractC2784.m4759(abstractC0027.f924);
        if (iM4759 == 1) {
            Activity activityM754 = abstractC0027.m754();
            try {
                if (activityM754.getWindow().getDecorView().isAttachedToWindow()) {
                    AbstractC1574.m3312(activityM754, view);
                    return;
                } else {
                    activityM754.getWindow().getDecorView().post(new RunnableC0132(activityM754, view, 7, 0));
                    return;
                }
            } catch (Exception unused) {
                if (activityM754 == null || activityM754.isDestroyed()) {
                    return;
                }
                AbstractC1574.m3312(activityM754, view);
                return;
            }
        }
        if (iM4759 == 2) {
            C1033 c1033 = new C1033();
            new WeakReference(abstractC0027.m754());
            abstractC0027.m754();
            Log.e(">>>", "DialogX.DialogFragment 模式无法支持非 AppCompatActivity 启动。");
            abstractC0027.f910 = new WeakReference(c1033);
            return;
        }
        if (iM4759 != 3) {
            if (abstractC0027.m756() == null) {
                return;
            }
            m745(new RunnableC0374(view, abstractC0027, 0));
            return;
        }
        if (f906 == null) {
            f906 = new HashMap();
        }
        f906.put(abstractC0027.mo751(), new C0373((int) (objArr2 == true ? 1 : 0)));
        int i2 = 0;
        Intent intent = new Intent(m739(), (Class<?>) AbstractActivityC1037.class);
        if (abstractC0027.m754() == null) {
            intent.addFlags(268435456);
        }
        intent.putExtra("dialogXKey", abstractC0027.mo751());
        intent.putExtra("fromActivityUiStatus", (abstractC0027.m754() == null || m737(abstractC0027.m754()) == null) ? 0 : m737(abstractC0027.m754()).getSystemUiVisibility());
        intent.putExtra("from", m739().hashCode());
        m739().startActivity(intent);
        if (abstractC0027.m754() != null) {
            abstractC0027.m754().overridePendingTransition(0, 0);
        }
    }

    public static void m747(TextView textView, CharSequence charSequence) {
        if (textView == null) {
            return;
        }
        if (m743(charSequence)) {
            textView.setVisibility(8);
            textView.setText("");
        } else {
            textView.setVisibility(0);
            textView.setText(charSequence);
        }
    }

    public final void m748() {
        this.f923 = false;
        this.f908 = new WeakReference(m740());
        if (m754() == null && m758()) {
            m741(null);
            if (m754() == null) {
                m734("DialogX 未初始化(E5)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
                return;
            }
        }
        if (this.f924 != 1 && (m754() instanceof InterfaceC1777)) {
            ((InterfaceC1777) m754()).mo750().m97(new InterfaceC1774() { // from class: com.kongzue.dialogx.interfaces.BaseDialog$7
                @Override // p000.InterfaceC1774
                public final void mo0(InterfaceC1777 interfaceC1777, EnumC1769 enumC1769) {
                    if (enumC1769 == EnumC1769.ON_DESTROY) {
                        AbstractC0027.m744(this.f902.m754());
                    }
                }
            });
        }
        View currentFocus = m754().getCurrentFocus();
        if (currentFocus != null) {
            ((InputMethodManager) m754().getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 2);
        }
    }

    public final View m749(int i) {
        if (!m758()) {
            return AbstractC1460.m3216(m736()).inflate(i, (ViewGroup) null);
        }
        if (m754() != null) {
            return AbstractC1460.m3216(m754()).inflate(i, (ViewGroup) null);
        }
        m734("DialogX 未初始化(E3)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
        return null;
    }

    @Override // p000.InterfaceC1777
    public final C0000 mo750() {
        return this.f911;
    }

    public abstract String mo751();

    public final int m752(boolean z) {
        return this.f914[!z ? 1 : 0];
    }

    public final View m753() {
        WeakReference weakReference = this.f909;
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    public final Activity m754() {
        WeakReference weakReference = this.f908;
        if (weakReference == null || weakReference.get() == null) {
            this.f908 = new WeakReference(m740());
        }
        return (Activity) this.f908.get();
    }

    public final Resources m755() {
        if (m754() != null) {
            return new C2008(m754()).getResources();
        }
        return m736() == null ? Resources.getSystem() : new C2008(m736()).getResources();
    }

    public final FrameLayout m756() {
        FrameLayout frameLayoutM737;
        Activity activityM754 = m754();
        if (m758()) {
            if (activityM754 == null) {
                activityM754 = m740();
                if (activityM754 == null) {
                    m734("DialogX 错误：在 getRootFrameLayout() 时无法获取绑定的 activity，请确认是否正确初始化：\nDialogX.init(context);\n\n或者使用 .show(activity) 启动对话框\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
                    return null;
                }
                this.f908 = new WeakReference(activityM754);
            }
            frameLayoutM737 = m737(activityM754);
        } else {
            frameLayoutM737 = (FrameLayout) m753().getParent();
        }
        if (frameLayoutM737 != null) {
            return (FrameLayout) new WeakReference(frameLayoutM737).get();
        }
        m734("DialogX 错误：在 getRootFrameLayout() 时无法获 activity(" + activityM754 + ") 的 decorView，请检查该 activity 是否正常显示且可以使 DialogX 基于其显示。\n若该 activity 不可用，可通过以下代码配置豁免 DialogX 对话框绑定至该 activity，例如：\nDialogX.unsupportedActivitiesPackageNames = new String[]{\n        \"com.bytedance.sdk.openadsdk.stub.activity\",\n        \"com.mobile.auth.gatewayauth\",\n        \"com.google.android.gms.ads\"\n};\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX");
        return null;
    }

    public final void m757(EditText editText, boolean z) {
        if (m754() == null) {
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) m754().getSystemService("input_method");
        if (z) {
            inputMethodManager.showSoftInput(editText, 0);
        } else {
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }

    public final boolean m758() {
        int i = this.f924;
        return i == 1 || i == 4 || i == 3;
    }

    public final boolean m759() {
        int i = this.f925;
        if (i == 3) {
            if (m736() == null) {
                if (true) {
                    return false;
                }
            } else if ((m755().getConfiguration().uiMode & 48) != 16) {
                return false;
            }
        } else if (i != 1) {
            return false;
        }
        return true;
    }

    public abstract void mo760();

    public final void m761(EnumC1770 enumC1770) {
        C0000 c0000 = this.f911;
        if (true) {
            try {
                c0000.m99("setCurrentState");
                c0000.m101(enumC1770);
            } catch (Exception unused) {
            }
        }
    }
}
