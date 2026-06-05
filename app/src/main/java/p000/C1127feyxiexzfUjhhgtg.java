package p000;

import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛲ要点脸能不能ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1127feyxiexzfUjhhgtg implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f4277Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1127feyxiexzfUjhhgtg(int i) {
        this.f4277Ujhhgtgfeyxiexzf = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) {
        Object c0919feyxiexzfUjhhgtg;
        Intent intent;
        Object c0919feyxiexzfUjhhgtg2;
        Object c0919feyxiexzfUjhhgtg3;
        Object c0919feyxiexzfUjhhgtg4;
        Object c0919feyxiexzfUjhhgtg5;
        Object c0919feyxiexzfUjhhgtg6;
        int i = this.f4277Ujhhgtgfeyxiexzf;
        int i2 = 6;
        boolean z = true;
        int i3 = 0;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                String str = (String) obj;
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(str, MagicFactory.get(4928317492889126282L, strArr)) && !C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(str, MagicFactory.get(4928317570198537610L, strArr))) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf = (C0578Ujhhgtgfeyxiexzf) obj;
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                if (c0578Ujhhgtgfeyxiexzf.m1848Ujhhgtgfeyxiexzf()[0] instanceof Intent) {
                    try {
                        c0919feyxiexzfUjhhgtg = c0578Ujhhgtgfeyxiexzf.m1848Ujhhgtgfeyxiexzf()[0];
                        if (c0919feyxiexzfUjhhgtg == null) {
                            c0919feyxiexzfUjhhgtg = null;
                        }
                    } catch (Throwable th) {
                        c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
                    }
                    intent = (Intent) (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg);
                } else {
                    try {
                        c0919feyxiexzfUjhhgtg2 = c0578Ujhhgtgfeyxiexzf.m1848Ujhhgtgfeyxiexzf()[1];
                        if (c0919feyxiexzfUjhhgtg2 == null) {
                            c0919feyxiexzfUjhhgtg2 = null;
                        }
                    } catch (Throwable th2) {
                        c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th2);
                    }
                    intent = (Intent) (c0919feyxiexzfUjhhgtg2 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg2);
                }
                for (InterfaceC0746Ujhhgtgfeyxiexzf interfaceC0746Ujhhgtgfeyxiexzf : C1126feyxiexzfUjhhgtg.f4276Ujhhgtgfeyxiexzf) {
                    try {
                        interfaceC0746Ujhhgtgfeyxiexzf.mo2085Ujhhgtgfeyxiexzf(c0578Ujhhgtgfeyxiexzf, intent);
                    } catch (Exception e) {
                        ArrayList arrayList = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                        StringBuilder sb = new StringBuilder();
                        sb.append(MagicFactory.get(4928317608853243274L, strArr2));
                        sb.append(interfaceC0746Ujhhgtgfeyxiexzf instanceof AbstractC2059Ujhhgtgfeyxiexzf ? ((AbstractC2059Ujhhgtgfeyxiexzf) interfaceC0746Ujhhgtgfeyxiexzf).mo1479feyxiexzfUjhhgtg() : MagicFactory.get(4928317784946902410L, strArr2));
                        AbstractC3317feyxiexzfUjhhgtg.m4809Ujhhgtgfeyxiexzf(sb, MagicFactory.get(4928317746292196746L, strArr2), e, 12);
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 2:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C1127feyxiexzfUjhhgtg(i2);
                return c1943Ujhhgtgfeyxiexzf;
            case 3:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C1127feyxiexzfUjhhgtg(8);
                return c1943Ujhhgtgfeyxiexzf;
            case 4:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C1127feyxiexzfUjhhgtg(7);
                return c1943Ujhhgtgfeyxiexzf;
            case 5:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C1127feyxiexzfUjhhgtg(9);
                return c1943Ujhhgtgfeyxiexzf;
            case 6:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg = (C3456feyxiexzfUjhhgtg) obj;
                String[] strArr3 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3456feyxiexzfUjhhgtg.m4953Ujhhgtgfeyxiexzf(MagicFactory.get(4928494999592502666L, strArr3));
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf = new C2812Ujhhgtgfeyxiexzf();
                c2812Ujhhgtgfeyxiexzf.m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928495965960144266L, strArr3));
                c3456feyxiexzfUjhhgtg.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 7:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg2 = (C3456feyxiexzfUjhhgtg) obj;
                String[] strArr4 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3456feyxiexzfUjhhgtg2.m4953Ujhhgtgfeyxiexzf(MagicFactory.get(4928498817818428810L, strArr4));
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf2 = new C2812Ujhhgtgfeyxiexzf();
                c2812Ujhhgtgfeyxiexzf2.m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928495390434526602L, strArr4));
                c3456feyxiexzfUjhhgtg2.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf2;
                return c1943Ujhhgtgfeyxiexzf;
            case 8:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg3 = (C3456feyxiexzfUjhhgtg) obj;
                String[] strArr5 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3456feyxiexzfUjhhgtg3.m4953Ujhhgtgfeyxiexzf(MagicFactory.get(4928495351779820938L, strArr5));
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf3 = new C2812Ujhhgtgfeyxiexzf();
                c2812Ujhhgtgfeyxiexzf3.m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928495038247208330L, strArr5), MagicFactory.get(4928495210045900170L, strArr5));
                c3456feyxiexzfUjhhgtg3.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf3;
                return c1943Ujhhgtgfeyxiexzf;
            case 9:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg4 = (C3456feyxiexzfUjhhgtg) obj;
                c3456feyxiexzfUjhhgtg4.m4953Ujhhgtgfeyxiexzf(MagicFactory.get(4928498993912087946L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf));
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf4 = new C2812Ujhhgtgfeyxiexzf();
                C3433feyxiexzfUjhhgtg c3433feyxiexzfUjhhgtg = new C3433feyxiexzfUjhhgtg();
                c3433feyxiexzfUjhhgtg.m4922Ujhhgtgfeyxiexzf(AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg(C1159feyxiexzfUjhhgtg.f4355Ujhhgtgfeyxiexzf));
                c3433feyxiexzfUjhhgtg.m4922Ujhhgtgfeyxiexzf(AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg(C1161feyxiexzfUjhhgtg.f4357Ujhhgtgfeyxiexzf));
                c3433feyxiexzfUjhhgtg.m4922Ujhhgtgfeyxiexzf(AbstractC1791feyxiexzfUjhhgtg.m3152feyxiexzfUjhhgtg(C1158feyxiexzfUjhhgtg.f4354Ujhhgtgfeyxiexzf));
                c2812Ujhhgtgfeyxiexzf4.f8949Ujhhgtgfeyxiexzf = c3433feyxiexzfUjhhgtg;
                c3456feyxiexzfUjhhgtg4.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf4;
                return c1943Ujhhgtgfeyxiexzf;
            case 10:
                return Boolean.valueOf(((View) obj).getVisibility() == 0);
            case 11:
                return Boolean.valueOf(((View) obj).getVisibility() == 0);
            case Opcodes.FCONST_1 /* 12 */:
                return Boolean.valueOf(((View) obj).getVisibility() == 0);
            case 13:
                C3265feyxiexzfUjhhgtg c3265feyxiexzfUjhhgtg = (C3265feyxiexzfUjhhgtg) obj;
                c3265feyxiexzfUjhhgtg.f10255Ujhhgtgfeyxiexzf = new C1127feyxiexzfUjhhgtg(14);
                c3265feyxiexzfUjhhgtg.f10256Ujhhgtgfeyxiexzf = new C1127feyxiexzfUjhhgtg(15);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DCONST_0 /* 14 */:
                ((C3456feyxiexzfUjhhgtg) obj).m4952Ujhhgtgfeyxiexzf(new C1127feyxiexzfUjhhgtg(17));
                return c1943Ujhhgtgfeyxiexzf;
            case 15:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg = (C3452feyxiexzfUjhhgtg) obj;
                C0394Ujhhgtgfeyxiexzf c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2694Ujhhgtgfeyxiexzf(c3452feyxiexzfUjhhgtg);
                Class<Object> cls = Object.class;
                Class<Object> clsM5159Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls));
                if (clsM5159Ujhhgtgfeyxiexzf == null) {
                    clsM5159Ujhhgtgfeyxiexzf = cls;
                }
                Class<String> clsM2695Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2695Ujhhgtgfeyxiexzf(c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf, clsM5159Ujhhgtgfeyxiexzf, String.class);
                Class cls2 = clsM2695Ujhhgtgfeyxiexzf != null ? clsM2695Ujhhgtgfeyxiexzf : String.class;
                Class<Object> clsM5159Ujhhgtgfeyxiexzf2 = AbstractC3593Ujhhgtgfeyxiexzf.m5159Ujhhgtgfeyxiexzf(AbstractC0959feyxiexzfUjhhgtg.m2443Ujhhgtgfeyxiexzf(cls));
                c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf.m1657Ujhhgtgfeyxiexzf(cls2, clsM5159Ujhhgtgfeyxiexzf2 != null ? clsM5159Ujhhgtgfeyxiexzf2 : Object.class);
                c3452feyxiexzfUjhhgtg.f10739Ujhhgtgfeyxiexzf = c0394UjhhgtgfeyxiexzfM2694Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case 16:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf2 = (C0578Ujhhgtgfeyxiexzf) obj;
                String[] strArr6 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c0578Ujhhgtgfeyxiexzf2.getClass();
                try {
                    c0919feyxiexzfUjhhgtg3 = c0578Ujhhgtgfeyxiexzf2.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg3 == null) {
                        c0919feyxiexzfUjhhgtg3 = null;
                    }
                } catch (Throwable th3) {
                    c0919feyxiexzfUjhhgtg3 = new C0919feyxiexzfUjhhgtg(th3);
                }
                String str2 = (String) (c0919feyxiexzfUjhhgtg3 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg3);
                try {
                    Object obj2 = c0578Ujhhgtgfeyxiexzf2.m1848Ujhhgtgfeyxiexzf()[1];
                    break;
                } catch (Throwable unused) {
                }
                for (InterfaceC0747Ujhhgtgfeyxiexzf interfaceC0747Ujhhgtgfeyxiexzf : C2064feyxiexzfUjhhgtg.f6792Ujhhgtgfeyxiexzf) {
                    try {
                        interfaceC0747Ujhhgtgfeyxiexzf.mo2086Ujhhgtgfeyxiexzf(c0578Ujhhgtgfeyxiexzf2, str2);
                    } catch (Exception e2) {
                        ArrayList arrayList2 = C2290feyxiexzfUjhhgtg.f7511Ujhhgtgfeyxiexzf;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(MagicFactory.get(4928316784219522442L, strArr6));
                        sb2.append(interfaceC0747Ujhhgtgfeyxiexzf instanceof AbstractC2059Ujhhgtgfeyxiexzf ? ((AbstractC2059Ujhhgtgfeyxiexzf) interfaceC0747Ujhhgtgfeyxiexzf).mo1479feyxiexzfUjhhgtg() : MagicFactory.get(4928316848644031882L, strArr6));
                        AbstractC3317feyxiexzfUjhhgtg.m4809Ujhhgtgfeyxiexzf(sb2, MagicFactory.get(4928316947428279690L, strArr6), e2, 12);
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.SIPUSH /* 17 */:
                String[] strArr7 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ((C2812Ujhhgtgfeyxiexzf) obj).m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928317050507494794L, strArr7), MagicFactory.get(4928317089162200458L, strArr7));
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.LDC /* 18 */:
                View view = (View) obj;
                String[] strArr8 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf(view, R.layout.module_dialog_system_browser, null, false);
                int i4 = R.id.moduleDialogBtnSystemBrowserAdd;
                MaterialButton materialButton = (MaterialButton) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogBtnSystemBrowserAdd);
                if (materialButton != null) {
                    i4 = R.id.moduleDialogEdtSystemBrowserHost;
                    TextInputEditText textInputEditText = (TextInputEditText) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogEdtSystemBrowserHost);
                    if (textInputEditText != null) {
                        i4 = R.id.moduleDialogInputSystemBrowserHost;
                        if (((TextInputLayout) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogInputSystemBrowserHost)) != null) {
                            i4 = R.id.moduleDialogRbSystemBrowserBlack;
                            MaterialRadioButton materialRadioButton = (MaterialRadioButton) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogRbSystemBrowserBlack);
                            if (materialRadioButton != null) {
                                i4 = R.id.moduleDialogRbSystemBrowserWhite;
                                MaterialRadioButton materialRadioButton2 = (MaterialRadioButton) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogRbSystemBrowserWhite);
                                if (materialRadioButton2 != null) {
                                    i4 = R.id.moduleDialogRgSystemBrowserMode;
                                    RadioGroup radioGroup = (RadioGroup) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogRgSystemBrowserMode);
                                    if (radioGroup != null) {
                                        i4 = R.id.moduleDialogRvSystemBrowserList;
                                        RecyclerView recyclerView = (RecyclerView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogRvSystemBrowserList);
                                        if (recyclerView != null) {
                                            LinearLayout linearLayout = (LinearLayout) viewM2416Ujhhgtgfeyxiexzf;
                                            final C0701Ujhhgtgfeyxiexzf c0701Ujhhgtgfeyxiexzf = new C0701Ujhhgtgfeyxiexzf(linearLayout, materialButton, textInputEditText, materialRadioButton, materialRadioButton2, radioGroup, recyclerView);
                                            C2071Ujhhgtgfeyxiexzf c2071Ujhhgtgfeyxiexzf = C2071Ujhhgtgfeyxiexzf.f6807Ujhhgtgfeyxiexzf;
                                            int iM4619Ujhhgtgfeyxiexzf = c2071Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf();
                                            EnumC2067feyxiexzfUjhhgtg enumC2067feyxiexzfUjhhgtg = EnumC2067feyxiexzfUjhhgtg.f6799Ujhhgtgfeyxiexzf;
                                            if (iM4619Ujhhgtgfeyxiexzf == enumC2067feyxiexzfUjhhgtg.f6802Ujhhgtgfeyxiexzf) {
                                                materialRadioButton2.setChecked(true);
                                            } else if (iM4619Ujhhgtgfeyxiexzf == EnumC2067feyxiexzfUjhhgtg.f6800Ujhhgtgfeyxiexzf.f6802Ujhhgtgfeyxiexzf) {
                                                materialRadioButton.setChecked(true);
                                            }
                                            int iM4619Ujhhgtgfeyxiexzf2 = c2071Ujhhgtgfeyxiexzf.m4619Ujhhgtgfeyxiexzf();
                                            final ArrayList arrayList3 = iM4619Ujhhgtgfeyxiexzf2 == enumC2067feyxiexzfUjhhgtg.f6802Ujhhgtgfeyxiexzf ? new ArrayList(C2072feyxiexzfUjhhgtg.f6808Ujhhgtgfeyxiexzf.m4622Ujhhgtgfeyxiexzf()) : iM4619Ujhhgtgfeyxiexzf2 == EnumC2067feyxiexzfUjhhgtg.f6800Ujhhgtgfeyxiexzf.f6802Ujhhgtgfeyxiexzf ? new ArrayList(C2070Ujhhgtgfeyxiexzf.f6806Ujhhgtgfeyxiexzf.m4622Ujhhgtgfeyxiexzf()) : new ArrayList();
                                            final C2823feyxiexzfUjhhgtg c2823feyxiexzfUjhhgtg = new C2823feyxiexzfUjhhgtg();
                                            c2823feyxiexzfUjhhgtg.f8979Ujhhgtgfeyxiexzf = arrayList3;
                                            c2823feyxiexzfUjhhgtg.f8980Ujhhgtgfeyxiexzf = new C2073feyxiexzfUjhhgtg(arrayList3, i3, c2823feyxiexzfUjhhgtg);
                                            view.getContext();
                                            recyclerView.setLayoutManager(new LinearLayoutManager(1));
                                            recyclerView.setAdapter(c2823feyxiexzfUjhhgtg);
                                            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: 上海高中ᛱ谢子非ᛱᛲ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴ
                                                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                                                public final void onCheckedChanged(RadioGroup radioGroup2, int i5) {
                                                    C0701Ujhhgtgfeyxiexzf c0701Ujhhgtgfeyxiexzf2 = c0701Ujhhgtgfeyxiexzf;
                                                    int id = ((MaterialRadioButton) c0701Ujhhgtgfeyxiexzf2.f2878Ujhhgtgfeyxiexzf).getId();
                                                    ArrayList arrayList4 = arrayList3;
                                                    if (i5 == id) {
                                                        arrayList4.clear();
                                                        arrayList4.addAll(new ArrayList(C2072feyxiexzfUjhhgtg.f6808Ujhhgtgfeyxiexzf.m4622Ujhhgtgfeyxiexzf()));
                                                    } else if (i5 == ((MaterialRadioButton) c0701Ujhhgtgfeyxiexzf2.f2876Ujhhgtgfeyxiexzf).getId()) {
                                                        arrayList4.clear();
                                                        arrayList4.addAll(new ArrayList(C2070Ujhhgtgfeyxiexzf.f6806Ujhhgtgfeyxiexzf.m4622Ujhhgtgfeyxiexzf()));
                                                    }
                                                    c2823feyxiexzfUjhhgtg.m2137Ujhhgtgfeyxiexzf();
                                                }
                                            });
                                            materialButton.setOnClickListener(new ViewOnClickListenerC2701feyxiexzfUjhhgtg(c0701Ujhhgtgfeyxiexzf, arrayList3, c2823feyxiexzfUjhhgtg));
                                            C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf = new C0290Ujhhgtgfeyxiexzf();
                                            C2074Ujhhgtgfeyxiexzf.f6812Ujhhgtgfeyxiexzf.getClass();
                                            c0290Ujhhgtgfeyxiexzf.f1721Ujhhgtgfeyxiexzf = C2074Ujhhgtgfeyxiexzf.f6816Ujhhgtgfeyxiexzf;
                                            c0290Ujhhgtgfeyxiexzf.f1723Ujhhgtgfeyxiexzf = linearLayout;
                                            c0290Ujhhgtgfeyxiexzf.m1502Ujhhgtgfeyxiexzf(MagicFactory.get(4928906418804753802L, strArr8), new C2550feyxiexzfUjhhgtg(c0701Ujhhgtgfeyxiexzf, 7, arrayList3));
                                            AbstractC1225feyxiexzfUjhhgtg.m2709Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf, null, 3);
                                            return c1943Ujhhgtgfeyxiexzf;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException(MagicFactory.get(4928805491368265098L, strArr8).concat(viewM2416Ujhhgtgfeyxiexzf.getResources().getResourceName(i4)));
            case 19:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf3 = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf3.getClass();
                try {
                    c0919feyxiexzfUjhhgtg4 = c0578Ujhhgtgfeyxiexzf3.m1848Ujhhgtgfeyxiexzf()[0];
                    if (c0919feyxiexzfUjhhgtg4 == null) {
                        c0919feyxiexzfUjhhgtg4 = null;
                    }
                } catch (Throwable th4) {
                    c0919feyxiexzfUjhhgtg4 = new C0919feyxiexzfUjhhgtg(th4);
                }
                String str3 = (String) (c0919feyxiexzfUjhhgtg4 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg4);
                C1983Ujhhgtgfeyxiexzf.f6550Ujhhgtgfeyxiexzf = str3 != null ? str3 : "";
                return c1943Ujhhgtgfeyxiexzf;
            case 20:
                ((C3265feyxiexzfUjhhgtg) obj).f10255Ujhhgtgfeyxiexzf = new C1127feyxiexzfUjhhgtg(22);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ILOAD /* 21 */:
                return Boolean.valueOf(((Class) obj).getName().startsWith(MagicFactory.get(4928218579792299402L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf)));
            case Opcodes.LLOAD /* 22 */:
                C3456feyxiexzfUjhhgtg c3456feyxiexzfUjhhgtg5 = (C3456feyxiexzfUjhhgtg) obj;
                String[] strArr9 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3456feyxiexzfUjhhgtg5.m4953Ujhhgtgfeyxiexzf(MagicFactory.get(4928217948432106890L, strArr9));
                C2812Ujhhgtgfeyxiexzf c2812Ujhhgtgfeyxiexzf5 = new C2812Ujhhgtgfeyxiexzf();
                c2812Ujhhgtgfeyxiexzf5.m4143Ujhhgtgfeyxiexzf(MagicFactory.get(4928218833195369866L, strArr9), MagicFactory.get(4928217888302564746L, strArr9));
                c3456feyxiexzfUjhhgtg5.f10746Ujhhgtgfeyxiexzf = c2812Ujhhgtgfeyxiexzf5;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.FLOAD /* 23 */:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C1127feyxiexzfUjhhgtg(24);
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.DLOAD /* 24 */:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg2 = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr10 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg2.m4951Ujhhgtgfeyxiexzf(MagicFactory.get(4928866106241713546L, strArr10));
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf = new C0394Ujhhgtgfeyxiexzf();
                if (AbstractC1265feyxiexzfUjhhgtg.m2830Ujhhgtgfeyxiexzf(EnumC2264feyxiexzfUjhhgtg.f7374Ujhhgtgfeyxiexzf) || AbstractC1265feyxiexzfUjhhgtg.m2831Ujhhgtgfeyxiexzf(EnumC2263Ujhhgtgfeyxiexzf.f7351Ujhhgtgfeyxiexzf)) {
                    c0394Ujhhgtgfeyxiexzf.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928387333352326538L, strArr10), MagicFactory.get(4928387384891934090L, strArr10));
                } else {
                    c0394Ujhhgtgfeyxiexzf.m1659feyxiexzfUjhhgtg(MagicFactory.get(4928387535215789450L, strArr10));
                    c0394Ujhhgtgfeyxiexzf.m1660feyxiexzfUjhhgtg(MagicFactory.get(4928866046112171402L, strArr10));
                }
                c3452feyxiexzfUjhhgtg2.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf;
                return c1943Ujhhgtgfeyxiexzf;
            case Opcodes.ALOAD /* 25 */:
                C0578Ujhhgtgfeyxiexzf c0578Ujhhgtgfeyxiexzf4 = (C0578Ujhhgtgfeyxiexzf) obj;
                c0578Ujhhgtgfeyxiexzf4.getClass();
                int i5 = 2;
                try {
                    c0919feyxiexzfUjhhgtg5 = c0578Ujhhgtgfeyxiexzf4.m1848Ujhhgtgfeyxiexzf()[2];
                    if (c0919feyxiexzfUjhhgtg5 == null) {
                        c0919feyxiexzfUjhhgtg5 = null;
                    }
                } catch (Throwable th5) {
                    c0919feyxiexzfUjhhgtg5 = new C0919feyxiexzfUjhhgtg(th5);
                }
                if (c0919feyxiexzfUjhhgtg5 instanceof C0919feyxiexzfUjhhgtg) {
                    c0919feyxiexzfUjhhgtg5 = null;
                }
                if (c0919feyxiexzfUjhhgtg5 == Bitmap.CompressFormat.JPEG) {
                    try {
                        c0919feyxiexzfUjhhgtg6 = c0578Ujhhgtgfeyxiexzf4.m1848Ujhhgtgfeyxiexzf()[3];
                        if (c0919feyxiexzfUjhhgtg6 == null) {
                            c0919feyxiexzfUjhhgtg6 = null;
                        }
                    } catch (Throwable th6) {
                        c0919feyxiexzfUjhhgtg6 = new C0919feyxiexzfUjhhgtg(th6);
                    }
                    String str4 = (String) (c0919feyxiexzfUjhhgtg6 instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg6);
                    String str5 = str4 != null ? str4 : "";
                    String[] strArr11 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                    if (AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(str5, MagicFactory.get(4928387264632849802L, strArr11), false) || AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(str5, MagicFactory.get(4928387234568078730L, strArr11), false)) {
                        new C2501feyxiexzfUjhhgtg(i5, i2, c0578Ujhhgtgfeyxiexzf4).m3786Ujhhgtgfeyxiexzf(Bitmap.CompressFormat.PNG);
                    }
                }
                return c1943Ujhhgtgfeyxiexzf;
            case 26:
                obj.getClass();
                throw new ClassCastException();
            case 27:
                ((C3265feyxiexzfUjhhgtg) obj).f10256Ujhhgtgfeyxiexzf = new C1947feyxiexzfUjhhgtg(i2);
                return c1943Ujhhgtgfeyxiexzf;
            case 28:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg3 = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr12 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg3.m4951Ujhhgtgfeyxiexzf(MagicFactory.get(4928491890036180362L, strArr12));
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf2 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf2.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928491726827423114L, strArr12), MagicFactory.get(4928491688172717450L, strArr12));
                c3452feyxiexzfUjhhgtg3.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf2;
                return c1943Ujhhgtgfeyxiexzf;
            default:
                C3452feyxiexzfUjhhgtg c3452feyxiexzfUjhhgtg4 = (C3452feyxiexzfUjhhgtg) obj;
                String[] strArr13 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3452feyxiexzfUjhhgtg4.m4951Ujhhgtgfeyxiexzf(MagicFactory.get(4928492272288269706L, strArr13));
                C0394Ujhhgtgfeyxiexzf c0394Ujhhgtgfeyxiexzf3 = new C0394Ujhhgtgfeyxiexzf();
                c0394Ujhhgtgfeyxiexzf3.m1661feyxiexzfUjhhgtg(MagicFactory.get(4928488694580512138L, strArr13), MagicFactory.get(4928488771889923466L, strArr13));
                c3452feyxiexzfUjhhgtg4.f10739Ujhhgtgfeyxiexzf = c0394Ujhhgtgfeyxiexzf3;
                return c1943Ujhhgtgfeyxiexzf;
        }
    }
}
