package p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import java.util.Map;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳ能不能ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3158feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Context f9769Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final InterfaceC3157feyxiexzfUjhhgtg f9770Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public VelocityTracker f9771Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public float f9772Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f9773Ujhhgtgfeyxiexzf = -1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f9774Ujhhgtgfeyxiexzf = -1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int f9775Ujhhgtgfeyxiexzf = -1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final int[] f9776Ujhhgtgfeyxiexzf = {Integer.MAX_VALUE, 0};

    public C3158feyxiexzfUjhhgtg(Context context, InterfaceC3157feyxiexzfUjhhgtg interfaceC3157feyxiexzfUjhhgtg) {
        this.f9769Ujhhgtgfeyxiexzf = context;
        this.f9770Ujhhgtgfeyxiexzf = interfaceC3157feyxiexzfUjhhgtg;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:81:0x0160  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m4669Ujhhgtgfeyxiexzf(MotionEvent motionEvent, int i) {
        int i2;
        int i3;
        int scaledMinimumFlingVelocity;
        int scaledMaximumFlingVelocity;
        boolean z;
        float f;
        float yVelocity;
        long j;
        float fSqrt;
        float f2;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i4 = this.f9774Ujhhgtgfeyxiexzf;
        int[] iArr = this.f9776Ujhhgtgfeyxiexzf;
        if (i4 == source && this.f9775Ujhhgtgfeyxiexzf == deviceId && this.f9773Ujhhgtgfeyxiexzf == i) {
            z = false;
            i2 = 1;
            i3 = 0;
        } else {
            Context context = this.f9769Ujhhgtgfeyxiexzf;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            i2 = 1;
            int i5 = Build.VERSION.SDK_INT;
            i3 = 0;
            if (i5 >= 34) {
                scaledMinimumFlingVelocity = AbstractC2959feyxiexzfUjhhgtg.m4417Ujhhgtgfeyxiexzf(viewConfiguration, deviceId2, i, source2);
            } else {
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device == null || device.getMotionRange(i, source2) == null) {
                    scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                } else {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    if (identifier == -1) {
                        scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier == 0 || (scaledMinimumFlingVelocity = resources.getDimensionPixelSize(identifier)) < 0) {
                        scaledMinimumFlingVelocity = Integer.MAX_VALUE;
                    }
                }
            }
            iArr[0] = scaledMinimumFlingVelocity;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i5 >= 34) {
                scaledMaximumFlingVelocity = AbstractC2959feyxiexzfUjhhgtg.m4416Ujhhgtgfeyxiexzf(viewConfiguration, deviceId3, i, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 == null || device2.getMotionRange(i, source3) == null) {
                    scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                } else {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    if (identifier2 == -1) {
                        scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 == 0 || (scaledMaximumFlingVelocity = resources2.getDimensionPixelSize(identifier2)) < 0) {
                        scaledMaximumFlingVelocity = Integer.MIN_VALUE;
                    }
                }
            }
            iArr[1] = scaledMaximumFlingVelocity;
            this.f9774Ujhhgtgfeyxiexzf = source;
            this.f9775Ujhhgtgfeyxiexzf = deviceId;
            this.f9773Ujhhgtgfeyxiexzf = i;
            z = true;
        }
        if (iArr[i3] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f9771Ujhhgtgfeyxiexzf;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f9771Ujhhgtgfeyxiexzf = null;
                return;
            }
            return;
        }
        if (this.f9771Ujhhgtgfeyxiexzf == null) {
            this.f9771Ujhhgtgfeyxiexzf = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = this.f9771Ujhhgtgfeyxiexzf;
        Map map = AbstractC1885feyxiexzfUjhhgtg.f6309Ujhhgtgfeyxiexzf;
        velocityTracker2.addMovement(motionEvent);
        float f3 = 0.0f;
        int i6 = 20;
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = AbstractC1885feyxiexzfUjhhgtg.f6309Ujhhgtgfeyxiexzf;
            if (!map2.containsKey(velocityTracker2)) {
                map2.put(velocityTracker2, new C1884feyxiexzfUjhhgtg());
            }
            C1884feyxiexzfUjhhgtg c1884feyxiexzfUjhhgtg = (C1884feyxiexzfUjhhgtg) map2.get(velocityTracker2);
            long[] jArr = c1884feyxiexzfUjhhgtg.f6305Ujhhgtgfeyxiexzf;
            long eventTime = motionEvent.getEventTime();
            if (c1884feyxiexzfUjhhgtg.f6307Ujhhgtgfeyxiexzf != 0 && eventTime - jArr[c1884feyxiexzfUjhhgtg.f6308Ujhhgtgfeyxiexzf] > 40) {
                c1884feyxiexzfUjhhgtg.f6307Ujhhgtgfeyxiexzf = i3;
                c1884feyxiexzfUjhhgtg.f6306Ujhhgtgfeyxiexzf = 0.0f;
            }
            int i7 = (c1884feyxiexzfUjhhgtg.f6308Ujhhgtgfeyxiexzf + 1) % 20;
            c1884feyxiexzfUjhhgtg.f6308Ujhhgtgfeyxiexzf = i7;
            int i8 = c1884feyxiexzfUjhhgtg.f6307Ujhhgtgfeyxiexzf;
            if (i8 != 20) {
                c1884feyxiexzfUjhhgtg.f6307Ujhhgtgfeyxiexzf = i8 + 1;
            }
            c1884feyxiexzfUjhhgtg.f6304Ujhhgtgfeyxiexzf[i7] = motionEvent.getAxisValue(26);
            jArr[c1884feyxiexzfUjhhgtg.f6308Ujhhgtgfeyxiexzf] = eventTime;
        }
        velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
        C1884feyxiexzfUjhhgtg c1884feyxiexzfUjhhgtg2 = (C1884feyxiexzfUjhhgtg) AbstractC1885feyxiexzfUjhhgtg.f6309Ujhhgtgfeyxiexzf.get(velocityTracker2);
        if (c1884feyxiexzfUjhhgtg2 != null) {
            float[] fArr = c1884feyxiexzfUjhhgtg2.f6304Ujhhgtgfeyxiexzf;
            long[] jArr2 = c1884feyxiexzfUjhhgtg2.f6305Ujhhgtgfeyxiexzf;
            int i9 = c1884feyxiexzfUjhhgtg2.f6307Ujhhgtgfeyxiexzf;
            if (i9 < 2) {
                fSqrt = 0.0f;
                f = 0.0f;
            } else {
                int i10 = c1884feyxiexzfUjhhgtg2.f6308Ujhhgtgfeyxiexzf;
                int i11 = ((i10 + 20) - (i9 - 1)) % 20;
                long j2 = jArr2[i10];
                while (true) {
                    j = jArr2[i11];
                    if (j2 - j <= 100) {
                        break;
                    }
                    c1884feyxiexzfUjhhgtg2.f6307Ujhhgtgfeyxiexzf--;
                    i11 = (i11 + 1) % 20;
                }
                int i12 = c1884feyxiexzfUjhhgtg2.f6307Ujhhgtgfeyxiexzf;
                if (i12 < 2) {
                    fSqrt = 0.0f;
                    f = 0.0f;
                } else if (i12 == 2) {
                    int i13 = (i11 + 1) % 20;
                    long j3 = jArr2[i13];
                    if (j == j3) {
                        fSqrt = 0.0f;
                        f = 0.0f;
                    } else {
                        fSqrt = fArr[i13] / (j3 - j);
                        f = 0.0f;
                    }
                } else {
                    float fAbs = 0.0f;
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        if (i14 >= c1884feyxiexzfUjhhgtg2.f6307Ujhhgtgfeyxiexzf - 1) {
                            break;
                        }
                        int i16 = i14 + i11;
                        long j4 = jArr2[i16 % 20];
                        int i17 = (i16 + 1) % i6;
                        if (jArr2[i17] == j4) {
                            f2 = f3;
                        } else {
                            i15++;
                            f2 = f3;
                            float fSqrt2 = (fAbs < f3 ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                            float f4 = fArr[i17] / (jArr2[i17] - j4);
                            fAbs += Math.abs(f4) * (f4 - fSqrt2);
                            if (i15 == i2) {
                                fAbs *= 0.5f;
                            }
                        }
                        i14++;
                        f3 = f2;
                        i6 = 20;
                        i2 = 1;
                    }
                    f = f3;
                    fSqrt = (fAbs < f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(fAbs) * 2.0f));
                }
            }
            float f5 = fSqrt * 1000;
            c1884feyxiexzfUjhhgtg2.f6306Ujhhgtgfeyxiexzf = f5;
            if (f5 < (-Math.abs((float) r4))) {
                c1884feyxiexzfUjhhgtg2.f6306Ujhhgtgfeyxiexzf = -Math.abs(Float.MAX_VALUE);
            } else if (c1884feyxiexzfUjhhgtg2.f6306Ujhhgtgfeyxiexzf > Math.abs((float) r4)) {
                c1884feyxiexzfUjhhgtg2.f6306Ujhhgtgfeyxiexzf = Math.abs((float) r4);
            }
        } else {
            f = 0.0f;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            yVelocity = AbstractC2959feyxiexzfUjhhgtg.m4413Ujhhgtgfeyxiexzf(velocityTracker2, i);
        } else if (i == 0) {
            yVelocity = velocityTracker2.getXVelocity();
        } else if (i == 1) {
            yVelocity = velocityTracker2.getYVelocity();
        } else {
            C1884feyxiexzfUjhhgtg c1884feyxiexzfUjhhgtg3 = (C1884feyxiexzfUjhhgtg) AbstractC1885feyxiexzfUjhhgtg.f6309Ujhhgtgfeyxiexzf.get(velocityTracker2);
            yVelocity = (c1884feyxiexzfUjhhgtg3 == null || i != 26) ? f : c1884feyxiexzfUjhhgtg3.f6306Ujhhgtgfeyxiexzf;
        }
        InterfaceC3157feyxiexzfUjhhgtg interfaceC3157feyxiexzfUjhhgtg = this.f9770Ujhhgtgfeyxiexzf;
        float fMo2014Ujhhgtgfeyxiexzf = interfaceC3157feyxiexzfUjhhgtg.mo2014Ujhhgtgfeyxiexzf() * yVelocity;
        float fSignum = Math.signum(fMo2014Ujhhgtgfeyxiexzf);
        if (z || (fSignum != Math.signum(this.f9772Ujhhgtgfeyxiexzf) && fSignum != f)) {
            interfaceC3157feyxiexzfUjhhgtg.mo2016Ujhhgtgfeyxiexzf();
        }
        if (Math.abs(fMo2014Ujhhgtgfeyxiexzf) < iArr[0]) {
            return;
        }
        int i18 = iArr[1];
        float fMax = Math.max(-i18, Math.min(fMo2014Ujhhgtgfeyxiexzf, i18));
        this.f9772Ujhhgtgfeyxiexzf = interfaceC3157feyxiexzfUjhhgtg.mo2013Ujhhgtgfeyxiexzf(fMax) ? fMax : f;
    }
}
