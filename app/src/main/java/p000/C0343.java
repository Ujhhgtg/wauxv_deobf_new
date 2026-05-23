package p000;

import bsh.Primitive;
import java.io.Serializable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᤞᲇᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0343 extends AbstractC2707 implements InterfaceC2335 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f1628;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public Serializable f1629;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0343(int i, int i2) {
        super(i);
        this.f1628 = i2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static char m1455(char c) {
        if (c == 'b') {
            return '\b';
        }
        if (c == 'f') {
            return '\f';
        }
        if (c == 'n') {
            return '\n';
        }
        if (c == 'r') {
            return '\r';
        }
        if (c != 't') {
            return c;
        }
        return '\t';
    }

    @Override // p000.AbstractC2707
    public final String toString() {
        switch (this.f1628) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(super.toString());
                sb.append(": ");
                return AbstractC2784.m4752(sb, (String) this.f1629, ":");
            default:
                return super.toString() + ": " + this.f1629;
        }
    }

    @Override // p000.AbstractC2707, p000.InterfaceC2225
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final Object mo306(C0550 c0550, RunnableC1668 runnableC1668) throws C1229 {
        switch (this.f1628) {
            case 0:
                if (m4710().length > 0) {
                    InterfaceC2225 interfaceC2225 = this.f8721[0];
                    if (interfaceC2225 instanceof C0338) {
                        ((C0338) interfaceC2225).f1611 = (String) this.f1629;
                    } else if (interfaceC2225 instanceof C0337) {
                        ((C0337) interfaceC2225).f1605 = (String) this.f1629;
                    } else if (interfaceC2225 instanceof C0361) {
                        ((C0361) interfaceC2225).f1680 = (String) this.f1629;
                    }
                    Object objMo306 = interfaceC2225.mo306(c0550, runnableC1668);
                    if (objMo306 instanceof C2588) {
                        C2588 c2588 = (C2588) objMo306;
                        String str = c2588.f8195;
                        int i = c2588.f8194;
                        if (i != 13) {
                            if (i == 20 && ((String) this.f1629).equals(str)) {
                                throw new C1229("Continue cannot be used outside of a loop", this, c0550);
                            }
                            return objMo306;
                        }
                        if (!((String) this.f1629).equals(str)) {
                            return objMo306;
                        }
                    }
                }
                return Primitive.VOID;
            default:
                return this.f1629;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public void m1456(String str) {
        int length = str.toCharArray().length;
        if (length == 0 || length > 4 || (length > 1 && str.charAt(0) != '\\')) {
            m1457(str);
            return;
        }
        try {
            char cCharAt = str.charAt(0);
            if (cCharAt == '\\') {
                char cCharAt2 = str.charAt(1);
                if (Character.isDigit(cCharAt2)) {
                    cCharAt = (char) Integer.parseInt(str.substring(1), 8);
                    if (255 < cCharAt) {
                        m1457(str);
                        return;
                    }
                } else {
                    cCharAt = m1455(cCharAt2);
                }
            }
            this.f1629 = new Primitive(cCharAt);
        } catch (Exception unused) {
            m1457(str);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public void m1457(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\\') {
                int i2 = i + 1;
                char cCharAt2 = str.charAt(i2);
                if (!Character.isDigit(cCharAt2) || Integer.parseInt(String.valueOf(cCharAt2)) >= 8) {
                    cCharAt = m1455(cCharAt2);
                    i = i2;
                } else {
                    int iMin = Math.min(i + 3, length - 1);
                    int i3 = i2;
                    while (i3 < iMin) {
                        int i4 = i3 + 1;
                        char cCharAt3 = str.charAt(i4);
                        if (!Character.isDigit(cCharAt3) || Integer.parseInt(String.valueOf(cCharAt3)) >= 8) {
                            break;
                        } else {
                            i3 = i4;
                        }
                    }
                    String strSubstring = str.substring(i2, i3 + 1);
                    if (strSubstring.length() != 3 || Integer.parseInt(String.valueOf(cCharAt2)) <= 3) {
                        cCharAt = (char) Integer.parseInt(strSubstring, 8);
                        i = i3;
                    } else {
                        i = i3 - 1;
                        cCharAt = (char) Integer.parseInt(str.substring(i2, i3), 8);
                    }
                }
            }
            sb.append(cCharAt);
            i++;
        }
        this.f1629 = sb.toString().intern();
    }
}
