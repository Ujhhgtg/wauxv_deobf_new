package com.highcapable.yukihookapi.hook.xposed.parasitic.activity.delegate;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000.AbstractC0145Ujhhgtgfeyxiexzf;
import p000.AbstractC0959feyxiexzfUjhhgtg;
import p000.AbstractC1152feyxiexzfUjhhgtg;
import p000.AbstractC2856feyxiexzfUjhhgtg;
import p000.AbstractC3028feyxiexzfUjhhgtg;
import p000.AbstractC3590Ujhhgtgfeyxiexzf;
import p000.AbstractC3593Ujhhgtgfeyxiexzf;
import p000.AbstractC3594Ujhhgtgfeyxiexzf;
import p000.C0216Ujhhgtgfeyxiexzf;
import p000.C0386Ujhhgtgfeyxiexzf;
import p000.C0393Ujhhgtgfeyxiexzf;
import p000.C0532Ujhhgtgfeyxiexzf;
import p000.C0709Ujhhgtgfeyxiexzf;
import p000.C0919feyxiexzfUjhhgtg;
import p000.C2065feyxiexzfUjhhgtg;
import p000.C2366Ujhhgtgfeyxiexzf;
import p000.C2374Ujhhgtgfeyxiexzf;
import p000.C3023feyxiexzfUjhhgtg;
import p000.C3438feyxiexzfUjhhgtg;
import p000.C3442feyxiexzfUjhhgtg;
import p000.InterfaceC0150Ujhhgtgfeyxiexzf;
import p000.InterfaceC0155Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC0155Ujhhgtgfeyxiexzf
public final class HandlerDelegate_me_hd_wauxv implements Handler.Callback {
    private final Handler.Callback baseInstance;

