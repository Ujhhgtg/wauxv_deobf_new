package androidx.savedstate;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.AbstractC1791feyxiexzfUjhhgtg;
import p000.AbstractC3317feyxiexzfUjhhgtg;
import p000.InterfaceC0053Ujhhgtgfeyxiexzf;
import p000.InterfaceC0083Ujhhgtgfeyxiexzf;
import p000.InterfaceC1094feyxiexzfUjhhgtg;
import p000.InterfaceC1096feyxiexzfUjhhgtg;
import p000.InterfaceC2298Ujhhgtgfeyxiexzf;
import p000.Ujhhgtgfeyxiexzf;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class Recreator implements InterfaceC0053Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Object f457Ujhhgtgfeyxiexzf;

    public Recreator(InterfaceC1096feyxiexzfUjhhgtg interfaceC1096feyxiexzfUjhhgtg) {
        this.f457Ujhhgtgfeyxiexzf = interfaceC1096feyxiexzfUjhhgtg;
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳ能不能要点脸ᛴᛱUjhhgtgᛱᛲ] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳ能不能要点脸ᛴᛱUjhhgtgᛱᛲ] */
    @Override // p000.InterfaceC0053Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public final void mo0Ujhhgtgfeyxiexzf(InterfaceC0083Ujhhgtgfeyxiexzf interfaceC0083Ujhhgtgfeyxiexzf, Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf) {
        if (ujhhgtgfeyxiexzf != Ujhhgtgfeyxiexzf.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC0083Ujhhgtgfeyxiexzf.mo895Ujhhgtgfeyxiexzf().m102Ujhhgtgfeyxiexzf(this);
        Bundle bundleM3578Ujhhgtgfeyxiexzf = this.f457Ujhhgtgfeyxiexzf.mo2572Ujhhgtgfeyxiexzf().m3578Ujhhgtgfeyxiexzf("androidx.savedstate.Restarter");
        if (bundleM3578Ujhhgtgfeyxiexzf == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleM3578Ujhhgtgfeyxiexzf.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        if (it.hasNext()) {
            String next = it.next();
            try {
                Class<? extends U> clsAsSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(InterfaceC1094feyxiexzfUjhhgtg.class);
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        ?? r4 = this.f457Ujhhgtgfeyxiexzf;
                        AbstractC1791feyxiexzfUjhhgtg abstractC1791feyxiexzfUjhhgtgMo3507Ujhhgtgfeyxiexzf = ((InterfaceC2298Ujhhgtgfeyxiexzf) r4).mo3507Ujhhgtgfeyxiexzf();
                        r4.mo2572Ujhhgtgfeyxiexzf();
                        abstractC1791feyxiexzfUjhhgtgMo3507Ujhhgtgfeyxiexzf.getClass();
                        throw null;
                    } catch (Exception e) {
                        throw new RuntimeException(AbstractC1225feyxiexzfUjhhgtg.m2711Ujhhgtgfeyxiexzf("Failed to instantiate ", next), e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(AbstractC3317feyxiexzfUjhhgtg.m4801Ujhhgtgfeyxiexzf("Class ", next, " wasn't found"), e3);
            }
        }
    }
}
