package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.lang.reflect.Constructor;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᤝᲁᲈᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2224 extends AbstractC1850 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C2224 f7274 = new C2224();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static Object m4155(C2224 c2224, String str, String str2, String str3, String str4, int i) throws NoSuchMethodException {
        String[] strArr = AbstractC1471.f5234;
        String str5 = "";
        String str6 = "";
        String str7 = "";
        String str8 = "";
        c2224.getClass();
        Constructor constructorM2609 = AbstractC0972.m2609(C2223.f7273);
        switch (constructorM2609.getParameterCount()) {
            case 10:
                return constructorM2609.newInstance(str, str2, 0, str3, str4, Integer.valueOf(i), str5, null, 1, null);
            case 11:
            default:
                throw new NoSuchMethodException("With " + constructorM2609.getParameterCount() + " parameters not supported");
            case Opcodes.FCONST_1 /* 12 */:
                return constructorM2609.newInstance(str, str2, 0, str3, str4, Integer.valueOf(i), str5, null, 1, null, 0L, str7);
            case 13:
                return constructorM2609.newInstance(str, str2, 0, str3, str4, Integer.valueOf(i), str5, null, 1, null, 0L, str7, str8);
            case Opcodes.DCONST_0 /* 14 */:
                return constructorM2609.newInstance(str, str2, 0, str3, str4, Integer.valueOf(i), str5, null, 1, str6, null, 0L, str7, str8);
        }
    }

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C2223.f7273, dexKitBridge, new C2218(7));
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
