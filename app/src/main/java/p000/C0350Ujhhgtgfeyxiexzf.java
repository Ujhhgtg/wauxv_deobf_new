package p000;

import android.app.Activity;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RadioGroup;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;
import me.hd.wauxv.ui.setting.view.ModuleTabLayout;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳᛴ要点脸ᛱfeyxiexzfᛱ能不能ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0350Ujhhgtgfeyxiexzf implements InterfaceC3545feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f1992Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f1993Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0350Ujhhgtgfeyxiexzf(int i, Object obj) {
        this.f1992Ujhhgtgfeyxiexzf = i;
        this.f1993Ujhhgtgfeyxiexzf = obj;
    }

    /* JADX WARN: Code duplicated, block: B:169:0x0381  */
    /* JADX WARN: Code duplicated, block: B:253:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:255:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:259:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:261:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:284:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x010c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0111  */
    /* JADX WARN: Code duplicated, block: B:46:0x0114  */
    /* JADX WARN: Code duplicated, block: B:50:0x0135  */
    /* JADX WARN: Code duplicated, block: B:52:0x013d A[LOOP:1: B:48:0x012f->B:52:0x013d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x015c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r1v79, types: [android.net.Uri, java.lang.CharSequence[], long[]] */
    /* JADX WARN: Type inference failed for: r1v82 */
    @Override // p000.InterfaceC3545feyxiexzfUjhhgtg
    public final Object invoke() {
        int i;
        C1277feyxiexzfUjhhgtg c1277feyxiexzfUjhhgtg;
        String str;
        String str2;
        ?? r1;
        Bundle bundle;
        C2080Ujhhgtgfeyxiexzf c2080Ujhhgtgfeyxiexzf;
        CharSequence charSequence;
        String string;
        ArrayList arrayList;
        int i2;
        ArrayList arrayList2;
        int i3;
        int i4 = this.f1992Ujhhgtgfeyxiexzf;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        Object obj = this.f1993Ujhhgtgfeyxiexzf;
        switch (i4) {
            case 0:
                C0327Ujhhgtgfeyxiexzf c0327Ujhhgtgfeyxiexzf = (C0327Ujhhgtgfeyxiexzf) obj;
                C0352Ujhhgtgfeyxiexzf.f1995Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0327Ujhhgtgfeyxiexzf.f1928Ujhhgtgfeyxiexzf));
                C0334Ujhhgtgfeyxiexzf.f1960Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0327Ujhhgtgfeyxiexzf.f1930Ujhhgtgfeyxiexzf));
                C0349Ujhhgtgfeyxiexzf.f1991Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0327Ujhhgtgfeyxiexzf.f1927Ujhhgtgfeyxiexzf));
                C0351Ujhhgtgfeyxiexzf.f1994Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0327Ujhhgtgfeyxiexzf.f1929Ujhhgtgfeyxiexzf));
                return c1943Ujhhgtgfeyxiexzf;
            case 1:
                C0329Ujhhgtgfeyxiexzf c0329Ujhhgtgfeyxiexzf = (C0329Ujhhgtgfeyxiexzf) obj;
                C0331Ujhhgtgfeyxiexzf.f1949Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0329Ujhhgtgfeyxiexzf.f1939Ujhhgtgfeyxiexzf));
                C0332Ujhhgtgfeyxiexzf.f1950Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0329Ujhhgtgfeyxiexzf.f1940Ujhhgtgfeyxiexzf));
                C0342Ujhhgtgfeyxiexzf.f1972Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf((TextInputEditText) c0329Ujhhgtgfeyxiexzf.f1943Ujhhgtgfeyxiexzf));
                C0341Ujhhgtgfeyxiexzf.f1971Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf((TextInputEditText) c0329Ujhhgtgfeyxiexzf.f1944Ujhhgtgfeyxiexzf));
                C0336Ujhhgtgfeyxiexzf.f1962Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0329Ujhhgtgfeyxiexzf.f1937Ujhhgtgfeyxiexzf));
                C0335Ujhhgtgfeyxiexzf.f1961Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0329Ujhhgtgfeyxiexzf.f1938Ujhhgtgfeyxiexzf));
                C0340Ujhhgtgfeyxiexzf.f1970Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf((TextInputEditText) c0329Ujhhgtgfeyxiexzf.f1941Ujhhgtgfeyxiexzf));
                C0339Ujhhgtgfeyxiexzf.f1969Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf((TextInputEditText) c0329Ujhhgtgfeyxiexzf.f1942Ujhhgtgfeyxiexzf));
                return c1943Ujhhgtgfeyxiexzf;
            case 2:
                C0328Ujhhgtgfeyxiexzf c0328Ujhhgtgfeyxiexzf = (C0328Ujhhgtgfeyxiexzf) obj;
                C0494Ujhhgtgfeyxiexzf.f2413Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0328Ujhhgtgfeyxiexzf.f1933Ujhhgtgfeyxiexzf));
                C0495Ujhhgtgfeyxiexzf.f2414Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0328Ujhhgtgfeyxiexzf.f1934Ujhhgtgfeyxiexzf));
                return c1943Ujhhgtgfeyxiexzf;
            case 3:
                C0312Ujhhgtgfeyxiexzf c0312Ujhhgtgfeyxiexzf = (C0312Ujhhgtgfeyxiexzf) obj;
                C0481Ujhhgtgfeyxiexzf.f2395Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0312Ujhhgtgfeyxiexzf.f1861Ujhhgtgfeyxiexzf));
                C0484Ujhhgtgfeyxiexzf.f2398Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0312Ujhhgtgfeyxiexzf.f1862Ujhhgtgfeyxiexzf));
                C0477Ujhhgtgfeyxiexzf.f2390Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0312Ujhhgtgfeyxiexzf.f1857Ujhhgtgfeyxiexzf));
                C0485Ujhhgtgfeyxiexzf.f2399Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0312Ujhhgtgfeyxiexzf.f1858Ujhhgtgfeyxiexzf));
                C0488Ujhhgtgfeyxiexzf.f2402Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0312Ujhhgtgfeyxiexzf.f1864Ujhhgtgfeyxiexzf));
                C0487Ujhhgtgfeyxiexzf.f2401Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0312Ujhhgtgfeyxiexzf.f1865Ujhhgtgfeyxiexzf));
                C0482Ujhhgtgfeyxiexzf c0482Ujhhgtgfeyxiexzf = C0482Ujhhgtgfeyxiexzf.f2396Ujhhgtgfeyxiexzf;
                Integer numM2673feyxiexzfUjhhgtg = AbstractC1184feyxiexzfUjhhgtg.m2673feyxiexzfUjhhgtg(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0312Ujhhgtgfeyxiexzf.f1860Ujhhgtgfeyxiexzf));
                c0482Ujhhgtgfeyxiexzf.m4626Ujhhgtgfeyxiexzf(numM2673feyxiexzfUjhhgtg != null ? numM2673feyxiexzfUjhhgtg.intValue() : 64);
                C0483Ujhhgtgfeyxiexzf c0483Ujhhgtgfeyxiexzf = C0483Ujhhgtgfeyxiexzf.f2397Ujhhgtgfeyxiexzf;
                Integer numM2673feyxiexzfUjhhgtg2 = AbstractC1184feyxiexzfUjhhgtg.m2673feyxiexzfUjhhgtg(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0312Ujhhgtgfeyxiexzf.f1863Ujhhgtgfeyxiexzf));
                c0483Ujhhgtgfeyxiexzf.m4626Ujhhgtgfeyxiexzf(numM2673feyxiexzfUjhhgtg2 != null ? numM2673feyxiexzfUjhhgtg2.intValue() : 64);
                C0486Ujhhgtgfeyxiexzf c0486Ujhhgtgfeyxiexzf = C0486Ujhhgtgfeyxiexzf.f2400Ujhhgtgfeyxiexzf;
                Integer numM2673feyxiexzfUjhhgtg3 = AbstractC1184feyxiexzfUjhhgtg.m2673feyxiexzfUjhhgtg(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0312Ujhhgtgfeyxiexzf.f1859Ujhhgtgfeyxiexzf));
                c0486Ujhhgtgfeyxiexzf.m4626Ujhhgtgfeyxiexzf(numM2673feyxiexzfUjhhgtg3 != null ? numM2673feyxiexzfUjhhgtg3.intValue() : 10);
                C0491Ujhhgtgfeyxiexzf.f2410Ujhhgtgfeyxiexzf.m4624Ujhhgtgfeyxiexzf(c0312Ujhhgtgfeyxiexzf.f1855Ujhhgtgfeyxiexzf.isChecked());
                C0492Ujhhgtgfeyxiexzf.f2411Ujhhgtgfeyxiexzf.m4624Ujhhgtgfeyxiexzf(c0312Ujhhgtgfeyxiexzf.f1856Ujhhgtgfeyxiexzf.isChecked());
                return c1943Ujhhgtgfeyxiexzf;
            case 4:
                C0327Ujhhgtgfeyxiexzf c0327Ujhhgtgfeyxiexzf2 = (C0327Ujhhgtgfeyxiexzf) obj;
                C0508Ujhhgtgfeyxiexzf.f2441Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0327Ujhhgtgfeyxiexzf2.f1928Ujhhgtgfeyxiexzf));
                C0515Ujhhgtgfeyxiexzf.f2459Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0327Ujhhgtgfeyxiexzf2.f1930Ujhhgtgfeyxiexzf));
                C0505Ujhhgtgfeyxiexzf.f2435Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0327Ujhhgtgfeyxiexzf2.f1927Ujhhgtgfeyxiexzf));
                C0507Ujhhgtgfeyxiexzf.f2440Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0327Ujhhgtgfeyxiexzf2.f1929Ujhhgtgfeyxiexzf));
                return c1943Ujhhgtgfeyxiexzf;
            case 5:
                C0677Ujhhgtgfeyxiexzf c0677Ujhhgtgfeyxiexzf = (C0677Ujhhgtgfeyxiexzf) ((C2629Ujhhgtgfeyxiexzf) obj).f8461Ujhhgtgfeyxiexzf;
                String str3 = c0677Ujhhgtgfeyxiexzf.f2797Ujhhgtgfeyxiexzf;
                int i5 = 3;
                int iM2713feyxiexzfUjhhgtg = AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(3);
                if (iM2713feyxiexzfUjhhgtg != 0) {
                    if (iM2713feyxiexzfUjhhgtg == 1) {
                        i = 2;
                    } else if (iM2713feyxiexzfUjhhgtg != 2) {
                        if (iM2713feyxiexzfUjhhgtg != 3) {
                            throw new C2870Ujhhgtgfeyxiexzf();
                        }
                        i5 = 4;
                    }
                    c1277feyxiexzfUjhhgtg = new C1277feyxiexzfUjhhgtg(str3, i5);
                    str = c0677Ujhhgtgfeyxiexzf.f2798Ujhhgtgfeyxiexzf;
                    if (AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(str)) {
                        str = null;
                    }
                    if (str != null) {
                        c1277feyxiexzfUjhhgtg.f4663Ujhhgtgfeyxiexzf = str;
                    }
                    str2 = AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg("") ? null : "";
                    if (str2 != null) {
                        c1277feyxiexzfUjhhgtg.f4665Ujhhgtgfeyxiexzf = str2;
                    }
                    return c1277feyxiexzfUjhhgtg;
                }
                i = 1;
                i5 = i;
                c1277feyxiexzfUjhhgtg = new C1277feyxiexzfUjhhgtg(str3, i5);
                str = c0677Ujhhgtgfeyxiexzf.f2798Ujhhgtgfeyxiexzf;
                if (AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(str)) {
                    str = null;
                }
                if (str != null) {
                    c1277feyxiexzfUjhhgtg.f4663Ujhhgtgfeyxiexzf = str;
                }
                if (AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg("")) {
                }
                if (str2 != null) {
                    c1277feyxiexzfUjhhgtg.f4665Ujhhgtgfeyxiexzf = str2;
                }
                return c1277feyxiexzfUjhhgtg;
            case 6:
                return new C1282feyxiexzfUjhhgtg((Context) ((C0210Ujhhgtgfeyxiexzf) ((C1283feyxiexzfUjhhgtg) obj).f4680Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf).f1470Ujhhgtgfeyxiexzf);
            case 7:
                C0210Ujhhgtgfeyxiexzf c0210Ujhhgtgfeyxiexzf = (C0210Ujhhgtgfeyxiexzf) ((C2629Ujhhgtgfeyxiexzf) obj).f8461Ujhhgtgfeyxiexzf;
                Context context = (Context) c0210Ujhhgtgfeyxiexzf.f1470Ujhhgtgfeyxiexzf;
                String str4 = ((C0677Ujhhgtgfeyxiexzf) ((C2629Ujhhgtgfeyxiexzf) c0210Ujhhgtgfeyxiexzf.f1471Ujhhgtgfeyxiexzf).f8461Ujhhgtgfeyxiexzf).f2797Ujhhgtgfeyxiexzf;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                Notification notification = new Notification();
                notification.when = System.currentTimeMillis();
                int i6 = -1;
                notification.audioStreamType = -1;
                ArrayList arrayList6 = new ArrayList();
                String str5 = (String) c0210Ujhhgtgfeyxiexzf.f1472Ujhhgtgfeyxiexzf;
                if (AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(str5)) {
                    str5 = null;
                }
                CharSequence charSequenceM2753Ujhhgtgfeyxiexzf = str5 != null ? AbstractC1245feyxiexzfUjhhgtg.m2753Ujhhgtgfeyxiexzf(str5) : null;
                String str6 = (String) c0210Ujhhgtgfeyxiexzf.f1473Ujhhgtgfeyxiexzf;
                if (AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(str6)) {
                    str6 = null;
                }
                CharSequence charSequenceM2753Ujhhgtgfeyxiexzf2 = str6 != null ? AbstractC1245feyxiexzfUjhhgtg.m2753Ujhhgtgfeyxiexzf(str6) : null;
                CharSequence charSequence2 = !AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg("") ? "" : null;
                CharSequence charSequenceM2753Ujhhgtgfeyxiexzf3 = charSequence2 != null ? AbstractC1245feyxiexzfUjhhgtg.m2753Ujhhgtgfeyxiexzf(charSequence2) : null;
                CharSequence charSequence3 = !AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg("") ? "" : null;
                CharSequence charSequenceM2753Ujhhgtgfeyxiexzf4 = charSequence3 != null ? AbstractC1245feyxiexzfUjhhgtg.m2753Ujhhgtgfeyxiexzf(charSequence3) : null;
                CharSequence charSequence4 = !AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg("") ? "" : null;
                CharSequence charSequenceM2753Ujhhgtgfeyxiexzf5 = charSequence4 != null ? AbstractC1245feyxiexzfUjhhgtg.m2753Ujhhgtgfeyxiexzf(charSequence4) : null;
                String str7 = !AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg("") ? "" : null;
                String str8 = str7 != null ? str7 : null;
                int i7 = AbstractC3028feyxiexzfUjhhgtg.f9394Ujhhgtgfeyxiexzf;
                String str9 = !AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg("") ? "" : null;
                String str10 = str9 != null ? str9 : null;
                CharSequence charSequence5 = !AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg("") ? "" : null;
                if (charSequence5 != null) {
                    notification.tickerText = AbstractC1245feyxiexzfUjhhgtg.m2753Ujhhgtgfeyxiexzf(charSequence5);
                }
                String str11 = !AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg("") ? "" : null;
                if (str11 == null) {
                    str11 = null;
                }
                str2 = AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg("") ? null : "";
                if (str2 == null) {
                    str2 = null;
                }
                Iterator it = ((ArrayList) c0210Ujhhgtgfeyxiexzf.f1474Ujhhgtgfeyxiexzf).iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                }
                int i8 = AbstractC3028feyxiexzfUjhhgtg.f9394Ujhhgtgfeyxiexzf;
                notification.icon = R.drawable.ic_better_android_simple_notification;
                if (i8 < 26) {
                    notification.defaults = -1;
                    notification.flags |= 1;
                    int iM2713feyxiexzfUjhhgtg2 = AbstractC1225feyxiexzfUjhhgtg.m2713feyxiexzfUjhhgtg(3);
                    if (iM2713feyxiexzfUjhhgtg2 == 0) {
                        i6 = -2;
                    } else if (iM2713feyxiexzfUjhhgtg2 != 1) {
                        if (iM2713feyxiexzfUjhhgtg2 == 2) {
                            i6 = 0;
                        } else {
                            if (iM2713feyxiexzfUjhhgtg2 != 3) {
                                throw new C2870Ujhhgtgfeyxiexzf();
                            }
                            i6 = 1;
                        }
                    }
                } else {
                    i6 = 0;
                }
                Bundle bundle2 = new Bundle();
                int i9 = Build.VERSION.SDK_INT;
                Notification.Builder builder = new Notification.Builder(context, str4);
                builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(charSequenceM2753Ujhhgtgfeyxiexzf).setContentText(charSequenceM2753Ujhhgtgfeyxiexzf2).setContentInfo(charSequenceM2753Ujhhgtgfeyxiexzf3).setContentIntent(null).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
                builder.setLargeIcon((Icon) null);
                builder.setSubText(charSequenceM2753Ujhhgtgfeyxiexzf4).setUsesChronometer(false).setPriority(i6);
                Iterator it2 = arrayList3.iterator();
                if (it2.hasNext()) {
                    throw AbstractC3317feyxiexzfUjhhgtg.m4793Ujhhgtgfeyxiexzf(it2);
                }
                builder.setShowWhen(true);
                builder.setLocalOnly(false);
                builder.setGroup(str8);
                builder.setSortKey(str11);
                builder.setGroupSummary(false);
                builder.setCategory(str10);
                builder.setColor(0);
                builder.setVisibility(0);
                builder.setPublicVersion(null);
                builder.setSound(notification.sound, notification.audioAttributes);
                if (i9 < 28) {
                    ArrayList arrayList7 = new ArrayList(arrayList4.size());
                    Iterator it3 = arrayList4.iterator();
                    if (it3.hasNext()) {
                        throw AbstractC3317feyxiexzfUjhhgtg.m4793Ujhhgtgfeyxiexzf(it3);
                    }
                    C2392Ujhhgtgfeyxiexzf c2392Ujhhgtgfeyxiexzf = new C2392Ujhhgtgfeyxiexzf(arrayList6.size() + arrayList7.size());
                    c2392Ujhhgtgfeyxiexzf.addAll(arrayList7);
                    c2392Ujhhgtgfeyxiexzf.addAll(arrayList6);
                    arrayList6 = new ArrayList(c2392Ujhhgtgfeyxiexzf);
                }
                if (!arrayList6.isEmpty()) {
                    Iterator it4 = arrayList6.iterator();
                    while (it4.hasNext()) {
                        builder.addPerson((String) it4.next());
                    }
                }
                if (arrayList5.size() > 0) {
                    bundle = new Bundle();
                    Bundle bundle3 = bundle.getBundle("android.car.EXTENSIONS");
                    if (bundle3 == null) {
                        bundle3 = new Bundle();
                    }
                    Bundle bundle4 = new Bundle(bundle3);
                    Bundle bundle5 = new Bundle();
                    if (arrayList5.size() > 0) {
                        Integer.toString(0);
                        if (arrayList5.get(0) != null) {
                            throw new ClassCastException();
                        }
                        new Bundle();
                        throw null;
                    }
                    bundle3.putBundle("invisible_actions", bundle5);
                    bundle4.putBundle("invisible_actions", bundle5);
                    bundle.putBundle("android.car.EXTENSIONS", bundle3);
                    bundle2.putBundle("android.car.EXTENSIONS", bundle4);
                    r1 = 0;
                } else {
                    r1 = 0;
                    bundle = null;
                }
                int i10 = Build.VERSION.SDK_INT;
                builder.setExtras(bundle);
                builder.setRemoteInputHistory(r1);
                builder.setBadgeIconType(0);
                builder.setSettingsText(charSequenceM2753Ujhhgtgfeyxiexzf5);
                builder.setShortcutId(str2);
                builder.setTimeoutAfter(0L);
                builder.setGroupAlertBehavior(0);
                if (!TextUtils.isEmpty(str4)) {
                    builder.setSound(r1).setDefaults(0).setLights(0, 0, 0).setVibrate(r1);
                }
                if (i10 >= 28) {
                    Iterator it5 = arrayList4.iterator();
                    if (it5.hasNext()) {
                        throw AbstractC3317feyxiexzfUjhhgtg.m4793Ujhhgtgfeyxiexzf(it5);
                    }
                }
                if (i10 >= 29) {
                    AbstractC0687Ujhhgtgfeyxiexzf.m1953Ujhhgtgfeyxiexzf(builder);
                    AbstractC0687Ujhhgtgfeyxiexzf.m1954Ujhhgtgfeyxiexzf(builder);
                }
                if (i10 >= 36) {
                    AbstractC2960feyxiexzfUjhhgtg.m4426Ujhhgtgfeyxiexzf(builder);
                }
                return builder.build();
            case 8:
                String strM2774Ujhhgtgfeyxiexzf = AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(((C0319Ujhhgtgfeyxiexzf) obj).f1877Ujhhgtgfeyxiexzf);
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                if (strM2774Ujhhgtgfeyxiexzf.endsWith(MagicFactory.get(4928845589182940554L, strArr))) {
                    Activity activityM5177Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5177Ujhhgtgfeyxiexzf();
                    Intent intent = new Intent();
                    intent.setClassName(activityM5177Ujhhgtgfeyxiexzf, MagicFactory.get(4928209740749604234L, strArr));
                    intent.putExtra(MagicFactory.get(4928209972677838218L, strArr), strM2774Ujhhgtgfeyxiexzf);
                    activityM5177Ujhhgtgfeyxiexzf.startActivity(intent);
                } else {
                    Activity activityM5177Ujhhgtgfeyxiexzf2 = AbstractC3594Ujhhgtgfeyxiexzf.m5177Ujhhgtgfeyxiexzf();
                    Intent intent2 = new Intent();
                    intent2.setClassName(activityM5177Ujhhgtgfeyxiexzf2, MagicFactory.get(4928210548203455882L, strArr));
                    intent2.putExtra(MagicFactory.get(4928209659145225610L, strArr), strM2774Ujhhgtgfeyxiexzf);
                    activityM5177Ujhhgtgfeyxiexzf2.startActivity(intent2);
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 9:
                C0322Ujhhgtgfeyxiexzf c0322Ujhhgtgfeyxiexzf = (C0322Ujhhgtgfeyxiexzf) obj;
                C1400feyxiexzfUjhhgtg.f4916Ujhhgtgfeyxiexzf.m4624Ujhhgtgfeyxiexzf(c0322Ujhhgtgfeyxiexzf.f1904Ujhhgtgfeyxiexzf.isChecked());
                C1401feyxiexzfUjhhgtg.f4917Ujhhgtgfeyxiexzf.m4624Ujhhgtgfeyxiexzf(c0322Ujhhgtgfeyxiexzf.f1903Ujhhgtgfeyxiexzf.isChecked());
                C1398feyxiexzfUjhhgtg.f4914Ujhhgtgfeyxiexzf.m4624Ujhhgtgfeyxiexzf(c0322Ujhhgtgfeyxiexzf.f1902Ujhhgtgfeyxiexzf.isChecked());
                return c1943Ujhhgtgfeyxiexzf;
            case 10:
                C0328Ujhhgtgfeyxiexzf c0328Ujhhgtgfeyxiexzf2 = (C0328Ujhhgtgfeyxiexzf) obj;
                C0766feyxiexzfUjhhgtg.f3043Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0328Ujhhgtgfeyxiexzf2.f1934Ujhhgtgfeyxiexzf));
                C0767feyxiexzfUjhhgtg.f3044Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0328Ujhhgtgfeyxiexzf2.f1933Ujhhgtgfeyxiexzf));
                return c1943Ujhhgtgfeyxiexzf;
            case 11:
                C0913feyxiexzfUjhhgtg.f3529Ujhhgtgfeyxiexzf.m4625Ujhhgtgfeyxiexzf(((C0307Ujhhgtgfeyxiexzf) obj).f1833Ujhhgtgfeyxiexzf.getValue());
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FCONST_1 /* 12 */:
                C0328Ujhhgtgfeyxiexzf c0328Ujhhgtgfeyxiexzf3 = (C0328Ujhhgtgfeyxiexzf) obj;
                C1097feyxiexzfUjhhgtg.f4179Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0328Ujhhgtgfeyxiexzf3.f1933Ujhhgtgfeyxiexzf));
                C1078feyxiexzfUjhhgtg.f4150Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0328Ujhhgtgfeyxiexzf3.f1934Ujhhgtgfeyxiexzf));
                return c1943Ujhhgtgfeyxiexzf;
            case 13:
                C1103feyxiexzfUjhhgtg c1103feyxiexzfUjhhgtg = (C1103feyxiexzfUjhhgtg) obj;
                return Integer.valueOf(AbstractC3611Ujhhgtgfeyxiexzf.m5217Ujhhgtgfeyxiexzf(c1103feyxiexzfUjhhgtg, c1103feyxiexzfUjhhgtg.f4197Ujhhgtgfeyxiexzf));
            case Opcodes.DCONST_0 /* 14 */:
                C1019feyxiexzfUjhhgtg c1019feyxiexzfUjhhgtg = (C1019feyxiexzfUjhhgtg) obj;
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ModuleTabLayout moduleTabLayout = c1019feyxiexzfUjhhgtg.f3991Ujhhgtgfeyxiexzf;
                if (moduleTabLayout == null) {
                    MagicFactory.get(4928451710617126282L, strArr2);
                    moduleTabLayout = null;
                }
                C0682Ujhhgtgfeyxiexzf c0682UjhhgtgfeyxiexzfM2813feyxiexzfUjhhgtg = AbstractC1264feyxiexzfUjhhgtg.m2813feyxiexzfUjhhgtg(0, moduleTabLayout.getTabCount());
                ArrayList arrayList8 = new ArrayList();
                Iterator it6 = c0682UjhhgtgfeyxiexzfM2813feyxiexzfUjhhgtg.iterator();
                while (true) {
                    C0679Ujhhgtgfeyxiexzf c0679Ujhhgtgfeyxiexzf = (C0679Ujhhgtgfeyxiexzf) it6;
                    if (!c0679Ujhhgtgfeyxiexzf.f2803Ujhhgtgfeyxiexzf) {
                        return arrayList8;
                    }
                    int iNextInt = c0679Ujhhgtgfeyxiexzf.nextInt();
                    ModuleTabLayout moduleTabLayout2 = c1019feyxiexzfUjhhgtg.f3991Ujhhgtgfeyxiexzf;
                    if (moduleTabLayout2 == null) {
                        MagicFactory.get(4928451805106406794L, strArr2);
                        moduleTabLayout2 = null;
                    }
                    if (iNextInt >= 0) {
                        if (iNextInt < moduleTabLayout2.getTabCount()) {
                            c2080Ujhhgtgfeyxiexzf = (C2080Ujhhgtgfeyxiexzf) moduleTabLayout2.f6506Ujhhgtgfeyxiexzf.get(iNextInt);
                        }
                        charSequence = c2080Ujhhgtgfeyxiexzf.f6827Ujhhgtgfeyxiexzf;
                        if (charSequence != null) {
                            string = charSequence.toString();
                        } else {
                            string = null;
                        }
                        if (string == null) {
                            string = MagicFactory.get(4928451762156733834L, strArr2);
                        }
                        List listM2516Ujhhgtgfeyxiexzf = c1019feyxiexzfUjhhgtg.m2516Ujhhgtgfeyxiexzf(iNextInt);
                        arrayList = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(listM2516Ujhhgtgfeyxiexzf, 10));
                        i2 = 0;
                        for (Object obj2 : listM2516Ujhhgtgfeyxiexzf) {
                            i3 = i2 + 1;
                            if (i2 >= 0) {
                                AbstractC2852feyxiexzfUjhhgtg.m4193Ujhhgtgfeyxiexzf();
                                throw null;
                            }
                            arrayList.add(new C1111feyxiexzfUjhhgtg((AbstractC2485feyxiexzfUjhhgtg) obj2, iNextInt, string, i2));
                            i2 = i3;
                        }
                        arrayList2 = new ArrayList();
                        for (Object obj3 : arrayList) {
                            if (!(((C1111feyxiexzfUjhhgtg) obj3).f4207Ujhhgtgfeyxiexzf instanceof C2508feyxiexzfUjhhgtg)) {
                                arrayList2.add(obj3);
                            }
                        }
                        AbstractC2862feyxiexzfUjhhgtg.m4266feyxiexzfUjhhgtg(arrayList8, arrayList2);
                    } else {
                        moduleTabLayout2.getClass();
                    }
                    c2080Ujhhgtgfeyxiexzf = null;
                    charSequence = c2080Ujhhgtgfeyxiexzf.f6827Ujhhgtgfeyxiexzf;
                    if (charSequence != null) {
                        string = charSequence.toString();
                    } else {
                        string = null;
                    }
                    if (string == null) {
                        string = MagicFactory.get(4928451762156733834L, strArr2);
                    }
                    List listM2516Ujhhgtgfeyxiexzf2 = c1019feyxiexzfUjhhgtg.m2516Ujhhgtgfeyxiexzf(iNextInt);
                    arrayList = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(listM2516Ujhhgtgfeyxiexzf2, 10));
                    i2 = 0;
                    while (r9.hasNext()) {
                        i3 = i2 + 1;
                        if (i2 >= 0) {
                            AbstractC2852feyxiexzfUjhhgtg.m4193Ujhhgtgfeyxiexzf();
                            throw null;
                        }
                        arrayList.add(new C1111feyxiexzfUjhhgtg((AbstractC2485feyxiexzfUjhhgtg) obj2, iNextInt, string, i2));
                        i2 = i3;
                    }
                    arrayList2 = new ArrayList();
                    while (r7.hasNext()) {
                        if (!(((C1111feyxiexzfUjhhgtg) obj3).f4207Ujhhgtgfeyxiexzf instanceof C2508feyxiexzfUjhhgtg)) {
                            arrayList2.add(obj3);
                        }
                    }
                    AbstractC2862feyxiexzfUjhhgtg.m4266feyxiexzfUjhhgtg(arrayList8, arrayList2);
                }
                break;
            case 15:
                C0701Ujhhgtgfeyxiexzf c0701Ujhhgtgfeyxiexzf = (C0701Ujhhgtgfeyxiexzf) obj;
                C1050feyxiexzfUjhhgtg.f4101Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf((TextInputEditText) c0701Ujhhgtgfeyxiexzf.f2876Ujhhgtgfeyxiexzf));
                C1051feyxiexzfUjhhgtg.f4102Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf((TextInputEditText) c0701Ujhhgtgfeyxiexzf.f2878Ujhhgtgfeyxiexzf));
                C1054feyxiexzfUjhhgtg.f4105Ujhhgtgfeyxiexzf.m4624Ujhhgtgfeyxiexzf(((MaterialCheckBox) c0701Ujhhgtgfeyxiexzf.f2877Ujhhgtgfeyxiexzf).isChecked());
                return c1943Ujhhgtgfeyxiexzf;
            case 16:
                C0328Ujhhgtgfeyxiexzf c0328Ujhhgtgfeyxiexzf4 = (C0328Ujhhgtgfeyxiexzf) obj;
                C1211feyxiexzfUjhhgtg.f4516Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0328Ujhhgtgfeyxiexzf4.f1933Ujhhgtgfeyxiexzf));
                C1207feyxiexzfUjhhgtg.f4509Ujhhgtgfeyxiexzf.m4629Ujhhgtgfeyxiexzf(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(c0328Ujhhgtgfeyxiexzf4.f1934Ujhhgtgfeyxiexzf));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.SIPUSH /* 17 */:
                C0701Ujhhgtgfeyxiexzf c0701Ujhhgtgfeyxiexzf2 = (C0701Ujhhgtgfeyxiexzf) obj;
                int checkedRadioButtonId = ((RadioGroup) c0701Ujhhgtgfeyxiexzf2.f2878Ujhhgtgfeyxiexzf).getCheckedRadioButtonId();
                if (checkedRadioButtonId == ((MaterialRadioButton) c0701Ujhhgtgfeyxiexzf2.f2877Ujhhgtgfeyxiexzf).getId()) {
                    C1236feyxiexzfUjhhgtg.f4569Ujhhgtgfeyxiexzf.m4626Ujhhgtgfeyxiexzf(EnumC1208feyxiexzfUjhhgtg.f4510Ujhhgtgfeyxiexzf.f4513Ujhhgtgfeyxiexzf);
                } else if (checkedRadioButtonId == ((MaterialRadioButton) c0701Ujhhgtgfeyxiexzf2.f2876Ujhhgtgfeyxiexzf).getId()) {
                    C1236feyxiexzfUjhhgtg.f4569Ujhhgtgfeyxiexzf.m4626Ujhhgtgfeyxiexzf(EnumC1208feyxiexzfUjhhgtg.f4511Ujhhgtgfeyxiexzf.f4513Ujhhgtgfeyxiexzf);
                }
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LDC /* 18 */:
                C1135feyxiexzfUjhhgtg c1135feyxiexzfUjhhgtg = C1135feyxiexzfUjhhgtg.f4300Ujhhgtgfeyxiexzf;
                Long lM2674feyxiexzfUjhhgtg = AbstractC1184feyxiexzfUjhhgtg.m2674feyxiexzfUjhhgtg(AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(((C0319Ujhhgtgfeyxiexzf) obj).f1877Ujhhgtgfeyxiexzf));
                c1135feyxiexzfUjhhgtg.m4627Ujhhgtgfeyxiexzf(lM2674feyxiexzfUjhhgtg != null ? lM2674feyxiexzfUjhhgtg.longValue() : 88888L);
                return c1943Ujhhgtgfeyxiexzf;
            case 19:
                ((C1907feyxiexzfUjhhgtg) obj).invoke();
                return c1943Ujhhgtgfeyxiexzf;
            default:
                C2213Ujhhgtgfeyxiexzf.f7194Ujhhgtgfeyxiexzf.m4626Ujhhgtgfeyxiexzf((int) ((C0307Ujhhgtgfeyxiexzf) obj).f1833Ujhhgtgfeyxiexzf.getValue());
                return c1943Ujhhgtgfeyxiexzf;
        }
    }
}
