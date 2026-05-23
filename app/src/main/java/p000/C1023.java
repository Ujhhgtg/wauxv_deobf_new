package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.Adler32;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1023 {

    public final C1986 f3737;

    public final C1986 f3738;

    public final C1986 f3739;

    public final C1986 f3740;

    public final C1977 f3741;

    public final C1977 f3742;

    public final C1977 f3743;

    public final C1301 f3744;

    public final C1979 f3745;

    public final C0548 f3746;

    public final C1986 f3747;

    public final C0548 f3748;

    public final C1977 f3749;

    public final C1986 f3750;

    public final C1977 f3751;

    public final AbstractC2643[] f3752;

    public int f3753;

    public C1023(C0580 c0580) {
        C1977 c1977 = new C1977(this, 4);
        this.f3751 = c1977;
        C1986 c1986 = new C1986(null, this, 4, 1);
        this.f3738 = c1986;
        C1986 c1987 = new C1986("word_data", this, 4, 2);
        this.f3737 = c1987;
        C1986 c1988 = new C1986("string_data", this, 1, 3);
        this.f3740 = c1988;
        C1986 c1989 = new C1986(null, this, 1, 1);
        this.f3747 = c1989;
        C1986 c19810 = new C1986("byte_data", this, 1, 2);
        this.f3750 = c19810;
        C1977 c1978 = new C1977(this, 2);
        this.f3741 = c1978;
        C1977 c1979 = new C1977(this, 3);
        this.f3742 = c1979;
        C1977 c19710 = new C1977(this, 1);
        this.f3743 = c19710;
        C1301 c1301 = new C1301(this);
        this.f3744 = c1301;
        C1979 c19711 = new C1979(this);
        this.f3745 = c19711;
        C0548 c0548 = new C0548(this, 1);
        this.f3746 = c0548;
        C1986 c19811 = new C1986("map", this, 4, 1);
        this.f3739 = c19811;
        if (C0580.m2002(26)) {
            C0548 c0549 = new C0548(this, 0);
            this.f3748 = c0549;
            C1977 c19712 = new C1977(this, 0);
            this.f3749 = c19712;
            this.f3752 = new AbstractC2643[]{c1977, c1978, c1979, c19710, c1301, c19711, c0548, c0549, c19712, c1987, c1986, c1988, c19810, c1989, c19811};
        } else {
            this.f3748 = null;
            this.f3749 = null;
            this.f3752 = new AbstractC2643[]{c1977, c1978, c1979, c19710, c1301, c19711, c0548, c1987, c1986, c1988, c19810, c1989, c19811};
        }
        this.f3753 = -1;
    }

    public final void m2595(AbstractC0777 abstractC0777) {
        if (abstractC0777 == null) {
            throw new NullPointerException("cst == null");
        }
        if (abstractC0777 instanceof C0917) {
            this.f3741.m3811((C0917) abstractC0777);
            return;
        }
        if (abstractC0777 instanceof C0918) {
            this.f3742.m3809((C0918) abstractC0777);
            return;
        }
        if (abstractC0777 instanceof AbstractC0891) {
            this.f3745.m3815((AbstractC0891) abstractC0777);
            return;
        }
        boolean z = abstractC0777 instanceof C0899;
        C1301 c1301 = this.f3744;
        if (z) {
            c1301.m3018((C0899) abstractC0777);
            return;
        }
        if (abstractC0777 instanceof C0898) {
            c1301.m3018(((C0898) abstractC0777).m2412());
            return;
        }
        if (abstractC0777 instanceof C0915) {
            this.f3743.m3812(((C0915) abstractC0777).f3376);
        } else if (abstractC0777 instanceof C0912) {
            this.f3749.m3810((C0912) abstractC0777);
        }
    }

    public final void m2596(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        this.f3746.m4636();
        this.f3747.m4636();
        this.f3737.m4636();
        boolean zM2002 = C0580.m2002(26);
        C0548 c0548 = this.f3748;
        if (zM2002) {
            c0548.m4636();
        }
        this.f3750.m4636();
        C1977 c1977 = this.f3749;
        if (zM2002) {
            c1977.m4636();
        }
        this.f3745.m4636();
        this.f3744.m4636();
        this.f3743.m4636();
        this.f3738.m4636();
        this.f3742.m4636();
        this.f3741.m4636();
        this.f3740.m4636();
        this.f3751.m4636();
        AbstractC2643[] abstractC2643Arr = this.f3752;
        int length = abstractC2643Arr.length;
        int iMo3852 = 0;
        for (int i = 0; i < length; i++) {
            AbstractC2643 abstractC2643 = abstractC2643Arr[i];
            if ((abstractC2643 != c0548 && abstractC2643 != c1977) || !abstractC2643.mo1923().isEmpty()) {
                if (iMo3852 < 0) {
                    
                    throw new IllegalArgumentException("fileOffset < 0");
                }
                if (abstractC2643.f8536 >= 0) {
                    throw new RuntimeException("fileOffset already set");
                }
                int i2 = abstractC2643.f8535 - 1;
                int i3 = (~i2) & (iMo3852 + i2);
                abstractC2643.f8536 = i3;
                if (i3 < iMo3852) {
                    throw new RuntimeException(AbstractC1194.m2779(i, "bogus placement for section "));
                }
                C1986 c1986 = this.f3739;
                if (abstractC2643 == c1986) {
                    try {
                        C1896.m3690(abstractC2643Arr, c1986);
                        c1986.m4636();
                    } catch (RuntimeException e) {
                        throw C1238.m2884("...while writing section " + i, e);
                    }
                }
                if (abstractC2643 instanceof C1986) {
                    ((C1986) abstractC2643).m3856();
                }
                iMo3852 = abstractC2643.mo3852() + i3;
            }
        }
        this.f3753 = iMo3852;
        byte[] bArr = new byte[iMo3852];
        C0519 c0519 = new C0519(bArr, false);
        for (int i4 = 0; i4 < length; i4++) {
            try {
                AbstractC2643 abstractC2644 = abstractC2643Arr[i4];
                if ((abstractC2644 != c0548 && abstractC2644 != c1977) || !abstractC2644.mo1923().isEmpty()) {
                    int iM4635 = abstractC2644.m4635() - c0519.f2196;
                    if (iM4635 < 0) {
                        throw new C1238("excess write of " + (-iM4635), null);
                    }
                    c0519.m1843(iM4635);
                    abstractC2644.m4639(c0519);
                }
            } catch (RuntimeException e2) {
                C1238 c1238 = e2 instanceof C1238 ? (C1238) e2 : new C1238(null, e2);
                c1238.m2885("...while writing section " + i4);
                throw c1238;
            }
        }
        int i5 = c0519.f2196;
        if (i5 != this.f3753) {
            throw new RuntimeException("foreshortened write");
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr, 32, i5 - 32);
            try {
                int iDigest = messageDigest.digest(bArr, 12, 20);
                if (iDigest != 20) {
                    throw new RuntimeException("unexpected digest write: " + iDigest + " bytes");
                }
                int i6 = c0519.f2196;
                Adler32 adler32 = new Adler32();
                adler32.update(bArr, 12, i6 - 12);
                int value = (int) adler32.getValue();
                bArr[8] = (byte) value;
                bArr[9] = (byte) (value >> 8);
                bArr[10] = (byte) (value >> 16);
                bArr[11] = (byte) (value >> 24);
                byteArrayOutputStream.write(c0519.f2195);
            } catch (DigestException e3) {
                throw new RuntimeException(e3);
            }
        } catch (NoSuchAlgorithmException e4) {
            throw new RuntimeException(e4);
        }
    }
}
