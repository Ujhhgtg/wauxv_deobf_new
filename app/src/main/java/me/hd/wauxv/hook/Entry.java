package me.hd.wauxv.hook;

import android.content.res.XModuleResources;
import android.content.res.XResources;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import me.hd.wauxv.hook.factory.MagicFactory;
import p000.AbstractC3590Ujhhgtgfeyxiexzf;
import p000.C0582Ujhhgtgfeyxiexzf;
import p000.C0918feyxiexzfUjhhgtg;
import p000.C0919feyxiexzfUjhhgtg;
import p000.C1943Ujhhgtgfeyxiexzf;
import p000.C2281feyxiexzfUjhhgtg;
import p000.C2283feyxiexzfUjhhgtg;
import p000.C2290feyxiexzfUjhhgtg;
import p000.InterfaceC0155Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC0155Ujhhgtgfeyxiexzf
public final class Entry implements IXposedHookZygoteInit, IXposedHookLoadPackage {
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        C0582Ujhhgtgfeyxiexzf c0582Ujhhgtgfeyxiexzf = C0582Ujhhgtgfeyxiexzf.f2614Ujhhgtgfeyxiexzf;
        c0582Ujhhgtgfeyxiexzf.getClass();
        if (loadPackageParam == null || !C0582Ujhhgtgfeyxiexzf.f2615Ujhhgtgfeyxiexzf) {
            return;
        }
        C0582Ujhhgtgfeyxiexzf.m1861Ujhhgtgfeyxiexzf(c0582Ujhhgtgfeyxiexzf, loadPackageParam, 5);
    }

    public void initZygote(IXposedHookZygoteInit.StartupParam startupParam) {
        Object c0919feyxiexzfUjhhgtg;
        Object c0919feyxiexzfUjhhgtg2;
        C0582Ujhhgtgfeyxiexzf c0582Ujhhgtgfeyxiexzf = C0582Ujhhgtgfeyxiexzf.f2614Ujhhgtgfeyxiexzf;
        c0582Ujhhgtgfeyxiexzf.getClass();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        if (startupParam == null) {
            return;
        }
        try {
            String str = MagicFactory.get(4928226903438919050L, strArr);
            String str2 = startupParam.modulePath;
            C2283feyxiexzfUjhhgtg.f7478Ujhhgtgfeyxiexzf = true;
            C2283feyxiexzfUjhhgtg.f7485Ujhhgtgfeyxiexzf = str;
            C2283feyxiexzfUjhhgtg.f7486Ujhhgtgfeyxiexzf = str2;
            try {
                int i = C2281feyxiexzfUjhhgtg.f7476Ujhhgtgfeyxiexzf;
                c0919feyxiexzfUjhhgtg2 = new C2281feyxiexzfUjhhgtg(XModuleResources.createInstance(C2283feyxiexzfUjhhgtg.f7486Ujhhgtgfeyxiexzf, (XResources) null));
            } catch (Throwable th) {
                c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th);
            }
            if (c0919feyxiexzfUjhhgtg2 instanceof C0919feyxiexzfUjhhgtg) {
                c0919feyxiexzfUjhhgtg2 = null;
            }
            C0582Ujhhgtgfeyxiexzf.m1861Ujhhgtgfeyxiexzf(c0582Ujhhgtgfeyxiexzf, null, 6);
            C0582Ujhhgtgfeyxiexzf.f2615Ujhhgtgfeyxiexzf = true;
            c0919feyxiexzfUjhhgtg = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        } catch (Throwable th2) {
            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th2);
        }
        Throwable thM2409Ujhhgtgfeyxiexzf = C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg);
        if (thM2409Ujhhgtgfeyxiexzf != null) {
            C2290feyxiexzfUjhhgtg.m3497Ujhhgtgfeyxiexzf(4, MagicFactory.get(4928226989338264970L, strArr), thM2409Ujhhgtgfeyxiexzf);
        }
    }
}
