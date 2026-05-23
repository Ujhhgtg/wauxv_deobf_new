package p000;

import bsh.C0007;
import com.alibaba.fastjson2.reader.ObjectReaderCreator;
import com.alibaba.fastjson2.reader.ObjectReaderCreatorASM;
import com.alibaba.fastjson2.reader.ObjectReaderImplList;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2255 implements Function {

    public final /* synthetic */ int f7318;

    public final /* synthetic */ Object f7319;

    public /* synthetic */ C2255(int i, Object obj) {
        this.f7318 = i;
        this.f7319 = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f7318) {
            case 0:
                return ObjectReaderCreator.lambda$createBuildFunction$0((Method) this.f7319, obj);
            case 1:
                return ObjectReaderCreatorASM.lambda$createValueConsumer0$1((Constructor) this.f7319, obj);
            case 2:
                return ObjectReaderImplList.lambda$of$0((Type) this.f7319, obj);
            case 3:
                return ((ObjectReaderImplList) this.f7319).lambda$readJSONBObject$3(obj);
            case 4:
                C0007 c0007 = (C0007) this.f7319;
                String str = (String) obj;
                if (c0007 == null) {
                    return null;
                }
                try {
                    return c0007.m357(str, false);
                } catch (Exception unused) {
                    return null;
                }
            default:
                Iterator it = (Iterator) this.f7319;
                StringBuilder sbM2788 = AbstractC1194.m2788((String) obj, " ");
                sbM2788.append((String) it.next());
                return sbM2788.toString();
        }
    }
}
