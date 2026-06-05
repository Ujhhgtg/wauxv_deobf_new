package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.Ujhhgtgfeyxiexzf;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳ要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2779feyxiexzfUjhhgtg implements Runnable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8786Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f8787Ujhhgtgfeyxiexzf;

    public /* synthetic */ RunnableC2779feyxiexzfUjhhgtg(int i, Object obj) {
        this.f8786Ujhhgtgfeyxiexzf = i;
        this.f8787Ujhhgtgfeyxiexzf = obj;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲ能不能ᛳ要点脸ᛴ, 上海高中ᛱ谢子非ᛱ要点脸ᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱ能不能ᛲᛳ] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8786Ujhhgtgfeyxiexzf) {
            case 0:
                ((CarouselLayoutManager) this.f8787Ujhhgtgfeyxiexzf).m2216feyxiexzfUjhhgtg();
                return;
            case 1:
                ((C2834feyxiexzfUjhhgtg) this.f8787Ujhhgtgfeyxiexzf).m4163Ujhhgtgfeyxiexzf(true);
                return;
            case 2:
                C3245feyxiexzfUjhhgtg c3245feyxiexzfUjhhgtg = (C3245feyxiexzfUjhhgtg) this.f8787Ujhhgtgfeyxiexzf;
                boolean zIsPopupShowing = c3245feyxiexzfUjhhgtg.f10173Ujhhgtgfeyxiexzf.isPopupShowing();
                c3245feyxiexzfUjhhgtg.m4745Ujhhgtgfeyxiexzf(zIsPopupShowing);
                c3245feyxiexzfUjhhgtg.f10178Ujhhgtgfeyxiexzf = zIsPopupShowing;
                return;
            case 3:
                C3625Ujhhgtgfeyxiexzf c3625Ujhhgtgfeyxiexzf = (C3625Ujhhgtgfeyxiexzf) this.f8787Ujhhgtgfeyxiexzf;
                synchronized (c3625Ujhhgtgfeyxiexzf.f11330Ujhhgtgfeyxiexzf) {
                    try {
                        if (c3625Ujhhgtgfeyxiexzf.f11334Ujhhgtgfeyxiexzf == null) {
                            return;
                        }
                        try {
                            C3635Ujhhgtgfeyxiexzf c3635UjhhgtgfeyxiexzfM5268Ujhhgtgfeyxiexzf = c3625Ujhhgtgfeyxiexzf.m5268Ujhhgtgfeyxiexzf();
                            int i = c3635UjhhgtgfeyxiexzfM5268Ujhhgtgfeyxiexzf.f11365Ujhhgtgfeyxiexzf;
                            if (i == 2) {
                                synchronized (c3625Ujhhgtgfeyxiexzf.f11330Ujhhgtgfeyxiexzf) {
                                }
                            }
                            if (i != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                            }
                            try {
                                Method method = AbstractC1761feyxiexzfUjhhgtg.f5923Ujhhgtgfeyxiexzf;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                C3339feyxiexzfUjhhgtg c3339feyxiexzfUjhhgtg = c3625Ujhhgtgfeyxiexzf.f11329Ujhhgtgfeyxiexzf;
                                Context context = c3625Ujhhgtgfeyxiexzf.f11327Ujhhgtgfeyxiexzf;
                                c3339feyxiexzfUjhhgtg.getClass();
                                C3635Ujhhgtgfeyxiexzf[] c3635UjhhgtgfeyxiexzfArr = {c3635UjhhgtgfeyxiexzfM5268Ujhhgtgfeyxiexzf};
                                AbstractC2855feyxiexzfUjhhgtg abstractC2855feyxiexzfUjhhgtg = AbstractC1771Ujhhgtgfeyxiexzf.f5944Ujhhgtgfeyxiexzf;
                                AbstractC1252feyxiexzfUjhhgtg.m2781Ujhhgtgfeyxiexzf("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface typefaceMo3105Ujhhgtgfeyxiexzf = AbstractC1771Ujhhgtgfeyxiexzf.f5944Ujhhgtgfeyxiexzf.mo3105Ujhhgtgfeyxiexzf(context, c3635UjhhgtgfeyxiexzfArr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferM4569Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.m4569Ujhhgtgfeyxiexzf(c3625Ujhhgtgfeyxiexzf.f11327Ujhhgtgfeyxiexzf, c3635UjhhgtgfeyxiexzfM5268Ujhhgtgfeyxiexzf.f11360Ujhhgtgfeyxiexzf);
                                    if (mappedByteBufferM4569Ujhhgtgfeyxiexzf == null || typefaceMo3105Ujhhgtgfeyxiexzf == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf = new C0416Ujhhgtgfeyxiexzf(typefaceMo3105Ujhhgtgfeyxiexzf, AbstractC3590Ujhhgtgfeyxiexzf.m5138Ujhhgtgfeyxiexzf(mappedByteBufferM4569Ujhhgtgfeyxiexzf));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (c3625Ujhhgtgfeyxiexzf.f11330Ujhhgtgfeyxiexzf) {
                                            try {
                                                AbstractC1264feyxiexzfUjhhgtg abstractC1264feyxiexzfUjhhgtg = c3625Ujhhgtgfeyxiexzf.f11334Ujhhgtgfeyxiexzf;
                                                if (abstractC1264feyxiexzfUjhhgtg != null) {
                                                    abstractC1264feyxiexzfUjhhgtg.mo2819Ujhhgtgfeyxiexzf(c0416Ujhhgtgfeyxiexzf);
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                            break;
                                        }
                                        c3625Ujhhgtgfeyxiexzf.m5267Ujhhgtgfeyxiexzf();
                                        return;
                                    } catch (Throwable th2) {
                                        Method method2 = AbstractC1761feyxiexzfUjhhgtg.f5923Ujhhgtgfeyxiexzf;
                                        Trace.endSection();
                                        throw th2;
                                    }
                                } catch (Throwable th3) {
                                    Trace.endSection();
                                    throw th3;
                                }
                            } catch (Throwable th4) {
                                Method method3 = AbstractC1761feyxiexzfUjhhgtg.f5923Ujhhgtgfeyxiexzf;
                                Trace.endSection();
                                throw th4;
                            }
                            break;
                        } catch (Throwable th5) {
                            synchronized (c3625Ujhhgtgfeyxiexzf.f11330Ujhhgtgfeyxiexzf) {
                                try {
                                    AbstractC1264feyxiexzfUjhhgtg abstractC1264feyxiexzfUjhhgtg2 = c3625Ujhhgtgfeyxiexzf.f11334Ujhhgtgfeyxiexzf;
                                    if (abstractC1264feyxiexzfUjhhgtg2 != null) {
                                        abstractC1264feyxiexzfUjhhgtg2.mo2816Ujhhgtgfeyxiexzf(th5);
                                    }
                                    c3625Ujhhgtgfeyxiexzf.m5267Ujhhgtgfeyxiexzf();
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
                C0843feyxiexzfUjhhgtg c0843feyxiexzfUjhhgtg = (C0843feyxiexzfUjhhgtg) this.f8787Ujhhgtgfeyxiexzf;
                Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf = c0843feyxiexzfUjhhgtg.f3324Ujhhgtgfeyxiexzf;
                if (c0843feyxiexzfUjhhgtg.f3320Ujhhgtgfeyxiexzf == 0) {
                    c0843feyxiexzfUjhhgtg.f3321Ujhhgtgfeyxiexzf = true;
                    ujhhgtgfeyxiexzf.m100Ujhhgtgfeyxiexzf(Ujhhgtgfeyxiexzf.ON_PAUSE);
                }
                if (c0843feyxiexzfUjhhgtg.f3319Ujhhgtgfeyxiexzf == 0 && c0843feyxiexzfUjhhgtg.f3321Ujhhgtgfeyxiexzf) {
                    ujhhgtgfeyxiexzf.m100Ujhhgtgfeyxiexzf(Ujhhgtgfeyxiexzf.ON_STOP);
                    c0843feyxiexzfUjhhgtg.f3322Ujhhgtgfeyxiexzf = true;
                    return;
                }
                return;
            case 5:
                ((AbstractC0800feyxiexzfUjhhgtg) this.f8787Ujhhgtgfeyxiexzf).mo861Ujhhgtgfeyxiexzf();
                return;
            case 6:
                C2450feyxiexzfUjhhgtg c2450feyxiexzfUjhhgtg = (C2450feyxiexzfUjhhgtg) this.f8787Ujhhgtgfeyxiexzf;
                c2450feyxiexzfUjhhgtg.f7932Ujhhgtgfeyxiexzf = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) c2450feyxiexzfUjhhgtg.f7934Ujhhgtgfeyxiexzf;
                C1900feyxiexzfUjhhgtg c1900feyxiexzfUjhhgtg = sideSheetBehavior.f845Ujhhgtgfeyxiexzf;
                if (c1900feyxiexzfUjhhgtg != null && c1900feyxiexzfUjhhgtg.m3243Ujhhgtgfeyxiexzf()) {
                    c2450feyxiexzfUjhhgtg.m3692Ujhhgtgfeyxiexzf(c2450feyxiexzfUjhhgtg.f7931Ujhhgtgfeyxiexzf);
                    return;
                } else {
                    if (sideSheetBehavior.f844Ujhhgtgfeyxiexzf == 2) {
                        sideSheetBehavior.m830Ujhhgtgfeyxiexzf(c2450feyxiexzfUjhhgtg.f7931Ujhhgtgfeyxiexzf);
                        return;
                    }
                    return;
                }
            case 7:
                ((AbstractC0056Ujhhgtgfeyxiexzf) this.f8787Ujhhgtgfeyxiexzf).invoke();
                return;
            case 8:
                ((TextInputLayout) this.f8787Ujhhgtgfeyxiexzf).f869Ujhhgtgfeyxiexzf.requestLayout();
                return;
            case 9:
                ((C2975feyxiexzfUjhhgtg) this.f8787Ujhhgtgfeyxiexzf).invoke();
                return;
            default:
                View view = (View) this.f8787Ujhhgtgfeyxiexzf;
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC2779feyxiexzfUjhhgtg(InterfaceC3545feyxiexzfUjhhgtg interfaceC3545feyxiexzfUjhhgtg) {
        this.f8786Ujhhgtgfeyxiexzf = 7;
        this.f8787Ujhhgtgfeyxiexzf = (AbstractC0056Ujhhgtgfeyxiexzf) interfaceC3545feyxiexzfUjhhgtg;
    }
}
