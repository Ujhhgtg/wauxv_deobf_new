package p000;

import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2323 extends AbstractC0054 {

    public final C2322 f7460 = new C2322();

    public final C1795 f7461 = new C1795();

    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    @Override // p000.AbstractC0054
    public final void mo917(CharSequence charSequence) {
        int iM4671;
        int i;
        C1795 c1795 = this.f7461;
        StringBuilder sb = c1795.f5996;
        if (sb.length() != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        int iM5089 = 0;
        while (iM5089 < charSequence.length()) {
            int iM4759 = AbstractC2784.m4759(c1795.f5995);
            if (iM4759 == 0) {
                int iM50810 = AbstractC3471.m5089(charSequence, iM5089, charSequence.length());
                if (iM50810 >= charSequence.length() || charSequence.charAt(iM50810) != '[') {
                    iM5089 = -1;
                } else {
                    c1795.f5995 = 2;
                    c1795.f5998 = new StringBuilder();
                    iM5089 = iM50810 + 1;
                    if (iM5089 >= charSequence.length()) {
                        c1795.f5998.append('\n');
                    }
                }
            } else if (iM4759 == 1) {
                iM4671 = AbstractC2665.m4671(iM5089, charSequence);
                if (iM4671 == -1) {
                    iM5089 = -1;
                } else {
                    c1795.f5998.append(charSequence, iM5089, iM4671);
                    if (iM4671 >= charSequence.length()) {
                        c1795.f5998.append('\n');
                        iM5089 = iM4671;
                    } else if (charSequence.charAt(iM4671) != ']' || (i = iM4671 + 1) >= charSequence.length() || charSequence.charAt(i) != ':' || c1795.f5998.length() > 999) {
                        iM5089 = -1;
                    } else {
                        String string = c1795.f5998.toString();
                        Pattern pattern = AbstractC1228.f4448;
                        String strReplaceAll = AbstractC1228.f4450.matcher(string.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        if (strReplaceAll.isEmpty()) {
                            iM5089 = -1;
                        } else {
                            c1795.f5999 = strReplaceAll;
                            c1795.f5995 = 3;
                            iM5089 = AbstractC3471.m5089(charSequence, iM4671 + 2, charSequence.length());
                        }
                    }
                }
            } else if (iM4759 == 2) {
                int iM50811 = AbstractC3471.m5089(charSequence, iM5089, charSequence.length());
                int iM4670 = AbstractC2665.m4670(iM50811, charSequence);
                if (iM4670 != -1) {
                    c1795.f6000 = charSequence.charAt(iM50811) == '<' ? charSequence.subSequence(iM50811 + 1, iM4670 - 1).toString() : charSequence.subSequence(iM50811, iM4670).toString();
                    iM5089 = AbstractC3471.m5089(charSequence, iM4670, charSequence.length());
                    if (iM5089 >= charSequence.length()) {
                        c1795.f6003 = true;
                        sb.setLength(0);
                    } else if (iM5089 == iM4670) {
                        iM5089 = -1;
                    }
                    c1795.f5995 = 4;
                } else {
                    iM5089 = -1;
                }
            } else if (iM4759 == 3) {
                iM5089 = AbstractC3471.m5089(charSequence, iM5089, charSequence.length());
                if (iM5089 >= charSequence.length()) {
                    c1795.f5995 = 1;
                } else {
                    c1795.f6001 = (char) 0;
                    char cCharAt = charSequence.charAt(iM5089);
                    if (cCharAt == '\"' || cCharAt == '\'') {
                        c1795.f6001 = cCharAt;
                    } else if (cCharAt == '(') {
                        c1795.f6001 = ')';
                    }
                    if (c1795.f6001 != 0) {
                        c1795.f5995 = 5;
                        c1795.f6002 = new StringBuilder();
                        iM5089++;
                        if (iM5089 == charSequence.length()) {
                            c1795.f6002.append('\n');
                        }
                    } else {
                        c1795.m3549();
                        c1795.f5995 = 1;
                    }
                }
            } else if (iM4759 == 4) {
                iM4671 = AbstractC2665.m4672(charSequence, iM5089, c1795.f6001);
                if (iM4671 == -1) {
                    iM5089 = -1;
                } else {
                    c1795.f6002.append(charSequence.subSequence(iM5089, iM4671));
                    if (iM4671 >= charSequence.length()) {
                        c1795.f6002.append('\n');
                        iM5089 = iM4671;
                    } else {
                        iM5089 = AbstractC3471.m5089(charSequence, iM4671 + 1, charSequence.length());
                        if (iM5089 != charSequence.length()) {
                            iM5089 = -1;
                        } else {
                            c1795.f6003 = true;
                            c1795.m3549();
                            sb.setLength(0);
                            c1795.f5995 = 1;
                        }
                    }
                }
            } else if (iM4759 == 5) {
                return;
            }
            if (iM5089 == -1) {
                c1795.f5995 = 6;
                return;
            }
        }
    }

    @Override // p000.AbstractC0054
    public final void mo919() {
        if (this.f7461.f5996.length() == 0) {
            this.f7460.m4144();
        }
    }

    @Override // p000.AbstractC0054
    public final AbstractC0428 mo920() {
        return this.f7460;
    }

    @Override // p000.AbstractC0054
    public final void mo922(C1640 c1640) {
        StringBuilder sb = this.f7461.f5996;
        if (sb.length() > 0) {
            c1640.m3364(sb.toString(), this.f7460);
        }
    }

    @Override // p000.AbstractC0054
    public final C0429 mo923(C1088 c1088) {
        if (c1088.f3918) {
            return null;
        }
        return C0429.m1634(c1088.f3912);
    }
}
