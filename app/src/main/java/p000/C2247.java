package p000;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.reader.ObjectReaderBaseModule;
import com.alibaba.fastjson2.reader.ObjectReaderCreatorASM;
import com.alibaba.fastjson2.reader.ObjectReaderImplList;
import java.time.Duration;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TimeZone;
import java.util.function.Function;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᤞᲇᲈᤝᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2247 implements Function {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7268;

    public /* synthetic */ C2247(int i) {
        this.f7268 = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f7268) {
            case 0:
                return ObjectReaderBaseModule.lambda$init$0(obj);
            case 1:
                return ObjectReaderBaseModule.lambda$init$1(obj);
            case 2:
                return ObjectReaderBaseModule.lambda$init$2(obj);
            case 3:
                return ObjectReaderBaseModule.lambda$init$3(obj);
            case 4:
                return Duration.parse((String) obj);
            case 5:
                return ZoneOffset.of((String) obj);
            case 6:
                return ZoneId.of((String) obj);
            case 7:
                return TimeZone.getTimeZone((String) obj);
            case 8:
                return ((List) obj).stream();
            case 9:
                return ObjectReaderCreatorASM.lambda$genMethodReadJSONBObject$0((Integer) obj);
            case 10:
                return ObjectReaderCreatorASM.lambda$genMethodGetFieldReader$0((Integer) obj);
            case 11:
                return ObjectReaderCreatorASM.lambda$genMethodGetFieldReaderLCase$0((Integer) obj);
            case Opcodes.FCONST_1 /* 12 */:
                return ObjectReaderCreatorASM.lambda$genMethodReadObject$0((Integer) obj);
            case 13:
                return ObjectReaderImplList.lambda$of$6(obj);
            case Opcodes.DCONST_0 /* 14 */:
                return ObjectReaderImplList.lambda$of$7(obj);
            case 15:
                return ObjectReaderImplList.lambda$of$8(obj);
            case 16:
                return Collections.synchronizedList((List) obj);
            case Opcodes.SIPUSH /* 17 */:
                return Collections.unmodifiableCollection((Collection) obj);
            case Opcodes.LDC /* 18 */:
                return Collections.unmodifiableList((List) obj);
            case 19:
                return Collections.unmodifiableSet((Set) obj);
            case 20:
                return Collections.unmodifiableSortedSet((SortedSet) obj);
            case Opcodes.ILOAD /* 21 */:
                return Collections.unmodifiableNavigableSet((NavigableSet) obj);
            case Opcodes.LLOAD /* 22 */:
                return ObjectReaderImplList.lambda$readJSONBObject$0((Collection) obj);
            case Opcodes.FLOAD /* 23 */:
                return Collections.synchronizedCollection((Collection) obj);
            case Opcodes.DLOAD /* 24 */:
                return ObjectReaderImplList.lambda$readJSONBObject$1((List) obj);
            case Opcodes.ALOAD /* 25 */:
                return ObjectReaderImplList.lambda$readJSONBObject$2((Collection) obj);
            case 26:
                return Collections.synchronizedSet((Set) obj);
            case 27:
                return Collections.synchronizedSortedSet((SortedSet) obj);
            case 28:
                return Collections.synchronizedNavigableSet((NavigableSet) obj);
            default:
                return ObjectReaderImplList.lambda$of$1(obj);
        }
    }
}
