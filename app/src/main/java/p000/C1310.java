package p000;

import com.alibaba.fastjson2.introspect.FunctionAccessor;
import com.alibaba.fastjson2.introspect.PropertyAccessor;
import com.alibaba.fastjson2.introspect.PropertyAccessorFactory;
import com.alibaba.fastjson2.reader.FieldReader;
import java.util.function.BiFunction;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᲁᤞᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1310 implements BiFunction {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f4745;

    public /* synthetic */ C1310(int i) {
        this.f4745 = i;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f4745) {
            case 0:
                return FieldReader.lambda$createPropertyAccessor$0((PropertyAccessor) obj, (Throwable) obj2);
            case 1:
                return FunctionAccessor.lambda$new$0((PropertyAccessor) obj, (Throwable) obj2);
            case 2:
                C3532 c3532M5122 = ((C3532) obj2).clone();
                c3532M5122.f11064.m3860("final");
                return c3532M5122;
            case 3:
                return PropertyAccessorFactory.lambda$create$2((PropertyAccessor) obj, (Throwable) obj2);
            case 4:
                return PropertyAccessorFactory.lambda$create$1((PropertyAccessor) obj, (Throwable) obj2);
            default:
                return PropertyAccessorFactory.lambda$create$0((PropertyAccessor) obj, (Throwable) obj2);
        }
    }
}
