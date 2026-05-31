package p000;

import android.content.ContentValues;
import java.util.Arrays;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲇᤞᲀᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0847 extends AbstractC1850 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C0847 f3262 = new C0847();

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C0846.f3261, dexKitBridge, new C0801(29));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public final Object m2497(ContentValues contentValues) {
        Object objM2224 = AbstractC0705.m2224(AbstractC0972.m2610(C0846.f3261).getDeclaringClass(), new Object[0]);
        int i = AbstractC1768.f5906;
        C2004 c2004M3560 = AbstractC2727.m4713(objM2224).m3560();
        c2004M3560.f6475 = "convertFrom";
        c2004M3560.m3007(Arrays.copyOf(new Object[]{AbstractC2574.m4549(ContentValues.class), AbstractC2574.m4549(Boolean.TYPE)}, 2));
        c2004M3560.m3926();
        ((C2013) AbstractC0739.m2290(c2004M3560.m3993())).m4025(contentValues, Boolean.TRUE);
        return objM2224;
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
