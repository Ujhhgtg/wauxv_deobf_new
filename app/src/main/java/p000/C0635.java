package p000;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import me.hd.wauxv.ui.setting.view.ModuleTabLayout;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲈᲀᤝᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0635 implements TextWatcher {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2472;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f2473;

    public /* synthetic */ C0635(int i, Object obj) {
        this.f2472 = i;
        this.f2473 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d1 A[SYNTHETIC] */
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        String str2;
        String str3;
        C0397 c0397;
        switch (this.f2472) {
            case 0:
                MaterialTextView materialTextView = (MaterialTextView) ((C2103) this.f2473).f6938;
                C0636 c0636 = C0636.f2474;
                String strValueOf = String.valueOf(editable);
                
                materialTextView.setText(C0636.m2038(strValueOf));
                break;
            case 1:
                ((C0815) this.f2473).m2365(String.valueOf(editable));
                break;
            default:
                String[] strArr = AbstractC1574.f5469;
                C2675 c2675 = (C2675) this.f2473;
                String strValueOf2 = String.valueOf(editable);
                ModuleTabLayout moduleTabLayout = null;
                if (!AbstractC2841.m4836(strValueOf2)) {
                    boolean z = true;
                    c2675.f8607 = true;
                    List<C2669> list = (List) c2675.f8606.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (C2669 c2669 : list) {
                        AbstractC0399 abstractC0399 = c2669.f8593;
                        boolean z2 = abstractC0399 instanceof C0394;
                        if (z2) {
                            str = ((C0394) abstractC0399).f1879;
                        } else if (abstractC0399 instanceof C0398) {
                            str = ((C0398) abstractC0399).f1893;
                        } else {
                            str = abstractC0399 instanceof C0396 ? ((C0396) abstractC0399).f1883 : "";
                        }
                        String str4 = str;
                        if (z2) {
                            str3 = ((C0394) abstractC0399).f1880;
                        } else if (abstractC0399 instanceof C0398) {
                            str3 = ((C0398) abstractC0399).f1894;
                        } else {
                            if (abstractC0399 instanceof C0396) {
                                str3 = ((C0396) abstractC0399).f1884;
                            } else {
                                str2 = null;
                            }
                            if (!AbstractC2841.m4828(str4, strValueOf2, true) || (str2 != null && AbstractC2841.m4828(str2, strValueOf2, true) == true)) {
                                c0397 = new C0397(str4, str2, c2669.f8594, c2669.f8595, c2669.f8596, new ViewOnClickListenerC0812(c2675, 3, c2669));
                            } else {
                                c0397 = null;
                            }
                            if (c0397 != null) {
                                arrayList.add(c0397);
                            }
                            z = true;
                        }
                        str2 = str3;
                        if (AbstractC2841.m4828(str4, strValueOf2, true)) {
                            c0397 = new C0397(str4, str2, c2669.f8594, c2669.f8595, c2669.f8596, new ViewOnClickListenerC0812(c2675, 3, c2669));
                        } else {
                            c0397 = new C0397(str4, str2, c2669.f8594, c2669.f8595, c2669.f8596, new ViewOnClickListenerC0812(c2675, 3, c2669));
                        }
                        if (true) {
                            arrayList.add(c0397);
                        }
                        z = true;
                    }
                    if (arrayList.isEmpty()) {
                        c2675.m4685().m5146(Collections.singletonList(new C0395("未找到匹配的功能")));
                    } else {
                        C3563 c3563M4685 = c2675.m4685();
                        C1809 c1809 = new C1809(10);
                        c1809.add(new C0395("搜索结果(" + arrayList.size() + ')'));
                        c1809.addAll(arrayList);
                        c3563M4685.m5146(AbstractC1459.m3173(c1809));
                    }
                } else if (c2675.f8607) {
                    C3563 c3563M4686 = c2675.m4685();
                    ModuleTabLayout moduleTabLayout2 = c2675.f8610;
                    if (moduleTabLayout2 == null) {
                        "tabLayout";
                    } else {
                        moduleTabLayout = moduleTabLayout2;
                    }
                    c3563M4686.m5146(c2675.m4684(moduleTabLayout.getSelectedTabPosition()));
                    c2675.f8607 = false;
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f2472;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.f2472;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    private final void m2032(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    private final void m2033(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    private final void m2034(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    private final void m2035(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    private final void m2036(int i, int i2, int i3, CharSequence charSequence) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    private final void m2037(int i, int i2, int i3, CharSequence charSequence) {
    }
}