    public HandlerDelegate_me_hd_wauxv(Handler.Callback callback) {
        this.baseInstance = callback;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0075  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:98:0x0214  */
    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws IllegalAccessException {
        Bundle bundle;
        Object c0919feyxiexzfUjhhgtg;
        List list;
        Bundle bundle2;
        Object c0919feyxiexzfUjhhgtg2;
        Object c0919feyxiexzfUjhhgtg3;
        Parcelable parcelable;
        Object c0919feyxiexzfUjhhgtg4;
        Object c0919feyxiexzfUjhhgtg5;
        C0532Ujhhgtgfeyxiexzf c0532Ujhhgtgfeyxiexzf = C0532Ujhhgtgfeyxiexzf.f2496Ujhhgtgfeyxiexzf;
        Handler.Callback callback = this.baseInstance;
        c0532Ujhhgtgfeyxiexzf.getClass();
        InterfaceC0150Ujhhgtgfeyxiexzf[] interfaceC0150UjhhgtgfeyxiexzfArr = C0532Ujhhgtgfeyxiexzf.f2497Ujhhgtgfeyxiexzf;
        int i = message.what;
        if (i == 100) {
            int i2 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
            C0709Ujhhgtgfeyxiexzf c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(message.obj);
            C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg = C3023feyxiexzfUjhhgtg.f9386Ujhhgtgfeyxiexzf;
            ((C0216Ujhhgtgfeyxiexzf) c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg.f2944Ujhhgtgfeyxiexzf).f1487Ujhhgtgfeyxiexzf = AbstractC3590Ujhhgtgfeyxiexzf.m5126Ujhhgtgfeyxiexzf();
            c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg.m2025Ujhhgtgfeyxiexzf(true);
            C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg.m2021Ujhhgtgfeyxiexzf();
            c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "intent";
            C3438feyxiexzfUjhhgtg c3438feyxiexzfUjhhgtg = (C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4239feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf());
            Intent intent = c3438feyxiexzfUjhhgtg != null ? (Intent) c3438feyxiexzfUjhhgtg.m4939Ujhhgtgfeyxiexzf() : null;
            C3438feyxiexzfUjhhgtg c3438feyxiexzfUjhhgtg2 = (C3438feyxiexzfUjhhgtg) C0532Ujhhgtgfeyxiexzf.f2500Ujhhgtgfeyxiexzf.getValue();
            if (c3438feyxiexzfUjhhgtg2 != null) {
                C3438feyxiexzfUjhhgtg c3438feyxiexzfUjhhgtg3 = new C3438feyxiexzfUjhhgtg(c3438feyxiexzfUjhhgtg2.f10714Ujhhgtgfeyxiexzf);
                c3438feyxiexzfUjhhgtg3.m1940Ujhhgtgfeyxiexzf(intent);
                try {
                    c0919feyxiexzfUjhhgtg = c3438feyxiexzfUjhhgtg3.m4939Ujhhgtgfeyxiexzf();
                } catch (Throwable th) {
                    c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
                }
                if (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg = null;
                }
                bundle = (Bundle) c0919feyxiexzfUjhhgtg;
            } else {
                bundle = null;
            }
            if (bundle != null) {
                C2374Ujhhgtgfeyxiexzf.f7725Ujhhgtgfeyxiexzf.getClass();
                Application applicationM3616Ujhhgtgfeyxiexzf = C2374Ujhhgtgfeyxiexzf.m3616Ujhhgtgfeyxiexzf();
                bundle.setClassLoader(applicationM3616Ujhhgtgfeyxiexzf != null ? applicationM3616Ujhhgtgfeyxiexzf.getClassLoader() : null);
            }
            if (intent != null && intent.hasExtra("")) {
                c3438feyxiexzfUjhhgtg.m4940Ujhhgtgfeyxiexzf(intent.getParcelableExtra(""));
            }
        } else if (i == 159) {
            int i3 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
            C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf = C0532Ujhhgtgfeyxiexzf.f2499Ujhhgtgfeyxiexzf;
            InterfaceC0150Ujhhgtgfeyxiexzf interfaceC0150Ujhhgtgfeyxiexzf = interfaceC0150UjhhgtgfeyxiexzfArr[1];
            C0709Ujhhgtgfeyxiexzf c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg = AbstractC3594Ujhhgtgfeyxiexzf.m5191feyxiexzfUjhhgtg(c2366Ujhhgtgfeyxiexzf.m3605Ujhhgtgfeyxiexzf());
            C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg2 = C3023feyxiexzfUjhhgtg.f9386Ujhhgtgfeyxiexzf;
            ((C0216Ujhhgtgfeyxiexzf) c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg.f2944Ujhhgtgfeyxiexzf).f1487Ujhhgtgfeyxiexzf = AbstractC3590Ujhhgtgfeyxiexzf.m5126Ujhhgtgfeyxiexzf();
            c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg.m2025Ujhhgtgfeyxiexzf(true);
            C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf = c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg.m2024Ujhhgtgfeyxiexzf();
            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.f1479Ujhhgtgfeyxiexzf = "getCallbacks";
            C0393Ujhhgtgfeyxiexzf c0393Ujhhgtgfeyxiexzf = (C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4239feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf.m1635Ujhhgtgfeyxiexzf());
            if (c0393Ujhhgtgfeyxiexzf != null) {
                c0393Ujhhgtgfeyxiexzf.m1940Ujhhgtgfeyxiexzf(message.obj);
                try {
                    c0919feyxiexzfUjhhgtg5 = c0393Ujhhgtgfeyxiexzf.m1650Ujhhgtgfeyxiexzf(Arrays.copyOf(new Object[0], 0));
                } catch (Throwable th2) {
                    c0919feyxiexzfUjhhgtg5 = new C0919feyxiexzfUjhhgtg(th2);
                }
                if (c0919feyxiexzfUjhhgtg5 instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg5 = null;
                }
                list = (List) c0919feyxiexzfUjhhgtg5;
                if (list == null || list.isEmpty()) {
                    list = null;
                }
            } else {
                list = null;
            }
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(obj.getClass().getName(), "LaunchActivityItem", false)) {
                        arrayList.add(obj);
                    }
                }
                for (Object obj2 : arrayList) {
                    int i4 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                    C0709Ujhhgtgfeyxiexzf c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg2 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(obj2);
                    c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg2.m2025Ujhhgtgfeyxiexzf(true);
                    C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2 = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg2.m2021Ujhhgtgfeyxiexzf();
                    c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = "mIntent";
                    C3438feyxiexzfUjhhgtg c3438feyxiexzfUjhhgtg4 = (C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4239feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf2.m4942Ujhhgtgfeyxiexzf());
                    Intent intent2 = c3438feyxiexzfUjhhgtg4 != null ? (Intent) c3438feyxiexzfUjhhgtg4.m4939Ujhhgtgfeyxiexzf() : null;
                    C0532Ujhhgtgfeyxiexzf.f2496Ujhhgtgfeyxiexzf.getClass();
                    C3438feyxiexzfUjhhgtg c3438feyxiexzfUjhhgtg5 = (C3438feyxiexzfUjhhgtg) C0532Ujhhgtgfeyxiexzf.f2500Ujhhgtgfeyxiexzf.getValue();
                    if (c3438feyxiexzfUjhhgtg5 != null) {
                        C3438feyxiexzfUjhhgtg c3438feyxiexzfUjhhgtg6 = new C3438feyxiexzfUjhhgtg(c3438feyxiexzfUjhhgtg5.f10714Ujhhgtgfeyxiexzf);
                        c3438feyxiexzfUjhhgtg6.m1940Ujhhgtgfeyxiexzf(intent2);
                        try {
                            c0919feyxiexzfUjhhgtg4 = c3438feyxiexzfUjhhgtg6.m4939Ujhhgtgfeyxiexzf();
                        } catch (Throwable th3) {
                            c0919feyxiexzfUjhhgtg4 = new C0919feyxiexzfUjhhgtg(th3);
                        }
                        if (c0919feyxiexzfUjhhgtg4 instanceof C0919feyxiexzfUjhhgtg) {
                            c0919feyxiexzfUjhhgtg4 = null;
                        }
                        bundle2 = (Bundle) c0919feyxiexzfUjhhgtg4;
                    } else {
                        bundle2 = null;
                    }
                    if (bundle2 != null) {
                        C2374Ujhhgtgfeyxiexzf.f7725Ujhhgtgfeyxiexzf.getClass();
                        Application applicationM3616Ujhhgtgfeyxiexzf2 = C2374Ujhhgtgfeyxiexzf.m3616Ujhhgtgfeyxiexzf();
                        bundle2.setClassLoader(applicationM3616Ujhhgtgfeyxiexzf2 != null ? applicationM3616Ujhhgtgfeyxiexzf2.getClassLoader() : null);
                    }
                    if (intent2 != null && intent2.hasExtra("")) {
                        Class<Intent> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Intent.class));
                        Class cls = clsM5159Ujhhgtgfeyxiexzf != null ? clsM5159Ujhhgtgfeyxiexzf : Intent.class;
                        int i5 = AbstractC3028feyxiexzfUjhhgtg.f9394Ujhhgtgfeyxiexzf;
                        Parcelable parcelableExtra = intent2.getParcelableExtra("");
                        if (parcelableExtra == null) {
                            parcelableExtra = null;
                        }
                        int i6 = AbstractC3028feyxiexzfUjhhgtg.f9394Ujhhgtgfeyxiexzf;
                        if (i6 >= 33 && (parcelable = (Parcelable) intent2.getParcelableExtra("", cls)) != null) {
                            parcelableExtra = parcelable;
                        }
                        Intent intent3 = (Intent) parcelableExtra;
                        if (i6 >= 31) {
                            C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf2 = C0532Ujhhgtgfeyxiexzf.f2498Ujhhgtgfeyxiexzf;
                            InterfaceC0150Ujhhgtgfeyxiexzf interfaceC0150Ujhhgtgfeyxiexzf2 = interfaceC0150UjhhgtgfeyxiexzfArr[0];
                            C0709Ujhhgtgfeyxiexzf c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg2 = AbstractC3594Ujhhgtgfeyxiexzf.m5191feyxiexzfUjhhgtg(c2366Ujhhgtgfeyxiexzf2.m3605Ujhhgtgfeyxiexzf());
                            C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg3 = C3023feyxiexzfUjhhgtg.f9386Ujhhgtgfeyxiexzf;
                            ((C0216Ujhhgtgfeyxiexzf) c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg2.f2944Ujhhgtgfeyxiexzf).f1487Ujhhgtgfeyxiexzf = AbstractC3590Ujhhgtgfeyxiexzf.m5126Ujhhgtgfeyxiexzf();
                            c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg2.m2025Ujhhgtgfeyxiexzf(true);
                            C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2 = c0709UjhhgtgfeyxiexzfM5191feyxiexzfUjhhgtg2.m2024Ujhhgtgfeyxiexzf();
                            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.f1479Ujhhgtgfeyxiexzf = "currentActivityThread";
                            C0393Ujhhgtgfeyxiexzf c0393Ujhhgtgfeyxiexzf2 = (C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4239feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf2.m1635Ujhhgtgfeyxiexzf());
                            Object objM1649Ujhhgtgfeyxiexzf = c0393Ujhhgtgfeyxiexzf2 != null ? c0393Ujhhgtgfeyxiexzf2.m1649Ujhhgtgfeyxiexzf(new Object[0]) : null;
                            C0709Ujhhgtgfeyxiexzf c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg3 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(message.obj);
                            ((C0216Ujhhgtgfeyxiexzf) c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg3.f2944Ujhhgtgfeyxiexzf).f1487Ujhhgtgfeyxiexzf = AbstractC3590Ujhhgtgfeyxiexzf.m5126Ujhhgtgfeyxiexzf();
                            c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg3.m2025Ujhhgtgfeyxiexzf(true);
                            C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3 = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg3.m2024Ujhhgtgfeyxiexzf();
                            c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3.f1479Ujhhgtgfeyxiexzf = "getActivityToken";
                            C0393Ujhhgtgfeyxiexzf c0393Ujhhgtgfeyxiexzf3 = (C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4239feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf3.m1635Ujhhgtgfeyxiexzf());
                            if (c0393Ujhhgtgfeyxiexzf3 != null) {
                                try {
                                    c0919feyxiexzfUjhhgtg2 = c0393Ujhhgtgfeyxiexzf3.m1649Ujhhgtgfeyxiexzf(Arrays.copyOf(new Object[0], 0));
                                } catch (Throwable th4) {
                                    c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th4);
                                }
                                if (c0919feyxiexzfUjhhgtg2 instanceof C0919feyxiexzfUjhhgtg) {
                                    c0919feyxiexzfUjhhgtg2 = null;
                                }
                            } else {
                                c0919feyxiexzfUjhhgtg2 = null;
                            }
                            if (objM1649Ujhhgtgfeyxiexzf != null) {
                                C0709Ujhhgtgfeyxiexzf c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg4 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(objM1649Ujhhgtgfeyxiexzf);
                                ((C0216Ujhhgtgfeyxiexzf) c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg4.f2944Ujhhgtgfeyxiexzf).f1487Ujhhgtgfeyxiexzf = AbstractC3590Ujhhgtgfeyxiexzf.m5126Ujhhgtgfeyxiexzf();
                                c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg4.m2025Ujhhgtgfeyxiexzf(true);
                                C0386Ujhhgtgfeyxiexzf c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf4 = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg4.m2024Ujhhgtgfeyxiexzf();
                                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf4.f1479Ujhhgtgfeyxiexzf = "getLaunchingActivity";
                                c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf4.m4863Ujhhgtgfeyxiexzf(Arrays.copyOf(new Object[]{AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(IBinder.class)}, 1));
                                C0393Ujhhgtgfeyxiexzf c0393Ujhhgtgfeyxiexzf4 = (C0393Ujhhgtgfeyxiexzf) AbstractC2856feyxiexzfUjhhgtg.m4239feyxiexzfUjhhgtg(c0386UjhhgtgfeyxiexzfM2024Ujhhgtgfeyxiexzf4.m1635Ujhhgtgfeyxiexzf());
                                if (c0393Ujhhgtgfeyxiexzf4 != null) {
                                    try {
                                        c0919feyxiexzfUjhhgtg3 = c0393Ujhhgtgfeyxiexzf4.m1649Ujhhgtgfeyxiexzf(Arrays.copyOf(new Object[]{c0919feyxiexzfUjhhgtg2}, 1));
                                    } catch (Throwable th5) {
                                        c0919feyxiexzfUjhhgtg3 = new C0919feyxiexzfUjhhgtg(th5);
                                    }
                                    if (c0919feyxiexzfUjhhgtg3 instanceof C0919feyxiexzfUjhhgtg) {
                                        c0919feyxiexzfUjhhgtg3 = null;
                                    }
                                } else {
                                    c0919feyxiexzfUjhhgtg3 = null;
                                }
                            } else {
                                c0919feyxiexzfUjhhgtg3 = null;
                            }
                            if (c0919feyxiexzfUjhhgtg3 != null) {
                                C0709Ujhhgtgfeyxiexzf c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg5 = AbstractC3594Ujhhgtgfeyxiexzf.m5192feyxiexzfUjhhgtg(c0919feyxiexzfUjhhgtg3);
                                ((C0216Ujhhgtgfeyxiexzf) c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg5.f2944Ujhhgtgfeyxiexzf).f1487Ujhhgtgfeyxiexzf = AbstractC3590Ujhhgtgfeyxiexzf.m5126Ujhhgtgfeyxiexzf();
                                c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg5.m2025Ujhhgtgfeyxiexzf(true);
                                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3 = c0709UjhhgtgfeyxiexzfM5192feyxiexzfUjhhgtg5.m2021Ujhhgtgfeyxiexzf();
                                c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.f1479Ujhhgtgfeyxiexzf = "intent";
                                C3438feyxiexzfUjhhgtg c3438feyxiexzfUjhhgtg7 = (C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4239feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2021Ujhhgtgfeyxiexzf3.m4942Ujhhgtgfeyxiexzf());
                                if (c3438feyxiexzfUjhhgtg7 != null) {
                                    c3438feyxiexzfUjhhgtg7.m4940Ujhhgtgfeyxiexzf(intent3);
                                }
                            }
                        }
                        c3438feyxiexzfUjhhgtg4.m4940Ujhhgtgfeyxiexzf(intent3);
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
