package p000;

import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸ᛱUjhhgtgᛱᛳᛴ能不能ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1371feyxiexzfUjhhgtg extends AbstractC2924Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C1368feyxiexzfUjhhgtg f4863Ujhhgtgfeyxiexzf = new C1368feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C0076Ujhhgtgfeyxiexzf f4864Ujhhgtgfeyxiexzf = new C0076Ujhhgtgfeyxiexzf();

    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    @Override // p000.AbstractC2924Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo1839Ujhhgtgfeyxiexzf(CharSequence charSequence) {
        int iM2771Ujhhgtgfeyxiexzf;
        int i;
        C0076Ujhhgtgfeyxiexzf c0076Ujhhgtgfeyxiexzf = this.f4864Ujhhgtgfeyxiexzf;
        StringBuilder sb = c0076Ujhhgtgfeyxiexzf.f1133Ujhhgtgfeyxiexzf;
        if (sb.length() != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        int iM4532Ujhhgtgfeyxiexzf = 0;
        while (iM4532Ujhhgtgfeyxiexzf < charSequence.length()) {
            int iM2713feyxiexzfUjhhgtg = AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(c0076Ujhhgtgfeyxiexzf.f1132Ujhhgtgfeyxiexzf);
            if (iM2713feyxiexzfUjhhgtg == 0) {
                int iM4532Ujhhgtgfeyxiexzf2 = C3052Ujhhgtgfeyxiexzf.m4532Ujhhgtgfeyxiexzf(charSequence, iM4532Ujhhgtgfeyxiexzf, charSequence.length());
                if (iM4532Ujhhgtgfeyxiexzf2 >= charSequence.length() || charSequence.charAt(iM4532Ujhhgtgfeyxiexzf2) != '[') {
                    iM4532Ujhhgtgfeyxiexzf = -1;
                } else {
                    c0076Ujhhgtgfeyxiexzf.f1132Ujhhgtgfeyxiexzf = 2;
                    c0076Ujhhgtgfeyxiexzf.f1135Ujhhgtgfeyxiexzf = new StringBuilder();
                    iM4532Ujhhgtgfeyxiexzf = iM4532Ujhhgtgfeyxiexzf2 + 1;
                    if (iM4532Ujhhgtgfeyxiexzf >= charSequence.length()) {
                        c0076Ujhhgtgfeyxiexzf.f1135Ujhhgtgfeyxiexzf.append('\n');
                    }
                }
            } else if (iM2713feyxiexzfUjhhgtg == 1) {
                iM2771Ujhhgtgfeyxiexzf = AbstractC1246feyxiexzfUjhhgtg.m2771Ujhhgtgfeyxiexzf(iM4532Ujhhgtgfeyxiexzf, charSequence);
                if (iM2771Ujhhgtgfeyxiexzf == -1) {
                    iM4532Ujhhgtgfeyxiexzf = -1;
                } else {
                    c0076Ujhhgtgfeyxiexzf.f1135Ujhhgtgfeyxiexzf.append(charSequence, iM4532Ujhhgtgfeyxiexzf, iM2771Ujhhgtgfeyxiexzf);
                    if (iM2771Ujhhgtgfeyxiexzf >= charSequence.length()) {
                        c0076Ujhhgtgfeyxiexzf.f1135Ujhhgtgfeyxiexzf.append('\n');
                        iM4532Ujhhgtgfeyxiexzf = iM2771Ujhhgtgfeyxiexzf;
                    } else if (charSequence.charAt(iM2771Ujhhgtgfeyxiexzf) != ']' || (i = iM2771Ujhhgtgfeyxiexzf + 1) >= charSequence.length() || charSequence.charAt(i) != ':' || c0076Ujhhgtgfeyxiexzf.f1135Ujhhgtgfeyxiexzf.length() > 999) {
                        iM4532Ujhhgtgfeyxiexzf = -1;
                    } else {
                        String string = c0076Ujhhgtgfeyxiexzf.f1135Ujhhgtgfeyxiexzf.toString();
                        Pattern pattern = AbstractC3372feyxiexzfUjhhgtg.f10544Ujhhgtgfeyxiexzf;
                        String strReplaceAll = AbstractC3372feyxiexzfUjhhgtg.f10546Ujhhgtgfeyxiexzf.matcher(string.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        if (strReplaceAll.isEmpty()) {
                            iM4532Ujhhgtgfeyxiexzf = -1;
                        } else {
                            c0076Ujhhgtgfeyxiexzf.f1136Ujhhgtgfeyxiexzf = strReplaceAll;
                            c0076Ujhhgtgfeyxiexzf.f1132Ujhhgtgfeyxiexzf = 3;
                            iM4532Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4532Ujhhgtgfeyxiexzf(charSequence, iM2771Ujhhgtgfeyxiexzf + 2, charSequence.length());
                        }
                    }
                }
            } else if (iM2713feyxiexzfUjhhgtg == 2) {
                int iM4532Ujhhgtgfeyxiexzf3 = C3052Ujhhgtgfeyxiexzf.m4532Ujhhgtgfeyxiexzf(charSequence, iM4532Ujhhgtgfeyxiexzf, charSequence.length());
                int iM2770Ujhhgtgfeyxiexzf = AbstractC1246feyxiexzfUjhhgtg.m2770Ujhhgtgfeyxiexzf(iM4532Ujhhgtgfeyxiexzf3, charSequence);
                if (iM2770Ujhhgtgfeyxiexzf != -1) {
                    c0076Ujhhgtgfeyxiexzf.f1137Ujhhgtgfeyxiexzf = charSequence.charAt(iM4532Ujhhgtgfeyxiexzf3) == '<' ? charSequence.subSequence(iM4532Ujhhgtgfeyxiexzf3 + 1, iM2770Ujhhgtgfeyxiexzf - 1).toString() : charSequence.subSequence(iM4532Ujhhgtgfeyxiexzf3, iM2770Ujhhgtgfeyxiexzf).toString();
                    iM4532Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4532Ujhhgtgfeyxiexzf(charSequence, iM2770Ujhhgtgfeyxiexzf, charSequence.length());
                    if (iM4532Ujhhgtgfeyxiexzf >= charSequence.length()) {
                        c0076Ujhhgtgfeyxiexzf.f1140Ujhhgtgfeyxiexzf = true;
                        sb.setLength(0);
                    } else if (iM4532Ujhhgtgfeyxiexzf == iM2770Ujhhgtgfeyxiexzf) {
                        iM4532Ujhhgtgfeyxiexzf = -1;
                    }
                    c0076Ujhhgtgfeyxiexzf.f1132Ujhhgtgfeyxiexzf = 4;
                } else {
                    iM4532Ujhhgtgfeyxiexzf = -1;
                }
            } else if (iM2713feyxiexzfUjhhgtg == 3) {
                iM4532Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4532Ujhhgtgfeyxiexzf(charSequence, iM4532Ujhhgtgfeyxiexzf, charSequence.length());
                if (iM4532Ujhhgtgfeyxiexzf >= charSequence.length()) {
                    c0076Ujhhgtgfeyxiexzf.f1132Ujhhgtgfeyxiexzf = 1;
                } else {
                    c0076Ujhhgtgfeyxiexzf.f1138Ujhhgtgfeyxiexzf = (char) 0;
                    char cCharAt = charSequence.charAt(iM4532Ujhhgtgfeyxiexzf);
                    if (cCharAt == '\"' || cCharAt == '\'') {
                        c0076Ujhhgtgfeyxiexzf.f1138Ujhhgtgfeyxiexzf = cCharAt;
                    } else if (cCharAt == '(') {
                        c0076Ujhhgtgfeyxiexzf.f1138Ujhhgtgfeyxiexzf = ')';
                    }
                    if (c0076Ujhhgtgfeyxiexzf.f1138Ujhhgtgfeyxiexzf != 0) {
                        c0076Ujhhgtgfeyxiexzf.f1132Ujhhgtgfeyxiexzf = 5;
                        c0076Ujhhgtgfeyxiexzf.f1139Ujhhgtgfeyxiexzf = new StringBuilder();
                        iM4532Ujhhgtgfeyxiexzf++;
                        if (iM4532Ujhhgtgfeyxiexzf == charSequence.length()) {
                            c0076Ujhhgtgfeyxiexzf.f1139Ujhhgtgfeyxiexzf.append('\n');
                        }
                    } else {
                        c0076Ujhhgtgfeyxiexzf.m1116Ujhhgtgfeyxiexzf();
                        c0076Ujhhgtgfeyxiexzf.f1132Ujhhgtgfeyxiexzf = 1;
                    }
                }
            } else if (iM2713feyxiexzfUjhhgtg == 4) {
                iM2771Ujhhgtgfeyxiexzf = AbstractC1246feyxiexzfUjhhgtg.m2772Ujhhgtgfeyxiexzf(charSequence, iM4532Ujhhgtgfeyxiexzf, c0076Ujhhgtgfeyxiexzf.f1138Ujhhgtgfeyxiexzf);
                if (iM2771Ujhhgtgfeyxiexzf == -1) {
                    iM4532Ujhhgtgfeyxiexzf = -1;
                } else {
                    c0076Ujhhgtgfeyxiexzf.f1139Ujhhgtgfeyxiexzf.append(charSequence.subSequence(iM4532Ujhhgtgfeyxiexzf, iM2771Ujhhgtgfeyxiexzf));
                    if (iM2771Ujhhgtgfeyxiexzf >= charSequence.length()) {
                        c0076Ujhhgtgfeyxiexzf.f1139Ujhhgtgfeyxiexzf.append('\n');
                        iM4532Ujhhgtgfeyxiexzf = iM2771Ujhhgtgfeyxiexzf;
                    } else {
                        iM4532Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4532Ujhhgtgfeyxiexzf(charSequence, iM2771Ujhhgtgfeyxiexzf + 1, charSequence.length());
                        if (iM4532Ujhhgtgfeyxiexzf != charSequence.length()) {
                            iM4532Ujhhgtgfeyxiexzf = -1;
                        } else {
                            c0076Ujhhgtgfeyxiexzf.f1140Ujhhgtgfeyxiexzf = true;
                            c0076Ujhhgtgfeyxiexzf.m1116Ujhhgtgfeyxiexzf();
                            sb.setLength(0);
                            c0076Ujhhgtgfeyxiexzf.f1132Ujhhgtgfeyxiexzf = 1;
                        }
                    }
                }
            } else if (iM2713feyxiexzfUjhhgtg == 5) {
                return;
            }
            if (iM4532Ujhhgtgfeyxiexzf == -1) {
                c0076Ujhhgtgfeyxiexzf.f1132Ujhhgtgfeyxiexzf = 6;
                return;
            }
        }
    }

    @Override // p000.AbstractC2924Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo1840Ujhhgtgfeyxiexzf() {
        if (this.f4864Ujhhgtgfeyxiexzf.f1133Ujhhgtgfeyxiexzf.length() == 0) {
            this.f4863Ujhhgtgfeyxiexzf.m2851Ujhhgtgfeyxiexzf();
        }
    }

    @Override // p000.AbstractC2924Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final AbstractC2516feyxiexzfUjhhgtg mo1152Ujhhgtgfeyxiexzf() {
        return this.f4863Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2924Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final void mo1841Ujhhgtgfeyxiexzf(C0655Ujhhgtgfeyxiexzf c0655Ujhhgtgfeyxiexzf) {
        StringBuilder sb = this.f4864Ujhhgtgfeyxiexzf.f1133Ujhhgtgfeyxiexzf;
        if (sb.length() > 0) {
            c0655Ujhhgtgfeyxiexzf.m1928Ujhhgtgfeyxiexzf(sb.toString(), this.f4863Ujhhgtgfeyxiexzf);
        }
    }

    @Override // p000.AbstractC2924Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final C2515feyxiexzfUjhhgtg mo1154Ujhhgtgfeyxiexzf(C3215feyxiexzfUjhhgtg c3215feyxiexzfUjhhgtg) {
        if (c3215feyxiexzfUjhhgtg.f10091Ujhhgtgfeyxiexzf) {
            return null;
        }
        return C2515feyxiexzfUjhhgtg.m3791Ujhhgtgfeyxiexzf(c3215feyxiexzfUjhhgtg.f10085Ujhhgtgfeyxiexzf);
    }
}
