package p000;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import me.hd.wauxv.ui.setting.view.ModuleTabLayout;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲁᲈᲀᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0628 implements TextWatcher {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2478;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f2479;

    public /* synthetic */ C0628(Object obj, int i) {
        this.f2478 = i;
        this.f2479 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d1 A[SYNTHETIC] */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        String str2;
        String str3;
        C0372 c0372;
        switch (this.f2478) {
            case 0:
                MaterialTextView materialTextView = (MaterialTextView) ((C1693) this.f2479).f5696;
                C0629 c0629 = C0629.f2480;
                String strValueOf = String.valueOf(editable);
                c0629.getClass();
                materialTextView.setText(C0629.m2149(strValueOf));
                break;
            case 1:
                ((C0814) this.f2479).m2481(String.valueOf(editable));
                break;
            default:
                String[] strArr = AbstractC1471.f5234;
                C2735 c2735 = (C2735) this.f2479;
                String strValueOf2 = String.valueOf(editable);
                ModuleTabLayout moduleTabLayout = null;
                if (!AbstractC2901.m4869(strValueOf2)) {
                    boolean z = true;
                    c2735.f8765 = true;
                    List<C2730> list = (List) c2735.f8764.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (C2730 c2730 : list) {
                        AbstractC0374 abstractC0374 = c2730.f8752;
                        boolean z2 = abstractC0374 instanceof C0369;
                        if (z2) {
                            str = ((C0369) abstractC0374).f1850;
                        } else if (abstractC0374 instanceof C0373) {
                            str = ((C0373) abstractC0374).f1864;
                        } else {
                            str = abstractC0374 instanceof C0371 ? ((C0371) abstractC0374).f1854 : "";
                        }
                        String str4 = str;
                        if (z2) {
                            str3 = ((C0369) abstractC0374).f1851;
                        } else if (abstractC0374 instanceof C0373) {
                            str3 = ((C0373) abstractC0374).f1865;
                        } else {
                            if (abstractC0374 instanceof C0371) {
                                str3 = ((C0371) abstractC0374).f1855;
                            } else {
                                str2 = null;
                            }
                            if (!AbstractC2901.m4861(str4, strValueOf2, z) || (str2 != null && AbstractC2901.m4861(str2, strValueOf2, z) == z)) {
                                c0372 = new C0372(str4, str2, c2730.f8753, c2730.f8754, c2730.f8755, new ViewOnClickListenerC0811(c2735, 3, c2730));
                            } else {
                                c0372 = null;
                            }
                            if (c0372 != null) {
                                arrayList.add(c0372);
                            }
                            z = true;
                        }
                        str2 = str3;
                        if (AbstractC2901.m4861(str4, strValueOf2, z)) {
                            c0372 = new C0372(str4, str2, c2730.f8753, c2730.f8754, c2730.f8755, new ViewOnClickListenerC0811(c2735, 3, c2730));
                        } else {
                            c0372 = new C0372(str4, str2, c2730.f8753, c2730.f8754, c2730.f8755, new ViewOnClickListenerC0811(c2735, 3, c2730));
                        }
                        if (c0372 != null) {
                            arrayList.add(c0372);
                        }
                        z = true;
                    }
                    if (arrayList.isEmpty()) {
                        c2735.m4719().m5152(Collections.singletonList(new C0370("未找到匹配的功能")));
                    } else {
                        C3622 c3622M4719 = c2735.m4719();
                        C1836 c1836 = new C1836(10);
                        c1836.add(new C0370("搜索结果(" + arrayList.size() + ')'));
                        c1836.addAll(arrayList);
                        c3622M4719.m5152(AbstractC3744.m5324(c1836));
                    }
                } else if (c2735.f8765) {
                    C3622 c3622M47110 = c2735.m4719();
                    ModuleTabLayout moduleTabLayout2 = c2735.f8768;
                    if (moduleTabLayout2 == null) {
                        "tabLayout";
                    } else {
                        moduleTabLayout = moduleTabLayout2;
                    }
                    c3622M47110.m5152(c2735.m4718(moduleTabLayout.getSelectedTabPosition()));
                    c2735.f8765 = false;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f2478;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f2478;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    private final void m2143(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    private final void m2144(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    private final void m2145(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    private final void m2146(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    private final void m2147(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    private final void m2148(int i, int i2, int i3, CharSequence charSequence) {
    }
}
