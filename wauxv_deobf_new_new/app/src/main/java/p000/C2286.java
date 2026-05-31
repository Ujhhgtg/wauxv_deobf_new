package p000;

import bsh.C0012;
import com.alibaba.fastjson2.reader.ObjectReaderCreator;
import com.alibaba.fastjson2.reader.ObjectReaderCreatorASM;
import com.alibaba.fastjson2.reader.ObjectReaderImplList;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲇᤝᤞᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2286 implements Function {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7438;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f7439;

    public /* synthetic */ C2286(Object obj, int i) {
        this.f7438 = i;
        this.f7439 = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f7438) {
            case 0:
                return ObjectReaderCreator.lambda$createBuildFunction$7((Method) this.f7439, obj);
            case 1:
                return ObjectReaderCreatorASM.lambda$createValueConsumer0$6((Constructor) this.f7439, obj);
            case 2:
                return ObjectReaderImplList.lambda$of$0((Type) this.f7439, obj);
            case 3:
                return ((ObjectReaderImplList) this.f7439).lambda$readJSONBObject$12(obj);
            case 4:
                C0012 c0012 = (C0012) this.f7439;
                String str = (String) obj;
                if (c0012 == null) {
                    return null;
                }
                try {
                    return c0012.m377(str, false);
                } catch (Exception unused) {
                    return null;
                }
            default:
                Iterator it = (Iterator) this.f7439;
                StringBuilder sbM2803 = AbstractC1095.m2803((String) obj, " ");
                sbM2803.append((String) it.next());
                return sbM2803.toString();
        }
    }
}
