package p000;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import me.hd.wauxv.ui.setting.view.ModuleTabLayout;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳᛲᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2737Ujhhgtgfeyxiexzf implements TextWatcher {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8699Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f8700Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2737Ujhhgtgfeyxiexzf(int i, Object obj) {
        this.f8699Ujhhgtgfeyxiexzf = i;
        this.f8700Ujhhgtgfeyxiexzf = obj;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d1 A[SYNTHETIC] */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        String str2;
        String str3;
        C2490feyxiexzfUjhhgtg c2490feyxiexzfUjhhgtg;
        switch (this.f8699Ujhhgtgfeyxiexzf) {
            case 0:
                MaterialTextView materialTextView = (MaterialTextView) ((C0701Ujhhgtgfeyxiexzf) this.f8700Ujhhgtgfeyxiexzf).f2876Ujhhgtgfeyxiexzf;
                C2740feyxiexzfUjhhgtg c2740feyxiexzfUjhhgtg = C2740feyxiexzfUjhhgtg.f8706Ujhhgtgfeyxiexzf;
                String strValueOf = String.valueOf(editable);
                c2740feyxiexzfUjhhgtg.getClass();
                materialTextView.setText(C2740feyxiexzfUjhhgtg.m4046feyxiexzfUjhhgtg(strValueOf));
                break;
            case 1:
                ((C3677feyxiexzfUjhhgtg) this.f8700Ujhhgtgfeyxiexzf).m5366Ujhhgtgfeyxiexzf(String.valueOf(editable));
                break;
            default:
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                C1019feyxiexzfUjhhgtg c1019feyxiexzfUjhhgtg = (C1019feyxiexzfUjhhgtg) this.f8700Ujhhgtgfeyxiexzf;
                String strValueOf2 = String.valueOf(editable);
                ModuleTabLayout moduleTabLayout = null;
                if (!AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(strValueOf2)) {
                    boolean z = true;
                    c1019feyxiexzfUjhhgtg.f3988Ujhhgtgfeyxiexzf = true;
                    List<C1111feyxiexzfUjhhgtg> list = (List) c1019feyxiexzfUjhhgtg.f3987Ujhhgtgfeyxiexzf.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (C1111feyxiexzfUjhhgtg c1111feyxiexzfUjhhgtg : list) {
                        AbstractC2485feyxiexzfUjhhgtg abstractC2485feyxiexzfUjhhgtg = c1111feyxiexzfUjhhgtg.f4207Ujhhgtgfeyxiexzf;
                        boolean z2 = abstractC2485feyxiexzfUjhhgtg instanceof C2507feyxiexzfUjhhgtg;
                        if (z2) {
                            str = ((C2507feyxiexzfUjhhgtg) abstractC2485feyxiexzfUjhhgtg).f8186Ujhhgtgfeyxiexzf;
                        } else if (abstractC2485feyxiexzfUjhhgtg instanceof C2486feyxiexzfUjhhgtg) {
                            str = ((C2486feyxiexzfUjhhgtg) abstractC2485feyxiexzfUjhhgtg).f8119Ujhhgtgfeyxiexzf;
                        } else {
                            str = abstractC2485feyxiexzfUjhhgtg instanceof C2489feyxiexzfUjhhgtg ? ((C2489feyxiexzfUjhhgtg) abstractC2485feyxiexzfUjhhgtg).f8124Ujhhgtgfeyxiexzf : "";
                        }
                        String str4 = str;
                        if (z2) {
                            str3 = ((C2507feyxiexzfUjhhgtg) abstractC2485feyxiexzfUjhhgtg).f8187Ujhhgtgfeyxiexzf;
                        } else if (abstractC2485feyxiexzfUjhhgtg instanceof C2486feyxiexzfUjhhgtg) {
                            str3 = ((C2486feyxiexzfUjhhgtg) abstractC2485feyxiexzfUjhhgtg).f8120Ujhhgtgfeyxiexzf;
                        } else {
                            if (abstractC2485feyxiexzfUjhhgtg instanceof C2489feyxiexzfUjhhgtg) {
                                str3 = ((C2489feyxiexzfUjhhgtg) abstractC2485feyxiexzfUjhhgtg).f8125Ujhhgtgfeyxiexzf;
                            } else {
                                str2 = null;
                            }
                            if (!AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(str4, strValueOf2, z) || (str2 != null && AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(str2, strValueOf2, z) == z)) {
                                c2490feyxiexzfUjhhgtg = new C2490feyxiexzfUjhhgtg(str4, str2, c1111feyxiexzfUjhhgtg.f4208Ujhhgtgfeyxiexzf, c1111feyxiexzfUjhhgtg.f4209Ujhhgtgfeyxiexzf, c1111feyxiexzfUjhhgtg.f4210Ujhhgtgfeyxiexzf, new ViewOnClickListenerC3674feyxiexzfUjhhgtg(c1019feyxiexzfUjhhgtg, 3, c1111feyxiexzfUjhhgtg));
                            } else {
                                c2490feyxiexzfUjhhgtg = null;
                            }
                            if (c2490feyxiexzfUjhhgtg != null) {
                                arrayList.add(c2490feyxiexzfUjhhgtg);
                            }
                            z = true;
                        }
                        str2 = str3;
                        if (AbstractC1152feyxiexzfUjhhgtg.m2623feyxiexzfUjhhgtg(str4, strValueOf2, z)) {
                            c2490feyxiexzfUjhhgtg = new C2490feyxiexzfUjhhgtg(str4, str2, c1111feyxiexzfUjhhgtg.f4208Ujhhgtgfeyxiexzf, c1111feyxiexzfUjhhgtg.f4209Ujhhgtgfeyxiexzf, c1111feyxiexzfUjhhgtg.f4210Ujhhgtgfeyxiexzf, new ViewOnClickListenerC3674feyxiexzfUjhhgtg(c1019feyxiexzfUjhhgtg, 3, c1111feyxiexzfUjhhgtg));
                        } else {
                            c2490feyxiexzfUjhhgtg = new C2490feyxiexzfUjhhgtg(str4, str2, c1111feyxiexzfUjhhgtg.f4208Ujhhgtgfeyxiexzf, c1111feyxiexzfUjhhgtg.f4209Ujhhgtgfeyxiexzf, c1111feyxiexzfUjhhgtg.f4210Ujhhgtgfeyxiexzf, new ViewOnClickListenerC3674feyxiexzfUjhhgtg(c1019feyxiexzfUjhhgtg, 3, c1111feyxiexzfUjhhgtg));
                        }
                        if (c2490feyxiexzfUjhhgtg != null) {
                            arrayList.add(c2490feyxiexzfUjhhgtg);
                        }
                        z = true;
                    }
                    if (arrayList.isEmpty()) {
                        c1019feyxiexzfUjhhgtg.m2517Ujhhgtgfeyxiexzf().m3268Ujhhgtgfeyxiexzf(Collections.singletonList(new C2508feyxiexzfUjhhgtg("未找到匹配的功能")));
                    } else {
                        C1905feyxiexzfUjhhgtg c1905feyxiexzfUjhhgtgM2517Ujhhgtgfeyxiexzf = c1019feyxiexzfUjhhgtg.m2517Ujhhgtgfeyxiexzf();
                        C0094Ujhhgtgfeyxiexzf c0094Ujhhgtgfeyxiexzf = new C0094Ujhhgtgfeyxiexzf(10);
                        c0094Ujhhgtgfeyxiexzf.add(new C2508feyxiexzfUjhhgtg("搜索结果(" + arrayList.size() + ')'));
                        c0094Ujhhgtgfeyxiexzf.addAll(arrayList);
                        c1905feyxiexzfUjhhgtgM2517Ujhhgtgfeyxiexzf.m3268Ujhhgtgfeyxiexzf(AbstractC1245feyxiexzfUjhhgtg.m2746Ujhhgtgfeyxiexzf(c0094Ujhhgtgfeyxiexzf));
                    }
                } else if (c1019feyxiexzfUjhhgtg.f3988Ujhhgtgfeyxiexzf) {
                    C1905feyxiexzfUjhhgtg c1905feyxiexzfUjhhgtgM2517Ujhhgtgfeyxiexzf2 = c1019feyxiexzfUjhhgtg.m2517Ujhhgtgfeyxiexzf();
                    ModuleTabLayout moduleTabLayout2 = c1019feyxiexzfUjhhgtg.f3991Ujhhgtgfeyxiexzf;
                    if (moduleTabLayout2 == null) {
                        "tabLayout";
                    } else {
                        moduleTabLayout = moduleTabLayout2;
                    }
                    c1905feyxiexzfUjhhgtgM2517Ujhhgtgfeyxiexzf2.m3268Ujhhgtgfeyxiexzf(c1019feyxiexzfUjhhgtg.m2516Ujhhgtgfeyxiexzf(moduleTabLayout.getSelectedTabPosition()));
                    c1019feyxiexzfUjhhgtg.f3988Ujhhgtgfeyxiexzf = false;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f8699Ujhhgtgfeyxiexzf;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f8699Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    private final void m4040Ujhhgtgfeyxiexzf(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    private final void m4041Ujhhgtgfeyxiexzf(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    private final void m4042Ujhhgtgfeyxiexzf(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    private final void m4043Ujhhgtgfeyxiexzf(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    private final void m4044Ujhhgtgfeyxiexzf(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    private final void m4045Ujhhgtgfeyxiexzf(int i, int i2, int i3, CharSequence charSequence) {
    }
}
