package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.umeng.analytics.pro.ek;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0891 extends AbstractC0911 {

    public final C2440 f3330;

    public C2440 f3331;

    public AbstractC0891(C0918 c0918, C0914 c0914) {
        super(c0918, c0914);
        String str = c0914.f3375.f3378;
        if (m2410()) {
            this.f3330 = C2440.m4419(str);
        } else {
            this.f3330 = C2440.m4420(str);
        }
        this.f3331 = null;
    }

    @Override // p000.InterfaceC3450
    public final C3448 getType() {
        return this.f3330.f7755;
    }

    @Override // p000.AbstractC0911, p000.AbstractC0777
    public final int mo2267(AbstractC0777 abstractC0777) {
        int iMo2267 = super.mo2267(abstractC0777);
        return iMo2267 != 0 ? iMo2267 : this.f3330.compareTo(((AbstractC0891) abstractC0777).f3330);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean m2410() {
        C0918 c0918 = C0918.f3399;
        C0918 c0919 = this.f3368;
        boolean zEquals = c0919.equals(c0918);
        C0914 c0914 = this.f3369;
        if (zEquals) {
            String str = c0914.f3374.f3378;
            
            if (str.equals("invoke") || str.equals("invokeExact")) {
                return true;
            }
        } else if (c0919.equals(C0918.f3400)) {
            String str2 = c0914.f3374.f3378;
            
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
                        b = 13;
                    }
                    break;
                case 102230:
                    if (str2.equals("get")) {
                        b = 14;
                    }
                    break;
                case 113762:
                    if (str2.equals("set")) {
                        b = 15;
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
                case 12 /* 12 */:
                case 13:
                case 14 /* 14 */:
                case 15:
                case 16:
                case 17 /* 17 */:
                case 18 /* 18 */:
                case 19:
                case 20:
                case 21 /* 21 */:
                case 22 /* 22 */:
                case 23 /* 23 */:
                case 24 /* 24 */:
                case 25 /* 25 */:
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
