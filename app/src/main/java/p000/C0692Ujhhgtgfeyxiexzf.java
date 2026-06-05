package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.ek;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛳᛱfeyxiexzfᛱᛲ能不能ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0692Ujhhgtgfeyxiexzf extends AbstractC0671Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static final C3056Ujhhgtgfeyxiexzf f2826Ujhhgtgfeyxiexzf = new C3056Ujhhgtgfeyxiexzf("([Ljava/lang/Object;)Ljava/lang/Object;");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static final C3056Ujhhgtgfeyxiexzf f2827Ujhhgtgfeyxiexzf = new C3056Ujhhgtgfeyxiexzf("([Ljava/lang/Object;)V");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static final C3056Ujhhgtgfeyxiexzf f2828Ujhhgtgfeyxiexzf = new C3056Ujhhgtgfeyxiexzf("([Ljava/lang/Object;)Z");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final InterfaceC1790feyxiexzfUjhhgtg f2829Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final C3154Ujhhgtgfeyxiexzf f2830Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final C3154Ujhhgtgfeyxiexzf f2831Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final C3156Ujhhgtgfeyxiexzf f2832Ujhhgtgfeyxiexzf;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C0692Ujhhgtgfeyxiexzf(C0927feyxiexzfUjhhgtg c0927feyxiexzfUjhhgtg, C1234feyxiexzfUjhhgtg c1234feyxiexzfUjhhgtg, C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg, InterfaceC1790feyxiexzfUjhhgtg interfaceC1790feyxiexzfUjhhgtg, C3154Ujhhgtgfeyxiexzf c3154Ujhhgtgfeyxiexzf) {
        C3154Ujhhgtgfeyxiexzf c3154Ujhhgtgfeyxiexzf2;
        super(c0927feyxiexzfUjhhgtg, c1234feyxiexzfUjhhgtg, null, c0960feyxiexzfUjhhgtg);
        int i = c0927feyxiexzfUjhhgtg.f3754Ujhhgtgfeyxiexzf;
        byte b = 6;
        if (i != 6) {
            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i, "opcode with invalid branchingness: "));
        }
        if (interfaceC1790feyxiexzfUjhhgtg == null) {
            throw new NullPointerException("catches == null");
        }
        this.f2829Ujhhgtgfeyxiexzf = interfaceC1790feyxiexzfUjhhgtg;
        if (c3154Ujhhgtgfeyxiexzf == null) {
            throw new NullPointerException("callSiteMethod == null");
        }
        if (!c3154Ujhhgtgfeyxiexzf.m5408Ujhhgtgfeyxiexzf()) {
            throw new IllegalArgumentException("callSiteMethod is not signature polymorphic");
        }
        this.f2830Ujhhgtgfeyxiexzf = c3154Ujhhgtgfeyxiexzf;
        C3057Ujhhgtgfeyxiexzf c3057Ujhhgtgfeyxiexzf = c3154Ujhhgtgfeyxiexzf.f9760Ujhhgtgfeyxiexzf;
        C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf = c3154Ujhhgtgfeyxiexzf.f9761Ujhhgtgfeyxiexzf.f9766Ujhhgtgfeyxiexzf;
        String str = c3056Ujhhgtgfeyxiexzf.f9450Ujhhgtgfeyxiexzf;
        boolean zEquals = c3057Ujhhgtgfeyxiexzf.equals(C3057Ujhhgtgfeyxiexzf.f9471Ujhhgtgfeyxiexzf);
        C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf2 = f2826Ujhhgtgfeyxiexzf;
        if (!zEquals || (!str.equals("invoke") && !str.equals("invokeExact"))) {
            if (c3057Ujhhgtgfeyxiexzf.equals(C3057Ujhhgtgfeyxiexzf.f9472feyxiexzfUjhhgtg)) {
                str.getClass();
                switch (str.hashCode()) {
                    case -1946504908:
                        b = !str.equals("getAndBitwiseOrRelease") ? (byte) -1 : (byte) 0;
                        break;
                    case -1686727776:
                        b = !str.equals("getAndBitwiseAndRelease") ? (byte) -1 : (byte) 1;
                        break;
                    case -1671098288:
                        b = !str.equals("compareAndSet") ? (byte) -1 : (byte) 2;
                        break;
                    case -1292078254:
                        b = !str.equals("compareAndExchangeRelease") ? (byte) -1 : (byte) 3;
                        break;
                    case -1117944904:
                        b = !str.equals("weakCompareAndSet") ? (byte) -1 : (byte) 4;
                        break;
                    case -1103072857:
                        b = !str.equals("getAndAddRelease") ? (byte) -1 : (byte) 5;
                        break;
                    case -1032914329:
                        if (!str.equals("getAndBitwiseAnd")) {
                            b = -1;
                        }
                        break;
                    case -1032892181:
                        b = !str.equals("getAndBitwiseXor") ? (byte) -1 : (byte) 7;
                        break;
                    case -794517348:
                        b = !str.equals("getAndBitwiseXorRelease") ? (byte) -1 : (byte) 8;
                        break;
                    case -567150350:
                        b = !str.equals("weakCompareAndSetPlain") ? (byte) -1 : (byte) 9;
                        break;
                    case -240822786:
                        b = !str.equals("weakCompareAndSetAcquire") ? (byte) -1 : (byte) 10;
                        break;
                    case -230706875:
                        b = !str.equals("setRelease") ? (byte) -1 : (byte) 11;
                        break;
                    case -127361888:
                        b = !str.equals("getAcquire") ? (byte) -1 : (byte) 12;
                        break;
                    case -37641530:
                        b = !str.equals("getAndSetRelease") ? (byte) -1 : ek.k;
                        break;
                    case 102230:
                        b = !str.equals("get") ? (byte) -1 : ek.l;
                        break;
                    case 113762:
                        b = !str.equals("set") ? (byte) -1 : ek.m;
                        break;
                    case 93645315:
                        b = !str.equals("getAndBitwiseOrAcquire") ? (byte) -1 : (byte) 16;
                        break;
                    case 101293086:
                        b = !str.equals("setVolatile") ? (byte) -1 : (byte) 17;
                        break;
                    case 189872914:
                        b = !str.equals("getVolatile") ? (byte) -1 : (byte) 18;
                        break;
                    case 282707520:
                        b = !str.equals("getAndAdd") ? (byte) -1 : (byte) 19;
                        break;
                    case 282724865:
                        b = !str.equals("getAndSet") ? (byte) -1 : (byte) 20;
                        break;
                    case 353422447:
                        b = !str.equals("getAndBitwiseAndAcquire") ? (byte) -1 : (byte) 21;
                        break;
                    case 470702883:
                        b = !str.equals("setOpaque") ? (byte) -1 : (byte) 22;
                        break;
                    case 685319959:
                        b = !str.equals("getOpaque") ? (byte) -1 : (byte) 23;
                        break;
                    case 748071969:
                        b = !str.equals("compareAndExchangeAcquire") ? (byte) -1 : (byte) 24;
                        break;
                    case 937077366:
                        b = !str.equals("getAndAddAcquire") ? (byte) -1 : (byte) 25;
                        break;
                    case 1245632875:
                        b = !str.equals("getAndBitwiseXorAcquire") ? (byte) -1 : (byte) 26;
                        break;
                    case 1352153939:
                        b = !str.equals("getAndBitwiseOr") ? (byte) -1 : (byte) 27;
                        break;
                    case 1483964149:
                        b = !str.equals("compareAndExchange") ? (byte) -1 : (byte) 28;
                        break;
                    case 2002508693:
                        b = !str.equals("getAndSetAcquire") ? (byte) -1 : (byte) 29;
                        break;
                    case 2013994287:
                        b = !str.equals("weakCompareAndSetRelease") ? (byte) -1 : (byte) 30;
                        break;
                    default:
                        b = -1;
                        break;
                }
                switch (b) {
                    case 0:
                    case 1:
                    case 3:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case Opcodes.FCONST_1 /* 12 */:
                    case 13:
                    case Opcodes.DCONST_0 /* 14 */:
                    case 16:
                    case Opcodes.LDC /* 18 */:
                    case 19:
                    case 20:
                    case Opcodes.ILOAD /* 21 */:
                    case Opcodes.FLOAD /* 23 */:
                    case Opcodes.DLOAD /* 24 */:
                    case Opcodes.ALOAD /* 25 */:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                        c3154Ujhhgtgfeyxiexzf2 = new C3154Ujhhgtgfeyxiexzf(c3057Ujhhgtgfeyxiexzf, new C3155Ujhhgtgfeyxiexzf(c3056Ujhhgtgfeyxiexzf, c3056Ujhhgtgfeyxiexzf2));
                        break;
                    case 2:
                    case 4:
                    case 9:
                    case 10:
                    case 30:
                        c3154Ujhhgtgfeyxiexzf2 = new C3154Ujhhgtgfeyxiexzf(c3057Ujhhgtgfeyxiexzf, new C3155Ujhhgtgfeyxiexzf(c3056Ujhhgtgfeyxiexzf, f2828Ujhhgtgfeyxiexzf));
                        break;
                    case 11:
                    case 15:
                    case Opcodes.SIPUSH /* 17 */:
                    case Opcodes.LLOAD /* 22 */:
                        c3154Ujhhgtgfeyxiexzf2 = new C3154Ujhhgtgfeyxiexzf(c3057Ujhhgtgfeyxiexzf, new C3155Ujhhgtgfeyxiexzf(c3056Ujhhgtgfeyxiexzf, f2827Ujhhgtgfeyxiexzf));
                        break;
                }
            }
            throw new IllegalArgumentException("Unknown signature polymorphic method: " + c3154Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf());
        }
        c3154Ujhhgtgfeyxiexzf2 = new C3154Ujhhgtgfeyxiexzf(c3057Ujhhgtgfeyxiexzf, new C3155Ujhhgtgfeyxiexzf(c3056Ujhhgtgfeyxiexzf, c3056Ujhhgtgfeyxiexzf2));
        this.f2831Ujhhgtgfeyxiexzf = c3154Ujhhgtgfeyxiexzf2;
        this.f2832Ujhhgtgfeyxiexzf = new C3156Ujhhgtgfeyxiexzf(c3154Ujhhgtgfeyxiexzf.f11831Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC0671Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo1936Ujhhgtgfeyxiexzf(InterfaceC0690Ujhhgtgfeyxiexzf interfaceC0690Ujhhgtgfeyxiexzf) {
        interfaceC0690Ujhhgtgfeyxiexzf.mo1711Ujhhgtgfeyxiexzf(this);
    }

    @Override // p000.AbstractC0671Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final InterfaceC1790feyxiexzfUjhhgtg mo1937Ujhhgtgfeyxiexzf() {
        return this.f2829Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0671Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final String mo1938Ujhhgtgfeyxiexzf() {
        return this.f2831Ujhhgtgfeyxiexzf.toString() + " " + this.f2832Ujhhgtgfeyxiexzf.toString() + " " + C2060Ujhhgtgfeyxiexzf.m3354Ujhhgtgfeyxiexzf(this.f2829Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC0671Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public final AbstractC0671Ujhhgtgfeyxiexzf mo1939Ujhhgtgfeyxiexzf(C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg) {
        return new C0692Ujhhgtgfeyxiexzf(this.f2786Ujhhgtgfeyxiexzf, this.f2787Ujhhgtgfeyxiexzf, this.f2789Ujhhgtgfeyxiexzf, this.f2829Ujhhgtgfeyxiexzf.mo2447Ujhhgtgfeyxiexzf(c1784feyxiexzfUjhhgtg), this.f2830Ujhhgtgfeyxiexzf);
    }
}
