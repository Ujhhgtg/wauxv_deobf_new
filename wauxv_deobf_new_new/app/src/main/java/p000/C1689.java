package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.ek;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲇᛸᲁᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1689 extends AbstractC1663 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final C0916 f5678 = new C0916("([Ljava/lang/Object;)Ljava/lang/Object;");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final C0916 f5679 = new C0916("([Ljava/lang/Object;)V");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final C0916 f5680 = new C0916("([Ljava/lang/Object;)Z");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final InterfaceC3510 f5681;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C0912 f5682;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C0912 f5683;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C0914 f5684;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C1689(C2648 c2648, C2848 c2848, C2582 c2582, InterfaceC3510 interfaceC3510, C0912 c0912) {
        C0912 c0913;
        super(c2648, c2848, null, c2582);
        int i = c2648.f8360;
        byte b = 6;
        if (i != 6) {
            throw new IllegalArgumentException(AbstractC1095.m2794(i, "opcode with invalid branchingness: "));
        }
        if (interfaceC3510 == null) {
            throw new NullPointerException("catches == null");
        }
        this.f5681 = interfaceC3510;
        if (c0912 == null) {
            throw new NullPointerException("callSiteMethod == null");
        }
        if (!c0912.m2527()) {
            throw new IllegalArgumentException("callSiteMethod is not signature polymorphic");
        }
        this.f5682 = c0912;
        C0917 c0917 = c0912.f3375;
        C0916 c0916 = c0912.f3376.f3381;
        String str = c0916.f3385;
        boolean zEquals = c0917.equals(C0917.f3406);
        C0916 c0918 = f5678;
        if (!zEquals || (!str.equals("invoke") && !str.equals("invokeExact"))) {
            if (c0917.equals(C0917.f3407)) {
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
                        c0913 = new C0912(c0917, new C0913(c0916, c0918));
                        break;
                    case 2:
                    case 4:
                    case 9:
                    case 10:
                    case 30:
                        c0913 = new C0912(c0917, new C0913(c0916, f5680));
                        break;
                    case 11:
                    case 15:
                    case Opcodes.SIPUSH /* 17 */:
                    case Opcodes.LLOAD /* 22 */:
                        c0913 = new C0912(c0917, new C0913(c0916, f5679));
                        break;
                }
            }
            throw new IllegalArgumentException("Unknown signature polymorphic method: " + c0912.mo1360());
        }
        c0913 = new C0912(c0917, new C0913(c0916, c0918));
        this.f5683 = c0913;
        this.f5684 = new C0914(c0912.f3337);
    }

    @Override // p000.AbstractC1663
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo3149(InterfaceC1662 interfaceC1662) {
        interfaceC1662.mo1690(this);
    }

    @Override // p000.AbstractC1663
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final InterfaceC3510 mo3150() {
        return this.f5681;
    }

    @Override // p000.AbstractC1663
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final String mo2530() {
        return this.f5683.toString() + " " + this.f5684.toString() + " " + C2928.m4927(this.f5681);
    }

    @Override // p000.AbstractC1663
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final AbstractC1663 mo3151(C3505 c3505) {
        return new C1689(this.f5623, this.f5624, this.f5626, this.f5681.mo1408(c3505), this.f5682);
    }
}
