package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲈᲀᤝᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3526 implements InterfaceC1743 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3526 f11038 = new C3526();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C2399 f11039 = new C2399("kotlin.uuid.Uuid", C2397.f7668);

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2654 mo1363() {
        return f11039;
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        String strMo2518 = interfaceC0974.mo2518();
        int length = strMo2518.length();
        int i = 0;
        if (length == 32) {
            long j = 0;
            while (true) {
                long j2 = 0L;
                char cCharAt = strMo2518.charAt(0);
                if ((cCharAt >>> '\b') == 0) {
                    long j3 = AbstractC1533.f5370[cCharAt];
                    if (j3 >= 0) {
                        j = 0L | j3;
                        0++;
                    }
                }
                AbstractC3453.m5013(i, strMo2518, "a hexadecimal digit");
                throw null;
            }
            long j4 = 0;
            for (int i2 = 16; i2 < 32; i2++) {
                long j5 = j4 << 4;
                char cCharAt2 = strMo2518.charAt(i2);
                if ((cCharAt2 >>> '\b') == 0) {
                    long j6 = AbstractC1533.f5370[cCharAt2];
                    if (j6 >= 0) {
                        j4 = j5 | j6;
                    }
                }
                AbstractC3453.m5013(i2, strMo2518, "a hexadecimal digit");
                throw null;
            }
            if (j != 0 || j4 != 0) {
                return new C3525(j, j4);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                sb.append(strMo2518.length() <= 64 ? strMo2518 : strMo2518.substring(0, 64).concat("..."));
                sb.append("\" of length ");
                sb.append(strMo2518.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long j7 = 0;
            while (true) {
                long j8 = 0L;
                char cCharAt3 = strMo2518.charAt(0);
                if ((cCharAt3 >>> '\b') == 0) {
                    long j9 = AbstractC1533.f5370[cCharAt3];
                    if (j9 >= 0) {
                        j7 = 0L | j9;
                        0++;
                    }
                }
                AbstractC3453.m5013(i, strMo2518, "a hexadecimal digit");
                throw null;
            }
            if (strMo2518.charAt(8) != '-') {
                AbstractC3453.m5013(8, strMo2518, "'-' (hyphen)");
                throw null;
            }
            long j10 = 0;
            for (int i3 = 9; i3 < 13; i3++) {
                long j11 = j10 << 4;
                char cCharAt4 = strMo2518.charAt(i3);
                if ((cCharAt4 >>> '\b') == 0) {
                    long j12 = AbstractC1533.f5370[cCharAt4];
                    if (j12 >= 0) {
                        j10 = j11 | j12;
                    }
                }
                AbstractC3453.m5013(i3, strMo2518, "a hexadecimal digit");
                throw null;
            }
            if (strMo2518.charAt(13) != '-') {
                AbstractC3453.m5013(13, strMo2518, "'-' (hyphen)");
                throw null;
            }
            long j13 = 0;
            for (int i4 = 14; i4 < 18; i4++) {
                long j14 = j13 << 4;
                char cCharAt5 = strMo2518.charAt(i4);
                if ((cCharAt5 >>> '\b') == 0) {
                    long j15 = AbstractC1533.f5370[cCharAt5];
                    if (j15 >= 0) {
                        j13 = j14 | j15;
                    }
                }
                AbstractC3453.m5013(i4, strMo2518, "a hexadecimal digit");
                throw null;
            }
            if (strMo2518.charAt(18) != '-') {
                AbstractC3453.m5013(18, strMo2518, "'-' (hyphen)");
                throw null;
            }
            long j16 = 0;
            for (int i5 = 19; i5 < 23; i5++) {
                long j17 = j16 << 4;
                char cCharAt6 = strMo2518.charAt(i5);
                if ((cCharAt6 >>> '\b') == 0) {
                    long j18 = AbstractC1533.f5370[cCharAt6];
                    if (j18 >= 0) {
                        j16 = j17 | j18;
                    }
                }
                AbstractC3453.m5013(i5, strMo2518, "a hexadecimal digit");
                throw null;
            }
            if (strMo2518.charAt(23) != '-') {
                AbstractC3453.m5013(23, strMo2518, "'-' (hyphen)");
                throw null;
            }
            long j19 = 0;
            for (int i6 = 24; i6 < 36; i6++) {
                long j20 = j19 << 4;
                char cCharAt7 = strMo2518.charAt(i6);
                if ((cCharAt7 >>> '\b') == 0) {
                    long j21 = AbstractC1533.f5370[cCharAt7];
                    if (j21 >= 0) {
                        j19 = j20 | j21;
                    }
                }
                AbstractC3453.m5013(i6, strMo2518, "a hexadecimal digit");
                throw null;
            }
            long j22 = (j7 << 32) | (j10 << 16) | j13;
            long j23 = (j16 << 48) | j19;
            if (j22 != 0 || j23 != 0) {
                return new C3525(j22, j23);
            }
        }
        return C3525.f11035;
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        interfaceC1206.mo2808(((C3525) obj).toString());
    }
}
