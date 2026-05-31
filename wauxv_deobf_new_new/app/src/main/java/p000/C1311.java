package p000;

import com.alibaba.fastjson2.introspect.FunctionAccessor;
import com.alibaba.fastjson2.introspect.PropertyAccessor;
import com.alibaba.fastjson2.introspect.PropertyAccessorFactory;
import com.alibaba.fastjson2.reader.FieldReader;
import java.util.function.BiFunction;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲀᤞᲁᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1311 implements BiFunction {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f4744;

    public /* synthetic */ C1311(int i) {
        this.f4744 = i;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        PropertyAccessor propertyAccessor = (PropertyAccessor) obj;
        Throwable th = (Throwable) obj2;
        switch (this.f4744) {
            case 0:
                return FieldReader.lambda$createPropertyAccessor$0(propertyAccessor, th);
            case 1:
                return FunctionAccessor.lambda$new$0(propertyAccessor, th);
            case 2:
                return PropertyAccessorFactory.lambda$create$2(propertyAccessor, th);
            case 3:
                return PropertyAccessorFactory.lambda$create$1(propertyAccessor, th);
            default:
                return PropertyAccessorFactory.lambda$create$0(propertyAccessor, th);
        }
    }
}
