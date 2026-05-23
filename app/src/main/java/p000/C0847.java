package p000;

import android.content.ContentValues;
import java.util.Arrays;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲇᲀᲁᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0847 extends AbstractC1823 implements InterfaceC1582 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C0847 f3254 = new C0847();

    @Override // p000.InterfaceC1582
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C0846.f3253, dexKitBridge, new C0807(20));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public final Object m2380(ContentValues contentValues) {
        Object objM2131 = AbstractC0710.m2131(AbstractC1574.dexToMethod(C0846.f3253).getDeclaringClass(), new Object[0]);
        int i = 0;
        MethodResolver c1973M3492 = AbstractC0968.startFieldResolution(objM2131).m3492();
        c1973M3492.f6370 = "convertFrom";
        c1973M3492.m2888(Arrays.copyOf(new Object[]{AbstractC2519.classToKClass(ContentValues.class), AbstractC2519.classToKClass(Boolean.TYPE)}, 2));
        c1973M3492.m3732();
        ((C1982) AbstractC0744.firstInList(c1973M3492.m3799())).m3831(contentValues, Boolean.TRUE);
        return objM2131;
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
