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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤞᲁᤝᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0563 implements Runnable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2294;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f2295;

    public /* synthetic */ RunnableC0563(int i, Object obj) {
        this.f2294 = i;
        this.f2295 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [ᛱᛲᛳᛴᛵᛶᛷᤝᲈᤞᲇᲁᲀᛸ, ᛱᛲᛳᛴᛵᛶᛷᤞᲀᤝᛸᲈᲇᲁ] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2294) {
            case 0:
                ((CarouselLayoutManager) this.f2295).m4480();
                return;
            case 1:
                ((C0727) this.f2295).m2155(true);
                return;
            case 2:
                C1118 c1118 = (C1118) this.f2295;
                boolean zIsPopupShowing = c1118.f4168.isPopupShowing();
                c1118.m2692(zIsPopupShowing);
                c1118.f4173 = zIsPopupShowing;
                return;
            case 3:
                C1373 c1373 = (C1373) this.f2295;
                synchronized (c1373.f4948) {
                    try {
                        if (c1373.f4952 == null) {
                            return;
                        }
                        try {
                            C1383 c1383M3094 = c1373.m3094();
                            int i = c1383M3094.f4983;
                            if (i == 2) {
                                synchronized (c1373.f4948) {
                                }
                            }
                            if (i != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                            }
                            try {
                                Method method = AbstractC3422.f10794;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                C1227 c1227 = c1373.f4947;
                                Context context = c1373.f4945;
                                
                                C1383[] c1383Arr = {c1383M3094};
                                AbstractC1459 abstractC1459 = AbstractC3460.f10933;
                                AbstractC0743.m2172("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface typefaceMo3201 = AbstractC3460.f10933.mo3201(context, c1383Arr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferM3218 = AbstractC1460.m3218(c1373.f4945, c1383M3094.f4978);
                                    if (mappedByteBufferM3218 == null || typefaceMo3201 == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        C2103 c2103 = new C2103(typefaceMo3201, AbstractC1458.m3167(mappedByteBufferM3218));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (c1373.f4948) {
                                            try {
                                                AbstractC1458 abstractC1458 = c1373.f4952;
                                                if (abstractC1458 != null) {
                                                    abstractC1458.mo2735(c2103);
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                            break;
                                        }
                                        c1373.m3093();
                                        return;
                                    } catch (Throwable th2) {
                                        Method method2 = AbstractC3422.f10794;
                                        Trace.endSection();
                                        throw th2;
                                    }
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            } catch (Throwable th4) {
                                Method method3 = AbstractC3422.f10794;
                                Trace.endSection();
                                throw th4;
                            }
                            break;
                        } catch (Throwable th5) {
                            synchronized (c1373.f4948) {
                                try {
                                    AbstractC1458 abstractC14510 = c1373.f4952;
                                    if (abstractC14510 != null) {
                                        abstractC14510.mo2734(th5);
                                    }
                                    c1373.m3093();
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
                C2407 c2407 = (C2407) this.f2295;
                C0000 c0000 = c2407.f7689;
                if (c2407.f7685 == 0) {
                    c2407.f7686 = true;
                    c0000.m100(EnumC1769.ON_PAUSE);
                }
                if (c2407.f7684 == 0 && c2407.f7686) {
                    c0000.m100(EnumC1769.ON_STOP);
                    c2407.f7687 = true;
                    return;
                }
                return;
            case 5:
                ((AbstractC2471) this.f2295).mo718();
                return;
            case 6:
                C0362 c0362 = (C0362) this.f2295;
                c0362.f1683 = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) c0362.f1685;
                C3579 c3579 = sideSheetBehavior.f765;
                if (c3579 != null && c3579.m5185()) {
                    c0362.m1474(c0362.f1682);
                    return;
                } else {
                    if (sideSheetBehavior.f764 == 2) {
                        sideSheetBehavior.m687(c0362.f1682);
                        return;
                    }
                    return;
                }
            case 7:
                ((AbstractC1756) this.f2295).invoke();
                return;
            case 8:
                ((TextInputLayout) this.f2295).f789.requestLayout();
                return;
            case 9:
                ((C0104) this.f2295).invoke();
                return;
            default:
                View view = (View) this.f2295;
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC0563(InterfaceC1414 interfaceC1414) {
        this.f2294 = 7;
        this.f2295 = (AbstractC1756) interfaceC1414;
    }
}
