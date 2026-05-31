package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.ComponentCallbacks2C0027;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲁᲀᤞᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1461 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C2866 f5176;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Handler f5177;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final ArrayList f5178;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final ComponentCallbacks2C2619 f5179;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final InterfaceC0399 f5180;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean f5181;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public boolean f5182;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public C2612 f5183;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C1458 f5184;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public boolean f5185;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public C1458 f5186;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public Bitmap f5187;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public C1458 f5188;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public int f5189;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public int f5190;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public int f5191;

    public C1461(ComponentCallbacks2C0027 componentCallbacks2C0027, C2866 c2866, int i, int i2, Bitmap bitmap) {
        InterfaceC0399 interfaceC0399 = componentCallbacks2C0027.f589;
        C1472 c1472 = componentCallbacks2C0027.f591;
        Context baseContext = c1472.getBaseContext();
        AbstractC2727.m4693(baseContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        ComponentCallbacks2C2619 componentCallbacks2C2619M4602 = ComponentCallbacks2C0027.m757(baseContext).f593.m4602(baseContext);
        Context baseContext2 = c1472.getBaseContext();
        AbstractC2727.m4693(baseContext2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        ComponentCallbacks2C2619 componentCallbacks2C2619M4603 = ComponentCallbacks2C0027.m757(baseContext2).f593.m4602(baseContext2);
        componentCallbacks2C2619M4603.getClass();
        C2612 c2612M4591 = new C2612(componentCallbacks2C2619M4603.f8286, componentCallbacks2C2619M4603, Bitmap.class, componentCallbacks2C2619M4603.f8287).mo1632(ComponentCallbacks2C2619.f8285).mo1632(((C2621) ((C2621) ((C2621) new C2621().m1635(C1068.f3859)).m1646()).m1643()).m1638(i, i2));
        this.f5178 = new ArrayList();
        this.f5179 = componentCallbacks2C2619M4602;
        Handler handler = new Handler(Looper.getMainLooper(), new C1460(this, 0));
        this.f5180 = interfaceC0399;
        this.f5177 = handler;
        this.f5183 = c2612M4591;
        this.f5176 = c2866;
        m3254(C3557.f11154, bitmap);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3252() {
        int i;
        int i2;
        if (!this.f5181 || this.f5182) {
            return;
        }
        C1458 c1458 = this.f5188;
        if (c1458 != null) {
            this.f5188 = null;
            m3253(c1458);
            return;
        }
        this.f5182 = true;
        C2866 c2866 = this.f5176;
        C1462 c1462 = c2866.f9131;
        int i3 = c1462.f5194;
        if (i3 <= 0 || (i2 = c2866.f9130) < 0) {
            i = 0;
        } else {
            i = (i2 < 0 || i2 >= i3) ? -1 : ((C1457) c1462.f5196.get(i2)).f5164;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) i);
        int i4 = (c2866.f9130 + 1) % c2866.f9131.f5194;
        c2866.f9130 = i4;
        this.f5186 = new C1458(this.f5177, i4, jUptimeMillis);
        C2612 c2612M4595 = this.f5183.mo1632((C2621) new C2621().m1642(new C2275(Double.valueOf(Math.random())))).m4595(c2866);
        c2612M4595.m4594(this.f5186, c2612M4595);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m3253(C1458 c1458) {
        this.f5182 = false;
        boolean z = this.f5185;
        Handler handler = this.f5177;
        if (z) {
            handler.obtainMessage(2, c1458).sendToTarget();
            return;
        }
        if (!this.f5181) {
            this.f5188 = c1458;
            return;
        }
        if (c1458.f5173 != null) {
            Bitmap bitmap = this.f5187;
            if (bitmap != null) {
                this.f5180.mo1609(bitmap);
                this.f5187 = null;
            }
            C1458 c1459 = this.f5184;
            this.f5184 = c1458;
            ArrayList arrayList = this.f5178;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C1454 c1454 = (C1454) ((InterfaceC1459) arrayList.get(size));
                Object callback = c1454.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    c1454.stop();
                    c1454.invalidateSelf();
                } else {
                    c1454.invalidateSelf();
                    C1461 c1461 = (C1461) c1454.f5143.f1247;
                    C1458 c14510 = c1461.f5184;
                    if ((c14510 != null ? c14510.f5171 : -1) == c1461.f5176.f9131.f5194 - 1) {
                        c1454.f5148++;
                    }
                    int i = c1454.f5149;
                    if (i != -1 && c1454.f5148 >= i) {
                        c1454.stop();
                    }
                }
            }
            if (c1459 != null) {
                handler.obtainMessage(2, c1459).sendToTarget();
            }
        }
        m3252();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m3254(InterfaceC3484 interfaceC3484, Bitmap bitmap) {
        AbstractC2727.m4693(interfaceC3484, "Argument must not be null");
        AbstractC2727.m4693(bitmap, "Argument must not be null");
        this.f5187 = bitmap;
        this.f5183 = this.f5183.mo1632(new C2621().m1644(interfaceC3484, true));
        this.f5189 = AbstractC3580.m5118(bitmap);
        this.f5190 = bitmap.getWidth();
        this.f5191 = bitmap.getHeight();
    }
}
