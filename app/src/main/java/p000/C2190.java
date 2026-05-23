package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.lang.reflect.Constructor;
import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲇᤝᛸᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2190 extends AbstractC1823 implements InterfaceC1582 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final C2190 f7151 = new C2190();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static Object m3962(C2190 c2190, String str, String str2, String str3, String str4, int i) throws NoSuchMethodException {
        String[] strArr = AbstractC1574.f5469;
        String str5 = "";
        String str6 = "";
        String str7 = "";
        String str8 = "";
        c2190.getClass();
        Constructor constructorM3314 = AbstractC1574.m3314(C2189.f7150);
        switch (constructorM3314.getParameterCount()) {
            case 10:
                return constructorM3314.newInstance(str, str2, 0, str3, str4, Integer.valueOf(i), str5, null, 1, null);
            case 11:
            default:
                throw new NoSuchMethodException("With " + constructorM3314.getParameterCount() + " parameters not supported");
            case Opcodes.FCONST_1 /* 12 */:
                return constructorM3314.newInstance(str, str2, 0, str3, str4, Integer.valueOf(i), str5, null, 1, null, 0L, str7);
            case 13:
                return constructorM3314.newInstance(str, str2, 0, str3, str4, Integer.valueOf(i), str5, null, 1, null, 0L, str7, str8);
            case Opcodes.DCONST_0 /* 14 */:
                return constructorM3314.newInstance(str, str2, 0, str3, str4, Integer.valueOf(i), str5, null, 1, str6, null, 0L, str7, str8);
        }
    }

    @Override // p000.InterfaceC1582
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.m3295(C2189.f7150, dexKitBridge, new C2174(21));
    }

    @Override // p000.AbstractC1557
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1126() {
    }
}
