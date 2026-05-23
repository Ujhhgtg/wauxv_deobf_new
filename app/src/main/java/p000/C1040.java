package p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᤞᲁᲇᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1040 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Context f3786;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final InterfaceC1041 f3787;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public VelocityTracker f3788;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public float f3789;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f3790 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public int f3791 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f3792 = -1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int[] f3793 = {Integer.MAX_VALUE, 0};

    public C1040(Context context, InterfaceC1041 interfaceC1041) {
        this.f3786 = context;
        this.f3787 = interfaceC1041;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:81:0x0160  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m2606(MotionEvent motionEvent, int i) {
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
        int i4 = this.f3791;
        int[] iArr = this.f3793;
        if (i4 == source && this.f3792 == deviceId && this.f3790 == i) {
            z = false;
            i2 = 1;
            i3 = 0;
        } else {
            Context context = this.f3786;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            i2 = 1;
            int i5 = Build.VERSION.SDK_INT;
            i3 = 0;
            if (i5 >= 34) {
                scaledMinimumFlingVelocity = AbstractC0088.m1074(viewConfiguration, deviceId2, i, source2);
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
                scaledMaximumFlingVelocity = AbstractC0088.m1073(viewConfiguration, deviceId3, i, source3);
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
            this.f3791 = source;
            this.f3792 = deviceId;
            this.f3790 = i;
            z = true;
        }
        if (iArr[i3] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f3788;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f3788 = null;
                return;
            }
            return;
        }
        if (this.f3788 == null) {
            this.f3788 = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = this.f3788;
        Map map = AbstractC3544.f11131;
        velocityTracker2.addMovement(motionEvent);
        float f3 = 0.0f;
        int i6 = 20;
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = AbstractC3544.f11131;
            if (!map2.containsKey(velocityTracker2)) {
                map2.put(velocityTracker2, new C3545());
            }
            C3545 c3545 = (C3545) map2.get(velocityTracker2);
            long[] jArr = c3545.f11133;
            long eventTime = motionEvent.getEventTime();
            if (c3545.f11135 != 0 && eventTime - jArr[c3545.f11136] > 40) {
                c3545.f11135 = i3;
                c3545.f11134 = 0.0f;
            }
            int i7 = (c3545.f11136 + 1) % 20;
            c3545.f11136 = i7;
            int i8 = c3545.f11135;
            if (i8 != 20) {
                c3545.f11135 = i8 + 1;
            }
            c3545.f11132[i7] = motionEvent.getAxisValue(26);
            jArr[c3545.f11136] = eventTime;
        }
        velocityTracker2.computeCurrentVelocity(1000, Float.MAX_VALUE);
        C3545 c3546 = (C3545) AbstractC3544.f11131.get(velocityTracker2);
        if (c3546 != null) {
            float[] fArr = c3546.f11132;
            long[] jArr2 = c3546.f11133;
            int i9 = c3546.f11135;
            if (i9 < 2) {
                fSqrt = 0.0f;
                f = 0.0f;
            } else {
                int i10 = c3546.f11136;
                int i11 = ((i10 + 20) - (i9 - 1)) % 20;
                long j2 = jArr2[i10];
                while (true) {
                    j = jArr2[i11];
                    if (j2 - j <= 100) {
                        break;
                    }
                    c3546.f11135--;
                    i11 = (i11 + 1) % 20;
                }
                int i12 = c3546.f11135;
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
                        if (i14 >= c3546.f11135 - 1) {
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
            c3546.f11134 = f5;
            if (f5 < (-Math.abs((float) r4))) {
                c3546.f11134 = -Math.abs(Float.MAX_VALUE);
            } else if (c3546.f11134 > Math.abs((float) r4)) {
                c3546.f11134 = Math.abs((float) r4);
            }
        } else {
            f = 0.0f;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            yVelocity = AbstractC0088.m1070(velocityTracker2, i);
        } else if (i == 0) {
            yVelocity = velocityTracker2.getXVelocity();
        } else if (i == 1) {
            yVelocity = velocityTracker2.getYVelocity();
        } else {
            C3545 c3547 = (C3545) AbstractC3544.f11131.get(velocityTracker2);
            yVelocity = (c3547 == null || i != 26) ? f : c3547.f11134;
        }
        InterfaceC1041 interfaceC1041 = this.f3787;
        float fMo2608 = interfaceC1041.mo2608() * yVelocity;
        float fSignum = Math.signum(fMo2608);
        if (z || (fSignum != Math.signum(this.f3789) && fSignum != f)) {
            interfaceC1041.mo2609();
        }
        if (Math.abs(fMo2608) < iArr[0]) {
            return;
        }
        int i18 = iArr[1];
        float fMax = Math.max(-i18, Math.min(fMo2608, i18));
        this.f3789 = interfaceC1041.mo2607(fMax) ? fMax : f;
    }
}
