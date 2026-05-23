package p000;

import android.content.ContentValues;
import java.util.Arrays;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0847 extends AbstractC1823 implements InterfaceC1582 {

    public static final C0847 f3254 = new C0847();

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C0846.f3253, dexKitBridge, new C0807(20));
    }

    public final Object m2380(ContentValues contentValues) {
        Object objM2131 = AbstractC0710.m2131(AbstractC1574.dexToMethod(C0846.f3253).getDeclaringClass(), new Object[0]);
        int i = 0;
        MethodResolver c1973M3492 = AbstractC0968.startMethodResolution_(objM2131).m3492();
        c1973M3492.name = "convertFrom";
        c1973M3492.paramTypes(Arrays.copyOf(new Object[]{AbstractC2519.classToKClass(ContentValues.class), AbstractC2519.classToKClass(Boolean.TYPE)}, 2));
        c1973M3492.superclass();
        ((C1982) AbstractC0744.firstInList(c1973M3492.resolve())).m3831(contentValues, Boolean.TRUE);
        return objM2131;
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
