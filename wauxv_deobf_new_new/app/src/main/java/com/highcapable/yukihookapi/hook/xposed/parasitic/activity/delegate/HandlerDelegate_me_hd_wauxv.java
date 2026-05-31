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
import p000.AbstractC0164;
import p000.AbstractC0739;
import p000.AbstractC1768;
import p000.AbstractC2234;
import p000.AbstractC2574;
import p000.AbstractC2727;
import p000.AbstractC2901;
import p000.C0160;
import p000.C0253;
import p000.C0261;
import p000.C1300;
import p000.C1316;
import p000.C1528;
import p000.C1681;
import p000.C1958;
import p000.C2004;
import p000.C2013;
import p000.C2641;
import p000.C2933;
import p000.InterfaceC1766;
import p000.InterfaceC1771;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1771
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
        Object c2641;
        List list;
        Bundle bundle2;
        Object c2642;
        Object c2643;
        Object c2644;
        Object c2645;
        C1528 c1528 = C1528.f5376;
        Handler.Callback callback = this.baseInstance;
        c1528.getClass();
        InterfaceC1766[] interfaceC1766Arr = C1528.f5377;
        int i = message.what;
        if (i == 100) {
            int i2 = AbstractC1768.f5906;
            C1681 c1681M4713 = AbstractC2727.m4713(message.obj);
            C2933 c2933 = C0160.f1227;
            ((C1958) c1681M4713.f5660).f6471 = AbstractC2234.m4168();
            c1681M4713.m3561(true);
            C1300 c1300M3558 = c1681M4713.m3558();
            c1300M3558.f6475 = "intent";
            C1316 c1316 = (C1316) AbstractC0739.m2291(c1300M3558.m3117());
            Intent intent = c1316 != null ? (Intent) c1316.m3127() : null;
            C1316 c1317 = (C1316) C1528.f5380.getValue();
            if (c1317 != null) {
                C1316 c1318 = new C1316(c1317.f4754);
                c1318.m3542(intent);
                try {
                    c2641 = c1318.m3127();
                } catch (Throwable th) {
                    c2641 = new C2641(th);
                }
                if (c2641 instanceof C2641) {
                    c2641 = null;
                }
                bundle = (Bundle) c2641;
            } else {
                bundle = null;
            }
            if (bundle != null) {
                C0261.f1489.getClass();
                Application applicationM1483 = C0261.m1483();
                bundle.setClassLoader(applicationM1483 != null ? applicationM1483.getClassLoader() : null);
            }
            if (intent != null && intent.hasExtra("")) {
                c1316.m3128(intent.getParcelableExtra(""));
            }
        } else if (i == 159) {
            int i3 = AbstractC1768.f5906;
            C0253 c0253 = C1528.f5379;
            InterfaceC1766 interfaceC1766 = interfaceC1766Arr[1];
            C1681 c1681M4712 = AbstractC2727.m4712(c0253.m1469());
            C2933 c2934 = C0160.f1227;
            ((C1958) c1681M4712.f5660).f6471 = AbstractC2234.m4168();
            c1681M4712.m3561(true);
            C2004 c2004M3560 = c1681M4712.m3560();
            c2004M3560.f6475 = "getCallbacks";
            C2013 c2013 = (C2013) AbstractC0739.m2291(c2004M3560.m3993());
            if (c2013 != null) {
                c2013.m3542(message.obj);
                try {
                    c2645 = c2013.m4026(Arrays.copyOf(new Object[0], 0));
                } catch (Throwable th2) {
                    c2645 = new C2641(th2);
                }
                if (c2645 instanceof C2641) {
                    c2645 = null;
                }
                list = (List) c2645;
                if (list == null || list.isEmpty()) {
                    list = null;
                }
            } else {
                list = null;
            }
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (AbstractC2901.m4861(obj.getClass().getName(), "LaunchActivityItem", false)) {
                        arrayList.add(obj);
                    }
                }
                for (Object obj2 : arrayList) {
                    int i4 = AbstractC1768.f5906;
                    C1681 c1681M4714 = AbstractC2727.m4713(obj2);
                    c1681M4714.m3561(true);
                    C1300 c1300M3559 = c1681M4714.m3558();
                    c1300M3559.f6475 = "mIntent";
                    C1316 c1319 = (C1316) AbstractC0739.m2291(c1300M3559.m3117());
                    Intent intent2 = c1319 != null ? (Intent) c1319.m3127() : null;
                    C1528.f5376.getClass();
                    C1316 c13110 = (C1316) C1528.f5380.getValue();
                    if (c13110 != null) {
                        C1316 c13111 = new C1316(c13110.f4754);
                        c13111.m3542(intent2);
                        try {
                            c2644 = c13111.m3127();
                        } catch (Throwable th3) {
                            c2644 = new C2641(th3);
                        }
                        if (c2644 instanceof C2641) {
                            c2644 = null;
                        }
                        bundle2 = (Bundle) c2644;
                    } else {
                        bundle2 = null;
                    }
                    if (bundle2 != null) {
                        C0261.f1489.getClass();
                        Application applicationM1484 = C0261.m1483();
                        bundle2.setClassLoader(applicationM1484 != null ? applicationM1484.getClassLoader() : null);
                    }
                    if (intent2 != null && intent2.hasExtra("")) {
                        Intent intent3 = (Intent) intent2.getParcelableExtra("");
                        if (AbstractC0164.m1348(31)) {
                            C0253 c0254 = C1528.f5378;
                            InterfaceC1766 interfaceC1767 = interfaceC1766Arr[0];
                            C1681 c1681M4715 = AbstractC2727.m4712(c0254.m1469());
                            C2933 c2935 = C0160.f1227;
                            ((C1958) c1681M4715.f5660).f6471 = AbstractC2234.m4168();
                            c1681M4715.m3561(true);
                            C2004 c2004M3561 = c1681M4715.m3560();
                            c2004M3561.f6475 = "currentActivityThread";
                            C2013 c2014 = (C2013) AbstractC0739.m2291(c2004M3561.m3993());
                            Object objM4025 = c2014 != null ? c2014.m4025(new Object[0]) : null;
                            C1681 c1681M4716 = AbstractC2727.m4713(message.obj);
                            ((C1958) c1681M4716.f5660).f6471 = AbstractC2234.m4168();
                            c1681M4716.m3561(true);
                            C2004 c2004M3562 = c1681M4716.m3560();
                            c2004M3562.f6475 = "getActivityToken";
                            C2013 c2015 = (C2013) AbstractC0739.m2291(c2004M3562.m3993());
                            if (c2015 != null) {
                                try {
                                    c2642 = c2015.m4025(Arrays.copyOf(new Object[0], 0));
                                } catch (Throwable th4) {
                                    c2642 = new C2641(th4);
                                }
                                if (c2642 instanceof C2641) {
                                    c2642 = null;
                                }
                            } else {
                                c2642 = null;
                            }
                            if (objM4025 != null) {
                                C1681 c1681M4717 = AbstractC2727.m4713(objM4025);
                                ((C1958) c1681M4717.f5660).f6471 = AbstractC2234.m4168();
                                c1681M4717.m3561(true);
                                C2004 c2004M3563 = c1681M4717.m3560();
                                c2004M3563.f6475 = "getLaunchingActivity";
                                c2004M3563.m3007(Arrays.copyOf(new Object[]{AbstractC2574.m4549(IBinder.class)}, 1));
                                C2013 c2016 = (C2013) AbstractC0739.m2291(c2004M3563.m3993());
                                if (c2016 != null) {
                                    try {
                                        c2643 = c2016.m4025(Arrays.copyOf(new Object[]{c2642}, 1));
                                    } catch (Throwable th5) {
                                        c2643 = new C2641(th5);
                                    }
                                    if (c2643 instanceof C2641) {
                                        c2643 = null;
                                    }
                                } else {
                                    c2643 = null;
                                }
                            } else {
                                c2643 = null;
                            }
                            if (c2643 != null) {
                                C1681 c1681M4718 = AbstractC2727.m4713(c2643);
                                ((C1958) c1681M4718.f5660).f6471 = AbstractC2234.m4168();
                                c1681M4718.m3561(true);
                                C1300 c1300M35510 = c1681M4718.m3558();
                                c1300M35510.f6475 = "intent";
                                C1316 c13112 = (C1316) AbstractC0739.m2291(c1300M35510.m3117());
                                if (c13112 != null) {
                                    c13112.m3128(intent3);
                                }
                            }
                        }
                        c1319.m3128(intent3);
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
