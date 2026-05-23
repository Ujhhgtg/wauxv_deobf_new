package p000;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0951 extends AbstractC1352 {

    public final int f3471;

    public C0951(int i, int i2) {
        super(i);
        this.f3471 = i2;
    }

    public final int m2445() {
        int length = this.f4836.length;
        if (length == 0) {
            return 0;
        }
        AbstractC0950 abstractC0950 = (AbstractC0950) m3062(length - 1);
        return abstractC0950.mo1344() + abstractC0950.m2442();
    }

    public final void m2446(C0519 c0519) {
        int i = c0519.f2196;
        int length = this.f4836.length;
        if (c0519.m1833()) {
            boolean z = c0519.f2197;
            for (int i2 = 0; i2 < length; i2++) {
                AbstractC0950 abstractC0950 = (AbstractC0950) m3062(i2);
                int iMo1344 = abstractC0950.mo1344() * 2;
                String string = null;
                if (iMo1344 != 0 || z) {
                    int i3 = c0519.f2200;
                    int i4 = c0519.f2199 - ((i3 / 2) + ((i3 * 2) + 8));
                    String strMo1345 = abstractC0950.mo1345();
                    if (strMo1345 != null) {
                        String str = "  " + abstractC0950.m2443() + ": ";
                        int length2 = str.length();
                        int length3 = i4 == 0 ? strMo1345.length() : i4 - length2;
                        StringWriter stringWriter = new StringWriter((str.length() + strMo1345.length()) * 3);
                        C0146 c0146 = new C0146(stringWriter, length2, length3, "");
                        try {
                            ((C1627) c0146.f1153).write(str);
                            ((C1627) c0146.f1154).write(strMo1345);
                            StringBuffer stringBuffer = (StringBuffer) c0146.f1152;
                            StringBuffer stringBuffer2 = (StringBuffer) c0146.f1151;
                            C1627 c1627 = (C1627) c0146.f1154;
                            C1627 c1628 = (C1627) c0146.f1153;
                            try {
                                C0146.m1151(stringBuffer2, c1628);
                                C0146.m1151(stringBuffer, c1627);
                                c0146.m1179();
                                C0146.m1151(stringBuffer2, c1628);
                                while (stringBuffer2.length() != 0) {
                                    c1627.write(10);
                                    c0146.m1179();
                                }
                                C0146.m1151(stringBuffer, c1627);
                                while (stringBuffer.length() != 0) {
                                    c1628.write(10);
                                    c0146.m1179();
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
                    c0519.m1831(iMo1344, string);
                } else if (iMo1344 != 0) {
                    c0519.m1831(iMo1344, "");
                }
            }
        }
        for (int i5 = 0; i5 < length; i5++) {
            AbstractC0950 abstractC0951 = (AbstractC0950) m3062(i5);
            try {
                abstractC0951.mo1347(c0519);
            } catch (RuntimeException e3) {
                throw C1238.m2884("...while writing " + abstractC0951, e3);
            }
        }
        int i6 = (c0519.f2196 - i) / 2;
        if (i6 == m2445()) {
            return;
        }
        throw new RuntimeException("write length mismatch; expected " + m2445() + " but actually wrote " + i6);
    }
}
