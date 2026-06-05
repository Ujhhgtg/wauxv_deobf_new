package p000;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3067Ujhhgtgfeyxiexzf extends AbstractC3474Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int f9496Ujhhgtgfeyxiexzf;

    public C3067Ujhhgtgfeyxiexzf(int i, int i2) {
        super(i);
        this.f9496Ujhhgtgfeyxiexzf = i2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final int m4541Ujhhgtgfeyxiexzf() {
        int length = this.f10801Ujhhgtgfeyxiexzf.length;
        if (length == 0) {
            return 0;
        }
        AbstractC3068Ujhhgtgfeyxiexzf abstractC3068Ujhhgtgfeyxiexzf = (AbstractC3068Ujhhgtgfeyxiexzf) m4969Ujhhgtgfeyxiexzf(length - 1);
        return abstractC3068Ujhhgtgfeyxiexzf.mo1865Ujhhgtgfeyxiexzf() + abstractC3068Ujhhgtgfeyxiexzf.m4544Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m4542Ujhhgtgfeyxiexzf(C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf) {
        int i = c2608Ujhhgtgfeyxiexzf.f8413Ujhhgtgfeyxiexzf;
        int length = this.f10801Ujhhgtgfeyxiexzf.length;
        if (c2608Ujhhgtgfeyxiexzf.m3888Ujhhgtgfeyxiexzf()) {
            boolean z = c2608Ujhhgtgfeyxiexzf.f8414Ujhhgtgfeyxiexzf;
            for (int i2 = 0; i2 < length; i2++) {
                AbstractC3068Ujhhgtgfeyxiexzf abstractC3068Ujhhgtgfeyxiexzf = (AbstractC3068Ujhhgtgfeyxiexzf) m4969Ujhhgtgfeyxiexzf(i2);
                int iMo1865Ujhhgtgfeyxiexzf = abstractC3068Ujhhgtgfeyxiexzf.mo1865Ujhhgtgfeyxiexzf() * 2;
                String string = null;
                if (iMo1865Ujhhgtgfeyxiexzf != 0 || z) {
                    int i3 = c2608Ujhhgtgfeyxiexzf.f8417Ujhhgtgfeyxiexzf;
                    int i4 = c2608Ujhhgtgfeyxiexzf.f8416Ujhhgtgfeyxiexzf - ((i3 / 2) + ((i3 * 2) + 8));
                    String strMo1866Ujhhgtgfeyxiexzf = abstractC3068Ujhhgtgfeyxiexzf.mo1866Ujhhgtgfeyxiexzf();
                    if (strMo1866Ujhhgtgfeyxiexzf != null) {
                        String str = "  " + abstractC3068Ujhhgtgfeyxiexzf.m4545Ujhhgtgfeyxiexzf() + ": ";
                        int length2 = str.length();
                        int length3 = i4 == 0 ? strMo1866Ujhhgtgfeyxiexzf.length() : i4 - length2;
                        StringWriter stringWriter = new StringWriter((str.length() + strMo1866Ujhhgtgfeyxiexzf.length()) * 3);
                        C3017Ujhhgtgfeyxiexzf c3017Ujhhgtgfeyxiexzf = new C3017Ujhhgtgfeyxiexzf(stringWriter, length2, length3, "");
                        try {
                            ((C0648Ujhhgtgfeyxiexzf) c3017Ujhhgtgfeyxiexzf.f9380Ujhhgtgfeyxiexzf).write(str);
                            ((C0648Ujhhgtgfeyxiexzf) c3017Ujhhgtgfeyxiexzf.f9381Ujhhgtgfeyxiexzf).write(strMo1866Ujhhgtgfeyxiexzf);
                            StringBuffer stringBuffer = (StringBuffer) c3017Ujhhgtgfeyxiexzf.f9379Ujhhgtgfeyxiexzf;
                            StringBuffer stringBuffer2 = (StringBuffer) c3017Ujhhgtgfeyxiexzf.f9378Ujhhgtgfeyxiexzf;
                            C0648Ujhhgtgfeyxiexzf c0648Ujhhgtgfeyxiexzf = (C0648Ujhhgtgfeyxiexzf) c3017Ujhhgtgfeyxiexzf.f9381Ujhhgtgfeyxiexzf;
                            C0648Ujhhgtgfeyxiexzf c0648Ujhhgtgfeyxiexzf2 = (C0648Ujhhgtgfeyxiexzf) c3017Ujhhgtgfeyxiexzf.f9380Ujhhgtgfeyxiexzf;
                            try {
                                C3017Ujhhgtgfeyxiexzf.m4461Ujhhgtgfeyxiexzf(stringBuffer2, c0648Ujhhgtgfeyxiexzf2);
                                C3017Ujhhgtgfeyxiexzf.m4461Ujhhgtgfeyxiexzf(stringBuffer, c0648Ujhhgtgfeyxiexzf);
                                c3017Ujhhgtgfeyxiexzf.m4489feyxiexzfUjhhgtg();
                                C3017Ujhhgtgfeyxiexzf.m4461Ujhhgtgfeyxiexzf(stringBuffer2, c0648Ujhhgtgfeyxiexzf2);
                                while (stringBuffer2.length() != 0) {
                                    c0648Ujhhgtgfeyxiexzf.write(10);
                                    c3017Ujhhgtgfeyxiexzf.m4489feyxiexzfUjhhgtg();
                                }
                                C3017Ujhhgtgfeyxiexzf.m4461Ujhhgtgfeyxiexzf(stringBuffer, c0648Ujhhgtgfeyxiexzf);
                                while (stringBuffer.length() != 0) {
                                    c0648Ujhhgtgfeyxiexzf2.write(10);
                                    c3017Ujhhgtgfeyxiexzf.m4489feyxiexzfUjhhgtg();
                                }
                                string = stringWriter.toString();
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        } catch (IOException e2) {
                            throw new RuntimeException("shouldn't happen", e2);
                        }
                    }
                }
                if (string != null) {
                    c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(iMo1865Ujhhgtgfeyxiexzf, string);
                } else if (iMo1865Ujhhgtgfeyxiexzf != 0) {
                    c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(iMo1865Ujhhgtgfeyxiexzf, "");
                }
            }
        }
        for (int i5 = 0; i5 < length; i5++) {
            AbstractC3068Ujhhgtgfeyxiexzf abstractC3068Ujhhgtgfeyxiexzf2 = (AbstractC3068Ujhhgtgfeyxiexzf) m4969Ujhhgtgfeyxiexzf(i5);
            try {
                abstractC3068Ujhhgtgfeyxiexzf2.mo1867Ujhhgtgfeyxiexzf(c2608Ujhhgtgfeyxiexzf);
            } catch (RuntimeException e3) {
                throw C3355feyxiexzfUjhhgtg.m4860Ujhhgtgfeyxiexzf("...while writing " + abstractC3068Ujhhgtgfeyxiexzf2, e3);
            }
        }
        int i6 = (c2608Ujhhgtgfeyxiexzf.f8413Ujhhgtgfeyxiexzf - i) / 2;
        if (i6 == m4541Ujhhgtgfeyxiexzf()) {
            return;
        }
        throw new RuntimeException("write length mismatch; expected " + m4541Ujhhgtgfeyxiexzf() + " but actually wrote " + i6);
    }
}
