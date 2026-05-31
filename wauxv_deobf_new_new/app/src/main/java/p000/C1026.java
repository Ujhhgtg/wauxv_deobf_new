package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.Adler32;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᛸᲇᤞᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1026 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C2017 f3744;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2017 f3745;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2017 f3746;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2017 f3747;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2008 f3748;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C2008 f3749;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C2008 f3750;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C1302 f3751;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C2010 f3752;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C0525 f3753;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final C2017 f3754;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final C0525 f3755;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final C2008 f3756;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final C2017 f3757;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final C2008 f3758;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final AbstractC2704[] f3759;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public int f3760;

    public C1026(C0561 c0561) {
        C2008 c2008 = new C2008(this, 4);
        this.f3758 = c2008;
        C2017 c2017 = new C2017(null, this, 4, 1);
        this.f3745 = c2017;
        C2017 c2018 = new C2017("word_data", this, 4, 2);
        this.f3744 = c2018;
        C2017 c2019 = new C2017("string_data", this, 1, 3);
        this.f3747 = c2019;
        C2017 c20110 = new C2017(null, this, 1, 1);
        this.f3754 = c20110;
        C2017 c20111 = new C2017("byte_data", this, 1, 2);
        this.f3757 = c20111;
        C2008 c2009 = new C2008(this, 2);
        this.f3748 = c2009;
        C2008 c20010 = new C2008(this, 3);
        this.f3749 = c20010;
        C2008 c20011 = new C2008(this, 1);
        this.f3750 = c20011;
        C1302 c1302 = new C1302(this);
        this.f3751 = c1302;
        C2010 c2010 = new C2010(this);
        this.f3752 = c2010;
        C0525 c0525 = new C0525(this, 1);
        this.f3753 = c0525;
        C2017 c20112 = new C2017("map", this, 4, 1);
        this.f3746 = c20112;
        if (C0561.m2099(26)) {
            C0525 c0526 = new C0525(this, 0);
            this.f3755 = c0526;
            C2008 c20012 = new C2008(this, 0);
            this.f3756 = c20012;
            this.f3759 = new AbstractC2704[]{c2008, c2009, c20010, c20011, c1302, c2010, c0525, c0526, c20012, c2018, c2017, c2019, c20111, c20110, c20112};
        } else {
            this.f3755 = null;
            this.f3756 = null;
            this.f3759 = new AbstractC2704[]{c2008, c2009, c20010, c20011, c1302, c2010, c0525, c2018, c2017, c2019, c20111, c20110, c20112};
        }
        this.f3760 = -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m2719(AbstractC0775 abstractC0775) {
        if (abstractC0775 == null) {
            throw new NullPointerException("cst == null");
        }
        if (abstractC0775 instanceof C0916) {
            this.f3748.m4005((C0916) abstractC0775);
            return;
        }
        if (abstractC0775 instanceof C0917) {
            this.f3749.m4003((C0917) abstractC0775);
            return;
        }
        if (abstractC0775 instanceof AbstractC0890) {
            this.f3752.m4009((AbstractC0890) abstractC0775);
            return;
        }
        boolean z = abstractC0775 instanceof C0898;
        C1302 c1302 = this.f3751;
        if (z) {
            c1302.m3121((C0898) abstractC0775);
            return;
        }
        if (abstractC0775 instanceof C0897) {
            c1302.m3121(((C0897) abstractC0775).m2529());
            return;
        }
        if (abstractC0775 instanceof C0914) {
            this.f3750.m4006(((C0914) abstractC0775).f3383);
        } else if (abstractC0775 instanceof C0911) {
            this.f3756.m4004((C0911) abstractC0775);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m2720(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        this.f3753.m4670();
        this.f3754.m4670();
        this.f3744.m4670();
        boolean zM2099 = C0561.m2099(26);
        C0525 c0525 = this.f3755;
        if (zM2099) {
            c0525.m4670();
        }
        this.f3757.m4670();
        C2008 c2008 = this.f3756;
        if (zM2099) {
            c2008.m4670();
        }
        this.f3752.m4670();
        this.f3751.m4670();
        this.f3750.m4670();
        this.f3745.m4670();
        this.f3749.m4670();
        this.f3748.m4670();
        this.f3747.m4670();
        this.f3758.m4670();
        AbstractC2704[] abstractC2704Arr = this.f3759;
        int length = abstractC2704Arr.length;
        int iMo4046 = 0;
        for (int i = 0; i < length; i++) {
            AbstractC2704 abstractC2704 = abstractC2704Arr[i];
            if ((abstractC2704 != c0525 && abstractC2704 != c2008) || !abstractC2704.mo2018().isEmpty()) {
                if (iMo4046 < 0) {
                    abstractC2704.getClass();
                    throw new IllegalArgumentException("fileOffset < 0");
                }
                if (abstractC2704.f8701 >= 0) {
                    throw new RuntimeException("fileOffset already set");
                }
                int i2 = abstractC2704.f8700 - 1;
                int i3 = (~i2) & (iMo4046 + i2);
                abstractC2704.f8701 = i3;
                if (i3 < iMo4046) {
                    throw new RuntimeException(AbstractC1095.m2794(i, "bogus placement for section "));
                }
                C2017 c2017 = this.f3746;
                if (abstractC2704 == c2017) {
                    try {
                        C1922.m3869(abstractC2704Arr, c2017);
                        c2017.m4670();
                    } catch (RuntimeException e) {
                        throw C1240.m3003("...while writing section " + i, e);
                    }
                }
                if (abstractC2704 instanceof C2017) {
                    ((C2017) abstractC2704).m4050();
                }
                iMo4046 = abstractC2704.mo4046() + i3;
            }
        }
        this.f3760 = iMo4046;
        byte[] bArr = new byte[iMo4046];
        C0496 c0496 = new C0496(bArr, false);
        for (int i4 = 0; i4 < length; i4++) {
            try {
                AbstractC2704 abstractC2705 = abstractC2704Arr[i4];
                if ((abstractC2705 != c0525 && abstractC2705 != c2008) || !abstractC2705.mo2018().isEmpty()) {
                    int iM4669 = abstractC2705.m4669() - c0496.f2152;
                    if (iM4669 < 0) {
                        throw new C1240("excess write of " + (-iM4669), null);
                    }
                    c0496.m1937(iM4669);
                    abstractC2705.m4673(c0496);
                }
            } catch (RuntimeException e2) {
                C1240 c1240 = e2 instanceof C1240 ? (C1240) e2 : new C1240(null, e2);
                c1240.m3004("...while writing section " + i4);
                throw c1240;
            }
        }
        int i5 = c0496.f2152;
        if (i5 != this.f3760) {
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
                int i6 = c0496.f2152;
                Adler32 adler32 = new Adler32();
                adler32.update(bArr, 12, i6 - 12);
                int value = (int) adler32.getValue();
                bArr[8] = (byte) value;
                bArr[9] = (byte) (value >> 8);
                bArr[10] = (byte) (value >> 16);
                bArr[11] = (byte) (value >> 24);
                byteArrayOutputStream.write(c0496.f2151);
            } catch (DigestException e3) {
                throw new RuntimeException(e3);
            }
        } catch (NoSuchAlgorithmException e4) {
            throw new RuntimeException(e4);
        }
    }
}
