package p000;

import me.hd.wauxv.hook.factory.MagicFactory;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱ能不能ᛴ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0178Ujhhgtgfeyxiexzf extends AbstractC0255Ujhhgtgfeyxiexzf implements InterfaceC0598Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final C0178Ujhhgtgfeyxiexzf f1381Ujhhgtgfeyxiexzf = new C0178Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public static String m1244feyxiexzfUjhhgtg(String str, boolean z) {
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        Object objInvoke = AbstractC1791feyxiexzfUjhhgtg.m3154feyxiexzfUjhhgtg(C0175Ujhhgtgfeyxiexzf.f1378Ujhhgtgfeyxiexzf).invoke(null, str);
        String string = objInvoke instanceof String ? (String) objInvoke : null;
        if (string != null) {
            String str2 = MagicFactory.get(4928542815463409034L, strArr);
            String str3 = MagicFactory.get(z ? 4928542806873474442L : 4928542798283539850L, strArr);
            int iM2632feyxiexzfUjhhgtg = AbstractC1152feyxiexzfUjhhgtg.m2632feyxiexzfUjhhgtg(6, string, str2);
            if (iM2632feyxiexzfUjhhgtg != -1) {
                int length = str2.length() + iM2632feyxiexzfUjhhgtg;
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
        return MagicFactory.get(4928542918542624138L, strArr);
    }

    @Override // p000.InterfaceC0598Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo1073Ujhhgtgfeyxiexzf(DexKitBridge dexKitBridge) {
        AbstractC1791feyxiexzfUjhhgtg.m3137Ujhhgtgfeyxiexzf(C0175Ujhhgtgfeyxiexzf.f1378Ujhhgtgfeyxiexzf, dexKitBridge, new C0176Ujhhgtgfeyxiexzf(0));
    }

    @Override // p000.AbstractC0571Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ */
    public final void mo1074feyxiexzfUjhhgtg() {
    }
}
