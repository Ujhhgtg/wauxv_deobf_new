package p000;

import com.alibaba.fastjson2.schema.ArraySchema;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0267 implements IntFunction {

    public final /* synthetic */ int f1467;

    public final /* synthetic */ Object f1468;

    public /* synthetic */ C0267(int i, Object obj) {
        this.f1467 = i;
        this.f1468 = obj;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        switch (this.f1467) {
            case 0:
                return ArraySchema.lambda$validateInternal$0((Object[]) this.f1468, i);
            case 1:
                return Array.get(this.f1468, i);
            case 2:
                return ArraySchema.lambda$validateInternal$2((Iterator) this.f1468, i);
            default:
                return (Object[]) Array.newInstance((Class<?>) this.f1468, i);
        }
    }
}
