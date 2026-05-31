package p000;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲀᤞᲈᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0592 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2408 = 2;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ ArrayList f2409;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f2410;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f2411;

    public /* synthetic */ ViewOnClickListenerC0592(C1693 c1693, ArrayList arrayList, C0713 c0713) {
        this.f2410 = c1693;
        this.f2409 = arrayList;
        this.f2411 = c0713;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0601 c0601;
        C1359 c1359;
        switch (this.f2408) {
            case 0:
                C2571 c2571 = (C2571) this.f2410;
                C2045 c2045 = (C2045) this.f2411;
                String str = EnumC1497.f5303.f5306;
                ArrayList arrayList = this.f2409;
                int size = arrayList.size();
                C1498.f5308.getClass();
                ArrayList arrayList2 = new ArrayList(AbstractC0741.m2313(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((C1496) it.next()).f5294);
                }
                Set setM2308 = AbstractC0739.m2308(arrayList2);
                int i = 1;
                while (true) {
                    StringBuilder sb = new StringBuilder();
                    String[] strArr = AbstractC1471.f5234;
                    sb.append("自定义分组");
                    sb.append(i);
                    String string = sb.toString();
                    if (!setM2308.contains(string)) {
                        arrayList.add(new C1496(str, size, string, true, new String[0]));
                        C0615.f2456.getClass();
                        if (C0615.m2138(arrayList)) {
                            Object obj = c2571.f8191;
                            C0601 c0602 = null;
                            if (obj == null) {
                                "adapter";
                                c0601 = null;
                            } else {
                                c0601 = (C0601) obj;
                            }
                            c0601.m2127(arrayList);
                            Object obj2 = c2571.f8191;
                            if (obj2 == null) {
                                "adapter";
                            } else {
                                c0602 = (C0601) obj2;
                            }
                            C0615.m2137(c2045, arrayList, c0602);
                        } else if (!arrayList.isEmpty()) {
                            arrayList.remove(AbstractC0740.m2310(arrayList));
                        }
                    } else {
                        i++;
                    }
                    break;
                }
                break;
            case 1:
                C2050 c2050 = (C2050) this.f2411;
                C2571 c2572 = (C2571) this.f2410;
                C1369 c1369 = C1369.f4885;
                Context context = c2050.f6866.getContext();
                Object obj3 = c2572.f8191;
                if (obj3 == null) {
                    "adapter";
                    c1359 = null;
                } else {
                    c1359 = (C1359) obj3;
                }
                c1369.getClass();
                C1369.m3187(context, null, this.f2409, c1359);
                break;
            default:
                C1693 c1693 = (C1693) this.f2410;
                C0713 c0713 = (C0713) this.f2411;
                TextInputEditText textInputEditText = (TextInputEditText) c1693.f5697;
                String strValueOf = String.valueOf(textInputEditText.getText());
                if (!AbstractC2901.m4869(strValueOf)) {
                    this.f2409.add(strValueOf);
                    c0713.m4462();
                    Editable text = textInputEditText.getText();
                    if (text != null) {
                        text.clear();
                    }
                }
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC0592(C2045 c2045, C2571 c2571, ArrayList arrayList) {
        this.f2409 = arrayList;
        this.f2410 = c2571;
        this.f2411 = c2045;
    }

    public /* synthetic */ ViewOnClickListenerC0592(C2050 c2050, ArrayList arrayList, C2571 c2571) {
        this.f2411 = c2050;
        this.f2409 = arrayList;
        this.f2410 = c2571;
    }
}
