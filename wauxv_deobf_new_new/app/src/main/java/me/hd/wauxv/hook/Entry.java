package me.hd.wauxv.hook;

import android.content.res.XModuleResources;
import android.content.res.XResources;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import p000.AbstractC1471;
import p000.C1573;
import p000.C2641;
import p000.C2642;
import p000.C3554;
import p000.C3741;
import p000.C3753;
import p000.C3755;
import p000.InterfaceC1771;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC1771
public final class Entry implements IXposedHookZygoteInit, IXposedHookLoadPackage {
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        C1573 c1573 = C1573.f5464;
        c1573.getClass();
        if (loadPackageParam == null || !C1573.f5465) {
            return;
        }
        C1573.m3446(c1573, loadPackageParam, 5);
    }

    public void initZygote(IXposedHookZygoteInit.StartupParam startupParam) {
        Object c2641;
        Object c2642;
        C1573 c1573 = C1573.f5464;
        c1573.getClass();
        String[] strArr = AbstractC1471.f5234;
        if (startupParam == null) {
            return;
        }
        try {
            String str = "me.hd.wauxv";
            String str2 = startupParam.modulePath;
            C3755.f11758 = true;
            C3755.f11765 = str;
            C3755.f11766 = str2;
            try {
                int i = C3753.f11754;
                c2642 = new C3753(XModuleResources.createInstance(C3755.f11766, (XResources) null));
            } catch (Throwable th) {
                c2642 = new C2641(th);
            }
            if (c2642 instanceof C2641) {
                c2642 = null;
            }
            C1573.m3446(c1573, null, 6);
            C1573.f5465 = true;
            c2641 = C3554.UNIT;
        } catch (Throwable th2) {
            c2641 = new C2641(th2);
        }
        Throwable thM4616 = C2642.m4616(c2641);
        if (thM4616 != null) {
            C3741.m5317(4, "An exception occurred when YukiHookAPI loading Xposed Module", thM4616);
        }
    }
}
