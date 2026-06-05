package p000;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能ᛴᛱUjhhgtgᛱᛲ要点脸ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2277Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final boolean f7460Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final String f7461Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final C2680Ujhhgtgfeyxiexzf f7462Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static final int f7463Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static final int f7464Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static C2277Ujhhgtgfeyxiexzf f7465Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public Application f7467Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final ConcurrentHashMap f7466Ujhhgtgfeyxiexzf = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C2275Ujhhgtgfeyxiexzf f7468Ujhhgtgfeyxiexzf = new InterfaceC3556feyxiexzfUjhhgtg() { // from class: 上海高中ᛱ谢子非ᛱᛳ能不能ᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ要点脸ᛲ
        @Override // p000.InterfaceC3556feyxiexzfUjhhgtg
        /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
        public final Object mo1207Ujhhgtgfeyxiexzf(Object obj, Object obj2, Object obj3) {
            Object c0919feyxiexzfUjhhgtg;
            C2277Ujhhgtgfeyxiexzf c2277Ujhhgtgfeyxiexzf = this.f7458Ujhhgtgfeyxiexzf;
            Intent intent = (Intent) obj3;
            String action = intent.getAction();
            if (action != null) {
                try {
                    ConcurrentHashMap concurrentHashMap = c2277Ujhhgtgfeyxiexzf.f7466Ujhhgtgfeyxiexzf;
                    c0919feyxiexzfUjhhgtg = null;
                    if (concurrentHashMap.isEmpty()) {
                        concurrentHashMap = null;
                    }
                    if (concurrentHashMap != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            String str = (String) entry.getKey();
                            C1381feyxiexzfUjhhgtg c1381feyxiexzfUjhhgtg = (C1381feyxiexzfUjhhgtg) entry.getValue();
                            Object obj4 = c1381feyxiexzfUjhhgtg.f4874Ujhhgtgfeyxiexzf;
                            Activity activity = obj4 instanceof Activity ? (Activity) obj4 : null;
                            if (activity != null && activity.isDestroyed()) {
                                arrayList.add(str);
                            } else if (c2277Ujhhgtgfeyxiexzf.m3474Ujhhgtgfeyxiexzf((Context) c1381feyxiexzfUjhhgtg.f4874Ujhhgtgfeyxiexzf)) {
                                ((InterfaceC3553feyxiexzfUjhhgtg) c1381feyxiexzfUjhhgtg.f4875Ujhhgtgfeyxiexzf).mo1179Ujhhgtgfeyxiexzf(action, intent);
                            }
                        }
                        ArrayList arrayList2 = arrayList.isEmpty() ? null : arrayList;
                        if (arrayList2 != null) {
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                concurrentHashMap.remove((String) it.next());
                            }
                        }
                        c0919feyxiexzfUjhhgtg = concurrentHashMap;
                    }
                } catch (Throwable th) {
                    c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
                }
                Throwable thM2409Ujhhgtgfeyxiexzf = C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg);
                if (thM2409Ujhhgtgfeyxiexzf != null) {
                    ArrayList arrayList3 = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                    C2290feyxiexzfUjhhgtg.m3497Ujhhgtgfeyxiexzf(4, "Received action \"" + action + "\" failed", thM2409Ujhhgtgfeyxiexzf);
                }
            }
            return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        }
    };

    static {
        Object c0919feyxiexzfUjhhgtg;
        boolean z = C2283feyxiexzfUjhhgtg.f7478Ujhhgtgfeyxiexzf;
        f7460Ujhhgtgfeyxiexzf = C2283feyxiexzfUjhhgtg.m3480Ujhhgtgfeyxiexzf();
        try {
            c0919feyxiexzfUjhhgtg = 1780240404821L;
        } catch (Throwable th) {
            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
        }
        if (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg) {
            c0919feyxiexzfUjhhgtg = null;
        }
        Long l = (Long) c0919feyxiexzfUjhhgtg;
        f7461Ujhhgtgfeyxiexzf = String.valueOf(l != null ? l.longValue() : 0L);
        f7462Ujhhgtgfeyxiexzf = new C2680Ujhhgtgfeyxiexzf(null, "yuki_logger_inmemory_data_result");
        f7463Ujhhgtgfeyxiexzf = 512000;
        f7464Ujhhgtgfeyxiexzf = 3;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static String m3472Ujhhgtgfeyxiexzf(String str) {
        return AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2644feyxiexzfUjhhgtg(str).toString().hashCode(), "yuki_hook_host_data_channel_");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static String m3473Ujhhgtgfeyxiexzf(Context context) {
        String packageName;
        String str = C2283feyxiexzfUjhhgtg.f7485Ujhhgtgfeyxiexzf;
        if (AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(str)) {
            if (context == null || (packageName = context.getPackageName()) == null) {
                packageName = "";
            }
            str = packageName;
        }
        return AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(AbstractC1152feyxiexzfUjhhgtg.m2644feyxiexzfUjhhgtg(str).toString().hashCode(), "yuki_hook_module_data_channel_");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final boolean m3474Ujhhgtgfeyxiexzf(Context context) {
        Object c0919feyxiexzfUjhhgtg;
        boolean z;
        int size;
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ComponentName componentName;
        try {
            if (!(context instanceof Application) && !f7460Ujhhgtgfeyxiexzf) {
                Context context2 = context == null ? this.f7467Ujhhgtgfeyxiexzf : context;
                Object systemService = context2 != null ? context2.getSystemService("activity") : null;
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                if (activityManager == null || (runningTasks = activityManager.getRunningTasks(9999)) == null) {
                    size = 0;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : runningTasks) {
                        ActivityManager.RunningTaskInfo runningTaskInfo = (ActivityManager.RunningTaskInfo) obj;
                        if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(context != null ? context.getClass().getName() : null, (runningTaskInfo == null || (componentName = runningTaskInfo.topActivity) == null) ? null : componentName.getClassName())) {
                            arrayList.add(obj);
                        }
                    }
                    size = arrayList.size();
                }
                z = size > 0;
            }
            c0919feyxiexzfUjhhgtg = Boolean.valueOf(z);
        } catch (Throwable th) {
            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
        }
        Boolean bool = (Boolean) (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg);
        if (bool != null) {
            return bool.booleanValue();
        }
        C2290feyxiexzfUjhhgtg.m3498Ujhhgtgfeyxiexzf("Couldn't got current Activity status because a SecurityException blocked it");
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C0416Ujhhgtgfeyxiexzf m3475Ujhhgtgfeyxiexzf(Application application, String str) {
        if (f7460Ujhhgtgfeyxiexzf && AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(C2283feyxiexzfUjhhgtg.f7485Ujhhgtgfeyxiexzf)) {
            throw new IllegalStateException("Xposed modulePackageName load failed, please reset and rebuild it");
        }
        return new C0416Ujhhgtgfeyxiexzf(this, application, str);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final void m3476Ujhhgtgfeyxiexzf(final Application application, String str) {
        if (AbstractC3594Ujhhgtgfeyxiexzf.f11192Ujhhgtgfeyxiexzf) {
            this.f7467Ujhhgtgfeyxiexzf = application;
            IntentFilter intentFilter = new IntentFilter();
            boolean z = f7460Ujhhgtgfeyxiexzf;
            intentFilter.addAction(z ? m3472Ujhhgtgfeyxiexzf(str) : m3473Ujhhgtgfeyxiexzf(application));
            C2564Ujhhgtgfeyxiexzf c2564Ujhhgtgfeyxiexzf = new C2564Ujhhgtgfeyxiexzf(this.f7468Ujhhgtgfeyxiexzf);
            if (AbstractC3028feyxiexzfUjhhgtg.f9394Ujhhgtgfeyxiexzf >= 26) {
                application.registerReceiver(c2564Ujhhgtgfeyxiexzf, intentFilter, 2);
            } else {
                application.registerReceiver(c2564Ujhhgtgfeyxiexzf, intentFilter);
            }
            if (z) {
                C0416Ujhhgtgfeyxiexzf c0416UjhhgtgfeyxiexzfM3475Ujhhgtgfeyxiexzf = m3475Ujhhgtgfeyxiexzf(application, str);
                final int i = 0;
                C0416Ujhhgtgfeyxiexzf.m1703feyxiexzfUjhhgtg(c0416UjhhgtgfeyxiexzfM3475Ujhhgtgfeyxiexzf, "module_generated_version_get", new InterfaceC3549feyxiexzfUjhhgtg(this) { // from class: 上海高中ᛱ谢子非ᛱᛳ能不能ᛴᛱUjhhgtgᛱ要点脸ᛲᛱfeyxiexzfᛱ

                    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
                    public final /* synthetic */ C2277Ujhhgtgfeyxiexzf f7472Ujhhgtgfeyxiexzf;

                    {
                        this.f7472Ujhhgtgfeyxiexzf = this;
                    }

                    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
                    public final Object invoke(Object obj) {
                        switch (i) {
                            case 0:
                                this.f7472Ujhhgtgfeyxiexzf.m3475Ujhhgtgfeyxiexzf(application, (String) obj).m1723Ujhhgtgfeyxiexzf(C0416Ujhhgtgfeyxiexzf.m1701feyxiexzfUjhhgtg(new C2680Ujhhgtgfeyxiexzf(C2277Ujhhgtgfeyxiexzf.f7461Ujhhgtgfeyxiexzf, "module_generated_version_result"), C3382feyxiexzfUjhhgtg.m4886Ujhhgtgfeyxiexzf(), -1, -1));
                                break;
                            default:
                                this.f7472Ujhhgtgfeyxiexzf.m3475Ujhhgtgfeyxiexzf(application, (String) obj).m1723Ujhhgtgfeyxiexzf(C0416Ujhhgtgfeyxiexzf.m1701feyxiexzfUjhhgtg(new C2680Ujhhgtgfeyxiexzf(C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf, C2277Ujhhgtgfeyxiexzf.f7462Ujhhgtgfeyxiexzf.f8567Ujhhgtgfeyxiexzf), C3382feyxiexzfUjhhgtg.m4886Ujhhgtgfeyxiexzf(), -1, -1));
                                break;
                        }
                        return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
                    }
                });
                final int i2 = 1;
                C0416Ujhhgtgfeyxiexzf.m1703feyxiexzfUjhhgtg(c0416UjhhgtgfeyxiexzfM3475Ujhhgtgfeyxiexzf, "yuki_logger_inmemory_data_get", new InterfaceC3549feyxiexzfUjhhgtg(this) { // from class: 上海高中ᛱ谢子非ᛱᛳ能不能ᛴᛱUjhhgtgᛱ要点脸ᛲᛱfeyxiexzfᛱ

                    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
                    public final /* synthetic */ C2277Ujhhgtgfeyxiexzf f7472Ujhhgtgfeyxiexzf;

                    {
                        this.f7472Ujhhgtgfeyxiexzf = this;
                    }

                    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
                    public final Object invoke(Object obj) {
                        switch (i2) {
                            case 0:
                                this.f7472Ujhhgtgfeyxiexzf.m3475Ujhhgtgfeyxiexzf(application, (String) obj).m1723Ujhhgtgfeyxiexzf(C0416Ujhhgtgfeyxiexzf.m1701feyxiexzfUjhhgtg(new C2680Ujhhgtgfeyxiexzf(C2277Ujhhgtgfeyxiexzf.f7461Ujhhgtgfeyxiexzf, "module_generated_version_result"), C3382feyxiexzfUjhhgtg.m4886Ujhhgtgfeyxiexzf(), -1, -1));
                                break;
                            default:
                                this.f7472Ujhhgtgfeyxiexzf.m3475Ujhhgtgfeyxiexzf(application, (String) obj).m1723Ujhhgtgfeyxiexzf(C0416Ujhhgtgfeyxiexzf.m1701feyxiexzfUjhhgtg(new C2680Ujhhgtgfeyxiexzf(C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf, C2277Ujhhgtgfeyxiexzf.f7462Ujhhgtgfeyxiexzf.f8567Ujhhgtgfeyxiexzf), C3382feyxiexzfUjhhgtg.m4886Ujhhgtgfeyxiexzf(), -1, -1));
                                break;
                        }
                        return C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
                    }
                });
            }
        }
    }
}
