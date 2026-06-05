package p000;

import com.alibaba.fastjson2.introspect.FunctionAccessor;
import com.alibaba.fastjson2.introspect.PropertyAccessor;
import com.alibaba.fastjson2.introspect.PropertyAccessorFactory;
import com.alibaba.fastjson2.reader.FieldReader;
import java.util.function.BiFunction;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱ能不能ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3428feyxiexzfUjhhgtg implements BiFunction {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f10692Ujhhgtgfeyxiexzf;

    public /* synthetic */ C3428feyxiexzfUjhhgtg(int i) {
        this.f10692Ujhhgtgfeyxiexzf = i;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f10692Ujhhgtgfeyxiexzf) {
            case 0:
                return FieldReader.lambda$createPropertyAccessor$0((PropertyAccessor) obj, (Throwable) obj2);
            case 1:
                return FunctionAccessor.lambda$new$0((PropertyAccessor) obj, (Throwable) obj2);
            case 2:
                C1853Ujhhgtgfeyxiexzf c1853UjhhgtgfeyxiexzfM3185Ujhhgtgfeyxiexzf = ((C1853Ujhhgtgfeyxiexzf) obj2).clone();
                c1853UjhhgtgfeyxiexzfM3185Ujhhgtgfeyxiexzf.f6224Ujhhgtgfeyxiexzf.addModifier("final");
                return c1853UjhhgtgfeyxiexzfM3185Ujhhgtgfeyxiexzf;
            case 3:
                return PropertyAccessorFactory.lambda$create$2((PropertyAccessor) obj, (Throwable) obj2);
            case 4:
                return PropertyAccessorFactory.lambda$create$1((PropertyAccessor) obj, (Throwable) obj2);
            default:
                return PropertyAccessorFactory.lambda$create$0((PropertyAccessor) obj, (Throwable) obj2);
        }
    }
}
