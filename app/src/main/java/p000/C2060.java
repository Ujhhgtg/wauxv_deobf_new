package p000;

import android.database.Cursor;
import java.util.Arrays;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2060 extends AbstractC1823 implements InterfaceC1582 {

    public static final C2060 f6855 = new C2060();

    public static Object m3882(Cursor cursor) {
        Object objM2131 = AbstractC0710.m2131(AbstractC1574.dexToClass(C2059.f6854), new Object[0]);
        int i = 0;
        MethodResolver c1973M3492 = AbstractC0968.startMethodResolution_(objM2131).m3492();
        c1973M3492.name = "convertFrom";
        c1973M3492.paramTypes(Arrays.copyOf(new Object[]{AbstractC2519.classToKClass(Cursor.class)}, 1));
        c1973M3492.superclass();
        ((C1982) AbstractC0744.firstInList(c1973M3492.resolve())).m3831(cursor);
        return objM2131;
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C2059.f6854, dexKitBridge, new C1884(29));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
