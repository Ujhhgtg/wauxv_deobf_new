package me.hd.wauxv.hook;

import android.content.res.XModuleResources;
import android.content.res.XResources;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import me.hd.wauxv.hook.factory.MagicFactory;
import p000.AbstractC1574;
import p000.C1562;
import p000.C2585;
import p000.C2586;
import p000.C3497;
import p000.C3678;
import p000.C3690;
import p000.C3692;
import p000.InterfaceC1748;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1748
public final class Entry implements IXposedHookZygoteInit, IXposedHookLoadPackage {
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        C1562 c1562 = C1562.f5434;
        c1562.getClass();
        if (loadPackageParam == null || !C1562.f5435) {
            return;
        }
        C1562.m3265(c1562, loadPackageParam, 5);
    }

    public void initZygote(IXposedHookZygoteInit.StartupParam startupParam) {
        Object c2585;
        Object c2586;
        C1562 c1562 = C1562.f5434;
        c1562.getClass();
        String[] strArr = AbstractC1574.f5469;
        if (startupParam == null) {
            return;
        }
        try {
            String str = "me.hd.wauxv";
            String str2 = startupParam.modulePath;
            C3692.f11601 = true;
            C3692.f11608 = str;
            C3692.f11609 = str2;
            try {
                int i = C3690.f11597;
                c2586 = new C3690(XModuleResources.createInstance(C3692.f11609, (XResources) null));
            } catch (Throwable th) {
                c2586 = new C2585(th);
            }
            if (c2586 instanceof C2585) {
                c2586 = null;
            }
            C1562.m3265(c1562, null, 6);
            C1562.f5435 = true;
            c2585 = C3497.f10997;
        } catch (Throwable th2) {
            c2585 = new C2585(th2);
        }
        Throwable thM4594 = C2586.m4594(c2585);
        if (thM4594 != null) {
            C3678.m5308(4, "An exception occurred when YukiHookAPI loading Xposed Module", thM4594);
        }
    }
}
