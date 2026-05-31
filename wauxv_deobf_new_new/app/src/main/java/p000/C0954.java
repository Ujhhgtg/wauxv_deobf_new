package p000;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲁᲇᛸᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0954 extends AbstractC1352 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f3486;

    public C0954(int i, int i2) {
        super(i);
        this.f3486 = i2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final int m2564() {
        int length = this.f4833.length;
        if (length == 0) {
            return 0;
        }
        AbstractC0953 abstractC0953 = (AbstractC0953) m3165(length - 1);
        return abstractC0953.mo1490() + abstractC0953.m2561();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final void m2565(C0496 c0496) {
        int i = c0496.f2152;
        int length = this.f4833.length;
        if (c0496.m1927()) {
            boolean z = c0496.f2153;
            for (int i2 = 0; i2 < length; i2++) {
                AbstractC0953 abstractC0953 = (AbstractC0953) m3165(i2);
                int iMo1490 = abstractC0953.mo1490() * 2;
                String string = null;
                if (iMo1490 != 0 || z) {
                    int i3 = c0496.f2156;
                    int i4 = c0496.f2155 - ((i3 / 2) + ((i3 * 2) + 8));
                    String strMo1491 = abstractC0953.mo1491();
                    if (strMo1491 != null) {
                        String str = "  " + abstractC0953.m2562() + ": ";
                        int length2 = str.length();
                        int length3 = i4 == 0 ? strMo1491.length() : i4 - length2;
                        StringWriter stringWriter = new StringWriter((str.length() + strMo1491.length()) * 3);
                        C0154 c0154 = new C0154(stringWriter, length2, length3, "");
                        try {
                            ((C1640) c0154.f1221).write(str);
                            ((C1640) c0154.f1222).write(strMo1491);
                            StringBuffer stringBuffer = (StringBuffer) c0154.f1220;
                            StringBuffer stringBuffer2 = (StringBuffer) c0154.f1219;
                            C1640 c1640 = (C1640) c0154.f1222;
                            C1640 c1641 = (C1640) c0154.f1221;
                            try {
                                C0154.m1297(stringBuffer2, c1641);
                                C0154.m1297(stringBuffer, c1640);
                                c0154.m1325();
                                C0154.m1297(stringBuffer2, c1641);
                                while (stringBuffer2.length() != 0) {
                                    c1640.write(10);
                                    c0154.m1325();
                                }
                                C0154.m1297(stringBuffer, c1640);
                                while (stringBuffer.length() != 0) {
                                    c1641.write(10);
                                    c0154.m1325();
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
                    c0496.m1925(iMo1490, string);
                } else if (iMo1490 != 0) {
                    c0496.m1925(iMo1490, "");
                }
            }
        }
        for (int i5 = 0; i5 < length; i5++) {
            AbstractC0953 abstractC0954 = (AbstractC0953) m3165(i5);
            try {
                abstractC0954.mo1493(c0496);
            } catch (RuntimeException e3) {
                throw C1240.m3003("...while writing " + abstractC0954, e3);
            }
        }
        int i6 = (c0496.f2152 - i) / 2;
        if (i6 == m2564()) {
            return;
        }
        throw new RuntimeException("write length mismatch; expected " + m2564() + " but actually wrote " + i6);
    }
}
