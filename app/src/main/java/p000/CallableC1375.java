package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1375 implements Callable {

    public final /* synthetic */ int f4954;

    public final /* synthetic */ String f4955;

    public final /* synthetic */ Context f4956;

    public final /* synthetic */ int f4957;

    public final /* synthetic */ Object f4958;

    public /* synthetic */ CallableC1375(String str, Context context, Object obj, int i, int i2) {
        this.f4954 = i2;
        this.f4955 = str;
        this.f4956 = context;
        this.f4958 = obj;
        this.f4957 = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f4954) {
            case 0:
                Object[] objArr = {(C1372) this.f4958};
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(objArr[0]);
                return AbstractC1378.m3096(this.f4955, this.f4956, Collections.unmodifiableList(arrayList), this.f4957);
            default:
                try {
                    return AbstractC1378.m3096(this.f4955, this.f4956, (ArrayList) this.f4958, this.f4957);
                } catch (Throwable unused) {
                    return new C1377(-3);
                }
        }
    }
}
