package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.ek;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1674 extends AbstractC1649 {

    public static final C0917 f5651 = new C0917("([Ljava/lang/Object;)Ljava/lang/Object;");

    public static final C0917 f5652 = new C0917("([Ljava/lang/Object;)V");

    public static final C0917 f5653 = new C0917("([Ljava/lang/Object;)Z");

    public final InterfaceC3454 f5654;

    public final C0913 f5655;

    public final C0913 f5656;

    public final C0915 f5657;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C1674(C2590 c2590, C2788 c2788, C2526 c2526, InterfaceC3454 interfaceC3454, C0913 c0913) {
        C0913 c0914;
        super(c2590, c2788, null, c2526);
        int i = c2590.f8208;
        byte b = 6;
        if (i != 6) {
            throw new IllegalArgumentException(AbstractC1194.m2779(i, "opcode with invalid branchingness: "));
        }
        if (interfaceC3454 == null) {
            throw new NullPointerException("catches == null");
        }
        this.f5654 = interfaceC3454;
        if (c0913 == null) {
            throw new NullPointerException("callSiteMethod == null");
        }
        if (!c0913.m2410()) {
            throw new IllegalArgumentException("callSiteMethod is not signature polymorphic");
        }
        this.f5655 = c0913;
        C0918 c0918 = c0913.f3368;
        C0917 c0917 = c0913.f3369.f3374;
        String str = c0917.f3378;
        boolean zEquals = c0918.equals(C0918.f3399);
        C0917 c0919 = f5651;
        if (!zEquals || (!str.equals("invoke") && !str.equals("invokeExact"))) {
            if (c0918.equals(C0918.f3400)) {
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
                        b = !str.equals("getAndSetRelease") ? (byte) -1 : 13;
                        break;
                    case 102230:
                        b = !str.equals("get") ? (byte) -1 : 14;
                        break;
                    case 113762:
                        b = !str.equals("set") ? (byte) -1 : 15;
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
                    case 12 /* 12 */:
                    case 13:
                    case 14 /* 14 */:
                    case 16:
                    case 18 /* 18 */:
                    case 19:
                    case 20:
                    case 21 /* 21 */:
                    case 23 /* 23 */:
                    case 24 /* 24 */:
                    case 25 /* 25 */:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                        c0914 = new C0913(c0918, new C0914(c0917, c0919));
                        break;
                    case 2:
                    case 4:
                    case 9:
                    case 10:
                    case 30:
                        c0914 = new C0913(c0918, new C0914(c0917, f5653));
                        break;
                    case 11:
                    case 15:
                    case 17 /* 17 */:
                    case 22 /* 22 */:
                        c0914 = new C0913(c0918, new C0914(c0917, f5652));
                        break;
                }
            }
            throw new IllegalArgumentException("Unknown signature polymorphic method: " + c0913.mo1214());
        }
        c0914 = new C0913(c0918, new C0914(c0917, c0919));
        this.f5656 = c0914;
        this.f5657 = new C0915(c0913.f3330);
    }

    @Override // p000.AbstractC1649
    public final void mo3046(InterfaceC1648 interfaceC1648) {
        interfaceC1648.mo1584(this);
    }

    @Override // p000.AbstractC1649
    public final InterfaceC3454 mo3047() {
        return this.f5654;
    }

    @Override // p000.AbstractC1649
    public final String mo2413() {
        return this.f5656.toString() + " " + this.f5657.toString() + " " + C2868.m4866(this.f5654);
    }

    @Override // p000.AbstractC1649
    public final AbstractC1649 mo3048(C3448 c3448) {
        return new C1674(this.f5588, this.f5589, this.f5591, this.f5654.mo1262(c3448), this.f5655);
    }
}
