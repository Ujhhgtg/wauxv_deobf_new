package p000;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2701feyxiexzfUjhhgtg implements View.OnClickListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f8618Ujhhgtgfeyxiexzf = 1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f8619Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f8620Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f8621Ujhhgtgfeyxiexzf;

    public /* synthetic */ ViewOnClickListenerC2701feyxiexzfUjhhgtg(C0701Ujhhgtgfeyxiexzf c0701Ujhhgtgfeyxiexzf, ArrayList arrayList, C2823feyxiexzfUjhhgtg c2823feyxiexzfUjhhgtg) {
        this.f8620Ujhhgtgfeyxiexzf = c0701Ujhhgtgfeyxiexzf;
        this.f8619Ujhhgtgfeyxiexzf = arrayList;
        this.f8621Ujhhgtgfeyxiexzf = c2823feyxiexzfUjhhgtg;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2717feyxiexzfUjhhgtg c2717feyxiexzfUjhhgtg;
        C3476feyxiexzfUjhhgtg c3476feyxiexzfUjhhgtg;
        switch (this.f8618Ujhhgtgfeyxiexzf) {
            case 0:
                C0976feyxiexzfUjhhgtg c0976feyxiexzfUjhhgtg = (C0976feyxiexzfUjhhgtg) this.f8620Ujhhgtgfeyxiexzf;
                C0330Ujhhgtgfeyxiexzf c0330Ujhhgtgfeyxiexzf = (C0330Ujhhgtgfeyxiexzf) this.f8621Ujhhgtgfeyxiexzf;
                String str = EnumC0628Ujhhgtgfeyxiexzf.f2668Ujhhgtgfeyxiexzf.f2671Ujhhgtgfeyxiexzf;
                ArrayList arrayList = this.f8619Ujhhgtgfeyxiexzf;
                int size = arrayList.size();
                C0629Ujhhgtgfeyxiexzf.f2673Ujhhgtgfeyxiexzf.getClass();
                ArrayList arrayList2 = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((C0627Ujhhgtgfeyxiexzf) it.next()).f2659Ujhhgtgfeyxiexzf);
                }
                Set setM4256Ujhhgtgfeyxiexzf = AbstractC2856feyxiexzfUjhhgtg.m4256Ujhhgtgfeyxiexzf(arrayList2);
                int i = 1;
                while (true) {
                    StringBuilder sb = new StringBuilder();
                    String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                    sb.append(MagicFactory.get(4928775426597193098L, strArr));
                    sb.append(i);
                    String string = sb.toString();
                    if (!setM4256Ujhhgtgfeyxiexzf.contains(string)) {
                        arrayList.add(new C0627Ujhhgtgfeyxiexzf(str, size, string, true, new String[0]));
                        C2726Ujhhgtgfeyxiexzf.f8680Ujhhgtgfeyxiexzf.getClass();
                        if (C2726Ujhhgtgfeyxiexzf.m4036feyxiexzfUjhhgtg(arrayList)) {
                            Object obj = c0976feyxiexzfUjhhgtg.f3870Ujhhgtgfeyxiexzf;
                            C2717feyxiexzfUjhhgtg c2717feyxiexzfUjhhgtg2 = null;
                            if (obj == null) {
                                MagicFactory.get(4928779880478279050L, strArr);
                                c2717feyxiexzfUjhhgtg = null;
                            } else {
                                c2717feyxiexzfUjhhgtg = (C2717feyxiexzfUjhhgtg) obj;
                            }
                            c2717feyxiexzfUjhhgtg.m4032Ujhhgtgfeyxiexzf(arrayList);
                            Object obj2 = c0976feyxiexzfUjhhgtg.f3870Ujhhgtgfeyxiexzf;
                            if (obj2 == null) {
                                MagicFactory.get(4928779983557494154L, strArr);
                            } else {
                                c2717feyxiexzfUjhhgtg2 = (C2717feyxiexzfUjhhgtg) obj2;
                            }
                            C2726Ujhhgtgfeyxiexzf.m4035feyxiexzfUjhhgtg(c0330Ujhhgtgfeyxiexzf, arrayList, c2717feyxiexzfUjhhgtg2);
                        } else if (!arrayList.isEmpty()) {
                            arrayList.remove(AbstractC2852feyxiexzfUjhhgtg.m4191Ujhhgtgfeyxiexzf(arrayList));
                        }
                    } else {
                        i++;
                    }
                    break;
                }
                break;
            case 1:
                C0310Ujhhgtgfeyxiexzf c0310Ujhhgtgfeyxiexzf = (C0310Ujhhgtgfeyxiexzf) this.f8621Ujhhgtgfeyxiexzf;
                C0976feyxiexzfUjhhgtg c0976feyxiexzfUjhhgtg2 = (C0976feyxiexzfUjhhgtg) this.f8620Ujhhgtgfeyxiexzf;
                C3613Ujhhgtgfeyxiexzf c3613Ujhhgtgfeyxiexzf = C3613Ujhhgtgfeyxiexzf.f11238Ujhhgtgfeyxiexzf;
                Context context = c0310Ujhhgtgfeyxiexzf.f1849Ujhhgtgfeyxiexzf.getContext();
                Object obj3 = c0976feyxiexzfUjhhgtg2.f3870Ujhhgtgfeyxiexzf;
                if (obj3 == null) {
                    MagicFactory.get(4928786962879350154L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf);
                    c3476feyxiexzfUjhhgtg = null;
                } else {
                    c3476feyxiexzfUjhhgtg = (C3476feyxiexzfUjhhgtg) obj3;
                }
                c3613Ujhhgtgfeyxiexzf.getClass();
                C3613Ujhhgtgfeyxiexzf.m5254feyxiexzfUjhhgtg(context, null, this.f8619Ujhhgtgfeyxiexzf, c3476feyxiexzfUjhhgtg);
                break;
            default:
                C0701Ujhhgtgfeyxiexzf c0701Ujhhgtgfeyxiexzf = (C0701Ujhhgtgfeyxiexzf) this.f8620Ujhhgtgfeyxiexzf;
                C2823feyxiexzfUjhhgtg c2823feyxiexzfUjhhgtg = (C2823feyxiexzfUjhhgtg) this.f8621Ujhhgtgfeyxiexzf;
                TextInputEditText textInputEditText = (TextInputEditText) c0701Ujhhgtgfeyxiexzf.f2877Ujhhgtgfeyxiexzf;
                String strM2774Ujhhgtgfeyxiexzf = AbstractC1246feyxiexzfUjhhgtg.m2774Ujhhgtgfeyxiexzf(textInputEditText);
                if (!AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(strM2774Ujhhgtgfeyxiexzf)) {
                    this.f8619Ujhhgtgfeyxiexzf.add(strM2774Ujhhgtgfeyxiexzf);
                    c2823feyxiexzfUjhhgtg.m2137Ujhhgtgfeyxiexzf();
                    Editable text = textInputEditText.getText();
                    if (text != null) {
                        text.clear();
                    }
                }
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC2701feyxiexzfUjhhgtg(C0330Ujhhgtgfeyxiexzf c0330Ujhhgtgfeyxiexzf, C0976feyxiexzfUjhhgtg c0976feyxiexzfUjhhgtg, ArrayList arrayList) {
        this.f8619Ujhhgtgfeyxiexzf = arrayList;
        this.f8620Ujhhgtgfeyxiexzf = c0976feyxiexzfUjhhgtg;
        this.f8621Ujhhgtgfeyxiexzf = c0330Ujhhgtgfeyxiexzf;
    }

    public /* synthetic */ ViewOnClickListenerC2701feyxiexzfUjhhgtg(C0310Ujhhgtgfeyxiexzf c0310Ujhhgtgfeyxiexzf, ArrayList arrayList, C0976feyxiexzfUjhhgtg c0976feyxiexzfUjhhgtg) {
        this.f8621Ujhhgtgfeyxiexzf = c0310Ujhhgtgfeyxiexzf;
        this.f8619Ujhhgtgfeyxiexzf = arrayList;
        this.f8620Ujhhgtgfeyxiexzf = c0976feyxiexzfUjhhgtg;
    }
}
