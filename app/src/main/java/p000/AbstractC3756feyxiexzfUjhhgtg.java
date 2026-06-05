package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.ek;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸能不能ᛴᛳᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3756feyxiexzfUjhhgtg extends AbstractC3152Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C0870feyxiexzfUjhhgtg f11831Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public C0870feyxiexzfUjhhgtg f11832Ujhhgtgfeyxiexzf;

    public AbstractC3756feyxiexzfUjhhgtg(C3057Ujhhgtgfeyxiexzf c3057Ujhhgtgfeyxiexzf, C3155Ujhhgtgfeyxiexzf c3155Ujhhgtgfeyxiexzf) {
        super(c3057Ujhhgtgfeyxiexzf, c3155Ujhhgtgfeyxiexzf);
        String str = c3155Ujhhgtgfeyxiexzf.f9767Ujhhgtgfeyxiexzf.f9450Ujhhgtgfeyxiexzf;
        if (m5408Ujhhgtgfeyxiexzf()) {
            this.f11831Ujhhgtgfeyxiexzf = C0870feyxiexzfUjhhgtg.m2299Ujhhgtgfeyxiexzf(str);
        } else {
            this.f11831Ujhhgtgfeyxiexzf = C0870feyxiexzfUjhhgtg.m2300Ujhhgtgfeyxiexzf(str);
        }
        this.f11832Ujhhgtgfeyxiexzf = null;
    }

    @Override // p000.InterfaceC1793feyxiexzfUjhhgtg
    public final C1784feyxiexzfUjhhgtg getType() {
        return this.f11831Ujhhgtgfeyxiexzf.f3381Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC3152Ujhhgtgfeyxiexzf, p000.AbstractC3638Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final int mo4535Ujhhgtgfeyxiexzf(AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf) {
        int iMo4535Ujhhgtgfeyxiexzf = super.mo4535Ujhhgtgfeyxiexzf(abstractC3638Ujhhgtgfeyxiexzf);
        return iMo4535Ujhhgtgfeyxiexzf != 0 ? iMo4535Ujhhgtgfeyxiexzf : this.f11831Ujhhgtgfeyxiexzf.compareTo(((AbstractC3756feyxiexzfUjhhgtg) abstractC3638Ujhhgtgfeyxiexzf).f11831Ujhhgtgfeyxiexzf);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean m5408Ujhhgtgfeyxiexzf() {
        C3057Ujhhgtgfeyxiexzf c3057Ujhhgtgfeyxiexzf = C3057Ujhhgtgfeyxiexzf.f9471Ujhhgtgfeyxiexzf;
        C3057Ujhhgtgfeyxiexzf c3057Ujhhgtgfeyxiexzf2 = this.f9760Ujhhgtgfeyxiexzf;
        boolean zEquals = c3057Ujhhgtgfeyxiexzf2.equals(c3057Ujhhgtgfeyxiexzf);
        C3155Ujhhgtgfeyxiexzf c3155Ujhhgtgfeyxiexzf = this.f9761Ujhhgtgfeyxiexzf;
        if (zEquals) {
            String str = c3155Ujhhgtgfeyxiexzf.f9766Ujhhgtgfeyxiexzf.f9450Ujhhgtgfeyxiexzf;
            str.getClass();
            if (str.equals("invoke") || str.equals("invokeExact")) {
                return true;
            }
        } else if (c3057Ujhhgtgfeyxiexzf2.equals(C3057Ujhhgtgfeyxiexzf.f9472feyxiexzfUjhhgtg)) {
            String str2 = c3155Ujhhgtgfeyxiexzf.f9766Ujhhgtgfeyxiexzf.f9450Ujhhgtgfeyxiexzf;
            str2.getClass();
            byte b = -1;
            switch (str2.hashCode()) {
                case -1946504908:
                    if (str2.equals("getAndBitwiseOrRelease")) {
                        b = 0;
                    }
                    break;
                case -1686727776:
                    if (str2.equals("getAndBitwiseAndRelease")) {
                        b = 1;
                    }
                    break;
                case -1671098288:
                    if (str2.equals("compareAndSet")) {
                        b = 2;
                    }
                    break;
                case -1292078254:
                    if (str2.equals("compareAndExchangeRelease")) {
                        b = 3;
                    }
                    break;
                case -1117944904:
                    if (str2.equals("weakCompareAndSet")) {
                        b = 4;
                    }
                    break;
                case -1103072857:
                    if (str2.equals("getAndAddRelease")) {
                        b = 5;
                    }
                    break;
                case -1032914329:
                    if (str2.equals("getAndBitwiseAnd")) {
                        b = 6;
                    }
                    break;
                case -1032892181:
                    if (str2.equals("getAndBitwiseXor")) {
                        b = 7;
                    }
                    break;
                case -794517348:
                    if (str2.equals("getAndBitwiseXorRelease")) {
                        b = 8;
                    }
                    break;
                case -567150350:
                    if (str2.equals("weakCompareAndSetPlain")) {
                        b = 9;
                    }
                    break;
                case -240822786:
                    if (str2.equals("weakCompareAndSetAcquire")) {
                        b = 10;
                    }
                    break;
                case -230706875:
                    if (str2.equals("setRelease")) {
                        b = 11;
                    }
                    break;
                case -127361888:
                    if (str2.equals("getAcquire")) {
                        b = 12;
                    }
                    break;
                case -37641530:
                    if (str2.equals("getAndSetRelease")) {
                        b = ek.k;
                    }
                    break;
                case 102230:
                    if (str2.equals("get")) {
                        b = ek.l;
                    }
                    break;
                case 113762:
                    if (str2.equals("set")) {
                        b = ek.m;
                    }
                    break;
                case 93645315:
                    if (str2.equals("getAndBitwiseOrAcquire")) {
                        b = 16;
                    }
                    break;
                case 101293086:
                    if (str2.equals("setVolatile")) {
                        b = 17;
                    }
                    break;
                case 189872914:
                    if (str2.equals("getVolatile")) {
                        b = 18;
                    }
                    break;
                case 282707520:
                    if (str2.equals("getAndAdd")) {
                        b = 19;
                    }
                    break;
                case 282724865:
                    if (str2.equals("getAndSet")) {
                        b = 20;
                    }
                    break;
                case 353422447:
                    if (str2.equals("getAndBitwiseAndAcquire")) {
                        b = 21;
                    }
                    break;
                case 470702883:
                    if (str2.equals("setOpaque")) {
                        b = 22;
                    }
                    break;
                case 685319959:
                    if (str2.equals("getOpaque")) {
                        b = 23;
                    }
                    break;
                case 748071969:
                    if (str2.equals("compareAndExchangeAcquire")) {
                        b = 24;
                    }
                    break;
                case 937077366:
                    if (str2.equals("getAndAddAcquire")) {
                        b = 25;
                    }
                    break;
                case 1245632875:
                    if (str2.equals("getAndBitwiseXorAcquire")) {
                        b = 26;
                    }
                    break;
                case 1352153939:
                    if (str2.equals("getAndBitwiseOr")) {
                        b = 27;
                    }
                    break;
                case 1483964149:
                    if (str2.equals("compareAndExchange")) {
                        b = 28;
                    }
                    break;
                case 2002508693:
                    if (str2.equals("getAndSetAcquire")) {
                        b = 29;
                    }
                    break;
                case 2013994287:
                    if (str2.equals("weakCompareAndSetRelease")) {
                        b = 30;
                    }
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case Opcodes.FCONST_1 /* 12 */:
                case 13:
                case Opcodes.DCONST_0 /* 14 */:
                case 15:
                case 16:
                case Opcodes.SIPUSH /* 17 */:
                case Opcodes.LDC /* 18 */:
                case 19:
                case 20:
                case Opcodes.ILOAD /* 21 */:
                case Opcodes.LLOAD /* 22 */:
                case Opcodes.FLOAD /* 23 */:
                case Opcodes.DLOAD /* 24 */:
                case Opcodes.ALOAD /* 25 */:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                    return true;
            }
        }
        return false;
    }
}
