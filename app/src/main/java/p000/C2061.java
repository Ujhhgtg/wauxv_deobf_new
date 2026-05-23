package p000;

import android.database.Cursor;
import java.util.Arrays;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2061 extends AbstractC1823 {

    public static final C2061 f6856 = new C2061();

    public static final LinkedHashSet f6857 = new LinkedHashSet();

    @Override // p000.AbstractC1557
    public final void mo1126() {
        int i = 0;
        
        MethodResolver c1973M3492 = AbstractC0968.startMethodResolution(AbstractC1574.dexToClass(C2059.f6854)).m3492();
        c1973M3492.name = "convertFrom";
        c1973M3492.paramTypes(Arrays.copyOf(new Object[]{AbstractC2519.classToKClass(Cursor.class)}, 1));
        c1973M3492.superclass();
        C3689 c3689M4174 = m4174((C1982) AbstractC0744.firstInList(c1973M3492.resolve()), 1);
        c3689M4174.m5350(new C2058(1));
        c3689M4174.applyHook();
    }
}
