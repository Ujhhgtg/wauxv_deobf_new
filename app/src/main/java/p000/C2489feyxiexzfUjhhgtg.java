package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ要点脸ᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2489feyxiexzfUjhhgtg extends AbstractC2485feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f8124Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f8125Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C1414feyxiexzfUjhhgtg f8126Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final ViewOnClickListenerC3674feyxiexzfUjhhgtg f8127Ujhhgtgfeyxiexzf;

    public C2489feyxiexzfUjhhgtg(String str, String str2, C1414feyxiexzfUjhhgtg c1414feyxiexzfUjhhgtg, ViewOnClickListenerC3674feyxiexzfUjhhgtg viewOnClickListenerC3674feyxiexzfUjhhgtg) {
        this.f8124Ujhhgtgfeyxiexzf = str;
        this.f8125Ujhhgtgfeyxiexzf = str2;
        this.f8126Ujhhgtgfeyxiexzf = c1414feyxiexzfUjhhgtg;
        this.f8127Ujhhgtgfeyxiexzf = viewOnClickListenerC3674feyxiexzfUjhhgtg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2489feyxiexzfUjhhgtg)) {
            return false;
        }
        C2489feyxiexzfUjhhgtg c2489feyxiexzfUjhhgtg = (C2489feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f8124Ujhhgtgfeyxiexzf, c2489feyxiexzfUjhhgtg.f8124Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f8125Ujhhgtgfeyxiexzf, c2489feyxiexzfUjhhgtg.f8125Ujhhgtgfeyxiexzf) && this.f8126Ujhhgtgfeyxiexzf.equals(c2489feyxiexzfUjhhgtg.f8126Ujhhgtgfeyxiexzf) && this.f8127Ujhhgtgfeyxiexzf.equals(c2489feyxiexzfUjhhgtg.f8127Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        int iHashCode = this.f8124Ujhhgtgfeyxiexzf.hashCode() * 31;
        String str = this.f8125Ujhhgtgfeyxiexzf;
        return this.f8127Ujhhgtgfeyxiexzf.hashCode() + ((this.f8126Ujhhgtgfeyxiexzf.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("PluginSwitch(title=");
        sb.append(this.f8124Ujhhgtgfeyxiexzf);
        sb.append(", desc=");
        sb.append(this.f8125Ujhhgtgfeyxiexzf);
        sb.append(", plugin=");
        sb.append(this.f8126Ujhhgtgfeyxiexzf);
        sb.append(", onClick=");
        sb.append(this.f8127Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
