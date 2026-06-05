package p000;

import android.content.Context;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textview.MaterialTextView;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;
import me.hd.wauxv.ui.setting.view.ModuleRecyclerView;
import me.hd.wauxv.ui.setting.view.ModuleTabLayout;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸能不能ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC3674feyxiexzfUjhhgtg implements View.OnClickListener {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f11671Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f11672Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f11673Ujhhgtgfeyxiexzf;

    public /* synthetic */ ViewOnClickListenerC3674feyxiexzfUjhhgtg(Object obj, int i, Object obj2) {
        this.f11671Ujhhgtgfeyxiexzf = i;
        this.f11673Ujhhgtgfeyxiexzf = obj;
        this.f11672Ujhhgtgfeyxiexzf = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0043  */
    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws NoSuchAlgorithmException, IOException {
        C3678feyxiexzfUjhhgtg c3678feyxiexzfUjhhgtg;
        String[] strArr;
        boolean zM2931Ujhhgtgfeyxiexzf;
        MaterialTextView materialTextView;
        C2080Ujhhgtgfeyxiexzf c2080Ujhhgtgfeyxiexzf;
        ModuleRecyclerView moduleRecyclerView;
        C1981Ujhhgtgfeyxiexzf c1981Ujhhgtgfeyxiexzf;
        int i = this.f11671Ujhhgtgfeyxiexzf;
        ModuleRecyclerView moduleRecyclerView2 = null;
        Object obj = this.f11672Ujhhgtgfeyxiexzf;
        Object obj2 = this.f11673Ujhhgtgfeyxiexzf;
        switch (i) {
            case 0:
                C3677feyxiexzfUjhhgtg c3677feyxiexzfUjhhgtg = (C3677feyxiexzfUjhhgtg) obj;
                if (((Boolean) ((InterfaceC3549feyxiexzfUjhhgtg) obj2).invoke(c3677feyxiexzfUjhhgtg)).booleanValue()) {
                    return;
                }
                ((C0400Ujhhgtgfeyxiexzf) c3677feyxiexzfUjhhgtg.f11679Ujhhgtgfeyxiexzf.getValue()).m1677feyxiexzfUjhhgtg();
                return;
            case 1:
                InterfaceC3553feyxiexzfUjhhgtg interfaceC3553feyxiexzfUjhhgtg = (InterfaceC3553feyxiexzfUjhhgtg) obj2;
                C3677feyxiexzfUjhhgtg c3677feyxiexzfUjhhgtg2 = (C3677feyxiexzfUjhhgtg) obj;
                C3678feyxiexzfUjhhgtg c3678feyxiexzfUjhhgtg2 = c3677feyxiexzfUjhhgtg2.f11678Ujhhgtgfeyxiexzf;
                if (c3678feyxiexzfUjhhgtg2 == null) {
                    MagicFactory.get(4928464672828425610L, AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf);
                    c3678feyxiexzfUjhhgtg = null;
                } else {
                    c3678feyxiexzfUjhhgtg = c3678feyxiexzfUjhhgtg2;
                }
                if (((Boolean) interfaceC3553feyxiexzfUjhhgtg.mo1179Ujhhgtgfeyxiexzf(c3678feyxiexzfUjhhgtg.m5369Ujhhgtgfeyxiexzf(), c3677feyxiexzfUjhhgtg2)).booleanValue()) {
                    return;
                }
                ((C0400Ujhhgtgfeyxiexzf) c3677feyxiexzfUjhhgtg2.f11679Ujhhgtgfeyxiexzf.getValue()).m1677feyxiexzfUjhhgtg();
                return;
            case 2:
                C1414feyxiexzfUjhhgtg c1414feyxiexzfUjhhgtg = (C1414feyxiexzfUjhhgtg) obj2;
                C1019feyxiexzfUjhhgtg c1019feyxiexzfUjhhgtg = (C1019feyxiexzfUjhhgtg) obj;
                String[] strArr2 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                View viewM2416Ujhhgtgfeyxiexzf = AbstractC0924feyxiexzfUjhhgtg.m2416Ujhhgtgfeyxiexzf(view, R.layout.module_dialog_plugin_readme, null, false);
                MaterialTextView materialTextView2 = (MaterialTextView) AbstractC1246feyxiexzfUjhhgtg.m2765Ujhhgtgfeyxiexzf(viewM2416Ujhhgtgfeyxiexzf, R.id.moduleDialogTvPluginReadme);
                if (materialTextView2 == null) {
                    throw new NullPointerException(MagicFactory.get(4928806590879892874L, strArr2).concat(viewM2416Ujhhgtgfeyxiexzf.getResources().getResourceName(R.id.moduleDialogTvPluginReadme)));
                }
                LinearLayout linearLayout = (LinearLayout) viewM2416Ujhhgtgfeyxiexzf;
                Context context = materialTextView2.getContext();
                ArrayList<C3732feyxiexzfUjhhgtg> arrayList = new ArrayList(3);
                TextView.BufferType bufferType = TextView.BufferType.SPANNABLE;
                arrayList.add(new C3732feyxiexzfUjhhgtg());
                arrayList.add(new C3732feyxiexzfUjhhgtg(c1019feyxiexzfUjhhgtg));
                if (arrayList.isEmpty()) {
                    throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                HashSet hashSet = new HashSet(3);
                for (C3732feyxiexzfUjhhgtg c3732feyxiexzfUjhhgtg : arrayList) {
                    if (!arrayList2.contains(c3732feyxiexzfUjhhgtg)) {
                        if (hashSet.contains(c3732feyxiexzfUjhhgtg)) {
                            throw new IllegalStateException("Cyclic dependency chain found: " + hashSet);
                        }
                        hashSet.add(c3732feyxiexzfUjhhgtg);
                        c3732feyxiexzfUjhhgtg.getClass();
                        hashSet.remove(c3732feyxiexzfUjhhgtg);
                        if (!arrayList2.contains(c3732feyxiexzfUjhhgtg)) {
                            if (C3732feyxiexzfUjhhgtg.class.isAssignableFrom(c3732feyxiexzfUjhhgtg.getClass())) {
                                arrayList2.add(0, c3732feyxiexzfUjhhgtg);
                            } else {
                                arrayList2.add(c3732feyxiexzfUjhhgtg);
                            }
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                LinkedHashSet linkedHashSet = C3215feyxiexzfUjhhgtg.f10082Ujhhgtgfeyxiexzf;
                float f = context.getResources().getDisplayMetrics().density;
                C0206Ujhhgtgfeyxiexzf c0206Ujhhgtgfeyxiexzf = new C0206Ujhhgtgfeyxiexzf();
                c0206Ujhhgtgfeyxiexzf.f1462Ujhhgtgfeyxiexzf = (int) ((8 * f) + 0.5f);
                c0206Ujhhgtgfeyxiexzf.f1459Ujhhgtgfeyxiexzf = (int) ((24 * f) + 0.5f);
                int i2 = (int) ((4 * f) + 0.5f);
                c0206Ujhhgtgfeyxiexzf.f1460Ujhhgtgfeyxiexzf = i2;
                int i3 = (int) ((1 * f) + 0.5f);
                c0206Ujhhgtgfeyxiexzf.f1461Ujhhgtgfeyxiexzf = i3;
                c0206Ujhhgtgfeyxiexzf.f1463Ujhhgtgfeyxiexzf = i3;
                c0206Ujhhgtgfeyxiexzf.f1464Ujhhgtgfeyxiexzf = i2;
                C3332feyxiexzfUjhhgtg c3332feyxiexzfUjhhgtg = new C3332feyxiexzfUjhhgtg();
                C3107Ujhhgtgfeyxiexzf c3107Ujhhgtgfeyxiexzf = new C3107Ujhhgtgfeyxiexzf(4);
                C3107Ujhhgtgfeyxiexzf c3107Ujhhgtgfeyxiexzf2 = new C3107Ujhhgtgfeyxiexzf(3);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C3732feyxiexzfUjhhgtg c3732feyxiexzfUjhhgtg2 = (C3732feyxiexzfUjhhgtg) it.next();
                    c3732feyxiexzfUjhhgtg2.getClass();
                    ArrayList arrayList6 = arrayList2;
                    switch (c3732feyxiexzfUjhhgtg2.f11794Ujhhgtgfeyxiexzf) {
                        case 1:
                            c3332feyxiexzfUjhhgtg.f10375Ujhhgtgfeyxiexzf = new C2579Ujhhgtgfeyxiexzf((C1019feyxiexzfUjhhgtg) c3732feyxiexzfUjhhgtg2.f11795Ujhhgtgfeyxiexzf);
                            break;
                    }
                    ArrayList arrayList7 = arrayList5;
                    LinkedHashSet linkedHashSet2 = linkedHashSet;
                    String[] strArr3 = strArr2;
                    LinearLayout linearLayout2 = linearLayout;
                    TextView.BufferType bufferType2 = bufferType;
                    MaterialTextView materialTextView3 = materialTextView2;
                    switch (c3732feyxiexzfUjhhgtg2.f11794Ujhhgtgfeyxiexzf) {
                        case 0:
                            c3107Ujhhgtgfeyxiexzf.m4631Ujhhgtgfeyxiexzf(C1964Ujhhgtgfeyxiexzf.class, new C3731Ujhhgtgfeyxiexzf(c3732feyxiexzfUjhhgtg2));
                            c3107Ujhhgtgfeyxiexzf.m4631Ujhhgtgfeyxiexzf(C1193feyxiexzfUjhhgtg.class, new C3730feyxiexzfUjhhgtg(6));
                            c3107Ujhhgtgfeyxiexzf.m4631Ujhhgtgfeyxiexzf(C3306feyxiexzfUjhhgtg.class, new C3730feyxiexzfUjhhgtg(7));
                            c3107Ujhhgtgfeyxiexzf.m4631Ujhhgtgfeyxiexzf(C2517feyxiexzfUjhhgtg.class, new C3730feyxiexzfUjhhgtg(8));
                            c3107Ujhhgtgfeyxiexzf.m4631Ujhhgtgfeyxiexzf(C2865feyxiexzfUjhhgtg.class, new C3730feyxiexzfUjhhgtg(9));
                            c3107Ujhhgtgfeyxiexzf.m4631Ujhhgtgfeyxiexzf(C3411Ujhhgtgfeyxiexzf.class, new C3730feyxiexzfUjhhgtg(10));
                            c3107Ujhhgtgfeyxiexzf.m4631Ujhhgtgfeyxiexzf(C0647Ujhhgtgfeyxiexzf.class, new C3730feyxiexzfUjhhgtg(11));
                            c3107Ujhhgtgfeyxiexzf.m4631Ujhhgtgfeyxiexzf(C0749Ujhhgtgfeyxiexzf.class, new C3730feyxiexzfUjhhgtg(12));
                            c3107Ujhhgtgfeyxiexzf.m4631Ujhhgtgfeyxiexzf(C2626feyxiexzfUjhhgtg.class, new C3730feyxiexzfUjhhgtg(14));
                            c3107Ujhhgtgfeyxiexzf.m4631Ujhhgtgfeyxiexzf(C1472feyxiexzfUjhhgtg.class, new C3730feyxiexzfUjhhgtg(14));
                            c3107Ujhhgtgfeyxiexzf.m4631Ujhhgtgfeyxiexzf(C0096Ujhhgtgfeyxiexzf.class, new C3730feyxiexzfUjhhgtg(13));
                            c3107Ujhhgtgfeyxiexzf.m4631Ujhhgtgfeyxiexzf(C2007feyxiexzfUjhhgtg.class, new C3730feyxiexzfUjhhgtg(0));
                            c3107Ujhhgtgfeyxiexzf.m4631Ujhhgtgfeyxiexzf(C0537Ujhhgtgfeyxiexzf.class, new C3730feyxiexzfUjhhgtg(1));
                            c3107Ujhhgtgfeyxiexzf.m4631Ujhhgtgfeyxiexzf(C1229feyxiexzfUjhhgtg.class, new C3730feyxiexzfUjhhgtg(2));
                            c3107Ujhhgtgfeyxiexzf.m4631Ujhhgtgfeyxiexzf(C0539Ujhhgtgfeyxiexzf.class, new C3730feyxiexzfUjhhgtg(3));
                            c3107Ujhhgtgfeyxiexzf.m4631Ujhhgtgfeyxiexzf(C1368feyxiexzfUjhhgtg.class, new C3730feyxiexzfUjhhgtg(4));
                            c3107Ujhhgtgfeyxiexzf.m4631Ujhhgtgfeyxiexzf(C0067Ujhhgtgfeyxiexzf.class, new C3730feyxiexzfUjhhgtg(5));
                            break;
                    }
                    switch (c3732feyxiexzfUjhhgtg2.f11794Ujhhgtgfeyxiexzf) {
                        case 0:
                            C2521feyxiexzfUjhhgtg c2521feyxiexzfUjhhgtg = new C2521feyxiexzfUjhhgtg(1);
                            c3107Ujhhgtgfeyxiexzf2.m4632Ujhhgtgfeyxiexzf(C1193feyxiexzfUjhhgtg.class, new C2521feyxiexzfUjhhgtg(7));
                            c3107Ujhhgtgfeyxiexzf2.m4632Ujhhgtgfeyxiexzf(C3306feyxiexzfUjhhgtg.class, new C2521feyxiexzfUjhhgtg(3));
                            c3107Ujhhgtgfeyxiexzf2.m4632Ujhhgtgfeyxiexzf(C2517feyxiexzfUjhhgtg.class, new C2521feyxiexzfUjhhgtg(0));
                            c3107Ujhhgtgfeyxiexzf2.m4632Ujhhgtgfeyxiexzf(C2865feyxiexzfUjhhgtg.class, new C2521feyxiexzfUjhhgtg(2));
                            c3107Ujhhgtgfeyxiexzf2.m4632Ujhhgtgfeyxiexzf(C3411Ujhhgtgfeyxiexzf.class, c2521feyxiexzfUjhhgtg);
                            c3107Ujhhgtgfeyxiexzf2.m4632Ujhhgtgfeyxiexzf(C0647Ujhhgtgfeyxiexzf.class, c2521feyxiexzfUjhhgtg);
                            c3107Ujhhgtgfeyxiexzf2.m4632Ujhhgtgfeyxiexzf(C0096Ujhhgtgfeyxiexzf.class, new C2521feyxiexzfUjhhgtg(6));
                            c3107Ujhhgtgfeyxiexzf2.m4632Ujhhgtgfeyxiexzf(C0537Ujhhgtgfeyxiexzf.class, new C2521feyxiexzfUjhhgtg(4));
                            c3107Ujhhgtgfeyxiexzf2.m4632Ujhhgtgfeyxiexzf(C0067Ujhhgtgfeyxiexzf.class, new C2521feyxiexzfUjhhgtg(5));
                            c3107Ujhhgtgfeyxiexzf2.m4632Ujhhgtgfeyxiexzf(C2007feyxiexzfUjhhgtg.class, new C2521feyxiexzfUjhhgtg(8));
                            break;
                    }
                    arrayList2 = arrayList6;
                    it = it;
                    arrayList5 = arrayList7;
                    linkedHashSet = linkedHashSet2;
                    strArr2 = strArr3;
                    linearLayout = linearLayout2;
                    bufferType = bufferType2;
                    materialTextView2 = materialTextView3;
                    c1414feyxiexzfUjhhgtg = c1414feyxiexzfUjhhgtg;
                }
                String[] strArr4 = strArr2;
                ArrayList arrayList8 = arrayList2;
                C1414feyxiexzfUjhhgtg c1414feyxiexzfUjhhgtg2 = c1414feyxiexzfUjhhgtg;
                LinearLayout linearLayout3 = linearLayout;
                MaterialTextView materialTextView4 = materialTextView2;
                TextView.BufferType bufferType3 = bufferType;
                ArrayList arrayList9 = arrayList5;
                LinkedHashSet linkedHashSet3 = linkedHashSet;
                C0206Ujhhgtgfeyxiexzf c0206Ujhhgtgfeyxiexzf2 = new C0206Ujhhgtgfeyxiexzf();
                c0206Ujhhgtgfeyxiexzf2.f1459Ujhhgtgfeyxiexzf = c0206Ujhhgtgfeyxiexzf.f1459Ujhhgtgfeyxiexzf;
                c0206Ujhhgtgfeyxiexzf2.f1460Ujhhgtgfeyxiexzf = c0206Ujhhgtgfeyxiexzf.f1460Ujhhgtgfeyxiexzf;
                c0206Ujhhgtgfeyxiexzf2.f1461Ujhhgtgfeyxiexzf = c0206Ujhhgtgfeyxiexzf.f1461Ujhhgtgfeyxiexzf;
                c0206Ujhhgtgfeyxiexzf2.f1462Ujhhgtgfeyxiexzf = c0206Ujhhgtgfeyxiexzf.f1462Ujhhgtgfeyxiexzf;
                c0206Ujhhgtgfeyxiexzf2.f1463Ujhhgtgfeyxiexzf = c0206Ujhhgtgfeyxiexzf.f1463Ujhhgtgfeyxiexzf;
                c0206Ujhhgtgfeyxiexzf2.f1464Ujhhgtgfeyxiexzf = c0206Ujhhgtgfeyxiexzf.f1464Ujhhgtgfeyxiexzf;
                C3596feyxiexzfUjhhgtg c3596feyxiexzfUjhhgtg = new C3596feyxiexzfUjhhgtg(Collections.unmodifiableMap(c3107Ujhhgtgfeyxiexzf2.f9652Ujhhgtgfeyxiexzf));
                c3332feyxiexzfUjhhgtg.f10372Ujhhgtgfeyxiexzf = c0206Ujhhgtgfeyxiexzf2;
                c3332feyxiexzfUjhhgtg.f10378Ujhhgtgfeyxiexzf = c3596feyxiexzfUjhhgtg;
                if (((C3382feyxiexzfUjhhgtg) c3332feyxiexzfUjhhgtg.f10373Ujhhgtgfeyxiexzf) == null) {
                    c3332feyxiexzfUjhhgtg.f10373Ujhhgtgfeyxiexzf = new C3382feyxiexzfUjhhgtg();
                }
                if (((C0420Ujhhgtgfeyxiexzf) c3332feyxiexzfUjhhgtg.f10374Ujhhgtgfeyxiexzf) == null) {
                    c3332feyxiexzfUjhhgtg.f10374Ujhhgtgfeyxiexzf = new C0420Ujhhgtgfeyxiexzf(19);
                }
                if (((InterfaceC0075Ujhhgtgfeyxiexzf) c3332feyxiexzfUjhhgtg.f10375Ujhhgtgfeyxiexzf) == null) {
                    c3332feyxiexzfUjhhgtg.f10375Ujhhgtgfeyxiexzf = new C3339feyxiexzfUjhhgtg(22);
                }
                if (((C3339feyxiexzfUjhhgtg) c3332feyxiexzfUjhhgtg.f10376Ujhhgtgfeyxiexzf) == null) {
                    c3332feyxiexzfUjhhgtg.f10376Ujhhgtgfeyxiexzf = new C3339feyxiexzfUjhhgtg(18);
                }
                if (((C3339feyxiexzfUjhhgtg) c3332feyxiexzfUjhhgtg.f10377Ujhhgtgfeyxiexzf) == null) {
                    c3332feyxiexzfUjhhgtg.f10377Ujhhgtgfeyxiexzf = new C3339feyxiexzfUjhhgtg(19);
                }
                C0210Ujhhgtgfeyxiexzf c0210Ujhhgtgfeyxiexzf = new C0210Ujhhgtgfeyxiexzf(c3332feyxiexzfUjhhgtg);
                LinkedHashSet linkedHashSet4 = C3215feyxiexzfUjhhgtg.f10082Ujhhgtgfeyxiexzf;
                ArrayList arrayList10 = new ArrayList();
                arrayList10.addAll(arrayList3);
                Iterator it2 = linkedHashSet3.iterator();
                while (it2.hasNext()) {
                    arrayList10.add(C3215feyxiexzfUjhhgtg.f10083Ujhhgtgfeyxiexzf.get((Class) it2.next()));
                }
                C0420Ujhhgtgfeyxiexzf c0420Ujhhgtgfeyxiexzf = new C0420Ujhhgtgfeyxiexzf(6);
                new C0655Ujhhgtgfeyxiexzf(new C2629Ujhhgtgfeyxiexzf(arrayList4, 16, Collections.EMPTY_MAP));
                List listUnmodifiableList = Collections.unmodifiableList(arrayList8);
                String str = (String) c1414feyxiexzfUjhhgtg2.f4973Ujhhgtgfeyxiexzf.getValue();
                Iterator it3 = listUnmodifiableList.iterator();
                while (it3.hasNext()) {
                    ((C3732feyxiexzfUjhhgtg) it3.next()).getClass();
                }
                if (str == null) {
                    throw new NullPointerException("input must not be null");
                }
                C3215feyxiexzfUjhhgtg c3215feyxiexzfUjhhgtg = new C3215feyxiexzfUjhhgtg(arrayList10, c0420Ujhhgtgfeyxiexzf, arrayList4);
                int i4 = 0;
                while (true) {
                    int length = str.length();
                    int i5 = i4;
                    while (true) {
                        if (i5 < length) {
                            char cCharAt = str.charAt(i5);
                            if (cCharAt != '\n' && cCharAt != '\r') {
                                i5++;
                            }
                        } else {
                            i5 = -1;
                        }
                    }
                    if (i5 == -1) {
                        if (str.length() > 0 && (i4 == 0 || i4 < str.length())) {
                            c3215feyxiexzfUjhhgtg.m4709Ujhhgtgfeyxiexzf(str.substring(i4));
                        }
                        c3215feyxiexzfUjhhgtg.m4706Ujhhgtgfeyxiexzf(c3215feyxiexzfUjhhgtg.f10097Ujhhgtgfeyxiexzf);
                        C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf = new C2629Ujhhgtgfeyxiexzf(c3215feyxiexzfUjhhgtg.f10094Ujhhgtgfeyxiexzf, 16, c3215feyxiexzfUjhhgtg.f10096Ujhhgtgfeyxiexzf);
                        c3215feyxiexzfUjhhgtg.f10093Ujhhgtgfeyxiexzf.getClass();
                        C0655Ujhhgtgfeyxiexzf c0655Ujhhgtgfeyxiexzf = new C0655Ujhhgtgfeyxiexzf(c2629Ujhhgtgfeyxiexzf);
                        Iterator it4 = c3215feyxiexzfUjhhgtg.f10098Ujhhgtgfeyxiexzf.iterator();
                        while (it4.hasNext()) {
                            ((AbstractC2924Ujhhgtgfeyxiexzf) it4.next()).mo1841Ujhhgtgfeyxiexzf(c0655Ujhhgtgfeyxiexzf);
                        }
                        C0584Ujhhgtgfeyxiexzf c0584Ujhhgtgfeyxiexzf = (C0584Ujhhgtgfeyxiexzf) c3215feyxiexzfUjhhgtg.f10095Ujhhgtgfeyxiexzf.f9901Ujhhgtgfeyxiexzf;
                        Iterator it5 = arrayList9.iterator();
                        if (it5.hasNext()) {
                            throw AbstractC3317feyxiexzfUjhhgtg.m4793Ujhhgtgfeyxiexzf(it5);
                        }
                        Iterator it6 = listUnmodifiableList.iterator();
                        while (it6.hasNext()) {
                            ((C3732feyxiexzfUjhhgtg) it6.next()).getClass();
                        }
                        C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf = new C0416Ujhhgtgfeyxiexzf(c0210Ujhhgtgfeyxiexzf, new C3107Ujhhgtgfeyxiexzf(6), new C1233feyxiexzfUjhhgtg(), Collections.unmodifiableMap(c3107Ujhhgtgfeyxiexzf.f9652Ujhhgtgfeyxiexzf), new C2466feyxiexzfUjhhgtg(4));
                        c0416Ujhhgtgfeyxiexzf.m1726feyxiexzfUjhhgtg(c0584Ujhhgtgfeyxiexzf);
                        Iterator it7 = listUnmodifiableList.iterator();
                        while (it7.hasNext()) {
                            ((C3732feyxiexzfUjhhgtg) it7.next()).getClass();
                        }
                        C1233feyxiexzfUjhhgtg c1233feyxiexzfUjhhgtg = (C1233feyxiexzfUjhhgtg) c0416Ujhhgtgfeyxiexzf.f2245Ujhhgtgfeyxiexzf;
                        C1231feyxiexzfUjhhgtg c1231feyxiexzfUjhhgtg = new C1231feyxiexzfUjhhgtg(c1233feyxiexzfUjhhgtg.f4559Ujhhgtgfeyxiexzf);
                        for (C1235feyxiexzfUjhhgtg c1235feyxiexzfUjhhgtg : c1233feyxiexzfUjhhgtg.f4560Ujhhgtgfeyxiexzf) {
                            c1231feyxiexzfUjhhgtg.setSpan(c1235feyxiexzfUjhhgtg.f4565Ujhhgtgfeyxiexzf, c1235feyxiexzfUjhhgtg.f4566Ujhhgtgfeyxiexzf, c1235feyxiexzfUjhhgtg.f4567Ujhhgtgfeyxiexzf, c1235feyxiexzfUjhhgtg.f4568Ujhhgtgfeyxiexzf);
                        }
                        Iterator it8 = listUnmodifiableList.iterator();
                        while (it8.hasNext()) {
                            switch (((C3732feyxiexzfUjhhgtg) it8.next()).f11794Ujhhgtgfeyxiexzf) {
                                case 0:
                                    C1473feyxiexzfUjhhgtg[] c1473feyxiexzfUjhhgtgArr = (C1473feyxiexzfUjhhgtg[]) c1231feyxiexzfUjhhgtg.getSpans(0, c1231feyxiexzfUjhhgtg.length(), C1473feyxiexzfUjhhgtg.class);
                                    if (c1473feyxiexzfUjhhgtgArr != null) {
                                        TextPaint paint = materialTextView4.getPaint();
                                        for (C1473feyxiexzfUjhhgtg c1473feyxiexzfUjhhgtg : c1473feyxiexzfUjhhgtgArr) {
                                            c1473feyxiexzfUjhhgtg.f5116Ujhhgtgfeyxiexzf = (int) (paint.measureText(c1473feyxiexzfUjhhgtg.f5114Ujhhgtgfeyxiexzf) + 0.5f);
                                        }
                                    }
                                    C2005feyxiexzfUjhhgtg[] c2005feyxiexzfUjhhgtgArr = (C2005feyxiexzfUjhhgtg[]) c1231feyxiexzfUjhhgtg.getSpans(0, c1231feyxiexzfUjhhgtg.length(), C2005feyxiexzfUjhhgtg.class);
                                    if (c2005feyxiexzfUjhhgtgArr != null) {
                                        for (C2005feyxiexzfUjhhgtg c2005feyxiexzfUjhhgtg : c2005feyxiexzfUjhhgtgArr) {
                                            c1231feyxiexzfUjhhgtg.removeSpan(c2005feyxiexzfUjhhgtg);
                                        }
                                    }
                                    C2005feyxiexzfUjhhgtg c2005feyxiexzfUjhhgtg2 = new C2005feyxiexzfUjhhgtg();
                                    materialTextView = materialTextView4;
                                    new WeakReference(materialTextView);
                                    c1231feyxiexzfUjhhgtg.setSpan(c2005feyxiexzfUjhhgtg2, 0, c1231feyxiexzfUjhhgtg.length(), 18);
                                    break;
                                default:
                                    materialTextView = materialTextView4;
                                    break;
                            }
                            materialTextView4 = materialTextView;
                        }
                        TextView textView = materialTextView4;
                        textView.setText(c1231feyxiexzfUjhhgtg, bufferType3);
                        Iterator it9 = listUnmodifiableList.iterator();
                        while (it9.hasNext()) {
                            switch (((C3732feyxiexzfUjhhgtg) it9.next()).f11794Ujhhgtgfeyxiexzf) {
                                case 0:
                                    if (textView.getMovementMethod() == null) {
                                        textView.setMovementMethod(LinkMovementMethod.getInstance());
                                    }
                                    break;
                            }
                        }
                        C0290Ujhhgtgfeyxiexzf c0290Ujhhgtgfeyxiexzf = new C0290Ujhhgtgfeyxiexzf();
                        c0290Ujhhgtgfeyxiexzf.f1723Ujhhgtgfeyxiexzf = linearLayout3;
                        C0290Ujhhgtgfeyxiexzf.m1499Ujhhgtgfeyxiexzf(c0290Ujhhgtgfeyxiexzf, null, 3);
                        C1435feyxiexzfUjhhgtg c1435feyxiexzfUjhhgtg = (C1435feyxiexzfUjhhgtg) AbstractC1453feyxiexzfUjhhgtg.f5062Ujhhgtgfeyxiexzf.get(c1414feyxiexzfUjhhgtg2.f4968Ujhhgtgfeyxiexzf);
                        if (c1435feyxiexzfUjhhgtg != null) {
                            strArr = strArr4;
                            zM2931Ujhhgtgfeyxiexzf = c1435feyxiexzfUjhhgtg.m2931Ujhhgtgfeyxiexzf(MagicFactory.get(4928460919027008906L, strArr));
                        } else {
                            strArr = strArr4;
                            C1435feyxiexzfUjhhgtg c1435feyxiexzfUjhhgtgM2964Ujhhgtgfeyxiexzf = AbstractC1453feyxiexzfUjhhgtg.m2964Ujhhgtgfeyxiexzf(c1414feyxiexzfUjhhgtg2);
                            zM2931Ujhhgtgfeyxiexzf = c1435feyxiexzfUjhhgtgM2964Ujhhgtgfeyxiexzf != null && c1435feyxiexzfUjhhgtgM2964Ujhhgtgfeyxiexzf.m2931Ujhhgtgfeyxiexzf(MagicFactory.get(4928461000631387530L, strArr));
                        }
                        if (zM2931Ujhhgtgfeyxiexzf) {
                            c0290Ujhhgtgfeyxiexzf.m1501Ujhhgtgfeyxiexzf(MagicFactory.get(4928454845943252362L, strArr), new C1433feyxiexzfUjhhgtg(c1414feyxiexzfUjhhgtg2, 6));
                        }
                        c0290Ujhhgtgfeyxiexzf.m1500Ujhhgtgfeyxiexzf().m1681feyxiexzfUjhhgtg();
                        return;
                    }
                    c3215feyxiexzfUjhhgtg.m4709Ujhhgtgfeyxiexzf(str.substring(i4, i5));
                    i4 = i5 + 1;
                    if (i4 < str.length() && str.charAt(i5) == '\r') {
                        if (str.charAt(i4) == '\n') {
                            i4 = i5 + 2;
                        }
                    }
                }
                break;
            default:
                C1019feyxiexzfUjhhgtg c1019feyxiexzfUjhhgtg2 = (C1019feyxiexzfUjhhgtg) obj2;
                C1111feyxiexzfUjhhgtg c1111feyxiexzfUjhhgtg = (C1111feyxiexzfUjhhgtg) obj;
                c1019feyxiexzfUjhhgtg2.m2515Ujhhgtgfeyxiexzf();
                int i6 = c1111feyxiexzfUjhhgtg.f4208Ujhhgtgfeyxiexzf;
                int i7 = c1111feyxiexzfUjhhgtg.f4210Ujhhgtgfeyxiexzf;
                String[] strArr5 = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                ModuleTabLayout moduleTabLayout = c1019feyxiexzfUjhhgtg2.f3991Ujhhgtgfeyxiexzf;
                if (moduleTabLayout == null) {
                    MagicFactory.get(4928467241218868618L, strArr5);
                    moduleTabLayout = null;
                }
                if (i6 >= 0) {
                    if (i6 < moduleTabLayout.getTabCount()) {
                        c2080Ujhhgtgfeyxiexzf = (C2080Ujhhgtgfeyxiexzf) moduleTabLayout.f6506Ujhhgtgfeyxiexzf.get(i6);
                    }
                    if (c2080Ujhhgtgfeyxiexzf != null) {
                        c1981Ujhhgtgfeyxiexzf = c2080Ujhhgtgfeyxiexzf.f6831Ujhhgtgfeyxiexzf;
                        if (c1981Ujhhgtgfeyxiexzf != null) {
                            throw new IllegalArgumentException("Tab not attached to a TabLayout");
                        }
                        c1981Ujhhgtgfeyxiexzf.m3327Ujhhgtgfeyxiexzf(c2080Ujhhgtgfeyxiexzf);
                    }
                    moduleRecyclerView = c1019feyxiexzfUjhhgtg2.f3996Ujhhgtgfeyxiexzf;
                    if (moduleRecyclerView == null) {
                        MagicFactory.get(4928467335708149130L, strArr5);
                        moduleRecyclerView = null;
                    }
                    if (moduleRecyclerView.isLaidOut() || moduleRecyclerView.isLayoutRequested()) {
                        moduleRecyclerView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1110feyxiexzfUjhhgtg(c1019feyxiexzfUjhhgtg2, i7));
                        return;
                    }
                    ModuleRecyclerView moduleRecyclerView3 = c1019feyxiexzfUjhhgtg2.f3996Ujhhgtgfeyxiexzf;
                    if (moduleRecyclerView3 == null) {
                        MagicFactory.get(4928467279873574282L, strArr5);
                    } else {
                        moduleRecyclerView2 = moduleRecyclerView3;
                    }
                    if (moduleRecyclerView2.m228feyxiexzfUjhhgtg(i7) != null) {
                        moduleRecyclerView2.postDelayed(new RunnableC3262feyxiexzfUjhhgtg(moduleRecyclerView2, i7, c1019feyxiexzfUjhhgtg2, 1), 150L);
                        return;
                    }
                    C1112feyxiexzfUjhhgtg c1112feyxiexzfUjhhgtg = new C1112feyxiexzfUjhhgtg(c1019feyxiexzfUjhhgtg2, i7);
                    if (moduleRecyclerView2.f414feyxiexzfUjhhgtg == null) {
                        moduleRecyclerView2.f414feyxiexzfUjhhgtg = new ArrayList();
                    }
                    moduleRecyclerView2.f414feyxiexzfUjhhgtg.add(c1112feyxiexzfUjhhgtg);
                    moduleRecyclerView2.m256Ujhhgtgfeyxiexzf(i7);
                    return;
                }
                moduleTabLayout.getClass();
                c2080Ujhhgtgfeyxiexzf = null;
                if (c2080Ujhhgtgfeyxiexzf != null) {
                    c1981Ujhhgtgfeyxiexzf = c2080Ujhhgtgfeyxiexzf.f6831Ujhhgtgfeyxiexzf;
                    if (c1981Ujhhgtgfeyxiexzf != null) {
                        throw new IllegalArgumentException("Tab not attached to a TabLayout");
                    }
                    c1981Ujhhgtgfeyxiexzf.m3327Ujhhgtgfeyxiexzf(c2080Ujhhgtgfeyxiexzf);
                }
                moduleRecyclerView = c1019feyxiexzfUjhhgtg2.f3996Ujhhgtgfeyxiexzf;
                if (moduleRecyclerView == null) {
                    MagicFactory.get(4928467335708149130L, strArr5);
                    moduleRecyclerView = null;
                }
                if (moduleRecyclerView.isLaidOut()) {
                }
                moduleRecyclerView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1110feyxiexzfUjhhgtg(c1019feyxiexzfUjhhgtg2, i7));
                return;
        }
    }
}
