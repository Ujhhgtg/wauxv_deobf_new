package p000;

import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛲ能不能ᛴᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3083Ujhhgtgfeyxiexzf implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f9536Ujhhgtgfeyxiexzf;

    public /* synthetic */ C3083Ujhhgtgfeyxiexzf(int i) {
        this.f9536Ujhhgtgfeyxiexzf = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) throws IllegalAccessException {
        Object c0919feyxiexzfUjhhgtg;
        Object c0919feyxiexzfUjhhgtg2;
        Object c0919feyxiexzfUjhhgtg3;
        Object c0919feyxiexzfUjhhgtg4;
        Object c0919feyxiexzfUjhhgtg5;
        int i = this.f9536Ujhhgtgfeyxiexzf;
        int i2 = 5;
        int i3 = 4;
        int i4 = 3;
        int i5 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_custom_dpi, null, false);
                int i6 = R.id.moduleDialogEdtCustomDpi;
                TextInputEditText textInputEditText = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtCustomDpi);
                if (textInputEditText != null) {
                    i6 = R.id.moduleDialogInputCustomDpi;
                    if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputCustomDpi)) != null) {
                        LinearLayout linearLayout = (LinearLayout) viewM2416Ujhhgtgfeyxiexzf;
                        C0319Ujhhgtgfeyxiexzf c0319Ujhhgtgfeyxiexzf = new C0319Ujhhgtgfeyxiexzf(linearLayout, textInputEditText, i4);
                        textInputEditText.setText(String.valueOf(C3065Ujhhgtgfeyxiexzf.f9490Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf()));
                        C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf = new C0290Ujhhgtgfeyxiexzf();
                        C3066Ujhhgtgfeyxiexzf.f9491Ujhhgtgfeyxiexzf.getClass();
                        c0290Ujhhgtgfeyxiexzf.f1721Ujhhgtgfeyxiexzf = C3066Ujhhgtgfeyxiexzf.f9493Ujhhgtgfeyxiexzf;
                        c0290Ujhhgtgfeyxiexzf.f1723Ujhhgtgfeyxiexzf = linearLayout;
                        c0290Ujhhgtgfeyxiexzf.m1502Ujhhgtgfeyxiexzf(MagicFactory.get(4928385245998220682L, strArr), new C2977Ujhhgtgfeyxiexzf(16, c0319Ujhhgtgfeyxiexzf));
                        AbstractC1225feyxiexzfUjhhgtg.m2709Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf, null, 3);
                        return c1943Ujhhgtgfeyxiexzf;
                    }
                }
                throw new NullPointerException(MagicFactory.get(4928818410629891466L, strArr).concat(viewM2416Ujhhgtgfeyxiexzf.getResources().getResourceName(i6)));
            case 1:
                C3265feyxiexzfUjhhgtg c3265feyxiexzfUjhhgtg = (C3265feyxiexzfUjhhgtg) obj;
                c3265feyxiexzfUjhhgtg.f10255Ujhhgtgfeyxiexzf = new C3083Ujhhgtgfeyxiexzf(i3);
                c3265feyxiexzfUjhhgtg.f10256Ujhhgtgfeyxiexzf = new C3083Ujhhgtgfeyxiexzf(i2);
                return c1943Ujhhgtgfeyxiexzf;
            case 2:
                float fM4619Ujhhgtgfeyxiexzf = (C3065Ujhhgtgfeyxiexzf.f9490Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf() * 1.1666666f) / 400.0f;
                int i7 = AbstractC0145Ujhhgtgfeyxiexzf.f1303Ujhhgtgfeyxiexzf;
                C3442feyxiexzfUjhhgtg c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2693Ujhhgtgfeyxiexzf((C0578Ujhhgtgfeyxiexzf) obj);
                c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf.f10724Ujhhgtgfeyxiexzf = AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Float.TYPE);
                ((C3438feyxiexzfUjhhgtg) AbstractC2856feyxiexzfUjhhgtg.m4238feyxiexzfUjhhgtg(c3442feyxiexzfUjhhgtgM2693Ujhhgtgfeyxiexzf.m4942Ujhhgtgfeyxiexzf())).m4940Ujhhgtgfeyxiexzf(Float.valueOf(fM4619Ujhhgtgfeyxiexzf));
                return c1943Ujhhgtgfeyxiexzf;
            case 3:
                Object objM1850Ujhhgtgfeyxiexzf = ((C0578Ujhhgtgfeyxiexzf) obj).m1850Ujhhgtgfeyxiexzf();
                DisplayMetrics displayMetrics = objM1850Ujhhgtgfeyxiexzf instanceof DisplayMetrics ? (DisplayMetrics) objM1850Ujhhgtgfeyxiexzf : null;
                if (displayMetrics != null) {
                    float f = displayMetrics.scaledDensity / displayMetrics.density;
                    C3065Ujhhgtgfeyxiexzf c3065Ujhhgtgfeyxiexzf = C3065Ujhhgtgfeyxiexzf.f9490Ujhhgtgfeyxiexzf;
                    displayMetrics.density = c3065Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf() / 160.0f;
                    displayMetrics.densityDpi = c3065Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf();
                    displayMetrics.scaledDensity = (c3065Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf() / 160.0f) * f;
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 4:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C3711Ujhhgtgfeyxiexzf(29));
                return c1943Ujhhgtgfeyxiexzf;
            case 5:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg = (C3452feyxiexzfUjhhgtg) obj;
                c3452feyxiexzfUjhhgtg.getClass();
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf = new C0394Ujhhgtgfeyxiexzf();
                C2946feyxiexzfUjhhgtg c2946feyxiexzfUjhhgtg = new C2946feyxiexzfUjhhgtg(objArr2 == true ? 1 : 0, objArr == true ? 1 : 0);
                c2946feyxiexzfUjhhgtg.f9244Ujhhgtgfeyxiexzf = 1;
                c2946feyxiexzfUjhhgtg.f9245Ujhhgtgfeyxiexzf = 2;
                c0394Ujhhgtgfeyxiexzf.f2134Ujhhgtgfeyxiexzf = c2946feyxiexzfUjhhgtg;
                Class<DisplayMetrics> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(DisplayMetrics.class));
                c0394Ujhhgtgfeyxiexzf.m1658feyxiexzfUjhhgtg(clsM5159Ujhhgtgfeyxiexzf != null ? clsM5159Ujhhgtgfeyxiexzf : DisplayMetrics.class);
                c0394Ujhhgtgfeyxiexzf.m1655Ujhhgtgfeyxiexzf(0);
                c3452feyxiexzfUjhhgtg.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 6:
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf2 = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf((View) obj, R.layout.module_dialog_custom_unread_count, null, false);
                int i8 = R.id.moduleDialogEdtCustomUnReadCount;
                TextInputEditText textInputEditText2 = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogEdtCustomUnReadCount);
                if (textInputEditText2 != null) {
                    i8 = R.id.moduleDialogInputCustomUnReadCount;
                    if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf2, R.id.moduleDialogInputCustomUnReadCount)) != null) {
                        LinearLayout linearLayout2 = (LinearLayout) viewM2416Ujhhgtgfeyxiexzf2;
                        C0319Ujhhgtgfeyxiexzf c0319Ujhhgtgfeyxiexzf2 = new C0319Ujhhgtgfeyxiexzf(linearLayout2, textInputEditText2, i3);
                        textInputEditText2.setText(String.valueOf(C3061Ujhhgtgfeyxiexzf.f9483Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf()));
                        C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf2 = new C0290Ujhhgtgfeyxiexzf();
                        C3064Ujhhgtgfeyxiexzf.f9485Ujhhgtgfeyxiexzf.getClass();
                        c0290Ujhhgtgfeyxiexzf2.f1721Ujhhgtgfeyxiexzf = C3064Ujhhgtgfeyxiexzf.f9487Ujhhgtgfeyxiexzf;
                        c0290Ujhhgtgfeyxiexzf2.f1723Ujhhgtgfeyxiexzf = linearLayout2;
                        c0290Ujhhgtgfeyxiexzf2.m1502Ujhhgtgfeyxiexzf(MagicFactory.get(4928389283267478922L, strArr2), new C2977Ujhhgtgfeyxiexzf(17, c0319Ujhhgtgfeyxiexzf2));
                        AbstractC1225feyxiexzfUjhhgtg.m2709Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf2, null, 3);
                        return c1943Ujhhgtgfeyxiexzf;
                    }
                }
                throw new NullPointerException(MagicFactory.get(4928818548068844938L, strArr2).concat(viewM2416Ujhhgtgfeyxiexzf2.getResources().getResourceName(i8)));
            case 7:
                C2625feyxiexzfUjhhgtg.f8453Ujhhgtgfeyxiexzf.getClass();
                return Boolean.valueOf(((AbstractC2059Ujhhgtgfeyxiexzf) obj).mo3353feyxiexzfUjhhgtg());
            case 8:
                String strMo1480feyxiexzfUjhhgtg = ((AbstractC2059Ujhhgtgfeyxiexzf) obj).mo1480feyxiexzfUjhhgtg();
                C1420feyxiexzfUjhhgtg.f4989Ujhhgtgfeyxiexzf.getClass();
                return Boolean.valueOf(!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(strMo1480feyxiexzfUjhhgtg, C1420feyxiexzfUjhhgtg.f4990Ujhhgtgfeyxiexzf));
            case 9:
                return ((AbstractC2059Ujhhgtgfeyxiexzf) obj).mo1480feyxiexzfUjhhgtg();
            case 10:
                return ((AbstractC2059Ujhhgtgfeyxiexzf) obj).mo1479feyxiexzfUjhhgtg();
            case 11:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf = (C0578Ujhhgtgfeyxiexzf) obj;
                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0578Ujhhgtgfeyxiexzf.getClass();
                try {
                    c0919feyxiexzfUjhhgtg = c0578Ujhhgtgfeyxiexzf.m1848Ujhhgtgfeyxiexzf()[1];
                    if (c0919feyxiexzfUjhhgtg == null) {
                        c0919feyxiexzfUjhhgtg = null;
                    }
                } catch (Throwable th) {
                    c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
                }
                if (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg = null;
                }
                Integer num = (Integer) c0919feyxiexzfUjhhgtg;
                int iIntValue = num != null ? num.intValue() : 0;
                try {
                    c0919feyxiexzfUjhhgtg2 = c0578Ujhhgtgfeyxiexzf.m1848Ujhhgtgfeyxiexzf()[2];
                    if (c0919feyxiexzfUjhhgtg2 == null) {
                        c0919feyxiexzfUjhhgtg2 = null;
                    }
                } catch (Throwable th2) {
                    c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th2);
                }
                if (c0919feyxiexzfUjhhgtg2 instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg2 = null;
                }
                String str = (String) c0919feyxiexzfUjhhgtg2;
                if (str == null) {
                    str = "";
                }
                try {
                    c0919feyxiexzfUjhhgtg3 = c0578Ujhhgtgfeyxiexzf.m1848Ujhhgtgfeyxiexzf()[9];
                    if (c0919feyxiexzfUjhhgtg3 == null) {
                        c0919feyxiexzfUjhhgtg3 = null;
                    }
                } catch (Throwable th3) {
                    c0919feyxiexzfUjhhgtg3 = new C0919feyxiexzfUjhhgtg(th3);
                }
                String str2 = (String) (c0919feyxiexzfUjhhgtg3 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg3);
                String str3 = str2 != null ? str2 : "";
                if (iIntValue == 0) {
                    String str4 = MagicFactory.get(4928813071985542538L, strArr3);
                    StringBuilder sbM2707Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(str);
                    sbM2707Ujhhgtgfeyxiexzf.append(MagicFactory.get(4928813162179855754L, strArr3));
                    sbM2707Ujhhgtgfeyxiexzf.append(str3);
                    Log.v(str4, sbM2707Ujhhgtgfeyxiexzf.toString());
                } else if (iIntValue == 1) {
                    String str5 = MagicFactory.get(4928813149294953866L, strArr3);
                    StringBuilder sbM2707Ujhhgtgfeyxiexzf2 = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(str);
                    sbM2707Ujhhgtgfeyxiexzf2.append(MagicFactory.get(4928812139977639306L, strArr3));
                    sbM2707Ujhhgtgfeyxiexzf2.append(str3);
                    Log.d(str5, sbM2707Ujhhgtgfeyxiexzf2.toString());
                } else if (iIntValue == 2) {
                    String str6 = MagicFactory.get(4928812127092737418L, strArr3);
                    StringBuilder sbM2707Ujhhgtgfeyxiexzf3 = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(str);
                    sbM2707Ujhhgtgfeyxiexzf3.append(MagicFactory.get(4928812217287050634L, strArr3));
                    sbM2707Ujhhgtgfeyxiexzf3.append(str3);
                    Log.i(str6, sbM2707Ujhhgtgfeyxiexzf3.toString());
                } else if (iIntValue == 3) {
                    String str7 = MagicFactory.get(4928812204402148746L, strArr3);
                    StringBuilder sbM2707Ujhhgtgfeyxiexzf4 = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(str);
                    sbM2707Ujhhgtgfeyxiexzf4.append(MagicFactory.get(4928812294596461962L, strArr3));
                    sbM2707Ujhhgtgfeyxiexzf4.append(str3);
                    Log.w(str7, sbM2707Ujhhgtgfeyxiexzf4.toString());
                } else if (iIntValue == 4) {
                    String str8 = MagicFactory.get(4928812281711560074L, strArr3);
                    StringBuilder sbM2707Ujhhgtgfeyxiexzf5 = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(str);
                    sbM2707Ujhhgtgfeyxiexzf5.append(MagicFactory.get(4928812371905873290L, strArr3));
                    sbM2707Ujhhgtgfeyxiexzf5.append(str3);
                    Log.e(str8, sbM2707Ujhhgtgfeyxiexzf5.toString());
                } else if (iIntValue == 5) {
                    String str9 = MagicFactory.get(4928812359020971402L, strArr3);
                    StringBuilder sbM2707Ujhhgtgfeyxiexzf6 = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(str);
                    sbM2707Ujhhgtgfeyxiexzf6.append(MagicFactory.get(4928812449215284618L, strArr3));
                    sbM2707Ujhhgtgfeyxiexzf6.append(str3);
                    Log.wtf(str9, sbM2707Ujhhgtgfeyxiexzf6.toString());
                }
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FCONST_1 /* 12 */:
                return AbstractC3273feyxiexzfUjhhgtg.m4783Ujhhgtgfeyxiexzf((String) obj);
            case 13:
                return AbstractC3273feyxiexzfUjhhgtg.m4782Ujhhgtgfeyxiexzf((Class) obj);
            case Opcodes.DCONST_0 /* 14 */:
                return AbstractC3273feyxiexzfUjhhgtg.m4782Ujhhgtgfeyxiexzf((Class) obj);
            case 15:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf2 = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf2.getClass();
                try {
                    c0919feyxiexzfUjhhgtg4 = c0578Ujhhgtgfeyxiexzf2.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg4 == null) {
                        c0919feyxiexzfUjhhgtg4 = null;
                    }
                } catch (Throwable th4) {
                    c0919feyxiexzfUjhhgtg4 = new C0919feyxiexzfUjhhgtg(th4);
                }
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) (c0919feyxiexzfUjhhgtg4 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg4);
                if (layoutParams.screenBrightness >= 0.5f) {
                    layoutParams.screenBrightness = -1.0f;
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 16:
                C3265feyxiexzfUjhhgtg c3265feyxiexzfUjhhgtg2 = (C3265feyxiexzfUjhhgtg) obj;
                c3265feyxiexzfUjhhgtg2.f10255Ujhhgtgfeyxiexzf = new C3083Ujhhgtgfeyxiexzf(18);
                c3265feyxiexzfUjhhgtg2.f10256Ujhhgtgfeyxiexzf = new C3083Ujhhgtgfeyxiexzf(19);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.SIPUSH /* 17 */:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf3 = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf3.getClass();
                try {
                    c0919feyxiexzfUjhhgtg5 = c0578Ujhhgtgfeyxiexzf3.m1848Ujhhgtgfeyxiexzf()[2];
                    if (c0919feyxiexzfUjhhgtg5 == null) {
                        c0919feyxiexzfUjhhgtg5 = null;
                    }
                } catch (Throwable th5) {
                    c0919feyxiexzfUjhhgtg5 = new C0919feyxiexzfUjhhgtg(th5);
                }
                if (AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg((c0919feyxiexzfUjhhgtg5 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg5).toString(), MagicFactory.get(4928232847673656714L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf), false)) {
                    c0578Ujhhgtgfeyxiexzf3.m1851Ujhhgtgfeyxiexzf();
                }
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LDC /* 18 */:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg = (C3456feyxiexzfUjhhgtg) obj;
                c3456feyxiexzfUjhhgtg.getClass();
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf = new C2812Ujhhgtgfeyxiexzf();
                String[] strArr4 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                if (AbstractC1265feyxiexzfUjhhgtg.m2830Ujhhgtgfeyxiexzf(EnumC2264feyxiexzfUjhhgtg.f7375Ujhhgtgfeyxiexzf) || AbstractC1265feyxiexzfUjhhgtg.m2831Ujhhgtgfeyxiexzf(EnumC2263Ujhhgtgfeyxiexzf.f7351Ujhhgtgfeyxiexzf)) {
                    c2812Ujhhgtgfeyxiexzf.m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928232920688100746L, strArr4), MagicFactory.get(4928232894918296970L, strArr4));
                } else {
                    c2812Ujhhgtgfeyxiexzf.m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928232997997512074L, strArr4), MagicFactory.get(4928232972227708298L, strArr4));
                }
                c3456feyxiexzfUjhhgtg.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 19:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg2 = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg2);
                Class<Boolean> clsM5159Ujhhgtgfeyxiexzf2 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(Boolean.class));
                Class<Integer> clsM2695Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2695Ujhhgtgfeyxiexzf(c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf, clsM5159Ujhhgtgfeyxiexzf2 != null ? clsM5159Ujhhgtgfeyxiexzf2 : Boolean.class, Integer.class);
                Class cls = clsM2695Ujhhgtgfeyxiexzf != null ? clsM2695Ujhhgtgfeyxiexzf : Integer.class;
                Class<String> clsM5159Ujhhgtgfeyxiexzf3 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(String.class));
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf.m1657Ujhhgtgfeyxiexzf(cls, clsM5159Ujhhgtgfeyxiexzf3 != null ? clsM5159Ujhhgtgfeyxiexzf3 : String.class, null);
                c3452feyxiexzfUjhhgtg2.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 20:
                C3265feyxiexzfUjhhgtg c3265feyxiexzfUjhhgtg3 = (C3265feyxiexzfUjhhgtg) obj;
                c3265feyxiexzfUjhhgtg3.f10255Ujhhgtgfeyxiexzf = new C3083Ujhhgtgfeyxiexzf(21);
                c3265feyxiexzfUjhhgtg3.f10256Ujhhgtgfeyxiexzf = new C3083Ujhhgtgfeyxiexzf(22);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ILOAD /* 21 */:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg2 = (C3456feyxiexzfUjhhgtg) obj;
                String[] strArr5 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3456feyxiexzfUjhhgtg2.m4953Ujhhgtgfeyxiexzf(MagicFactory.get(4928411239140296074L, strArr5));
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf2 = new C2812Ujhhgtgfeyxiexzf();
                c2812Ujhhgtgfeyxiexzf2.m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928410792463697290L, strArr5));
                C1155feyxiexzfUjhhgtg c1155feyxiexzfUjhhgtg = new C1155feyxiexzfUjhhgtg(MagicFactory.get(4928410925607683466L, strArr5), 1, false);
                List arrayList = c2812Ujhhgtgfeyxiexzf2.f8951Ujhhgtgfeyxiexzf;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                c2812Ujhhgtgfeyxiexzf2.f8951Ujhhgtgfeyxiexzf = arrayList;
                arrayList.add(c1155feyxiexzfUjhhgtg);
                c3456feyxiexzfUjhhgtg2.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf2;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LLOAD /* 22 */:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C3083Ujhhgtgfeyxiexzf(24));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FLOAD /* 23 */:
                ((C0578Ujhhgtgfeyxiexzf) obj).m1853Ujhhgtgfeyxiexzf(null);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DLOAD /* 24 */:
                ((C0394Ujhhgtgfeyxiexzf) obj).m1661feyxiexzfUjhhgtg(MagicFactory.get(4928411105996309898L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ALOAD /* 25 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C3083Ujhhgtgfeyxiexzf(26);
                return c1943Ujhhgtgfeyxiexzf;
            case 26:
                ((C3452feyxiexzfUjhhgtg) obj).m4950Ujhhgtgfeyxiexzf(new C3083Ujhhgtgfeyxiexzf(28));
                return c1943Ujhhgtgfeyxiexzf;
            case 27:
                ((C0578Ujhhgtgfeyxiexzf) obj).m1851Ujhhgtgfeyxiexzf();
                return c1943Ujhhgtgfeyxiexzf;
            case 28:
                String[] strArr6 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C0394Ujhhgtgfeyxiexzf) obj).m1661feyxiexzfUjhhgtg(MagicFactory.get(4928410603485136266L, strArr6), MagicFactory.get(4928410783873762698L, strArr6));
                return c1943Ujhhgtgfeyxiexzf;
            default:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C3172feyxiexzfUjhhgtg(i5);
                return c1943Ujhhgtgfeyxiexzf;
        }
    }
}
