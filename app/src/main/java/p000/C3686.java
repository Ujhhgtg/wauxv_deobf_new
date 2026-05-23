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

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3686 {

    public static final boolean f11576;

    public static final String f11577;

    public static final C0588 f11578;

    public static final int f11579;

    public static final int f11580;

    public static C3686 f11581;

    public Application f11583;

    public final ConcurrentHashMap f11582 = new ConcurrentHashMap();

    public final C3683 f11584 = new InterfaceC1430() { // from class: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤞᲀᲈᤝᲁ
        @Override // p000.InterfaceC1430
        public final Object mo3133(Object obj, Object obj2, Object obj3) {
            Object c2585;
            C3686 c3686 = this.f11568;
            Intent intent = (Intent) obj3;
            String action = intent.getAction();
            if (action != null) {
                try {
                    ConcurrentHashMap concurrentHashMap = c3686.f11582;
                    c2585 = null;
                    if (concurrentHashMap.isEmpty()) {
                        concurrentHashMap = null;
                    }
                    if (concurrentHashMap != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            String str = (String) entry.getKey();
                            C2315 c2315 = (C2315) entry.getValue();
                            Object obj4 = c2315.f7445;
                            Activity activity = obj4 instanceof Activity ? (Activity) obj4 : null;
                            if (activity != null && activity.isDestroyed()) {
                                arrayList.add(str);
                            } else if (c3686.m5345((Context) c2315.f7445)) {
                                ((InterfaceC1429) c2315.f7446).mo1196(action, intent);
                            }
                        }
                        ArrayList arrayList2 = arrayList.isEmpty() ? null : arrayList;
                        if (arrayList2 != null) {
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                concurrentHashMap.remove((String) it.next());
                            }
                        }
                        c2585 = concurrentHashMap;
                    }
                } catch (Throwable th) {
                    c2585 = new C2585(th);
                }
                Throwable thM4594 = C2586.m4594(c2585);
                if (thM4594 != null) {
                    ArrayList arrayList3 = C3678.f11549;
                    C3678.m5308(4, "Received action \"" + action + "\" failed", thM4594);
                }
            }
            return Unit.INSTANCE;
        }
    };

    static {
        Object c2585;
        boolean z = C3692.f11601;
        f11576 = C3692.m5357();
        try {
            c2585 = 1777192932264L;
        } catch (Throwable th) {
            c2585 = new C2585(th);
        }
        if (c2585 instanceof C2585) {
            c2585 = null;
        }
        Long l = (Long) c2585;
        f11577 = String.valueOf(l != null ? l.longValue() : 0L);
        f11578 = new C0588(null, "yuki_logger_inmemory_data_result");
        f11579 = 512000;
        f11580 = 3;
    }

    public static String m5343(String str) {
        return AbstractC1194.m2779(AbstractC2841.m4848(str).toString().hashCode(), "yuki_hook_host_data_channel_");
    }

    public static String m5344(Context context) {
        String packageName;
        String str = C3692.f11608;
        if (AbstractC2841.m4836(str)) {
            if (context == null || (packageName = context.getPackageName()) == null) {
                packageName = "";
            }
            str = packageName;
        }
        return AbstractC1194.m2779(AbstractC2841.m4848(str).toString().hashCode(), "yuki_hook_module_data_channel_");
    }

    public final boolean m5345(Context context) {
        Object c2585;
        boolean z;
        int size;
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ComponentName componentName;
        try {
            if (!(context instanceof Application) && !f11576) {
                Context context2 = context == null ? this.f11583 : context;
                Object systemService = context2 != null ? context2.getSystemService("activity") : null;
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                if (activityManager == null || (runningTasks = activityManager.getRunningTasks(9999)) == null) {
                    size = 0;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : runningTasks) {
                        ActivityManager.RunningTaskInfo runningTaskInfo = (ActivityManager.RunningTaskInfo) obj;
                        if (AbstractC2207.m4087(context != null ? context.getClass().getName() : null, (runningTaskInfo == null || (componentName = runningTaskInfo.topActivity) == null) ? null : componentName.getClassName())) {
                            arrayList.add(obj);
                        }
                    }
                    size = arrayList.size();
                }
                z = size > 0;
            }
            c2585 = Boolean.valueOf(z);
        } catch (Throwable th) {
            c2585 = new C2585(th);
        }
        Boolean bool = (Boolean) (c2585 instanceof C2585 ? null : c2585);
        if (bool != null) {
            return bool.booleanValue();
        }
        C3678.m5309("Couldn't got current Activity status because a SecurityException blocked it");
        return false;
    }

    public final C2103 m5346(Application application, String str) {
        if (f11576 && AbstractC2841.m4836(C3692.f11608)) {
            throw new IllegalStateException("Xposed modulePackageName load failed, please reset and rebuild it");
        }
        return new C2103(this, application, str);
    }

    public final void m5347(final Application application, String str) {
        if (AbstractC2205.f7173) {
            this.f11583 = application;
            IntentFilter intentFilter = new IntentFilter();
            boolean z = f11576;
            intentFilter.addAction(z ? m5343(str) : m5344(application));
            C0476 c0476 = new C0476(this.f11584);
            if (AbstractC0156.m1202(26)) {
                application.registerReceiver(c0476, intentFilter, 2);
            } else {
                application.registerReceiver(c0476, intentFilter);
            }
            if (z) {
                C2103 c2103M5346 = m5346(application, str);
                final int i = 0;
                C2103.m3907(c2103M5346, "module_generated_version_get", new InterfaceC1425(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤞᲀᲈᲁᤝ

                    public final /* synthetic */ C3686 f11570;

                    {
                        this.f11570 = this;
                    }

                    @Override // p000.InterfaceC1425
                    public final Object invoke(Object obj) {
                        switch (0) {
                            case 0:
                                this.f11570.m5346(application, (String) obj).m3919(C2103.m3905(new C0588(C3686.f11577, "module_generated_version_result"), C1133.m2705(), -1, -1));
                                break;
                            default:
                                this.f11570.m5346(application, (String) obj).m3919(C2103.m3905(new C0588(C3678.f11549, C3686.f11578.f2389), C1133.m2705(), -1, -1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
                final int i2 = 1;
                C2103.m3907(c2103M5346, "yuki_logger_inmemory_data_get", new InterfaceC1425(this) { // from class: ᛱᛲᛳᛴᛵᛶᛷᲇᛸᤞᲀᲈᲁᤝ

                    public final /* synthetic */ C3686 f11570;

                    {
                        this.f11570 = this;
                    }

                    @Override // p000.InterfaceC1425
                    public final Object invoke(Object obj) {
                        switch (1) {
                            case 0:
                                this.f11570.m5346(application, (String) obj).m3919(C2103.m3905(new C0588(C3686.f11577, "module_generated_version_result"), C1133.m2705(), -1, -1));
                                break;
                            default:
                                this.f11570.m5346(application, (String) obj).m3919(C2103.m3905(new C0588(C3678.f11549, C3686.f11578.f2389), C1133.m2705(), -1, -1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                });
            }
        }
    }
}
