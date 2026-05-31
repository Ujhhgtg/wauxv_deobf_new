package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᛸᲀᲁᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1383 implements Callable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f4983;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ String f4984;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ Context f4985;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f4986;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f4987;

    public /* synthetic */ CallableC1383(String str, Context context, Object obj, int i, int i2) {
        this.f4983 = i2;
        this.f4984 = str;
        this.f4985 = context;
        this.f4987 = obj;
        this.f4986 = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f4983) {
            case 0:
                Object[] objArr = {(C1380) this.f4987};
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(objArr[0]);
                return AbstractC1386.m3204(this.f4984, this.f4985, Collections.unmodifiableList(arrayList), this.f4986);
            default:
                try {
                    return AbstractC1386.m3204(this.f4984, this.f4985, (ArrayList) this.f4987, this.f4986);
                } catch (Throwable unused) {
                    return new C1385(-3);
                }
        }
    }
}
