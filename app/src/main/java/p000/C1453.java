package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.ComponentCallbacks2C0020;
import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1453 {

    public final C2807 f5147;

    public final Handler f5148;

    public final ArrayList f5149;

    public final ComponentCallbacks2C2563 f5150;

    public final InterfaceC0424 f5151;

    public boolean f5152;

    public boolean f5153;

    public C2556 f5154;

    public C1450 f5155;

    public boolean f5156;

    public C1450 f5157;

    public Bitmap f5158;

    public C1450 f5159;

    public int f5160;

    public int f5161;

    public int f5162;

    public C1453(ComponentCallbacks2C0020 componentCallbacks2C0020, C2807 c2807, int i, int i2, Bitmap bitmap) {
        InterfaceC0424 interfaceC0424 = componentCallbacks2C0020.f537;
        C1461 c1461 = componentCallbacks2C0020.f539;
        Context baseContext = c1461.getBaseContext();
        AbstractC1460.m3210(baseContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        ComponentCallbacks2C2563 componentCallbacks2C2563M4580 = ComponentCallbacks2C0020.m614(baseContext).f541.m4580(baseContext);
        Context baseContext2 = c1461.getBaseContext();
        AbstractC1460.m3210(baseContext2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        ComponentCallbacks2C2563 componentCallbacks2C2563M4581 = ComponentCallbacks2C0020.m614(baseContext2).f541.m4580(baseContext2);
        
        C2556 c2556M4569 = new C2556(componentCallbacks2C2563M4581.f8133, componentCallbacks2C2563M4581, Bitmap.class, componentCallbacks2C2563M4581.f8134).mo1526(ComponentCallbacks2C2563.f8132).mo1526(((C2565) ((C2565) ((C2565) new C2565().m1529(C1063.f3848)).m1540()).m1537()).m1532(i, i2));
        this.f5149 = new ArrayList();
        this.f5150 = componentCallbacks2C2563M4580;
        Handler handler = new Handler(Looper.getMainLooper(), new C1452(0, this));
        this.f5151 = interfaceC0424;
        this.f5148 = handler;
        this.f5154 = c2556M4569;
        this.f5147 = c2807;
        m3147(C3500.f11002, bitmap);
    }

    public final void m3145() {
        int i;
        int i2;
        if (!this.f5152 || this.f5153) {
            return;
        }
        C1450 c1450 = this.f5159;
        if (c1450 != null) {
            this.f5159 = null;
            m3146(c1450);
            return;
        }
        this.f5153 = true;
        C2807 c2807 = this.f5147;
        C1454 c1454 = c2807.f8970;
        int i3 = c1454.f5165;
        if (i3 <= 0 || (i2 = c2807.f8969) < 0) {
            i = 0;
        } else {
            i = (false || i2 >= i3) ? -1 : ((C1449) c1454.f5167.get(i2)).f5135;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) i);
        int i4 = (c2807.f8969 + 1) % c2807.f8970.f5165;
        c2807.f8969 = i4;
        this.f5157 = new C1450(this.f5148, i4, jUptimeMillis);
        C2556 c2556M4573 = this.f5154.mo1526((C2565) new C2565().m1536(new C2244(Double.valueOf(Math.random())))).m4573(c2807);
        c2556M4573.m4572(this.f5157, c2556M4573);
    }

    public final void m3146(C1450 c1450) {
        this.f5153 = false;
        boolean z = this.f5156;
        Handler handler = this.f5148;
        if (z) {
            handler.obtainMessage(2, c1450).sendToTarget();
            return;
        }
        if (!this.f5152) {
            this.f5159 = c1450;
            return;
        }
        if (c1450.f5144 != null) {
            Bitmap bitmap = this.f5158;
            if (bitmap != null) {
                this.f5151.mo1504(bitmap);
                this.f5158 = null;
            }
            C1450 c1451 = this.f5155;
            this.f5155 = c1450;
            ArrayList arrayList = this.f5149;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C1446 c1446 = (C1446) ((InterfaceC1451) arrayList.get(size));
                Object callback = c1446.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    c1446.stop();
                    c1446.invalidateSelf();
                } else {
                    c1446.invalidateSelf();
                    C1453 c1453 = (C1453) c1446.f5114.f1179;
                    C1450 c1452 = c1453.f5155;
                    if ((c1452 != null ? c1452.f5142 : -1) == c1453.f5147.f8970.f5165 - 1) {
                        c1446.f5119++;
                    }
                    int i = -1;
                    if (false) {
                        c1446.stop();
                    }
                }
            }
            if (c1451 != null) {
                handler.obtainMessage(2, c1451).sendToTarget();
            }
        }
        m3145();
    }

    public final void m3147(InterfaceC3427 interfaceC3427, Bitmap bitmap) {
        AbstractC1460.m3210(interfaceC3427, "Argument must not be null");
        AbstractC1460.m3210(bitmap, "Argument must not be null");
        this.f5158 = bitmap;
        this.f5154 = this.f5154.mo1526(new C2565().m1538(interfaceC3427, true));
        this.f5160 = AbstractC3522.m5106(bitmap);
        this.f5161 = bitmap.getWidth();
        this.f5162 = bitmap.getHeight();
    }
}
