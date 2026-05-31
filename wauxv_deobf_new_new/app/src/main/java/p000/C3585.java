package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤞᛸᤝᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3585 implements InterfaceC1767 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3585 f11193 = new C3585();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C2452 f11194 = new C2452("kotlin.uuid.Uuid", C2450.f7812);

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2715 mo1509() {
        return f11194;
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo1068(InterfaceC0978 interfaceC0978) {
        String strMo2642 = interfaceC0978.mo2642();
        int length = strMo2642.length();
        int i = 0;
        if (length == 32) {
            long j = 0;
            while (i < 16) {
                long j2 = j << 4;
                char cCharAt = strMo2642.charAt(i);
                if ((cCharAt >>> '\b') == 0) {
                    long j3 = AbstractC1545.f5401[cCharAt];
                    if (j3 >= 0) {
                        j = j2 | j3;
                        i++;
                    }
                }
                AbstractC0738.m2283(i, strMo2642, "a hexadecimal digit");
                throw null;
            }
            long j4 = 0;
            for (int i2 = 16; i2 < 32; i2++) {
                long j5 = j4 << 4;
                char cCharAt2 = strMo2642.charAt(i2);
                if ((cCharAt2 >>> '\b') == 0) {
                    long j6 = AbstractC1545.f5401[cCharAt2];
                    if (j6 >= 0) {
                        j4 = j5 | j6;
                    }
                }
                AbstractC0738.m2283(i2, strMo2642, "a hexadecimal digit");
                throw null;
            }
            if (j != 0 || j4 != 0) {
                return new C3583(j, j4);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                sb.append(strMo2642.length() <= 64 ? strMo2642 : strMo2642.substring(0, 64).concat("..."));
                sb.append("\" of length ");
                sb.append(strMo2642.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long j7 = 0;
            while (i < 8) {
                long j8 = j7 << 4;
                char cCharAt3 = strMo2642.charAt(i);
                if ((cCharAt3 >>> '\b') == 0) {
                    long j9 = AbstractC1545.f5401[cCharAt3];
                    if (j9 >= 0) {
                        j7 = j8 | j9;
                        i++;
                    }
                }
                AbstractC0738.m2283(i, strMo2642, "a hexadecimal digit");
                throw null;
            }
            if (strMo2642.charAt(8) != '-') {
                AbstractC0738.m2283(8, strMo2642, "'-' (hyphen)");
                throw null;
            }
            long j10 = 0;
            for (int i3 = 9; i3 < 13; i3++) {
                long j11 = j10 << 4;
                char cCharAt4 = strMo2642.charAt(i3);
                if ((cCharAt4 >>> '\b') == 0) {
                    long j12 = AbstractC1545.f5401[cCharAt4];
                    if (j12 >= 0) {
                        j10 = j11 | j12;
                    }
                }
                AbstractC0738.m2283(i3, strMo2642, "a hexadecimal digit");
                throw null;
            }
            if (strMo2642.charAt(13) != '-') {
                AbstractC0738.m2283(13, strMo2642, "'-' (hyphen)");
                throw null;
            }
            long j13 = 0;
            for (int i4 = 14; i4 < 18; i4++) {
                long j14 = j13 << 4;
                char cCharAt5 = strMo2642.charAt(i4);
                if ((cCharAt5 >>> '\b') == 0) {
                    long j15 = AbstractC1545.f5401[cCharAt5];
                    if (j15 >= 0) {
                        j13 = j14 | j15;
                    }
                }
                AbstractC0738.m2283(i4, strMo2642, "a hexadecimal digit");
                throw null;
            }
            if (strMo2642.charAt(18) != '-') {
                AbstractC0738.m2283(18, strMo2642, "'-' (hyphen)");
                throw null;
            }
            long j16 = 0;
            for (int i5 = 19; i5 < 23; i5++) {
                long j17 = j16 << 4;
                char cCharAt6 = strMo2642.charAt(i5);
                if ((cCharAt6 >>> '\b') == 0) {
                    long j18 = AbstractC1545.f5401[cCharAt6];
                    if (j18 >= 0) {
                        j16 = j17 | j18;
                    }
                }
                AbstractC0738.m2283(i5, strMo2642, "a hexadecimal digit");
                throw null;
            }
            if (strMo2642.charAt(23) != '-') {
                AbstractC0738.m2283(23, strMo2642, "'-' (hyphen)");
                throw null;
            }
            long j19 = 0;
            for (int i6 = 24; i6 < 36; i6++) {
                long j20 = j19 << 4;
                char cCharAt7 = strMo2642.charAt(i6);
                if ((cCharAt7 >>> '\b') == 0) {
                    long j21 = AbstractC1545.f5401[cCharAt7];
                    if (j21 >= 0) {
                        j19 = j20 | j21;
                    }
                }
                AbstractC0738.m2283(i6, strMo2642, "a hexadecimal digit");
                throw null;
            }
            long j22 = (j7 << 32) | (j10 << 16) | j13;
            long j23 = (j16 << 48) | j19;
            if (j22 != 0 || j23 != 0) {
                return new C3583(j22, j23);
            }
        }
        return C3583.f11188;
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        interfaceC1207.mo2930(((C3583) obj).toString());
    }
}
