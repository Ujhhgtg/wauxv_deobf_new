package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.Adler32;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱ能不能ᛳᛲᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3268feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C0295Ujhhgtgfeyxiexzf f10260Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C0295Ujhhgtgfeyxiexzf f10261Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C0295Ujhhgtgfeyxiexzf f10262Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C0295Ujhhgtgfeyxiexzf f10263Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C0395Ujhhgtgfeyxiexzf f10264Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C0395Ujhhgtgfeyxiexzf f10265Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final C0395Ujhhgtgfeyxiexzf f10266Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final C3444feyxiexzfUjhhgtg f10267Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final C0392Ujhhgtgfeyxiexzf f10268Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final C2635feyxiexzfUjhhgtg f10269Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final C0295Ujhhgtgfeyxiexzf f10270Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final C2635feyxiexzfUjhhgtg f10271Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final C0395Ujhhgtgfeyxiexzf f10272Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final C0295Ujhhgtgfeyxiexzf f10273Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final C0395Ujhhgtgfeyxiexzf f10274Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final AbstractC1090feyxiexzfUjhhgtg[] f10275Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public int f10276Ujhhgtgfeyxiexzf;

    public C3268feyxiexzfUjhhgtg(C2697Ujhhgtgfeyxiexzf c2697Ujhhgtgfeyxiexzf) {
        C0395Ujhhgtgfeyxiexzf c0395Ujhhgtgfeyxiexzf = new C0395Ujhhgtgfeyxiexzf(this, 4);
        this.f10274Ujhhgtgfeyxiexzf = c0395Ujhhgtgfeyxiexzf;
        C0295Ujhhgtgfeyxiexzf c0295Ujhhgtgfeyxiexzf = new C0295Ujhhgtgfeyxiexzf(null, this, 4, 1);
        this.f10261Ujhhgtgfeyxiexzf = c0295Ujhhgtgfeyxiexzf;
        C0295Ujhhgtgfeyxiexzf c0295Ujhhgtgfeyxiexzf2 = new C0295Ujhhgtgfeyxiexzf("word_data", this, 4, 2);
        this.f10260Ujhhgtgfeyxiexzf = c0295Ujhhgtgfeyxiexzf2;
        C0295Ujhhgtgfeyxiexzf c0295Ujhhgtgfeyxiexzf3 = new C0295Ujhhgtgfeyxiexzf("string_data", this, 1, 3);
        this.f10263Ujhhgtgfeyxiexzf = c0295Ujhhgtgfeyxiexzf3;
        C0295Ujhhgtgfeyxiexzf c0295Ujhhgtgfeyxiexzf4 = new C0295Ujhhgtgfeyxiexzf(null, this, 1, 1);
        this.f10270Ujhhgtgfeyxiexzf = c0295Ujhhgtgfeyxiexzf4;
        C0295Ujhhgtgfeyxiexzf c0295Ujhhgtgfeyxiexzf5 = new C0295Ujhhgtgfeyxiexzf("byte_data", this, 1, 2);
        this.f10273Ujhhgtgfeyxiexzf = c0295Ujhhgtgfeyxiexzf5;
        C0395Ujhhgtgfeyxiexzf c0395Ujhhgtgfeyxiexzf2 = new C0395Ujhhgtgfeyxiexzf(this, 2);
        this.f10264Ujhhgtgfeyxiexzf = c0395Ujhhgtgfeyxiexzf2;
        C0395Ujhhgtgfeyxiexzf c0395Ujhhgtgfeyxiexzf3 = new C0395Ujhhgtgfeyxiexzf(this, 3);
        this.f10265Ujhhgtgfeyxiexzf = c0395Ujhhgtgfeyxiexzf3;
        C0395Ujhhgtgfeyxiexzf c0395Ujhhgtgfeyxiexzf4 = new C0395Ujhhgtgfeyxiexzf(this, 1);
        this.f10266Ujhhgtgfeyxiexzf = c0395Ujhhgtgfeyxiexzf4;
        C3444feyxiexzfUjhhgtg c3444feyxiexzfUjhhgtg = new C3444feyxiexzfUjhhgtg(this);
        this.f10267Ujhhgtgfeyxiexzf = c3444feyxiexzfUjhhgtg;
        C0392Ujhhgtgfeyxiexzf c0392Ujhhgtgfeyxiexzf = new C0392Ujhhgtgfeyxiexzf(this);
        this.f10268Ujhhgtgfeyxiexzf = c0392Ujhhgtgfeyxiexzf;
        C2635feyxiexzfUjhhgtg c2635feyxiexzfUjhhgtg = new C2635feyxiexzfUjhhgtg(this, 1);
        this.f10269Ujhhgtgfeyxiexzf = c2635feyxiexzfUjhhgtg;
        C0295Ujhhgtgfeyxiexzf c0295Ujhhgtgfeyxiexzf6 = new C0295Ujhhgtgfeyxiexzf("map", this, 4, 1);
        this.f10262Ujhhgtgfeyxiexzf = c0295Ujhhgtgfeyxiexzf6;
        if (C2697Ujhhgtgfeyxiexzf.m4029Ujhhgtgfeyxiexzf(26)) {
            C2635feyxiexzfUjhhgtg c2635feyxiexzfUjhhgtg2 = new C2635feyxiexzfUjhhgtg(this, 0);
            this.f10271Ujhhgtgfeyxiexzf = c2635feyxiexzfUjhhgtg2;
            C0395Ujhhgtgfeyxiexzf c0395Ujhhgtgfeyxiexzf5 = new C0395Ujhhgtgfeyxiexzf(this, 0);
            this.f10272Ujhhgtgfeyxiexzf = c0395Ujhhgtgfeyxiexzf5;
            this.f10275Ujhhgtgfeyxiexzf = new AbstractC1090feyxiexzfUjhhgtg[]{c0395Ujhhgtgfeyxiexzf, c0395Ujhhgtgfeyxiexzf2, c0395Ujhhgtgfeyxiexzf3, c0395Ujhhgtgfeyxiexzf4, c3444feyxiexzfUjhhgtg, c0392Ujhhgtgfeyxiexzf, c2635feyxiexzfUjhhgtg, c2635feyxiexzfUjhhgtg2, c0395Ujhhgtgfeyxiexzf5, c0295Ujhhgtgfeyxiexzf2, c0295Ujhhgtgfeyxiexzf, c0295Ujhhgtgfeyxiexzf3, c0295Ujhhgtgfeyxiexzf5, c0295Ujhhgtgfeyxiexzf4, c0295Ujhhgtgfeyxiexzf6};
        } else {
            this.f10271Ujhhgtgfeyxiexzf = null;
            this.f10272Ujhhgtgfeyxiexzf = null;
            this.f10275Ujhhgtgfeyxiexzf = new AbstractC1090feyxiexzfUjhhgtg[]{c0395Ujhhgtgfeyxiexzf, c0395Ujhhgtgfeyxiexzf2, c0395Ujhhgtgfeyxiexzf3, c0395Ujhhgtgfeyxiexzf4, c3444feyxiexzfUjhhgtg, c0392Ujhhgtgfeyxiexzf, c2635feyxiexzfUjhhgtg, c0295Ujhhgtgfeyxiexzf2, c0295Ujhhgtgfeyxiexzf, c0295Ujhhgtgfeyxiexzf3, c0295Ujhhgtgfeyxiexzf5, c0295Ujhhgtgfeyxiexzf4, c0295Ujhhgtgfeyxiexzf6};
        }
        this.f10276Ujhhgtgfeyxiexzf = -1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m4774Ujhhgtgfeyxiexzf(AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf) {
        if (abstractC3638Ujhhgtgfeyxiexzf == null) {
            throw new NullPointerException("cst == null");
        }
        if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3056Ujhhgtgfeyxiexzf) {
            this.f10264Ujhhgtgfeyxiexzf.m1671Ujhhgtgfeyxiexzf((C3056Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf);
            return;
        }
        if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3057Ujhhgtgfeyxiexzf) {
            this.f10265Ujhhgtgfeyxiexzf.m1669Ujhhgtgfeyxiexzf((C3057Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf);
            return;
        }
        if (abstractC3638Ujhhgtgfeyxiexzf instanceof AbstractC3756feyxiexzfUjhhgtg) {
            this.f10268Ujhhgtgfeyxiexzf.m1646Ujhhgtgfeyxiexzf((AbstractC3756feyxiexzfUjhhgtg) abstractC3638Ujhhgtgfeyxiexzf);
            return;
        }
        boolean z = abstractC3638Ujhhgtgfeyxiexzf instanceof C3140Ujhhgtgfeyxiexzf;
        C3444feyxiexzfUjhhgtg c3444feyxiexzfUjhhgtg = this.f10267Ujhhgtgfeyxiexzf;
        if (z) {
            c3444feyxiexzfUjhhgtg.m4944Ujhhgtgfeyxiexzf((C3140Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf);
            return;
        }
        if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3139Ujhhgtgfeyxiexzf) {
            c3444feyxiexzfUjhhgtg.m4944Ujhhgtgfeyxiexzf(((C3139Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf).m4656Ujhhgtgfeyxiexzf());
            return;
        }
        if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3156Ujhhgtgfeyxiexzf) {
            this.f10266Ujhhgtgfeyxiexzf.m1672Ujhhgtgfeyxiexzf(((C3156Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf).f9768Ujhhgtgfeyxiexzf);
        } else if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3153Ujhhgtgfeyxiexzf) {
            this.f10272Ujhhgtgfeyxiexzf.m1670Ujhhgtgfeyxiexzf((C3153Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m4775Ujhhgtgfeyxiexzf(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        this.f10269Ujhhgtgfeyxiexzf.m2562Ujhhgtgfeyxiexzf();
        this.f10270Ujhhgtgfeyxiexzf.m2562Ujhhgtgfeyxiexzf();
        this.f10260Ujhhgtgfeyxiexzf.m2562Ujhhgtgfeyxiexzf();
        boolean zM4029Ujhhgtgfeyxiexzf = C2697Ujhhgtgfeyxiexzf.m4029Ujhhgtgfeyxiexzf(26);
        C2635feyxiexzfUjhhgtg c2635feyxiexzfUjhhgtg = this.f10271Ujhhgtgfeyxiexzf;
        if (zM4029Ujhhgtgfeyxiexzf) {
            c2635feyxiexzfUjhhgtg.m2562Ujhhgtgfeyxiexzf();
        }
        this.f10273Ujhhgtgfeyxiexzf.m2562Ujhhgtgfeyxiexzf();
        C0395Ujhhgtgfeyxiexzf c0395Ujhhgtgfeyxiexzf = this.f10272Ujhhgtgfeyxiexzf;
        if (zM4029Ujhhgtgfeyxiexzf) {
            c0395Ujhhgtgfeyxiexzf.m2562Ujhhgtgfeyxiexzf();
        }
        this.f10268Ujhhgtgfeyxiexzf.m2562Ujhhgtgfeyxiexzf();
        this.f10267Ujhhgtgfeyxiexzf.m2562Ujhhgtgfeyxiexzf();
        this.f10266Ujhhgtgfeyxiexzf.m2562Ujhhgtgfeyxiexzf();
        this.f10261Ujhhgtgfeyxiexzf.m2562Ujhhgtgfeyxiexzf();
        this.f10265Ujhhgtgfeyxiexzf.m2562Ujhhgtgfeyxiexzf();
        this.f10264Ujhhgtgfeyxiexzf.m2562Ujhhgtgfeyxiexzf();
        this.f10263Ujhhgtgfeyxiexzf.m2562Ujhhgtgfeyxiexzf();
        this.f10274Ujhhgtgfeyxiexzf.m2562Ujhhgtgfeyxiexzf();
        AbstractC1090feyxiexzfUjhhgtg[] abstractC1090feyxiexzfUjhhgtgArr = this.f10275Ujhhgtgfeyxiexzf;
        int length = abstractC1090feyxiexzfUjhhgtgArr.length;
        int iMo1507Ujhhgtgfeyxiexzf = 0;
        for (int i = 0; i < length; i++) {
            AbstractC1090feyxiexzfUjhhgtg abstractC1090feyxiexzfUjhhgtg = abstractC1090feyxiexzfUjhhgtgArr[i];
            if ((abstractC1090feyxiexzfUjhhgtg != c2635feyxiexzfUjhhgtg && abstractC1090feyxiexzfUjhhgtg != c0395Ujhhgtgfeyxiexzf) || !abstractC1090feyxiexzfUjhhgtg.mo1505Ujhhgtgfeyxiexzf().isEmpty()) {
                if (iMo1507Ujhhgtgfeyxiexzf < 0) {
                    abstractC1090feyxiexzfUjhhgtg.getClass();
                    throw new IllegalArgumentException("fileOffset < 0");
                }
                if (abstractC1090feyxiexzfUjhhgtg.f4174Ujhhgtgfeyxiexzf >= 0) {
                    throw new RuntimeException("fileOffset already set");
                }
                int i2 = abstractC1090feyxiexzfUjhhgtg.f4173Ujhhgtgfeyxiexzf - 1;
                int i3 = (~i2) & (iMo1507Ujhhgtgfeyxiexzf + i2);
                abstractC1090feyxiexzfUjhhgtg.f4174Ujhhgtgfeyxiexzf = i3;
                if (i3 < iMo1507Ujhhgtgfeyxiexzf) {
                    throw new RuntimeException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i, "bogus placement for section "));
                }
                C0295Ujhhgtgfeyxiexzf c0295Ujhhgtgfeyxiexzf = this.f10262Ujhhgtgfeyxiexzf;
                if (abstractC1090feyxiexzfUjhhgtg == c0295Ujhhgtgfeyxiexzf) {
                    try {
                        C0200Ujhhgtgfeyxiexzf.m1273Ujhhgtgfeyxiexzf(abstractC1090feyxiexzfUjhhgtgArr, c0295Ujhhgtgfeyxiexzf);
                        c0295Ujhhgtgfeyxiexzf.m2562Ujhhgtgfeyxiexzf();
                    } catch (RuntimeException e) {
                        throw C3355feyxiexzfUjhhgtg.m4860Ujhhgtgfeyxiexzf("...while writing section " + i, e);
                    }
                }
                if (abstractC1090feyxiexzfUjhhgtg instanceof C0295Ujhhgtgfeyxiexzf) {
                    ((C0295Ujhhgtgfeyxiexzf) abstractC1090feyxiexzfUjhhgtg).m1511Ujhhgtgfeyxiexzf();
                }
                iMo1507Ujhhgtgfeyxiexzf = abstractC1090feyxiexzfUjhhgtg.mo1507Ujhhgtgfeyxiexzf() + i3;
            }
        }
        this.f10276Ujhhgtgfeyxiexzf = iMo1507Ujhhgtgfeyxiexzf;
        byte[] bArr = new byte[iMo1507Ujhhgtgfeyxiexzf];
        C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf = new C2608Ujhhgtgfeyxiexzf(bArr, false);
        for (int i4 = 0; i4 < length; i4++) {
            try {
                AbstractC1090feyxiexzfUjhhgtg abstractC1090feyxiexzfUjhhgtg2 = abstractC1090feyxiexzfUjhhgtgArr[i4];
                if ((abstractC1090feyxiexzfUjhhgtg2 != c2635feyxiexzfUjhhgtg && abstractC1090feyxiexzfUjhhgtg2 != c0395Ujhhgtgfeyxiexzf) || !abstractC1090feyxiexzfUjhhgtg2.mo1505Ujhhgtgfeyxiexzf().isEmpty()) {
                    int iM2561Ujhhgtgfeyxiexzf = abstractC1090feyxiexzfUjhhgtg2.m2561Ujhhgtgfeyxiexzf() - c2608Ujhhgtgfeyxiexzf.f8413Ujhhgtgfeyxiexzf;
                    if (iM2561Ujhhgtgfeyxiexzf < 0) {
                        throw new C3355feyxiexzfUjhhgtg("excess write of " + (-iM2561Ujhhgtgfeyxiexzf), null);
                    }
                    c2608Ujhhgtgfeyxiexzf.m3898Ujhhgtgfeyxiexzf(iM2561Ujhhgtgfeyxiexzf);
                    abstractC1090feyxiexzfUjhhgtg2.m2565Ujhhgtgfeyxiexzf(c2608Ujhhgtgfeyxiexzf);
                }
            } catch (RuntimeException e2) {
                C3355feyxiexzfUjhhgtg c3355feyxiexzfUjhhgtg = e2 instanceof C3355feyxiexzfUjhhgtg ? (C3355feyxiexzfUjhhgtg) e2 : new C3355feyxiexzfUjhhgtg(null, e2);
                c3355feyxiexzfUjhhgtg.m4861Ujhhgtgfeyxiexzf("...while writing section " + i4);
                throw c3355feyxiexzfUjhhgtg;
            }
        }
        int i5 = c2608Ujhhgtgfeyxiexzf.f8413Ujhhgtgfeyxiexzf;
        if (i5 != this.f10276Ujhhgtgfeyxiexzf) {
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
                int i6 = c2608Ujhhgtgfeyxiexzf.f8413Ujhhgtgfeyxiexzf;
                Adler32 adler32 = new Adler32();
                adler32.update(bArr, 12, i6 - 12);
                int value = (int) adler32.getValue();
                bArr[8] = (byte) value;
                bArr[9] = (byte) (value >> 8);
                bArr[10] = (byte) (value >> 16);
                bArr[11] = (byte) (value >> 24);
                byteArrayOutputStream.write(c2608Ujhhgtgfeyxiexzf.f8412Ujhhgtgfeyxiexzf);
            } catch (DigestException e3) {
                throw new RuntimeException(e3);
            }
        } catch (NoSuchAlgorithmException e4) {
            throw new RuntimeException(e4);
        }
    }
}
