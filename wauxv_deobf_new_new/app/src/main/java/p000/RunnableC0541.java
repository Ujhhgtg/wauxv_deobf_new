package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.C0000;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤝᲀᤞᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0541 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2257;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f2258;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC0541(InterfaceC1422 interfaceC1422) {
        this.f2257 = 7;
        this.f2258 = (AbstractC1778) interfaceC1422;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲀᛸᤞᲁᲇ, ᛱᛲᛳᛴᛵᛶᛷᤞᲀᤝᲈᲁᛸᲇ] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2257) {
            case 0:
                ((CarouselLayoutManager) this.f2258).m4501();
                return;
            case 1:
                ((C0722) this.f2258).m2247(true);
                return;
            case 2:
                C1124 c1124 = (C1124) this.f2258;
                boolean zIsPopupShowing = c1124.f4179.isPopupShowing();
                c1124.m2841(zIsPopupShowing);
                c1124.f4184 = zIsPopupShowing;
                return;
            case 3:
                C1381 c1381 = (C1381) this.f2258;
                synchronized (c1381.f4977) {
                    try {
                        if (c1381.f4981 == null) {
                            return;
                        }
                        try {
                            C1391 c1391M3202 = c1381.m3202();
                            int i = c1391M3202.f5012;
                            if (i == 2) {
                                synchronized (c1381.f4977) {
                                }
                            }
                            if (i != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                            }
                            try {
                                Method method = AbstractC3480.f10955;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                C1224 c1224 = c1381.f4976;
                                Context context = c1381.f4974;
                                c1224.getClass();
                                C1391[] c1391Arr = {c1391M3202};
                                AbstractC1586 abstractC1586 = AbstractC3516.f11089;
                                AbstractC1468.m3299("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface typefaceMo3492 = AbstractC3516.f11089.mo3492(context, c1391Arr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferM4178 = AbstractC2234.m4178(c1381.f4974, c1391M3202.f5007);
                                    if (mappedByteBufferM4178 == null || typefaceMo3492 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        C2136 c2136 = new C2136(typefaceMo3492, C1787.m3675(mappedByteBufferM4178));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (c1381.f4977) {
                                            try {
                                                AbstractC2240 abstractC2240 = c1381.f4981;
                                                if (abstractC2240 != null) {
                                                    abstractC2240.mo2879(c2136);
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                            break;
                                        }
                                        c1381.m3201();
                                        return;
                                    } catch (Throwable th2) {
                                        Method method2 = AbstractC3480.f10955;
                                        Trace.endSection();
                                        throw th2;
                                    }
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            } catch (Throwable th4) {
                                Method method3 = AbstractC3480.f10955;
                                Trace.endSection();
                                throw th4;
                            }
                            break;
                        } catch (Throwable th5) {
                            synchronized (c1381.f4977) {
                                try {
                                    AbstractC2240 abstractC2241 = c1381.f4981;
                                    if (abstractC2241 != null) {
                                        abstractC2241.mo2878(th5);
                                    }
                                    c1381.m3201();
                                    return;
                                } catch (Throwable th6) {
                                    throw th6;
                                }
                            }
                        }
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
            case 4:
                C2460 c2460 = (C2460) this.f2258;
                C0000 c0000 = c2460.f7833;
                if (c2460.f7829 == 0) {
                    c2460.f7830 = true;
                    c0000.m100(EnumC1792.ON_PAUSE);
                }
                if (c2460.f7828 == 0 && c2460.f7830) {
                    c0000.m100(EnumC1792.ON_STOP);
                    c2460.f7831 = true;
                    return;
                }
                return;
            case 5:
                ((AbstractC2524) this.f2258).mo862();
                return;
            case 6:
                C0337 c0337 = (C0337) this.f2258;
                c0337.f1654 = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) c0337.f1656;
                C3639 c3639 = sideSheetBehavior.f831;
                if (c3639 != null && c3639.m5191()) {
                    c0337.m1579(c0337.f1653);
                    return;
                } else {
                    if (sideSheetBehavior.f830 == 2) {
                        sideSheetBehavior.m831(c0337.f1653);
                        return;
                    }
                    return;
                }
            case 7:
                ((AbstractC1778) this.f2258).invoke();
                return;
            case 8:
                ((TextInputLayout) this.f2258).f855.requestLayout();
                return;
            case 9:
                ((C0112) this.f2258).invoke();
                return;
            default:
                View view = (View) this.f2258;
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                return;
        }
    }

    public /* synthetic */ RunnableC0541(Object obj, int i) {
        this.f2257 = i;
        this.f2258 = obj;
    }
}
