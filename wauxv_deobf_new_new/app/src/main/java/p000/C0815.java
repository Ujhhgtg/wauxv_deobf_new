package p000;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᲇᲈᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0815 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0814 f3200;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public boolean f3201;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final ArrayList f3202 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final LinkedHashMap f3203 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final ArrayList f3204 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public String f3205;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public int f3206;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f3207;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final int f3208;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public String f3209;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final C0801 f3210;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public InterfaceC1437 f3211;

    public C0815(C0814 c0814) {
        this.f3200 = c0814;
        String[] strArr = AbstractC1471.f5234;
        this.f3205 = "";
        this.f3206 = R.drawable.ic_contact_confirm_24dp;
        this.f3207 = "取消";
        this.f3208 = R.drawable.ic_contact_cancel_24dp;
        this.f3209 = "确定";
        this.f3210 = new C0801(15);
        this.f3211 = new C0192(2);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m2483(String str, ArrayList arrayList) {
        this.f3203.put(str, arrayList);
        this.f3204.addAll(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0012  */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final ArrayList m2484() {
        ArrayList<C0800> arrayList;
        ArrayList arrayList2 = new ArrayList();
        if (this.f3201) {
            arrayList = this.f3202;
            if (arrayList.isEmpty()) {
                arrayList = this.f3204;
            }
        } else {
            arrayList = this.f3204;
        }
        for (C0800 c0800 : arrayList) {
            if (c0800.f3170) {
                arrayList2.add(c0800);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final List m2485(String str) {
        if (!AbstractC1469.m3322(str, "全部")) {
            List list = (List) this.f3203.get(str);
            return list == null ? C1191.f4326 : list;
        }
        if (this.f3201) {
            ArrayList arrayList = this.f3202;
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return this.f3204;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m2486(ArrayList arrayList) {
        this.f3201 = true;
        this.f3202.addAll(arrayList);
    }
}
