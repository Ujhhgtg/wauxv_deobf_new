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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲁᲈᤞᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3749 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final boolean f11733;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final String f11734;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C0569 f11735;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final int f11736;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final int f11737;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static C3749 f11738;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public Application f11740;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final ConcurrentHashMap f11739 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C3746 f11741 = new InterfaceC1438() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲁᲈᤝᤞᲀ
        @Override // p000.InterfaceC1438
        /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
        public final Object mo2135(Object obj, Object obj2, Object obj3) {
            Object c2641;
            C3749 c3749 = this.f11725;
            Intent intent = (Intent) obj3;
            String action = intent.getAction();
            if (action != null) {
                try {
                    ConcurrentHashMap concurrentHashMap = c3749.f11739;
                    c2641 = null;
                    if (concurrentHashMap.isEmpty()) {
                        concurrentHashMap = null;
                    }
                    if (concurrentHashMap != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            String str = (String) entry.getKey();
                            C2348 c2348 = (C2348) entry.getValue();
                            Object obj4 = c2348.f7567;
                            Activity activity = obj4 instanceof Activity ? (Activity) obj4 : null;
                            if (activity != null && activity.isDestroyed()) {
                                arrayList.add(str);
                            } else if (c3749.m5353((Context) c2348.f7567)) {
                                ((InterfaceC1437) c2348.f7568).mo1342(action, intent);
                            }
                        }
                        ArrayList arrayList2 = arrayList.isEmpty() ? null : arrayList;
                        if (arrayList2 != null) {
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                concurrentHashMap.remove((String) it.next());
                            }
                        }
                        c2641 = concurrentHashMap;
                    }
                } catch (Throwable th) {
                    c2641 = new C2641(th);
                }
                Throwable thM4616 = C2642.m4616(c2641);
                if (thM4616 != null) {
                    ArrayList arrayList3 = C3741.f11709;
                    C3741.m5317(4, "Received action \"" + action + "\" failed", thM4616);
                }
            }
            return C3554.UNIT;
        }
    };

    static {
        Object c2641;
        boolean z = C3755.f11758;
        f11733 = C3755.m5365();
        try {
            c2641 = 1779713681948L;
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        if (c2641 instanceof C2641) {
            c2641 = null;
        }
        Long l = (Long) c2641;
        f11734 = String.valueOf(l != null ? l.longValue() : 0L);
        f11735 = new C0569(null, "yuki_logger_inmemory_data_result");
        f11736 = 512000;
        f11737 = 3;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static String m5351(String str) {
        return AbstractC1095.m2794(AbstractC2901.m4882(str).toString().hashCode(), "yuki_hook_host_data_channel_");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static String m5352(Context context) {
        String packageName;
        String str = C3755.f11765;
        if (AbstractC2901.m4869(str)) {
            if (context == null || (packageName = context.getPackageName()) == null) {
                packageName = "";
            }
            str = packageName;
        }
        return AbstractC1095.m2794(AbstractC2901.m4882(str).toString().hashCode(), "yuki_hook_module_data_channel_");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final boolean m5353(Context context) {
        Object c2641;
        boolean z;
        int size;
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ComponentName componentName;
        try {
            if (!(context instanceof Application) && !f11733) {
                Context context2 = context == null ? this.f11740 : context;
                Object systemService = context2 != null ? context2.getSystemService("activity") : null;
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                if (activityManager == null || (runningTasks = activityManager.getRunningTasks(9999)) == null) {
                    size = 0;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : runningTasks) {
                        ActivityManager.RunningTaskInfo runningTaskInfo = (ActivityManager.RunningTaskInfo) obj;
                        if (AbstractC1469.m3322(context != null ? context.getClass().getName() : null, (runningTaskInfo == null || (componentName = runningTaskInfo.topActivity) == null) ? null : componentName.getClassName())) {
                            arrayList.add(obj);
                        }
                    }
                    size = arrayList.size();
                }
                z = size > 0;
            }
            c2641 = Boolean.valueOf(z);
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        Boolean bool = (Boolean) (c2641 instanceof C2641 ? null : c2641);
        if (bool != null) {
            return bool.booleanValue();
        }
        C3741.m5318("Couldn't got current Activity status because a SecurityException blocked it");
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2136 m5354(Application application, String str) {
        if (f11733 && AbstractC2901.m4869(C3755.f11765)) {
            throw new IllegalStateException("Xposed modulePackageName load failed, please reset and rebuild it");
        }
        return new C2136(this, application, str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m5355(final Application application, String str) {
        if (AbstractC2240.f7305) {
            this.f11740 = application;
            IntentFilter intentFilter = new IntentFilter();
            boolean z = f11733;
            intentFilter.addAction(z ? m5351(str) : m5352(application));
            C0451 c0451 = new C0451(this.f11741);
            if (AbstractC0164.m1348(26)) {
                application.registerReceiver(c0451, intentFilter, 2);
            } else {
                application.registerReceiver(c0451, intentFilter);
            }
            if (z) {
                C2136 c2136M5354 = m5354(application, str);
                final int i = 0;
                C2136.m4090(c2136M5354, "module_generated_version_get", new InterfaceC1433(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲁᲈᤝᲀᤞ

                    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
                    public final /* synthetic */ C3749 f11727;

                    {
                        this.f11727 = this;
                    }

                    @Override // p000.InterfaceC1433
                    public final Object invoke(Object obj) {
                        switch (i) {
                            case 0:
                                this.f11727.m5354(application, (String) obj).m4103(C2136.m4088(new C0569(C3749.f11734, "module_generated_version_result"), C1139.m2855(), -1, -1));
                                break;
                            default:
                                this.f11727.m5354(application, (String) obj).m4103(C2136.m4088(new C0569(C3741.f11709, C3749.f11735.f2355), C1139.m2855(), -1, -1));
                                break;
                        }
                        return C3554.UNIT;
                    }
                });
                final int i2 = 1;
                C2136.m4090(c2136M5354, "yuki_logger_inmemory_data_get", new InterfaceC1433(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᲁᲈᤝᲀᤞ

                    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
                    public final /* synthetic */ C3749 f11727;

                    {
                        this.f11727 = this;
                    }

                    @Override // p000.InterfaceC1433
                    public final Object invoke(Object obj) {
                        switch (i2) {
                            case 0:
                                this.f11727.m5354(application, (String) obj).m4103(C2136.m4088(new C0569(C3749.f11734, "module_generated_version_result"), C1139.m2855(), -1, -1));
                                break;
                            default:
                                this.f11727.m5354(application, (String) obj).m4103(C2136.m4088(new C0569(C3741.f11709, C3749.f11735.f2355), C1139.m2855(), -1, -1));
                                break;
                        }
                        return C3554.UNIT;
                    }
                });
            }
        }
    }
}
