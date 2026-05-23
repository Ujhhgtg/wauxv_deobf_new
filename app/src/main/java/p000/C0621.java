package p000;

import android.widget.BaseAdapter;
import android.widget.ListView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᲁᲈᲀᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0621 implements InterfaceC2885 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ BaseAdapter f2450;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ ListView f2451;

    public C0621(BaseAdapter baseAdapter, ListView listView) {
        this.f2450 = baseAdapter;
        this.f2451 = listView;
    }

    @Override // p000.InterfaceC2884
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void mo2030(C2888 c2888) throws IllegalAccessException, InvocationTargetException {
        C0618.f2447.m2545(c2888.f9247);
        
        Method methodM3315 = AbstractC1574.dexToMethod(C0919.f3403);
        Object[] objArr = {Boolean.TRUE};
        BaseAdapter baseAdapter = this.f2450;
        methodM3315.invoke(baseAdapter, objArr);
        
        AbstractC1574.dexToMethod(C0854.f3269).invoke(this.f2451, null);
        baseAdapter.notifyDataSetChanged();
    }

    @Override // p000.InterfaceC2884
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void mo2029(C2888 c2888) {
    }
}
