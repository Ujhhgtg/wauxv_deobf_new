package p000;

import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲀᤞᲁᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0710 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2713;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f2714;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ Object f2715;

    public /* synthetic */ C0710(Object obj, int i, Object obj2) {
        this.f2713 = i;
        this.f2714 = obj;
        this.f2715 = obj2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f2713) {
            case 0:
                C0713 c0713 = (C0713) this.f2714;
                C0714 c0714 = (C0714) this.f2715;
                Set set = (Set) c0713.f2721;
                if (!z) {
                    set.remove(c0714.f2722);
                } else {
                    set.add(c0714.f2722);
                }
                break;
            case 1:
                C0800 c0800 = (C0800) this.f2714;
                C0799 c0799 = (C0799) this.f2715;
                c0800.f3170 = z;
                c0799.f3166.m2482();
                c0799.f3166.m2480();
                break;
            case 2:
                C1358 c1358 = (C1358) this.f2714;
                C1359 c1359 = (C1359) this.f2715;
                ArrayList arrayList = c1359.f4868;
                int iM4533 = c1358.m4533();
                if (iM4533 != -1) {
                    arrayList.set(iM4533, C1363.m3183((C1363) arrayList.get(iM4533), 0, z, 31));
                    C1369.f4885.getClass();
                    C1369.m3185(arrayList, c1359);
                    break;
                }
                break;
            default:
                C2355 c2355 = (C2355) this.f2714;
                C0713 c0715 = (C0713) this.f2715;
                int iM4534 = c2355.m4533();
                if (iM4534 != -1) {
                    ArrayList arrayList2 = (ArrayList) c0715.f2720;
                    arrayList2.set(iM4534, C2358.m4305((C2358) arrayList2.get(iM4534), null, 0, z, 7));
                    c0715.f8077.m4466(iM4534, 1);
                    ((C2349) c0715.f2721).invoke();
                    break;
                }
                break;
        }
    }
}
