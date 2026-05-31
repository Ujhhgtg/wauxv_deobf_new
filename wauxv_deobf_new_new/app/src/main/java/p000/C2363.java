package p000;

import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᛸᲈᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2363 extends AbstractC0061 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C2362 f7598 = new C2362();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C1818 f7599 = new C1818();

    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    @Override // p000.AbstractC0061
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1061(CharSequence charSequence) {
        int iM5344;
        int i;
        C1818 c1818 = this.f7599;
        StringBuilder sb = c1818.f6052;
        if (sb.length() != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        int iM3371 = 0;
        while (iM3371 < charSequence.length()) {
            int iM4792 = AbstractC2844.m4792(c1818.f6051);
            if (iM4792 == 0) {
                int iM3372 = AbstractC1470.m3371(charSequence, iM3371, charSequence.length());
                if (iM3372 >= charSequence.length() || charSequence.charAt(iM3372) != '[') {
                    iM3371 = -1;
                } else {
                    c1818.f6051 = 2;
                    c1818.f6054 = new StringBuilder();
                    iM3371 = iM3372 + 1;
                    if (iM3371 >= charSequence.length()) {
                        c1818.f6054.append('\n');
                    }
                }
            } else if (iM4792 == 1) {
                iM5344 = AbstractC3744.m5344(iM3371, charSequence);
                if (iM5344 == -1) {
                    iM3371 = -1;
                } else {
                    c1818.f6054.append(charSequence, iM3371, iM5344);
                    if (iM5344 >= charSequence.length()) {
                        c1818.f6054.append('\n');
                        iM3371 = iM5344;
                    } else if (charSequence.charAt(iM5344) != ']' || (i = iM5344 + 1) >= charSequence.length() || charSequence.charAt(i) != ':' || c1818.f6054.length() > 999) {
                        iM3371 = -1;
                    } else {
                        String string = c1818.f6054.toString();
                        Pattern pattern = AbstractC1230.f4446;
                        String strReplaceAll = AbstractC1230.f4448.matcher(string.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        if (strReplaceAll.isEmpty()) {
                            iM3371 = -1;
                        } else {
                            c1818.f6055 = strReplaceAll;
                            c1818.f6051 = 3;
                            iM3371 = AbstractC1470.m3371(charSequence, iM5344 + 2, charSequence.length());
                        }
                    }
                }
            } else if (iM4792 == 2) {
                int iM3373 = AbstractC1470.m3371(charSequence, iM3371, charSequence.length());
                int iM5343 = AbstractC3744.m5343(iM3373, charSequence);
                if (iM5343 != -1) {
                    c1818.f6056 = charSequence.charAt(iM3373) == '<' ? charSequence.subSequence(iM3373 + 1, iM5343 - 1).toString() : charSequence.subSequence(iM3373, iM5343).toString();
                    iM3371 = AbstractC1470.m3371(charSequence, iM5343, charSequence.length());
                    if (iM3371 >= charSequence.length()) {
                        c1818.f6059 = true;
                        sb.setLength(0);
                    } else if (iM3371 == iM5343) {
                        iM3371 = -1;
                    }
                    c1818.f6051 = 4;
                } else {
                    iM3371 = -1;
                }
            } else if (iM4792 == 3) {
                iM3371 = AbstractC1470.m3371(charSequence, iM3371, charSequence.length());
                if (iM3371 >= charSequence.length()) {
                    c1818.f6051 = 1;
                } else {
                    c1818.f6057 = (char) 0;
                    char cCharAt = charSequence.charAt(iM3371);
                    if (cCharAt == '\"' || cCharAt == '\'') {
                        c1818.f6057 = cCharAt;
                    } else if (cCharAt == '(') {
                        c1818.f6057 = ')';
                    }
                    if (c1818.f6057 != 0) {
                        c1818.f6051 = 5;
                        c1818.f6058 = new StringBuilder();
                        iM3371++;
                        if (iM3371 == charSequence.length()) {
                            c1818.f6058.append('\n');
                        }
                    } else {
                        c1818.m3721();
                        c1818.f6051 = 1;
                    }
                }
            } else if (iM4792 == 4) {
                iM5344 = AbstractC3744.m5345(charSequence, iM3371, c1818.f6057);
                if (iM5344 == -1) {
                    iM3371 = -1;
                } else {
                    c1818.f6058.append(charSequence.subSequence(iM3371, iM5344));
                    if (iM5344 >= charSequence.length()) {
                        c1818.f6058.append('\n');
                        iM3371 = iM5344;
                    } else {
                        iM3371 = AbstractC1470.m3371(charSequence, iM5344 + 1, charSequence.length());
                        if (iM3371 != charSequence.length()) {
                            iM3371 = -1;
                        } else {
                            c1818.f6059 = true;
                            c1818.m3721();
                            sb.setLength(0);
                            c1818.f6051 = 1;
                        }
                    }
                }
            } else if (iM4792 == 5) {
                return;
            }
            if (iM3371 == -1) {
                c1818.f6051 = 6;
                return;
            }
        }
    }

    @Override // p000.AbstractC0061
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1063() {
        if (this.f7599.f6052.length() == 0) {
            this.f7598.m4273();
        }
    }

    @Override // p000.AbstractC0061
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final AbstractC0403 mo1064() {
        return this.f7598;
    }

    @Override // p000.AbstractC0061
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final void mo1066(C1654 c1654) {
        StringBuilder sb = this.f7599.f6052;
        if (sb.length() > 0) {
            c1654.m3528(sb.toString(), this.f7598);
        }
    }

    @Override // p000.AbstractC0061
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final C0404 mo1067(C1093 c1093) {
        if (c1093.f3929) {
            return null;
        }
        return C0404.m1740(c1093.f3923);
    }
}
