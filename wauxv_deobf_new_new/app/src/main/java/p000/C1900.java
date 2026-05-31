package p000;

import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᤝᲈᲇᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1900 extends AbstractC1850 implements InterfaceC1594 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final C1900 f6295 = new C1900();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static String m3832(String str, boolean z) {
        String[] strArr = AbstractC1471.f5234;
        Object objInvoke = AbstractC0972.m2610(C1899.f6294).invoke(null, str);
        String string = objInvoke instanceof String ? (String) objInvoke : null;
        if (string != null) {
            String str2 = "/";
            String str3 = MagicFactory.get(z ? -397971669645955L : -397980259580547L, strArr);
            int iM4870 = AbstractC2901.m4870(6, string, str2);
            if (iM4870 != -1) {
                int length = str2.length() + iM4870;
                int length2 = string.length();
                if (length2 < length) {
                    throw new IndexOutOfBoundsException("End index (" + length2 + ") is less than start index (" + length + ").");
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) string, 0, length);
                sb.append((CharSequence) str3);
                sb.append((CharSequence) string, length2, string.length());
                string = sb.toString();
            }
            if (string != null) {
                return string;
            }
        }
        return "";
    }

    @Override // p000.InterfaceC1594
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1378(DexKitBridge dexKitBridge) {
        AbstractC0972.m2592(C1899.f6294, dexKitBridge, new C1898(0));
    }

    @Override // p000.AbstractC1569
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo1272() {
    }
}
