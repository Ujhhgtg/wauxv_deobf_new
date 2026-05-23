package com.highcapable.yukihookapi.hook.xposed.parasitic.activity.delegate;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000.AbstractC0156;
import p000.AbstractC0744;
import p000.AbstractC0968;
import p000.AbstractC2205;
import p000.AbstractC2519;
import p000.AbstractC2841;
import p000.C0152;
import p000.C0243;
import p000.C0251;
import p000.C1299;
import p000.C1315;
import p000.C1516;
import p000.C1744;
import p000.C1927;
import p000.MethodResolver;
import p000.C1982;
import p000.C2585;
import p000.C2873;
import p000.InterfaceC1742;
import p000.InterfaceC1748;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1748
public final class HandlerDelegate_me_hd_wauxv implements Handler.Callback {
    private final Handler.Callback baseInstance;

    public HandlerDelegate_me_hd_wauxv(Handler.Callback callback) {
        this.baseInstance = callback;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0075  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f4  */
    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws IllegalAccessException {
        Bundle bundle;
        Object c2585;
        List list;
        Bundle bundle2;
        Object c2586;
        Object c2587;
        Object c2588;
        Object c2589;
        C1516 c1516 = C1516.f5345;
        Handler.Callback callback = this.baseInstance;
        
        InterfaceC1742[] interfaceC1742Arr = C1516.f5346;
        int i = message.what;
        if (i == 100) {
            int i2 = 0;
            C1744 c1744M2484 = AbstractC0968.startFieldResolution(message.obj);
            C2873 c2873 = C0152.f1159;
            ((C1927) c1744M2484.f5843).f6366 = AbstractC2205.m4054();
            c1744M2484.m3493(true);
            C1299 c1299M3490 = c1744M2484.m3490();
            c1299M3490.f6370 = "intent";
            C1315 c1315 = (C1315) AbstractC0744.m2192(c1299M3490.resolve());
            Intent intent = c1315 != null ? (Intent) c1315.m3024() : null;
            C1315 c1316 = (C1315) C1516.f5349.getValue();
            if (c1316 != null) {
                C1315 c1317 = new C1315(c1316.f4755);
                c1317.m3378(intent);
                try {
                    c2585 = c1317.m3024();
                } catch (Throwable th) {
                    c2585 = new C2585(th);
                }
                if (c2585 instanceof C2585) {
                    c2585 = null;
                }
                bundle = (Bundle) c2585;
            } else {
                bundle = null;
            }
            if (bundle != null) {
                
                Application applicationM1337 = C0251.m1337();
                bundle.setClassLoader(applicationM1337 != null ? applicationM1337.getClassLoader() : null);
            }
            if (intent != null && intent.hasExtra("")) {
                c1315.set(intent.getParcelableExtra(""));
            }
        } else if (i == 159) {
            int i3 = 0;
            C0243 c0243 = C1516.f5348;
            InterfaceC1742 interfaceC1742 = interfaceC1742Arr[1];
            C1744 c1744M2483 = AbstractC0968.startMethodResolution(c0243.m1323());
            C2873 c2874 = C0152.f1159;
            ((C1927) c1744M2483.f5843).f6366 = AbstractC2205.m4054();
            c1744M2483.m3493(true);
            MethodResolver c1973M3492 = c1744M2483.m3492();
            c1973M3492.f6370 = "getCallbacks";
            C1982 c1982 = (C1982) AbstractC0744.m2192(c1973M3492.m3799());
            if (c1982 != null) {
                c1982.m3378(message.obj);
                try {
                    c2589 = c1982.invoke(Arrays.copyOf(new Object[0], 0));
                } catch (Throwable th2) {
                    c2589 = new C2585(th2);
                }
                if (c2589 instanceof C2585) {
                    c2589 = null;
                }
                list = (List) c2589;
                if (list == null || list.isEmpty()) {
                    list = null;
                }
            } else {
                list = null;
            }
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (AbstractC2841.m4828(obj.getClass().getName(), "LaunchActivityItem", false)) {
                        arrayList.add(obj);
                    }
                }
                for (Object obj2 : arrayList) {
                    int i4 = 0;
                    C1744 c1744M2485 = AbstractC0968.startFieldResolution(obj2);
                    c1744M2485.m3493(true);
                    C1299 c1299M3491 = c1744M2485.m3490();
                    c1299M3491.f6370 = "mIntent";
                    C1315 c1318 = (C1315) AbstractC0744.m2192(c1299M3491.resolve());
                    Intent intent2 = c1318 != null ? (Intent) c1318.m3024() : null;
                    
                    C1315 c1319 = (C1315) C1516.f5349.getValue();
                    if (c1319 != null) {
                        C1315 c13110 = new C1315(c1319.f4755);
                        c13110.m3378(intent2);
                        try {
                            c2588 = c13110.m3024();
                        } catch (Throwable th3) {
                            c2588 = new C2585(th3);
                        }
                        if (c2588 instanceof C2585) {
                            c2588 = null;
                        }
                        bundle2 = (Bundle) c2588;
                    } else {
                        bundle2 = null;
                    }
                    if (bundle2 != null) {
                        
                        Application applicationM1338 = C0251.m1337();
                        bundle2.setClassLoader(applicationM1338 != null ? applicationM1338.getClassLoader() : null);
                    }
                    if (intent2 != null && intent2.hasExtra("")) {
                        Intent intent3 = (Intent) intent2.getParcelableExtra("");
                        if (AbstractC0156.m1202(31)) {
                            C0243 c0244 = C1516.f5347;
                            InterfaceC1742 interfaceC1743 = interfaceC1742Arr[0];
                            C1744 c1744M2486 = AbstractC0968.startMethodResolution(c0244.m1323());
                            C2873 c2875 = C0152.f1159;
                            ((C1927) c1744M2486.f5843).f6366 = AbstractC2205.m4054();
                            c1744M2486.m3493(true);
                            MethodResolver c1973M3493 = c1744M2486.m3492();
                            c1973M3493.f6370 = "currentActivityThread";
                            C1982 c1983 = (C1982) AbstractC0744.m2192(c1973M3493.m3799());
                            Object objM3831 = c1983 != null ? c1983.m3831(new Object[0]) : null;
                            C1744 c1744M2487 = AbstractC0968.startFieldResolution(message.obj);
                            ((C1927) c1744M2487.f5843).f6366 = AbstractC2205.m4054();
                            c1744M2487.m3493(true);
                            MethodResolver c1973M3494 = c1744M2487.m3492();
                            c1973M3494.f6370 = "getActivityToken";
                            C1982 c1984 = (C1982) AbstractC0744.m2192(c1973M3494.m3799());
                            if (c1984 != null) {
                                try {
                                    c2586 = c1984.m3831(Arrays.copyOf(new Object[0], 0));
                                } catch (Throwable th4) {
                                    c2586 = new C2585(th4);
                                }
                                if (c2586 instanceof C2585) {
                                    c2586 = null;
                                }
                            } else {
                                c2586 = null;
                            }
                            if (objM3831 != null) {
                                C1744 c1744M2488 = AbstractC0968.startFieldResolution(objM3831);
                                ((C1927) c1744M2488.f5843).f6366 = AbstractC2205.m4054();
                                c1744M2488.m3493(true);
                                MethodResolver c1973M3495 = c1744M2488.m3492();
                                c1973M3495.f6370 = "getLaunchingActivity";
                                c1973M3495.m2888(Arrays.copyOf(new Object[]{AbstractC2519.classToKClass(IBinder.class)}, 1));
                                C1982 c1985 = (C1982) AbstractC0744.m2192(c1973M3495.m3799());
                                if (c1985 != null) {
                                    try {
                                        c2587 = c1985.m3831(Arrays.copyOf(new Object[]{c2586}, 1));
                                    } catch (Throwable th5) {
                                        c2587 = new C2585(th5);
                                    }
                                    if (c2587 instanceof C2585) {
                                        c2587 = null;
                                    }
                                } else {
                                    c2587 = null;
                                }
                            } else {
                                c2587 = null;
                            }
                            if (c2587 != null) {
                                C1744 c1744M2489 = AbstractC0968.startFieldResolution(c2587);
                                ((C1927) c1744M2489.f5843).f6366 = AbstractC2205.m4054();
                                c1744M2489.m3493(true);
                                C1299 c1299M3492 = c1744M2489.m3490();
                                c1299M3492.f6370 = "intent";
                                C1315 c13111 = (C1315) AbstractC0744.m2192(c1299M3492.resolve());
                                if (c13111 != null) {
                                    c13111.set(intent3);
                                }
                            }
                        }
                        c1318.set(intent3);
                    }
                }
            }
        }
        if (callback != null) {
            return callback.handleMessage(message);
        }
        return false;
    }
}
